package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionFormat extends js.Object {
  val Application: js.Any
  var Blur: Double
  val Creator: Double
  @JSName("Office.ReflectionFormat_typekey")
  var OfficeDotReflectionFormat_typekey: ReflectionFormat
  var Offset: Double
  var Size: Double
  var Transparency: Double
  var Type: MsoReflectionType
}

object ReflectionFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Blur: Double,
    Creator: Double,
    OfficeDotReflectionFormat_typekey: ReflectionFormat,
    Offset: Double,
    Size: Double,
    Transparency: Double,
    Type: MsoReflectionType
  ): ReflectionFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ReflectionFormat_typekey")(OfficeDotReflectionFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFormat]
  }
}

