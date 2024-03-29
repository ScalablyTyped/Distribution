package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a factory for a {@link XContentProvider} .
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a {@link XContentProvider} implementation object.
    * @param Service the name of the UNO service to be used to create the implementation of the content provider.
    * @returns a content provider.
    */
  def createContentProvider(Service: String): XContentProvider
}
object XContentProviderFactory {
  
  inline def apply(
    acquire: () => Unit,
    createContentProvider: String => XContentProvider,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XContentProviderFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createContentProvider = js.Any.fromFunction1(createContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentProviderFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XContentProviderFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateContentProvider(value: String => XContentProvider): Self = StObject.set(x, "createContentProvider", js.Any.fromFunction1(value))
  }
}
