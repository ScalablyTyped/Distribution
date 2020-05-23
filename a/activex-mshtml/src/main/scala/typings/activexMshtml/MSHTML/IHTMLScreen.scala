package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLScreen extends js.Object {
  @JSName("MSHTML.IHTMLScreen_typekey")
  var MSHTMLDotIHTMLScreen_typekey: IHTMLScreen
  val availHeight: Double
  val availWidth: Double
  var bufferDepth: Double
  val colorDepth: Double
  val fontSmoothingEnabled: Boolean
  val height: Double
  var updateInterval: Double
  val width: Double
}

object IHTMLScreen {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLScreen_typekey: IHTMLScreen,
    availHeight: Double,
    availWidth: Double,
    bufferDepth: Double,
    colorDepth: Double,
    fontSmoothingEnabled: Boolean,
    height: Double,
    updateInterval: Double,
    width: Double
  ): IHTMLScreen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], bufferDepth = bufferDepth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], fontSmoothingEnabled = fontSmoothingEnabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], updateInterval = updateInterval.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLScreen_typekey")(MSHTMLDotIHTMLScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLScreen]
  }
}

