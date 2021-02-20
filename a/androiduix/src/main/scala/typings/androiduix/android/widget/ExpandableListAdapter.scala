package typings.androiduix.android.widget

import typings.androiduix.android.database.DataSetObserver
import typings.androiduix.android.view.View
import typings.androiduix.android.view.ViewGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandableListAdapter extends StObject {
  
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
  implicit class ExpandableListAdapterMutableBuilder[Self <: ExpandableListAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreAllItemsEnabled(value: () => Boolean): Self = StObject.set(x, "areAllItemsEnabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetChild(value: (Double, Double) => js.Any): Self = StObject.set(x, "getChild", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetChildId(value: (Double, Double) => Double): Self = StObject.set(x, "getChildId", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetChildView(value: (Double, Double, Boolean, View, ViewGroup) => View): Self = StObject.set(x, "getChildView", js.Any.fromFunction5(value))
    
    @scala.inline
    def setGetChildrenCount(value: Double => Double): Self = StObject.set(x, "getChildrenCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCombinedChildId(value: (Double, Double) => Double): Self = StObject.set(x, "getCombinedChildId", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCombinedGroupId(value: Double => Double): Self = StObject.set(x, "getCombinedGroupId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroup(value: Double => js.Any): Self = StObject.set(x, "getGroup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupCount(value: () => Double): Self = StObject.set(x, "getGroupCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupId(value: Double => Double): Self = StObject.set(x, "getGroupId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupView(value: (Double, Boolean, View, ViewGroup) => View): Self = StObject.set(x, "getGroupView", js.Any.fromFunction4(value))
    
    @scala.inline
    def setHasStableIds(value: () => Boolean): Self = StObject.set(x, "hasStableIds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsChildSelectable(value: (Double, Double) => Boolean): Self = StObject.set(x, "isChildSelectable", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnGroupCollapsed(value: Double => Unit): Self = StObject.set(x, "onGroupCollapsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnGroupExpanded(value: Double => Unit): Self = StObject.set(x, "onGroupExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterDataSetObserver(value: DataSetObserver => Unit): Self = StObject.set(x, "registerDataSetObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregisterDataSetObserver(value: DataSetObserver => Unit): Self = StObject.set(x, "unregisterDataSetObserver", js.Any.fromFunction1(value))
  }
}
