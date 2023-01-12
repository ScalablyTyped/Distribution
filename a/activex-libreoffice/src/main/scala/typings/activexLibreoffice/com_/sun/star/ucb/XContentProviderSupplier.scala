package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a supplier for a content provider.
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns a content provider.
    * @returns a content provider.
    */
  val ContentProvider: XContentProvider
  
  /**
    * returns a content provider.
    * @returns a content provider.
    */
  def getContentProvider(): XContentProvider
}
object XContentProviderSupplier {
  
  inline def apply(
    ContentProvider: XContentProvider,
    acquire: () => Unit,
    getContentProvider: () => XContentProvider,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XContentProviderSupplier = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getContentProvider = js.Any.fromFunction0(getContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentProviderSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XContentProviderSupplier] (val x: Self) extends AnyVal {
    
    inline def setContentProvider(value: XContentProvider): Self = StObject.set(x, "ContentProvider", value.asInstanceOf[js.Any])
    
    inline def setGetContentProvider(value: () => XContentProvider): Self = StObject.set(x, "getContentProvider", js.Any.fromFunction0(value))
  }
}
