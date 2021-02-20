package typings.amapJsApi.AMap

import typings.amapJsApi.amapJsApiStrings.close
import typings.amapJsApi.amapJsApiStrings.items
import typings.amapJsApi.amapJsApiStrings.open
import typings.amapJsApi.anon.Target
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenu[ExtraData] extends Overlay[ExtraData] {
  
  /**
    * 右键菜单中添加菜单项
    * @param text 菜单显示内容
    * @param fn 该菜单下需进行的操作
    * @param num 当前菜单项在右键菜单中的排序位置，以0开始
    */
  def addItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit]): Unit = js.native
  def addItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit], num: Double): Unit = js.native
  
  /**
    * 关闭右键菜单
    */
  def close(): Unit = js.native
  
  /**
    * 在地图的指定位置打开右键菜单。
    * @param map 目标地图
    * @param position 打开位置经纬度
    */
  def open(map: Map, position: LocationValue): Unit = js.native
  
  /**
    * 删除一个菜单项
    * @param text 菜单显示内容
    * @param fn 该菜单下需进行的操作
    */
  def removeItem(text: String, fn: js.ThisFunction0[/* this */ HTMLLIElement, Unit]): Unit = js.native
}
object ContextMenu {
  
  @js.native
  trait EventMap[I] extends StObject {
    
    var close: Event_[typings.amapJsApi.amapJsApiStrings.close, Target[I]] = js.native
    
    var items: Event_[typings.amapJsApi.amapJsApiStrings.items, js.UndefOr[scala.Nothing]] = js.native
    
    var open: Event_[typings.amapJsApi.amapJsApiStrings.open, Target[I]] = js.native
  }
  object EventMap {
    
    @scala.inline
    def apply[I](
      close: Event_[close, Target[I]],
      items: Event_[items, js.UndefOr[scala.Nothing]],
      open: Event_[open, Target[I]]
    ): EventMap[I] = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap[I]]
    }
    
    @scala.inline
    implicit class EventMapMutableBuilder[Self <: EventMap[_], I] (val x: Self with EventMap[I]) extends AnyVal {
      
      @scala.inline
      def setClose(value: Event_[close, Target[I]]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItems(value: Event_[items, js.UndefOr[scala.Nothing]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpen(value: Event_[open, Target[I]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * 右键菜单内容
      */
    var content: js.UndefOr[String | HTMLElement] = js.native
    
    // internal
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String | HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
