package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAngle extends js.Object {
  @JSName("MSHTML.SVGAngle_typekey")
  var MSHTMLDotSVGAngle_typekey: SVGAngle
  var unitType: Double
  var value: Double
  var valueAsString: String
  var valueInSpecifiedUnits: Double
  def convertToSpecifiedUnits(unitType: Double): Unit
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit
}

object SVGAngle {
  @scala.inline
  def apply(
    MSHTMLDotSVGAngle_typekey: SVGAngle,
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: String,
    valueInSpecifiedUnits: Double
  ): SVGAngle = {
    val __obj = js.Dynamic.literal(convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGAngle_typekey")(MSHTMLDotSVGAngle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAngle]
  }
}

