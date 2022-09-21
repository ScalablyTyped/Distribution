package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with XInterface {
  
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
  def mapContentIdentifierString(Source: String): String
  
  /**
    * Map the content identifiers (or related data) contained in the columns of a {@link com.sun.star.sdbc.XRow} .
    * @param Value On input, a sequence of anys corresponding to the columns of the XRow (the first column goes into the zeroth position of the sequence, and
    * @returns `TRUE` if any of the columns contain data that (potentially) needs mapping (though maybe no mapping occurred for the concrete input data of this
    */
  def mapRow(Value: js.Array[SeqEquiv[Any]]): Boolean
}
object XContentIdentifierMapping {
  
  inline def apply(
    acquire: () => Unit,
    mapContent: XContent => XContent,
    mapContentIdentifier: XContentIdentifier => XContentIdentifier,
    mapContentIdentifierString: String => String,
    mapRow: js.Array[SeqEquiv[Any]] => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XContentIdentifierMapping = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), mapContent = js.Any.fromFunction1(mapContent), mapContentIdentifier = js.Any.fromFunction1(mapContentIdentifier), mapContentIdentifierString = js.Any.fromFunction1(mapContentIdentifierString), mapRow = js.Any.fromFunction1(mapRow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentIdentifierMapping]
  }
  
  extension [Self <: XContentIdentifierMapping](x: Self) {
    
    inline def setMapContent(value: XContent => XContent): Self = StObject.set(x, "mapContent", js.Any.fromFunction1(value))
    
    inline def setMapContentIdentifier(value: XContentIdentifier => XContentIdentifier): Self = StObject.set(x, "mapContentIdentifier", js.Any.fromFunction1(value))
    
    inline def setMapContentIdentifierString(value: String => String): Self = StObject.set(x, "mapContentIdentifierString", js.Any.fromFunction1(value))
    
    inline def setMapRow(value: js.Array[SeqEquiv[Any]] => Boolean): Self = StObject.set(x, "mapRow", js.Any.fromFunction1(value))
  }
}
