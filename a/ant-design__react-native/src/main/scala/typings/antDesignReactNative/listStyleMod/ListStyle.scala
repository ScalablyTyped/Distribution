package typings.antDesignReactNative.listStyleMod

import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStyle extends js.Object {
  var Arrow: TextStyle = js.native
  var ArrowV: TextStyle = js.native
  var Body: ViewStyle = js.native
  var BodyBottomLine: ViewStyle = js.native
  var Brief: ViewStyle = js.native
  var BriefText: TextStyle = js.native
  var Content: TextStyle = js.native
  var Extra: TextStyle = js.native
  var Footer: TextStyle = js.native
  var Header: TextStyle = js.native
  var Item: ViewStyle = js.native
  var Line: ViewStyle = js.native
  var Thumb: ImageStyle = js.native
  var column: ViewStyle = js.native
  var multipleLine: ViewStyle = js.native
  var multipleThumb: ImageStyle = js.native
  var underlayColor: ViewStyle = js.native
}

object ListStyle {
  @scala.inline
  def apply(
    Arrow: TextStyle,
    ArrowV: TextStyle,
    Body: ViewStyle,
    BodyBottomLine: ViewStyle,
    Brief: ViewStyle,
    BriefText: TextStyle,
    Content: TextStyle,
    Extra: TextStyle,
    Footer: TextStyle,
    Header: TextStyle,
    Item: ViewStyle,
    Line: ViewStyle,
    Thumb: ImageStyle,
    column: ViewStyle,
    multipleLine: ViewStyle,
    multipleThumb: ImageStyle,
    underlayColor: ViewStyle
  ): ListStyle = {
    val __obj = js.Dynamic.literal(Arrow = Arrow.asInstanceOf[js.Any], ArrowV = ArrowV.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any], BodyBottomLine = BodyBottomLine.asInstanceOf[js.Any], Brief = Brief.asInstanceOf[js.Any], BriefText = BriefText.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Extra = Extra.asInstanceOf[js.Any], Footer = Footer.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Line = Line.asInstanceOf[js.Any], Thumb = Thumb.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], multipleLine = multipleLine.asInstanceOf[js.Any], multipleThumb = multipleThumb.asInstanceOf[js.Any], underlayColor = underlayColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStyle]
  }
  @scala.inline
  implicit class ListStyleOps[Self <: ListStyle] (val x: Self) extends AnyVal {
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
    def setArrow(value: TextStyle): Self = this.set("Arrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setArrowV(value: TextStyle): Self = this.set("ArrowV", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: ViewStyle): Self = this.set("Body", value.asInstanceOf[js.Any])
    @scala.inline
    def setBodyBottomLine(value: ViewStyle): Self = this.set("BodyBottomLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrief(value: ViewStyle): Self = this.set("Brief", value.asInstanceOf[js.Any])
    @scala.inline
    def setBriefText(value: TextStyle): Self = this.set("BriefText", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: TextStyle): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: TextStyle): Self = this.set("Extra", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: TextStyle): Self = this.set("Footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: TextStyle): Self = this.set("Header", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: ViewStyle): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: ViewStyle): Self = this.set("Line", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumb(value: ImageStyle): Self = this.set("Thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: ViewStyle): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultipleLine(value: ViewStyle): Self = this.set("multipleLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultipleThumb(value: ImageStyle): Self = this.set("multipleThumb", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderlayColor(value: ViewStyle): Self = this.set("underlayColor", value.asInstanceOf[js.Any])
  }
  
}

