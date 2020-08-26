package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OMathMatCol extends js.Object {
  var Align: WdOMathHorizAlignType = js.native
  val Application: typings.activexWord.Word.Application = js.native
  val Args: OMathArgs = js.native
  val ColIndex: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.OMathMatCol_typekey")
  var WordDotOMathMatCol_typekey: OMathMatCol = js.native
  def Delete(): Unit = js.native
}

object OMathMatCol {
  @scala.inline
  def apply(
    Align: WdOMathHorizAlignType,
    Application: Application,
    Args: OMathArgs,
    ColIndex: Double,
    Creator: Double,
    Delete: () => Unit,
    Parent: js.Any,
    WordDotOMathMatCol_typekey: OMathMatCol
  ): OMathMatCol = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Args = Args.asInstanceOf[js.Any], ColIndex = ColIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.OMathMatCol_typekey")(WordDotOMathMatCol_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OMathMatCol]
  }
  @scala.inline
  implicit class OMathMatColOps[Self <: OMathMatCol] (val x: Self) extends AnyVal {
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
    def setAlign(value: WdOMathHorizAlignType): Self = this.set("Align", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: OMathArgs): Self = this.set("Args", value.asInstanceOf[js.Any])
    @scala.inline
    def setColIndex(value: Double): Self = this.set("ColIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotOMathMatCol_typekey(value: OMathMatCol): Self = this.set("Word.OMathMatCol_typekey", value.asInstanceOf[js.Any])
  }
  
}

