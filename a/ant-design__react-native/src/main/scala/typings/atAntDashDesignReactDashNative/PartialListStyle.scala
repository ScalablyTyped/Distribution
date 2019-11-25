package typings.atAntDashDesignReactDashNative

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ant-design/react-native.@ant-design/react-native/lib/list/style.ListStyle> */
trait PartialListStyle extends js.Object {
  var Arrow: js.UndefOr[ViewStyle] = js.undefined
  var ArrowV: js.UndefOr[ViewStyle] = js.undefined
  var Body: js.UndefOr[ViewStyle] = js.undefined
  var BodyBottomLine: js.UndefOr[ViewStyle] = js.undefined
  var Brief: js.UndefOr[ViewStyle] = js.undefined
  var BriefText: js.UndefOr[TextStyle] = js.undefined
  var Content: js.UndefOr[TextStyle] = js.undefined
  var Extra: js.UndefOr[TextStyle] = js.undefined
  var Footer: js.UndefOr[TextStyle] = js.undefined
  var Header: js.UndefOr[TextStyle] = js.undefined
  var Item: js.UndefOr[ViewStyle] = js.undefined
  var Line: js.UndefOr[ViewStyle] = js.undefined
  var Thumb: js.UndefOr[ImageStyle] = js.undefined
  var column: js.UndefOr[ViewStyle] = js.undefined
  var multipleLine: js.UndefOr[ViewStyle] = js.undefined
  var multipleThumb: js.UndefOr[ImageStyle] = js.undefined
  var underlayColor: js.UndefOr[ViewStyle] = js.undefined
}

object PartialListStyle {
  @scala.inline
  def apply(
    Arrow: ViewStyle = null,
    ArrowV: ViewStyle = null,
    Body: ViewStyle = null,
    BodyBottomLine: ViewStyle = null,
    Brief: ViewStyle = null,
    BriefText: TextStyle = null,
    Content: TextStyle = null,
    Extra: TextStyle = null,
    Footer: TextStyle = null,
    Header: TextStyle = null,
    Item: ViewStyle = null,
    Line: ViewStyle = null,
    Thumb: ImageStyle = null,
    column: ViewStyle = null,
    multipleLine: ViewStyle = null,
    multipleThumb: ImageStyle = null,
    underlayColor: ViewStyle = null
  ): PartialListStyle = {
    val __obj = js.Dynamic.literal()
    if (Arrow != null) __obj.updateDynamic("Arrow")(Arrow.asInstanceOf[js.Any])
    if (ArrowV != null) __obj.updateDynamic("ArrowV")(ArrowV.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (BodyBottomLine != null) __obj.updateDynamic("BodyBottomLine")(BodyBottomLine.asInstanceOf[js.Any])
    if (Brief != null) __obj.updateDynamic("Brief")(Brief.asInstanceOf[js.Any])
    if (BriefText != null) __obj.updateDynamic("BriefText")(BriefText.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Extra != null) __obj.updateDynamic("Extra")(Extra.asInstanceOf[js.Any])
    if (Footer != null) __obj.updateDynamic("Footer")(Footer.asInstanceOf[js.Any])
    if (Header != null) __obj.updateDynamic("Header")(Header.asInstanceOf[js.Any])
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (Line != null) __obj.updateDynamic("Line")(Line.asInstanceOf[js.Any])
    if (Thumb != null) __obj.updateDynamic("Thumb")(Thumb.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (multipleLine != null) __obj.updateDynamic("multipleLine")(multipleLine.asInstanceOf[js.Any])
    if (multipleThumb != null) __obj.updateDynamic("multipleThumb")(multipleThumb.asInstanceOf[js.Any])
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialListStyle]
  }
}

