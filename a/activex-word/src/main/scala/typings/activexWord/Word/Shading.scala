package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shading extends js.Object {
  val Application: typings.activexWord.Word.Application
  var BackgroundPatternColor: WdColor
  var BackgroundPatternColorIndex: WdColorIndex
  val Creator: Double
  var ForegroundPatternColor: WdColor
  var ForegroundPatternColorIndex: WdColorIndex
  val Parent: js.Any
  var Texture: WdTextureIndex
  @JSName("Word.Shading_typekey")
  var WordDotShading_typekey: Shading
}

object Shading {
  @scala.inline
  def apply(
    Application: Application,
    BackgroundPatternColor: WdColor,
    BackgroundPatternColorIndex: WdColorIndex,
    Creator: Double,
    ForegroundPatternColor: WdColor,
    ForegroundPatternColorIndex: WdColorIndex,
    Parent: js.Any,
    Texture: WdTextureIndex,
    WordDotShading_typekey: Shading
  ): Shading = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BackgroundPatternColor = BackgroundPatternColor.asInstanceOf[js.Any], BackgroundPatternColorIndex = BackgroundPatternColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ForegroundPatternColor = ForegroundPatternColor.asInstanceOf[js.Any], ForegroundPatternColorIndex = ForegroundPatternColorIndex.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Texture = Texture.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Shading_typekey")(WordDotShading_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shading]
  }
}

