package typings.androiduix.android.widget.ExpandableListConnector

import typings.androiduix.android.widget.ExpandableListPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionMetadata extends js.Object {
  
  var groupInsertIndex: Double = js.native
  
  var groupMetadata: GroupMetadata = js.native
  
  def isExpanded(): Boolean = js.native
  
  var position: ExpandableListPosition = js.native
  
  def recycle(): Unit = js.native
  
  /* private */ def resetState(): js.Any = js.native
}
object PositionMetadata {
  
  @scala.inline
  def apply(
    groupInsertIndex: Double,
    groupMetadata: GroupMetadata,
    isExpanded: () => Boolean,
    position: ExpandableListPosition,
    recycle: () => Unit,
    resetState: () => js.Any
  ): PositionMetadata = {
    val __obj = js.Dynamic.literal(groupInsertIndex = groupInsertIndex.asInstanceOf[js.Any], groupMetadata = groupMetadata.asInstanceOf[js.Any], isExpanded = js.Any.fromFunction0(isExpanded), position = position.asInstanceOf[js.Any], recycle = js.Any.fromFunction0(recycle), resetState = js.Any.fromFunction0(resetState))
    __obj.asInstanceOf[PositionMetadata]
  }
  
  @scala.inline
  implicit class PositionMetadataOps[Self <: PositionMetadata] (val x: Self) extends AnyVal {
    
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
    def setGroupInsertIndex(value: Double): Self = this.set("groupInsertIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupMetadata(value: GroupMetadata): Self = this.set("groupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExpanded(value: () => Boolean): Self = this.set("isExpanded", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPosition(value: ExpandableListPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecycle(value: () => Unit): Self = this.set("recycle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResetState(value: () => js.Any): Self = this.set("resetState", js.Any.fromFunction0(value))
  }
}
