package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGLength extends js.Object {
  @JSName("MSHTML.SVGLength_typekey")
  var MSHTMLDotSVGLength_typekey: SVGLength = js.native
  var unitType: Double = js.native
  var value: Double = js.native
  var valueAsString: String = js.native
  var valueInSpecifiedUnits: Double = js.native
  def convertToSpecifiedUnits(unitType: Double): Unit = js.native
  def newValueSpecifiedUnits(unitType: Double, valueInSpecifiedUnits: Double): Unit = js.native
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
  @scala.inline
  implicit class SVGLengthOps[Self <: SVGLength] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGLength_typekey(value: SVGLength): Self = this.set("MSHTML.SVGLength_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setConvertToSpecifiedUnits(value: Double => Unit): Self = this.set("convertToSpecifiedUnits", js.Any.fromFunction1(value))
    @scala.inline
    def setNewValueSpecifiedUnits(value: (Double, Double) => Unit): Self = this.set("newValueSpecifiedUnits", js.Any.fromFunction2(value))
    @scala.inline
    def setUnitType(value: Double): Self = this.set("unitType", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueAsString(value: String): Self = this.set("valueAsString", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueInSpecifiedUnits(value: Double): Self = this.set("valueInSpecifiedUnits", value.asInstanceOf[js.Any])
  }
  
}

