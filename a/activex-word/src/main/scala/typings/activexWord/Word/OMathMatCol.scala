package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OMathMatCol extends js.Object {
  var Align: WdOMathHorizAlignType
  val Application: typings.activexWord.Word.Application
  val Args: OMathArgs
  val ColIndex: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.OMathMatCol_typekey")
  var WordDotOMathMatCol_typekey: OMathMatCol
  def Delete(): Unit
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
}

