package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * compares the positions of two {@link TextRanges} within a {@link Text} .
  *
  * Only {@link TextRange} instances within the same {@link Text} can be compared.
  */
trait XTextRangeCompare
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns 1, if **xR1** ends before **xR2** , 0, if **xR1** ends at the same position as **xR2** and -1, if **xR1** ends behind **xR2** .
    * @throws com::sun::star::lang::IllegalArgumentException if either **xR1** or **xR2** is not within this text.
    */
  def compareRegionEnds(xR1: XTextRange, xR2: XTextRange): scala.Double
  /**
    * @returns 1 if **xR1** starts before **xR2** , 0 if **xR1** starts at the same position as **xR2** and -1 if **xR1** starts behind **xR2** .
    * @throws com::sun::star::lang::IllegalArgumentException if either **xR1** or **xR2** is not within this text.
    */
  def compareRegionStarts(xR1: XTextRange, xR2: XTextRange): scala.Double
}

object XTextRangeCompare {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    compareRegionEnds: js.Function2[XTextRange, XTextRange, scala.Double],
    compareRegionStarts: js.Function2[XTextRange, XTextRange, scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextRangeCompare = {
    val __obj = js.Dynamic.literal(acquire = acquire, compareRegionEnds = compareRegionEnds, compareRegionStarts = compareRegionStarts, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTextRangeCompare]
  }
}

