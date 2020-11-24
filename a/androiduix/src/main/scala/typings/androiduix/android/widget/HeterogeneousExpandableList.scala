package typings.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeterogeneousExpandableList extends js.Object {
  
  def getChildType(groupPosition: Double, childPosition: Double): Double = js.native
  
  def getChildTypeCount(): Double = js.native
  
  def getGroupType(groupPosition: Double): Double = js.native
  
  def getGroupTypeCount(): Double = js.native
}
object HeterogeneousExpandableList {
  
  @scala.inline
  def apply(
    getChildType: (Double, Double) => Double,
    getChildTypeCount: () => Double,
    getGroupType: Double => Double,
    getGroupTypeCount: () => Double
  ): HeterogeneousExpandableList = {
    val __obj = js.Dynamic.literal(getChildType = js.Any.fromFunction2(getChildType), getChildTypeCount = js.Any.fromFunction0(getChildTypeCount), getGroupType = js.Any.fromFunction1(getGroupType), getGroupTypeCount = js.Any.fromFunction0(getGroupTypeCount))
    __obj.asInstanceOf[HeterogeneousExpandableList]
  }
  
  @scala.inline
  implicit class HeterogeneousExpandableListOps[Self <: HeterogeneousExpandableList] (val x: Self) extends AnyVal {
    
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
    def setGetChildType(value: (Double, Double) => Double): Self = this.set("getChildType", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetChildTypeCount(value: () => Double): Self = this.set("getChildTypeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupType(value: Double => Double): Self = this.set("getGroupType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetGroupTypeCount(value: () => Double): Self = this.set("getGroupTypeCount", js.Any.fromFunction0(value))
  }
}
