package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides handling of array formulas in a cell range. */
@js.native
trait XArrayFormulaRange extends XInterface {
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  var ArrayFormula: String = js.native
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  def getArrayFormula(): String = js.native
  /**
    * applies the array formula to the entire cell range.
    * @param aFormula the formula that will be applied as array formula. Passing an empty string erases an existing array formula.
    */
  def setArrayFormula(aFormula: String): Unit = js.native
}

object XArrayFormulaRange {
  @scala.inline
  def apply(
    ArrayFormula: String,
    acquire: () => Unit,
    getArrayFormula: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setArrayFormula: String => Unit
  ): XArrayFormulaRange = {
    val __obj = js.Dynamic.literal(ArrayFormula = ArrayFormula.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getArrayFormula = js.Any.fromFunction0(getArrayFormula), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setArrayFormula = js.Any.fromFunction1(setArrayFormula))
    __obj.asInstanceOf[XArrayFormulaRange]
  }
  @scala.inline
  implicit class XArrayFormulaRangeOps[Self <: XArrayFormulaRange] (val x: Self) extends AnyVal {
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
    def setArrayFormula(value: String): Self = this.set("ArrayFormula", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetArrayFormula(value: () => String): Self = this.set("getArrayFormula", js.Any.fromFunction0(value))
    @scala.inline
    def setSetArrayFormula(value: String => Unit): Self = this.set("setArrayFormula", js.Any.fromFunction1(value))
  }
  
}

