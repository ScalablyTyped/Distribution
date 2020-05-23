package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGLength extends js.Object {
  @JSName("MSHTML.SVGLength_typekey")
  var MSHTMLDotSVGLength_typekey: SVGLength
  var unitType: Double
  var value: Double
  var valueAsString: String
  var valueInSpecifiedUnits: Double
  def convertToSpecifiedUnits(unitType: Double): Unit
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit
}

object SVGLength {
  @scala.inline
  def apply(
    MSHTMLDotSVGLength_typekey: SVGLength,
    convertToSpecifiedUnits: Double => Unit,
    newValueSpecifiedUnits: (Double, Double) => Unit,
    unitType: Double,
    value: Double,
    valueAsString: String,
    valueInSpecifiedUnits: Double
  ): SVGLength = {
    val __obj = js.Dynamic.literal(convertToSpecifiedUnits = js.Any.fromFunction1(convertToSpecifiedUnits), newValueSpecifiedUnits = js.Any.fromFunction2(newValueSpecifiedUnits), unitType = unitType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAsString = valueAsString.asInstanceOf[js.Any], valueInSpecifiedUnits = valueInSpecifiedUnits.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGLength_typekey")(MSHTMLDotSVGLength_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGLength]
  }
}

