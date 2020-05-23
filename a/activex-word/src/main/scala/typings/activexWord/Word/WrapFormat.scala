package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapFormat extends js.Object {
  var AllowOverlap: Double
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var DistanceBottom: Double
  var DistanceLeft: Double
  var DistanceRight: Double
  var DistanceTop: Double
  val Parent: js.Any
  var Side: WdWrapSideType
  var Type: WdWrapType
  @JSName("Word.WrapFormat_typekey")
  var WordDotWrapFormat_typekey: WrapFormat
}

object WrapFormat {
  @scala.inline
  def apply(
    AllowOverlap: Double,
    Application: Application,
    Creator: Double,
    DistanceBottom: Double,
    DistanceLeft: Double,
    DistanceRight: Double,
    DistanceTop: Double,
    Parent: js.Any,
    Side: WdWrapSideType,
    Type: WdWrapType,
    WordDotWrapFormat_typekey: WrapFormat
  ): WrapFormat = {
    val __obj = js.Dynamic.literal(AllowOverlap = AllowOverlap.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DistanceBottom = DistanceBottom.asInstanceOf[js.Any], DistanceLeft = DistanceLeft.asInstanceOf[js.Any], DistanceRight = DistanceRight.asInstanceOf[js.Any], DistanceTop = DistanceTop.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Side = Side.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.WrapFormat_typekey")(WordDotWrapFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapFormat]
  }
}

