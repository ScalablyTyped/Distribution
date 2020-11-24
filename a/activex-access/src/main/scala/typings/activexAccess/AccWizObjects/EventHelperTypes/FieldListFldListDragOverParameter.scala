package typings.activexAccess.AccWizObjects.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldListFldListDragOverParameter extends js.Object {
  
  val SourceCtlName: String = js.native
  
  val SourceFieldList: Double = js.native
  
  val SourceRow: Double = js.native
  
  val State: Double = js.native
  
  val TargetCtlName: String = js.native
  
  val TargetFieldList: Double = js.native
  
  val TargetRow: Double = js.native
}
object FieldListFldListDragOverParameter {
  
  @scala.inline
  def apply(
    SourceCtlName: String,
    SourceFieldList: Double,
    SourceRow: Double,
    State: Double,
    TargetCtlName: String,
    TargetFieldList: Double,
    TargetRow: Double
  ): FieldListFldListDragOverParameter = {
    val __obj = js.Dynamic.literal(SourceCtlName = SourceCtlName.asInstanceOf[js.Any], SourceFieldList = SourceFieldList.asInstanceOf[js.Any], SourceRow = SourceRow.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], TargetCtlName = TargetCtlName.asInstanceOf[js.Any], TargetFieldList = TargetFieldList.asInstanceOf[js.Any], TargetRow = TargetRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldListFldListDragOverParameter]
  }
  
  @scala.inline
  implicit class FieldListFldListDragOverParameterOps[Self <: FieldListFldListDragOverParameter] (val x: Self) extends AnyVal {
    
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
    def setSourceCtlName(value: String): Self = this.set("SourceCtlName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFieldList(value: Double): Self = this.set("SourceFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRow(value: Double): Self = this.set("SourceRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Double): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCtlName(value: String): Self = this.set("TargetCtlName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFieldList(value: Double): Self = this.set("TargetFieldList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRow(value: Double): Self = this.set("TargetRow", value.asInstanceOf[js.Any])
  }
}
