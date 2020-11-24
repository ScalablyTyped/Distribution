package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandableListAdapter extends js.Object {
  
  def areAllItemsEnabled(): Boolean = js.native
  
  def getChild(groupPosition: Double, childPosition: Double): js.Any = js.native
  
  def getChildId(groupPosition: Double, childPosition: Double): Double = js.native
  
  def getChildView(
    groupPosition: Double,
    childPosition: Double,
    isLastChild: Boolean,
    convertView: View,
    parent: ViewGroup
  ): View = js.native
  
  def getChildrenCount(groupPosition: Double): Double = js.native
  
  def getCombinedChildId(groupId: Double, childId: Double): Double = js.native
  
  def getCombinedGroupId(groupId: Double): Double = js.native
  
  def getGroup(groupPosition: Double): js.Any = js.native
  
  def getGroupCount(): Double = js.native
  
  def getGroupId(groupPosition: Double): Double = js.native
  
  def getGroupView(groupPosition: Double, isExpanded: Boolean, convertView: View, parent: ViewGroup): View = js.native
  
  def hasStableIds(): Boolean = js.native
  
  def isChildSelectable(groupPosition: Double, childPosition: Double): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def onGroupCollapsed(groupPosition: Double): Unit = js.native
  
  def onGroupExpanded(groupPosition: Double): Unit = js.native
  
  def registerDataSetObserver(observer: DataSetObserver): Unit = js.native
  
  def unregisterDataSetObserver(observer: DataSetObserver): Unit = js.native
}
object ExpandableListAdapter {
  
  @scala.inline
  def apply(
    areAllItemsEnabled: () => Boolean,
    getChild: (Double, Double) => js.Any,
    getChildId: (Double, Double) => Double,
    getChildView: (Double, Double, Boolean, View, ViewGroup) => View,
    getChildrenCount: Double => Double,
    getCombinedChildId: (Double, Double) => Double,
    getCombinedGroupId: Double => Double,
    getGroup: Double => js.Any,
    getGroupCount: () => Double,
    getGroupId: Double => Double,
    getGroupView: (Double, Boolean, View, ViewGroup) => View,
    hasStableIds: () => Boolean,
    isChildSelectable: (Double, Double) => Boolean,
    isEmpty: () => Boolean,
    onGroupCollapsed: Double => Unit,
    onGroupExpanded: Double => Unit,
    registerDataSetObserver: DataSetObserver => Unit,
    unregisterDataSetObserver: DataSetObserver => Unit
  ): ExpandableListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getChild = js.Any.fromFunction2(getChild), getChildId = js.Any.fromFunction2(getChildId), getChildView = js.Any.fromFunction5(getChildView), getChildrenCount = js.Any.fromFunction1(getChildrenCount), getCombinedChildId = js.Any.fromFunction2(getCombinedChildId), getCombinedGroupId = js.Any.fromFunction1(getCombinedGroupId), getGroup = js.Any.fromFunction1(getGroup), getGroupCount = js.Any.fromFunction0(getGroupCount), getGroupId = js.Any.fromFunction1(getGroupId), getGroupView = js.Any.fromFunction4(getGroupView), hasStableIds = js.Any.fromFunction0(hasStableIds), isChildSelectable = js.Any.fromFunction2(isChildSelectable), isEmpty = js.Any.fromFunction0(isEmpty), onGroupCollapsed = js.Any.fromFunction1(onGroupCollapsed), onGroupExpanded = js.Any.fromFunction1(onGroupExpanded), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
    __obj.asInstanceOf[ExpandableListAdapter]
  }
  
  @scala.inline
  implicit class ExpandableListAdapterOps[Self <: ExpandableListAdapter] (val x: Self) extends AnyVal {
    
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
    def setAreAllItemsEnabled(value: () => Boolean): Self = this.set("areAllItemsEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChild(value: (Double, Double) => js.Any): Self = this.set("getChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetChildId(value: (Double, Double) => Double): Self = this.set("getChildId", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetChildView(value: (Double, Double, Boolean, View, ViewGroup) => View): Self = this.set("getChildView", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetChildrenCount(value: Double => Double): Self = this.set("getChildrenCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCombinedChildId(value: (Double, Double) => Double): Self = this.set("getCombinedChildId", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCombinedGroupId(value: Double => Double): Self = this.set("getCombinedGroupId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroup(value: Double => js.Any): Self = this.set("getGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupCount(value: () => Double): Self = this.set("getGroupCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupId(value: Double => Double): Self = this.set("getGroupId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupView(value: (Double, Boolean, View, ViewGroup) => View): Self = this.set("getGroupView", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHasStableIds(value: () => Boolean): Self = this.set("hasStableIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChildSelectable(value: (Double, Double) => Boolean): Self = this.set("isChildSelectable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnGroupCollapsed(value: Double => Unit): Self = this.set("onGroupCollapsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGroupExpanded(value: Double => Unit): Self = this.set("onGroupExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterDataSetObserver(value: DataSetObserver => Unit): Self = this.set("registerDataSetObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterDataSetObserver(value: DataSetObserver => Unit): Self = this.set("unregisterDataSetObserver", js.Any.fromFunction1(value))
  }
}
