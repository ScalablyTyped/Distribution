package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * a factory for a {@link XContentProvider} .
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
@js.native
trait XContentProviderFactory extends XInterface {
  
  /**
    * creates a {@link XContentProvider} implementation object.
    * @param Service the name of the UNO service to be used to create the implementation of the content provider.
    * @returns a content provider.
    */
  def createContentProvider(Service: String): XContentProvider = js.native
}
object XContentProviderFactory {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createContentProvider: String => XContentProvider,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentProviderFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createContentProvider = js.Any.fromFunction1(createContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentProviderFactory]
  }
  
  @scala.inline
  implicit class XContentProviderFactoryMutableBuilder[Self <: XContentProviderFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateContentProvider(value: String => XContentProvider): Self = StObject.set(x, "createContentProvider", js.Any.fromFunction1(value))
  }
}
