package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLScreen extends js.Object {
  @JSName("MSHTML.HTMLScreen_typekey")
  var MSHTMLDotHTMLScreen_typekey: HTMLScreen
  val availHeight: Double
  val availWidth: Double
  var bufferDepth: Double
  val colorDepth: Double
  val constructor: js.Any
  val deviceXDPI: Double
  val deviceYDPI: Double
  val fontSmoothingEnabled: Boolean
  val height: Double
  val logicalXDPI: Double
  val logicalYDPI: Double
  val pixelDepth: Double
  val systemXDPI: Double
  val systemYDPI: Double
  var updateInterval: Double
  val width: Double
}

object HTMLScreen {
  @scala.inline
  def apply(
    MSHTMLDotHTMLScreen_typekey: HTMLScreen,
    availHeight: Double,
    availWidth: Double,
    bufferDepth: Double,
    colorDepth: Double,
    constructor: js.Any,
    deviceXDPI: Double,
    deviceYDPI: Double,
    fontSmoothingEnabled: Boolean,
    height: Double,
    logicalXDPI: Double,
    logicalYDPI: Double,
    pixelDepth: Double,
    systemXDPI: Double,
    systemYDPI: Double,
    updateInterval: Double,
    width: Double
  ): HTMLScreen = {
    val __obj = js.Dynamic.literal(availHeight = availHeight.asInstanceOf[js.Any], availWidth = availWidth.asInstanceOf[js.Any], bufferDepth = bufferDepth.asInstanceOf[js.Any], colorDepth = colorDepth.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], deviceXDPI = deviceXDPI.asInstanceOf[js.Any], deviceYDPI = deviceYDPI.asInstanceOf[js.Any], fontSmoothingEnabled = fontSmoothingEnabled.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], logicalXDPI = logicalXDPI.asInstanceOf[js.Any], logicalYDPI = logicalYDPI.asInstanceOf[js.Any], pixelDepth = pixelDepth.asInstanceOf[js.Any], systemXDPI = systemXDPI.asInstanceOf[js.Any], systemYDPI = systemYDPI.asInstanceOf[js.Any], updateInterval = updateInterval.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLScreen_typekey")(MSHTMLDotHTMLScreen_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLScreen]
  }
}

