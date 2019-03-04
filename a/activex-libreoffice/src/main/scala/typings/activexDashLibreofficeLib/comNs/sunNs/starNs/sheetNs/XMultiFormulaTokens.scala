package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to multiple sets of formula tokens.
  *
  * A service implementing this interface can internally set an arbitrary number of formula token sequences. The number of allowed formula token sequences
  * must be returned by the {@link com.sun.star.sheet.XMultiFormulaTokens.getCount()} method. When the client code tries to access formula tokens at index
  * that is outside the allowed index range, the implementation shall return an {@link com.sun.star.lang.IndexOutOfBoundsException} .
  */
trait XMultiFormulaTokens extends js.Object {
  /**
    * returns the number of formulas allowed in this formula token set.
    * @returns the number of formulas the implementation supports.
    */
  val Count: scala.Double
  /**
    * returns the number of formulas allowed in this formula token set.
    * @returns the number of formulas the implementation supports.
    */
  def getCount(): scala.Double
  /**
    * returns the formula at specified index as sequence of tokens.
    * @throws IndexOutOfBoundsException If the given index lies not in the valid range then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is
    */
  def getTokens(nIndex: scala.Double): activexDashInteropLib.SafeArray[FormulaToken]
  /**
    * sets the formula at specified index as sequence of tokens.
    * @throws IndexOutOfBoundsException If the given index lies not in the valid range then an {@link com.sun.star.lang.IndexOutOfBoundsException} exception is
    */
  def setTokens(nIndex: scala.Double, aTokens: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken]): scala.Unit
}

object XMultiFormulaTokens {
  @scala.inline
  def apply(
    Count: scala.Double,
    getCount: js.Function0[scala.Double],
    getTokens: js.Function1[scala.Double, activexDashInteropLib.SafeArray[FormulaToken]],
    setTokens: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FormulaToken], 
      scala.Unit
    ]
  ): XMultiFormulaTokens = {
    val __obj = js.Dynamic.literal(Count = Count, getCount = getCount, getTokens = getTokens, setTokens = setTokens)
  
    __obj.asInstanceOf[XMultiFormulaTokens]
  }
}

