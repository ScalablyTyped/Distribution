package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shading extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  var BackgroundPatternColor: WdColor = js.native
  var BackgroundPatternColorIndex: WdColorIndex = js.native
  val Creator: Double = js.native
  var ForegroundPatternColor: WdColor = js.native
  var ForegroundPatternColorIndex: WdColorIndex = js.native
  val Parent: js.Any = js.native
  var Texture: WdTextureIndex = js.native
  @JSName("Word.Shading_typekey")
  var WordDotShading_typekey: Shading = js.native
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
  @scala.inline
  implicit class ShadingOps[Self <: Shading] (val x: Self) extends AnyVal {
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
    def setBackgroundPatternColor(value: WdColor): Self = this.set("BackgroundPatternColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundPatternColorIndex(value: WdColorIndex): Self = this.set("BackgroundPatternColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setForegroundPatternColor(value: WdColor): Self = this.set("ForegroundPatternColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setForegroundPatternColorIndex(value: WdColorIndex): Self = this.set("ForegroundPatternColorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture(value: WdTextureIndex): Self = this.set("Texture", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotShading_typekey(value: Shading): Self = this.set("Word.Shading_typekey", value.asInstanceOf[js.Any])
  }
  
}

