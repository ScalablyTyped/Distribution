package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class XArrayFormulaRangeMutableBuilder[Self <: XArrayFormulaRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrayFormula(value: String): Self = StObject.set(x, "ArrayFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetArrayFormula(value: () => String): Self = StObject.set(x, "getArrayFormula", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetArrayFormula(value: String => Unit): Self = StObject.set(x, "setArrayFormula", js.Any.fromFunction1(value))
  }
}
