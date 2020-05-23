package typings.activexWord.Word

import typings.activexOffice.Office.MsoReflectionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionFormat extends js.Object {
  val Application: typings.activexWord.Word.Application
  var Blur: Double
  val Creator: Double
  var Offset: Double
  val Parent: js.Any
  var Size: Double
  var Transparency: Double
  var Type: MsoReflectionType
  @JSName("Word.ReflectionFormat_typekey")
  var WordDotReflectionFormat_typekey: ReflectionFormat
}

object ReflectionFormat {
  @scala.inline
  def apply(
    Application: Application,
    Blur: Double,
    Creator: Double,
    Offset: Double,
    Parent: js.Any,
    Size: Double,
    Transparency: Double,
    Type: MsoReflectionType,
    WordDotReflectionFormat_typekey: ReflectionFormat
  ): ReflectionFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Blur = Blur.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ReflectionFormat_typekey")(WordDotReflectionFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionFormat]
  }
}

