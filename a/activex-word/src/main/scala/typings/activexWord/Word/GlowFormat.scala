package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlowFormat extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Color: ColorFormat
  val Creator: Double
  val Parent: js.Any
  var Radius: Double
  var Transparency: Double
  @JSName("Word.GlowFormat_typekey")
  var WordDotGlowFormat_typekey: GlowFormat
}

object GlowFormat {
  @scala.inline
  def apply(
    Application: Application,
    Color: ColorFormat,
    Creator: Double,
    Parent: js.Any,
    Radius: Double,
    Transparency: Double,
    WordDotGlowFormat_typekey: GlowFormat
  ): GlowFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Radius = Radius.asInstanceOf[js.Any], Transparency = Transparency.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.GlowFormat_typekey")(WordDotGlowFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlowFormat]
  }
}

