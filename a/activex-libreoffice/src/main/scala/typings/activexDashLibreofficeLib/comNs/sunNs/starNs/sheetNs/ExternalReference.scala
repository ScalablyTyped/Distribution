package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data structure to store information about an external reference. An external reference can be either a single cell reference, a cell range reference,
  * or a named range.
  * @see FormulaMapGroupSpecialOffset.PUSH
  * @since OOo 3.1
  */
trait ExternalReference extends js.Object {
  /**
    * Index of an externally linked document. Each externally-linked document has a unique index value.
    *
    * You can get the index value of an external document from the corresponding {@link com.sun.star.sheet.ExternalDocLink} instance through its attribute
    * {@link com.sun.star.sheet.ExternalDocLink.TokenIndex} .
    * @see com.sun.star.sheet.ExternalDocLink
    * @see com.sun.star.sheet.ExternalDocLink.TokenIndex
    */
  var Index: scala.Double
  /**
    * Name of the sheet that the external reference points to.
    *
    * In case of a cell range reference that spans across multiple sheets, this is the name of the first sheet in that range.
    *
    * Note that an external range name ignores this value at the moment, but **it may make use of this data in the future when Calc supports a
    * sheet-specific range name.**
    *
    * Reference data.
    *
    * This can store either {@link SingleReference} for a single cell reference, {@link ComplexReference} for a cell range reference, or simply a string for
    * a defined name.
    *
    * The {@link SingleReference.Sheet} member shall contain the index of the external sheet cache containing the values of the externally referenced cells.
    * @see com.sun.star.sheet.SingleReference
    * @see com.sun.star.sheet.ComplexReference
    */
  var Reference: js.Any
}

object ExternalReference {
  @scala.inline
  def apply(Index: scala.Double, Reference: js.Any): ExternalReference = {
    val __obj = js.Dynamic.literal(Index = Index, Reference = Reference)
  
    __obj.asInstanceOf[ExternalReference]
  }
}

