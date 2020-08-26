package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XColorScaleEntry extends js.Object {
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color = js.native
  var Formula: String = js.native
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  var Type: Double = js.native
  def getColor(): Color = js.native
  def getFormula(): String = js.native
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def getType(): Double = js.native
  def setColor(Color: Color): Unit = js.native
  def setFormula(Formula: String): Unit = js.native
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def setType(Type: Double): Unit = js.native
}

object XColorScaleEntry {
  @scala.inline
  def apply(
    Color: Color,
    Formula: String,
    Type: Double,
    getColor: () => Color,
    getFormula: () => String,
    getType: () => Double,
    setColor: Color => Unit,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XColorScaleEntry = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getColor = js.Any.fromFunction0(getColor), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setColor = js.Any.fromFunction1(setColor), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XColorScaleEntry]
  }
  @scala.inline
  implicit class XColorScaleEntryOps[Self <: XColorScaleEntry] (val x: Self) extends AnyVal {
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
    def setColor(value: Color): Self = this.set("Color", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormula(value: String): Self = this.set("Formula", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetColor(value: () => Color): Self = this.set("getColor", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFormula(value: () => String): Self = this.set("getFormula", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => Double): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setSetColor(value: Color => Unit): Self = this.set("setColor", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFormula(value: String => Unit): Self = this.set("setFormula", js.Any.fromFunction1(value))
    @scala.inline
    def setSetType(value: Double => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
  }
  
}

