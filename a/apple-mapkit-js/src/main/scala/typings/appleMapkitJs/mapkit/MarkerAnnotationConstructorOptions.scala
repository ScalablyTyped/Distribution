package typings.appleMapkitJs.mapkit

import typings.appleMapkitJs.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the options that initialize a marker annotation.
  */
@js.native
trait MarkerAnnotationConstructorOptions extends AnnotationConstructorOptions {
  /**
    * The background color of the balloon.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The fill color of the glyph.
    */
  var glyphColor: js.UndefOr[String] = js.native
  /**
    * The image to display in the marker balloon.
    */
  var glyphImage: js.UndefOr[`1`] = js.native
  /**
    * The text to display in the marker balloon.
    */
  var glyphText: js.UndefOr[String] = js.native
  /**
    * The image to display in the balloon when the marker is selected.
    */
  var selectedGlyphImage: js.UndefOr[js.Object] = js.native
  /**
    * A value that determines the behavior of the subtitle's visibility.
    */
  var subtitleVisibility: js.UndefOr[String] = js.native
  /**
    * A value that determines the behavior of the title's visibility.
    */
  var titleVisibility: js.UndefOr[String] = js.native
}

object MarkerAnnotationConstructorOptions {
  @scala.inline
  def apply(): MarkerAnnotationConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerAnnotationConstructorOptions]
  }
  @scala.inline
  implicit class MarkerAnnotationConstructorOptionsOps[Self <: MarkerAnnotationConstructorOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setGlyphColor(value: String): Self = this.set("glyphColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphColor: Self = this.set("glyphColor", js.undefined)
    @scala.inline
    def setGlyphImage(value: `1`): Self = this.set("glyphImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphImage: Self = this.set("glyphImage", js.undefined)
    @scala.inline
    def setGlyphText(value: String): Self = this.set("glyphText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphText: Self = this.set("glyphText", js.undefined)
    @scala.inline
    def setSelectedGlyphImage(value: js.Object): Self = this.set("selectedGlyphImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedGlyphImage: Self = this.set("selectedGlyphImage", js.undefined)
    @scala.inline
    def setSubtitleVisibility(value: String): Self = this.set("subtitleVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitleVisibility: Self = this.set("subtitleVisibility", js.undefined)
    @scala.inline
    def setTitleVisibility(value: String): Self = this.set("titleVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleVisibility: Self = this.set("titleVisibility", js.undefined)
  }
  
}

