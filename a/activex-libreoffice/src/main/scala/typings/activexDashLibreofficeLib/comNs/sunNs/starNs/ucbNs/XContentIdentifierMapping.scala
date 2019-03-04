package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mapping from a (source) set of XContentIdentifiers to another (target) set of XContentIdentifiers.
  *
  * For convenience and performance, mapping between the string representations of source/target XContentIdentifiers, as well as mapping between XContents
  * identified by source/target XContentIdentifiers is also supported.
  *
  * This interface can be useful in cases where the identifiers (and associated contents) returned by the various methods of an {@link XContentAccess}
  * need to be mapped to some other space of identifiers (and associated contents).
  * @see XContent
  * @see XContentAccess
  * @see XContentIdentifier
  */
trait XContentIdentifierMapping
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Map the {@link XContent} identified by an {@link XContentIdentifier} .
    * @param Source The {@link XContent} identified by an {@link XContentIdentifier} from the source set.
    * @returns The {@link XContent} identified by the target set's {@link XContentIdentifier} corresponding to the source identifier. The returned {@link XConte
    */
  def mapContent(Source: XContent): XContent
  /**
    * Map an {@link XContentIdentifier} .
    * @param Source An {@link XContentIdentifier} from the source set.
    * @returns The target set's {@link XContentIdentifier} corresponding to the source identifier. The returned {@link XContentIdentifier} may be null if either
    */
  def mapContentIdentifier(Source: XContentIdentifier): XContentIdentifier
  /**
    * Map the string representation of an {@link XContentIdentifier} .
    * @param Source The string representation of an {@link XContentIdentifier} from the source set.
    * @returns The string representation of the target set's {@link XContentIdentifier} corresponding to the source identifier. The returned string may be empty
    */
  def mapContentIdentifierString(Source: java.lang.String): java.lang.String
  /**
    * Map the content identifiers (or related data) contained in the columns of a {@link com.sun.star.sdbc.XRow} .
    * @param Value On input, a sequence of anys corresponding to the columns of the XRow (the first column goes into the zeroth position of the sequence, and
    * @returns `TRUE` if any of the columns contain data that (potentially) needs mapping (though maybe no mapping occurred for the concrete input data of this
    */
  def mapRow(Value: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]): scala.Boolean
}

object XContentIdentifierMapping {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    mapContent: js.Function1[XContent, XContent],
    mapContentIdentifier: js.Function1[XContentIdentifier, XContentIdentifier],
    mapContentIdentifierString: js.Function1[java.lang.String, java.lang.String],
    mapRow: js.Function1[js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContentIdentifierMapping = {
    val __obj = js.Dynamic.literal(acquire = acquire, mapContent = mapContent, mapContentIdentifier = mapContentIdentifier, mapContentIdentifierString = mapContentIdentifierString, mapRow = mapRow, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XContentIdentifierMapping]
  }
}

