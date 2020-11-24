package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OMathMatRow extends js.Object {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Args: OMathArgs = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  val RowIndex: Double = js.native
  
  @JSName("Word.OMathMatRow_typekey")
  var WordDotOMathMatRow_typekey: OMathMatRow = js.native
}
object OMathMatRow {
  
  @scala.inline
  def apply(
    Application: Application,
    Args: OMathArgs,
    Creator: Double,
    Delete: () => Unit,
    Parent: js.Any,
    RowIndex: Double,
    WordDotOMathMatRow_typekey: OMathMatRow
  ): OMathMatRow = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any], RowIndex = RowIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMatRow_typekey")(WordDotOMathMatRow_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMatRow]
  }
  
  @scala.inline
  implicit class OMathMatRowOps[Self <: OMathMatRow] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgs(value: OMathArgs): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("RowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotOMathMatRow_typekey(value: OMathMatRow): Self = this.set("Word.OMathMatRow_typekey", value.asInstanceOf[js.Any])
  }
}
