package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gives access to multiple sets of formula tokens.
  *
  * A service implementing this interface can internally set an arbitrary number of formula token sequences. The number of allowed formula token sequences
  * must be returned by the {@link com.sun.star.sheet.XMultiFormulaTokens.getCount()} method. When the client code tries to access formula tokens at index
  * that is outside the allowed index range, the implementation shall return an {@link com.sun.star.lang.IndexOutOfBoundsException} .
  */
trait XMultiFormulaTokens extends StObject {
  
  /**
    * returns the number of formulas allowed in this formula token set.
    * @returns the number of formulas the implementation supports.
    */
  val Count: Double
  
  /**
    * returns the number of formulas allowed in this formula token set.
    * @returns the number of formulas the implementation supports.
    */
  def getCount(): Double
  
  /**
    * returns the formula at specified index as sequence of tokens.
    * @throws IndexOutOfBoundsException If the given index lies not in the valid range then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is
    */
  def getTokens(nIndex: Double): SafeArray[FormulaToken]
  
  /**
    * sets the formula at specified index as sequence of tokens.
    * @throws IndexOutOfBoundsException If the given index lies not in the valid range then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is
    */
  def setTokens(nIndex: Double, aTokens: SeqEquiv[FormulaToken]): Unit
}
object XMultiFormulaTokens {
  
  inline def apply(
    Count: Double,
    getCount: () => Double,
    getTokens: Double => SafeArray[FormulaToken],
    setTokens: (Double, SeqEquiv[FormulaToken]) => Unit
  ): XMultiFormulaTokens = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], getCount = js.Any.fromFunction0(getCount), getTokens = js.Any.fromFunction1(getTokens), setTokens = js.Any.fromFunction2(setTokens))
    __obj.asInstanceOf[XMultiFormulaTokens]
  }
  
  extension [Self <: XMultiFormulaTokens](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGetCount(value: () => Double): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    inline def setGetTokens(value: Double => SafeArray[FormulaToken]): Self = StObject.set(x, "getTokens", js.Any.fromFunction1(value))
    
    inline def setSetTokens(value: (Double, SeqEquiv[FormulaToken]) => Unit): Self = StObject.set(x, "setTokens", js.Any.fromFunction2(value))
  }
}
