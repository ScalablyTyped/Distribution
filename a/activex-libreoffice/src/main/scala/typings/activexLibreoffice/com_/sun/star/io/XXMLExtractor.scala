package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** offers the capability to extract the XML document stream from a document storage. */
trait XXMLExtractor
  extends StObject
     with XInterface {
  
  /**
    * extracts the XML stream from the document storage.
    * @returns the extracted XML stream.
    */
  def extract(aStream: XInputStream): XInputStream
}
object XXMLExtractor {
  
  inline def apply(
    acquire: () => Unit,
    extract: XInputStream => XInputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XXMLExtractor = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), extract = js.Any.fromFunction1(extract), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XXMLExtractor]
  }
  
  extension [Self <: XXMLExtractor](x: Self) {
    
    inline def setExtract(value: XInputStream => XInputStream): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
  }
}
