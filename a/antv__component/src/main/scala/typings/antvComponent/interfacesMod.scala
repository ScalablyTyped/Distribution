package typings.antvComponent

import typings.antvComponent.typesMod.ListItem
import typings.antvComponent.typesMod.LocationCfg
import typings.antvComponent.typesMod.LocationType
import typings.antvComponent.typesMod.OffsetPoint
import typings.antvComponent.typesMod.Range
import typings.antvGBase.interfacesMod.IBase
import typings.antvGBase.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait IComponent extends IBase {
    
    /**
      * 清空组件
      */
    def clear(): js.Any = js.native
    
    /**
      * 组件在画布上的包围盒
      * @return {BBox} 包围盒
      */
    def getBBox(): BBox = js.native
    
    /**
      * 组件布局要求的包围盒，不一定等于 getBBox
      * @return {BBox} 包围盒
      */
    def getLayoutBBox(): BBox = js.native
    
    /**
      * 隐藏
      */
    def hide(): js.Any = js.native
    
    /**
      * 初始化组件
      */
    def init(): Unit = js.native
    
    /**
      * 是否是列表
      */
    def isList(): Boolean = js.native
    
    /**
      * 是否是 slider
      */
    def isSlider(): Boolean = js.native
    
    /**
      * 渲染组件
      */
    def render(): js.Any = js.native
    
    /**
      * 是否可以响应事件
      * @param capture 是否可以响应事件
      */
    def setCapture(capture: Boolean): Unit = js.native
    
    /**
      * 显示
      */
    def show(): js.Any = js.native
    
    /**
      * 更新组件
      * @param {object} cfg 更新的配置项
      */
    def update(cfg: js.Object): js.Any = js.native
  }
  
  @js.native
  trait IList extends StObject {
    
    /**
      * 清空列表
      */
    def clearItems(): js.Any = js.native
    
    /**
      * 清楚所有列表项的状态
      * @param {string} state 状态值
      */
    def clearItemsState(state: String): js.Any = js.native
    
    /**
      * 获取列表项
      * @return {ListItem[]} 列表项集合
      */
    def getItems(): js.Array[ListItem] = js.native
    
    /**
      * 根据状态获取
      * @param  {state}     state 状态名
      * @return {ListItem[]} 列表项
      */
    def getItemsByState(state: js.Any): js.Array[ListItem] = js.native
    
    /**
      * 是否存在指定的状态
      * @param {ListItem} item  列表项
      * @param {string} state 状态名
      */
    def hasState(item: ListItem, state: String): Boolean = js.native
    
    /**
      * 设置列表项的状态
      * @param {ListItem} item  列表项
      * @param {string}   state 状态名
      * @param {boolean}  value 状态值, true, false
      */
    def setItemState(item: ListItem, state: String, value: Boolean): js.Any = js.native
    
    /**
      * 设置列表项
      * @param {ListItem[]} items 列表项集合
      */
    def setItems(items: js.Array[ListItem]): js.Any = js.native
    
    /**
      * 更新列表项
      * @param {ListItem} item 列表项
      * @param {object}   cfg  列表项
      */
    def updateItem(item: ListItem, cfg: js.Object): js.Any = js.native
  }
  object IList {
    
    @scala.inline
    def apply(
      clearItems: () => js.Any,
      clearItemsState: String => js.Any,
      getItems: () => js.Array[ListItem],
      getItemsByState: js.Any => js.Array[ListItem],
      hasState: (ListItem, String) => Boolean,
      setItemState: (ListItem, String, Boolean) => js.Any,
      setItems: js.Array[ListItem] => js.Any,
      updateItem: (ListItem, js.Object) => js.Any
    ): IList = {
      val __obj = js.Dynamic.literal(clearItems = js.Any.fromFunction0(clearItems), clearItemsState = js.Any.fromFunction1(clearItemsState), getItems = js.Any.fromFunction0(getItems), getItemsByState = js.Any.fromFunction1(getItemsByState), hasState = js.Any.fromFunction2(hasState), setItemState = js.Any.fromFunction3(setItemState), setItems = js.Any.fromFunction1(setItems), updateItem = js.Any.fromFunction2(updateItem))
      __obj.asInstanceOf[IList]
    }
    
    @scala.inline
    implicit class IListMutableBuilder[Self <: IList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearItems(value: () => js.Any): Self = StObject.set(x, "clearItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClearItemsState(value: String => js.Any): Self = StObject.set(x, "clearItemsState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetItems(value: () => js.Array[ListItem]): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetItemsByState(value: js.Any => js.Array[ListItem]): Self = StObject.set(x, "getItemsByState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasState(value: (ListItem, String) => Boolean): Self = StObject.set(x, "hasState", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetItemState(value: (ListItem, String, Boolean) => js.Any): Self = StObject.set(x, "setItemState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetItems(value: js.Array[ListItem] => js.Any): Self = StObject.set(x, "setItems", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateItem(value: (ListItem, js.Object) => js.Any): Self = StObject.set(x, "updateItem", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ILocation[T /* <: LocationCfg */] extends StObject {
    
    /**
      * 获取定位信息
      * @return {T} 定位信息
      */
    def getLocation(): T = js.native
    
    /**
      * 获取定位方式，point，points，region，circle，'none' 五种值
      * @return {LocationType} 定位方式
      */
    def getLocationType(): LocationType = js.native
    
    /**
      * 获取偏移信息
      * @return {OffsetPoint} 偏移信息
      */
    def getOffset(): OffsetPoint = js.native
    
    /**
      * 设置定位信息
      * @param {T} cfg 定位信息
      */
    def setLocation(cfg: T): js.Any = js.native
    
    /**
      * 设置偏移量
      * @param {number} offsetX 偏移 x
      * @param {number} offsetY 偏移 y
      */
    def setOffset(offsetX: Double, offsetY: Double): js.Any = js.native
  }
  object ILocation {
    
    @scala.inline
    def apply[T /* <: LocationCfg */](
      getLocation: () => T,
      getLocationType: () => LocationType,
      getOffset: () => OffsetPoint,
      setLocation: T => js.Any,
      setOffset: (Double, Double) => js.Any
    ): ILocation[T] = {
      val __obj = js.Dynamic.literal(getLocation = js.Any.fromFunction0(getLocation), getLocationType = js.Any.fromFunction0(getLocationType), getOffset = js.Any.fromFunction0(getOffset), setLocation = js.Any.fromFunction1(setLocation), setOffset = js.Any.fromFunction2(setOffset))
      __obj.asInstanceOf[ILocation[T]]
    }
    
    @scala.inline
    implicit class ILocationMutableBuilder[Self <: ILocation[_], T /* <: LocationCfg */] (val x: Self with ILocation[T]) extends AnyVal {
      
      @scala.inline
      def setGetLocation(value: () => T): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLocationType(value: () => LocationType): Self = StObject.set(x, "getLocationType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetOffset(value: () => OffsetPoint): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetLocation(value: T => js.Any): Self = StObject.set(x, "setLocation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetOffset(value: (Double, Double) => js.Any): Self = StObject.set(x, "setOffset", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ISlider extends StObject {
    
    /**
      * 获取滑动的范围
      * @return {Range} 滑动范围
      */
    def getRange(): Range = js.native
    
    /**
      * 获取当前值
      * @return {number|number[]} 当前值
      */
    def getValue(): Double | js.Array[Double] = js.native
    
    /**
      * 设置可滑动范围
      * @param {number} min 最小值
      * @param {number} max 最大值
      */
    def setRange(min: Double, max: Double): js.Any = js.native
    
    def setValue(value: js.Array[Double]): js.Any = js.native
    /**
      * 设置当前值，单值或者两个值
      * @param {number | number[]} value 值
      */
    def setValue(value: Double): js.Any = js.native
  }
}
