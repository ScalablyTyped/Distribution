package typings.accessibility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends js.Object {
  /** @default '#4054b2' */
  var backgroundColor: js.UndefOr[String] = js.native
  /** @default false */
  var circular: js.UndefOr[Boolean] = js.native
  /** @default false */
  var circularBorder: js.UndefOr[Boolean] = js.native
  /** @default '#fff' */
  var color: js.UndefOr[String] = js.native
  var dimensions: js.UndefOr[Dimensions] = js.native
  /** @default 'Material Icons' */
  var fontClass: js.UndefOr[String] = js.native
  /** @default ['https://fonts.googleapis.com/icon?family=Material+Icons'] */
  var fontFaceSrc: js.UndefOr[js.Array[String]] = js.native
  /** @default 'Material Icons' */
  var fontFamily: js.UndefOr[String] = js.native
  /** @default 'accessible' */
  var img: js.UndefOr[String] = js.native
  var position: js.UndefOr[Position] = js.native
  /** @default false */
  var useEmojis: js.UndefOr[Boolean] = js.native
  /** @default '9999' */
  var zIndex: js.UndefOr[String | Double] = js.native
}

object Icon {
  @scala.inline
  def apply(): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setCircular(value: Boolean): Self = this.set("circular", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
    @scala.inline
    def setCircularBorder(value: Boolean): Self = this.set("circularBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircularBorder: Self = this.set("circularBorder", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDimensions(value: Dimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setFontClass(value: String): Self = this.set("fontClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontClass: Self = this.set("fontClass", js.undefined)
    @scala.inline
    def setFontFaceSrcVarargs(value: String*): Self = this.set("fontFaceSrc", js.Array(value :_*))
    @scala.inline
    def setFontFaceSrc(value: js.Array[String]): Self = this.set("fontFaceSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFaceSrc: Self = this.set("fontFaceSrc", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setImg(value: String): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setUseEmojis(value: Boolean): Self = this.set("useEmojis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseEmojis: Self = this.set("useEmojis", js.undefined)
    @scala.inline
    def setZIndex(value: String | Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

