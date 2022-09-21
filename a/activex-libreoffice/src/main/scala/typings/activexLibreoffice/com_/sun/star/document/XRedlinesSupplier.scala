package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to a container of the redline objects of the document. */
trait XRedlinesSupplier
  extends StObject
     with XInterface {
  
  /** @returns an enumeration access that provides access to the redline objects of the document.  The returned objects implement at least the interface {@link  */
  val Redlines: XEnumerationAccess
  
  /** @returns an enumeration access that provides access to the redline objects of the document.  The returned objects implement at least the interface {@link  */
  def getRedlines(): XEnumerationAccess
}
object XRedlinesSupplier {
  
  inline def apply(
    Redlines: XEnumerationAccess,
    acquire: () => Unit,
    getRedlines: () => XEnumerationAccess,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XRedlinesSupplier = {
    val __obj = js.Dynamic.literal(Redlines = Redlines.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRedlines = js.Any.fromFunction0(getRedlines), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRedlinesSupplier]
  }
  
  extension [Self <: XRedlinesSupplier](x: Self) {
    
    inline def setGetRedlines(value: () => XEnumerationAccess): Self = StObject.set(x, "getRedlines", js.Any.fromFunction0(value))
    
    inline def setRedlines(value: XEnumerationAccess): Self = StObject.set(x, "Redlines", value.asInstanceOf[js.Any])
  }
}
