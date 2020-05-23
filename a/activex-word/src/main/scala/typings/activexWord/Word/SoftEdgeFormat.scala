package typings.activexWord.Word

import typings.activexOffice.Office.MsoSoftEdgeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoftEdgeFormat extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Parent: js.Any
  var Radius: Double
  var Type: MsoSoftEdgeType
  @JSName("Word.SoftEdgeFormat_typekey")
  var WordDotSoftEdgeFormat_typekey: SoftEdgeFormat
}

object SoftEdgeFormat {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    Radius: Double,
    Type: MsoSoftEdgeType,
    WordDotSoftEdgeFormat_typekey: SoftEdgeFormat
  ): SoftEdgeFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SoftEdgeFormat_typekey")(WordDotSoftEdgeFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftEdgeFormat]
  }
}

