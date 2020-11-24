package typings.antvComponent.interfacesMod

import typings.antvComponent.typesMod.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IList extends js.Object {
  
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
  implicit class IListOps[Self <: IList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearItems(value: () => js.Any): Self = this.set("clearItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearItemsState(value: String => js.Any): Self = this.set("clearItemsState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItems(value: () => js.Array[ListItem]): Self = this.set("getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemsByState(value: js.Any => js.Array[ListItem]): Self = this.set("getItemsByState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasState(value: (ListItem, String) => Boolean): Self = this.set("hasState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetItemState(value: (ListItem, String, Boolean) => js.Any): Self = this.set("setItemState", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetItems(value: js.Array[ListItem] => js.Any): Self = this.set("setItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateItem(value: (ListItem, js.Object) => js.Any): Self = this.set("updateItem", js.Any.fromFunction2(value))
  }
}
