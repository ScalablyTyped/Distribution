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
    if (Arrow != null) __obj.updateDynamic("Arrow")(Arrow)
    if (ArrowV != null) __obj.updateDynamic("ArrowV")(ArrowV)
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (BodyBottomLine != null) __obj.updateDynamic("BodyBottomLine")(BodyBottomLine)
    if (Brief != null) __obj.updateDynamic("Brief")(Brief)
    if (BriefText != null) __obj.updateDynamic("BriefText")(BriefText)
    if (Content != null) __obj.updateDynamic("Content")(Content)
    if (Extra != null) __obj.updateDynamic("Extra")(Extra)
    if (Footer != null) __obj.updateDynamic("Footer")(Footer)
    if (Header != null) __obj.updateDynamic("Header")(Header)
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (Line != null) __obj.updateDynamic("Line")(Line)
    if (Thumb != null) __obj.updateDynamic("Thumb")(Thumb)
    if (column != null) __obj.updateDynamic("column")(column)
    if (multipleLine != null) __obj.updateDynamic("multipleLine")(multipleLine)
    if (multipleThumb != null) __obj.updateDynamic("multipleThumb")(multipleThumb)
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    __obj.asInstanceOf[PartialListStyle]
  }
}

