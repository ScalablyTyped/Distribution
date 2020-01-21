package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.SVGAngle")
@js.native
class SVGAngle protected () extends js.Object {
  @JSName("MSHTML.SVGAngle_typekey")
  var MSHTMLDotSVGAngle_typekey: SVGAngle = js.native
  var unitType: Double = js.native
  var value: Double = js.native
  var valueAsString: String = js.native
  var valueInSpecifiedUnits: Double = js.native
  def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
}

