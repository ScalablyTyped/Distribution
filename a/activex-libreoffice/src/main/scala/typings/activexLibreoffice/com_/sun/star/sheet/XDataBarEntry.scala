package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDataBarEntry extends js.Object {
  var Formula: String = js.native
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  var Type: Double = js.native
  def getFormula(): String = js.native
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  def getType(): Double = js.native
  def setFormula(Formula: String): Unit = js.native
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  def setType(Type: Double): Unit = js.native
}

object XDataBarEntry {
  @scala.inline
  def apply(
    Formula: String,
    Type: Double,
    getFormula: () => String,
    getType: () => Double,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XDataBarEntry = {
    val __obj = js.Dynamic.literal(Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XDataBarEntry]
  }
  @scala.inline
  implicit class XDataBarEntryOps[Self <: XDataBarEntry] (val x: Self) extends AnyVal {
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
    def setFormula(value: String): Self = this.set("Formula", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetFormula(value: () => String): Self = this.set("getFormula", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => Double): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFormula(value: String => Unit): Self = this.set("setFormula", js.Any.fromFunction1(value))
    @scala.inline
    def setSetType(value: Double => Unit): Self = this.set("setType", js.Any.fromFunction1(value))
  }
  
}

