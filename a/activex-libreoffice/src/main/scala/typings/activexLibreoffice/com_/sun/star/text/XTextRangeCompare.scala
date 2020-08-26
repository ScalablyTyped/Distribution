package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * compares the positions of two {@link TextRanges} within a {@link Text} .
  *
  * Only {@link TextRange} instances within the same {@link Text} can be compared.
  */
@js.native
trait XTextRangeCompare extends XInterface {
  /**
    * @returns 1, if **xR1** ends before **xR2** , 0, if **xR1** ends at the same position as **xR2** and -1, if **xR1** ends behind **xR2** .
    * @throws com::sun::star::lang::IllegalArgumentException if either **xR1** or **xR2** is not within this text.
    */
  def compareRegionEnds(xR1: XTextRange, xR2: XTextRange): Double = js.native
  /**
    * @returns 1 if **xR1** starts before **xR2** , 0 if **xR1** starts at the same position as **xR2** and -1 if **xR1** starts behind **xR2** .
    * @throws com::sun::star::lang::IllegalArgumentException if either **xR1** or **xR2** is not within this text.
    */
  def compareRegionStarts(xR1: XTextRange, xR2: XTextRange): Double = js.native
}

object XTextRangeCompare {
  @scala.inline
  def apply(
    acquire: () => Unit,
    compareRegionEnds: (XTextRange, XTextRange) => Double,
    compareRegionStarts: (XTextRange, XTextRange) => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextRangeCompare = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareRegionEnds = js.Any.fromFunction2(compareRegionEnds), compareRegionStarts = js.Any.fromFunction2(compareRegionStarts), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextRangeCompare]
  }
  @scala.inline
  implicit class XTextRangeCompareOps[Self <: XTextRangeCompare] (val x: Self) extends AnyVal {
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
    def setCompareRegionEnds(value: (XTextRange, XTextRange) => Double): Self = this.set("compareRegionEnds", js.Any.fromFunction2(value))
    @scala.inline
    def setCompareRegionStarts(value: (XTextRange, XTextRange) => Double): Self = this.set("compareRegionStarts", js.Any.fromFunction2(value))
  }
  
}

