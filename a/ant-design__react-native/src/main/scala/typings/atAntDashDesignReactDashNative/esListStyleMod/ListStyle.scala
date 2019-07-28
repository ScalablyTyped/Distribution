package typings.atAntDashDesignReactDashNative.esListStyleMod

import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStyle extends js.Object {
  var Arrow: ViewStyle
  var ArrowV: ViewStyle
  var Body: ViewStyle
  var BodyBottomLine: ViewStyle
  var Brief: ViewStyle
  var BriefText: TextStyle
  var Content: TextStyle
  var Extra: TextStyle
  var Footer: TextStyle
  var Header: TextStyle
  var Item: ViewStyle
  var Line: ViewStyle
  var Thumb: ImageStyle
  var column: ViewStyle
  var multipleLine: ViewStyle
  var multipleThumb: ImageStyle
  var underlayColor: ViewStyle
}

object ListStyle {
  @scala.inline
  def apply(
    Arrow: ViewStyle,
    ArrowV: ViewStyle,
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
    val __obj = js.Dynamic.literal(Arrow = Arrow, ArrowV = ArrowV, Body = Body, BodyBottomLine = BodyBottomLine, Brief = Brief, BriefText = BriefText, Content = Content, Extra = Extra, Footer = Footer, Header = Header, Item = Item, Line = Line, Thumb = Thumb, column = column, multipleLine = multipleLine, multipleThumb = multipleThumb, underlayColor = underlayColor)
  
    __obj.asInstanceOf[ListStyle]
  }
}

