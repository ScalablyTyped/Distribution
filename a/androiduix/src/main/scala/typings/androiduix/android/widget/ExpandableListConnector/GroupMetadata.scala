package typings.androiduix.android.widget.ExpandableListConnector

import typings.androiduix.java_.lang.Comparable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMetadata extends Comparable[GroupMetadata] {
  
  var flPos: Double = js.native
  
  var gId: Double = js.native
  
  var gPos: Double = js.native
  
  var lastChildFlPos: Double = js.native
}
object GroupMetadata {
  
  @scala.inline
  def apply(
    compareTo: GroupMetadata => Double,
    flPos: Double,
    gId: Double,
    gPos: Double,
    lastChildFlPos: Double
  ): GroupMetadata = {
    val __obj = js.Dynamic.literal(compareTo = js.Any.fromFunction1(compareTo), flPos = flPos.asInstanceOf[js.Any], gId = gId.asInstanceOf[js.Any], gPos = gPos.asInstanceOf[js.Any], lastChildFlPos = lastChildFlPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMetadata]
  }
  
  @scala.inline
  implicit class GroupMetadataOps[Self <: GroupMetadata] (val x: Self) extends AnyVal {
    
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
    def setFlPos(value: Double): Self = this.set("flPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGId(value: Double): Self = this.set("gId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGPos(value: Double): Self = this.set("gPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChildFlPos(value: Double): Self = this.set("lastChildFlPos", value.asInstanceOf[js.Any])
  }
}
