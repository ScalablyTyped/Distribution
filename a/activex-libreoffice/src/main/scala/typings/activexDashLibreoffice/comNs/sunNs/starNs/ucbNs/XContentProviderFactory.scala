package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a factory for a {@link XContentProvider} .
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderFactory extends XInterface {
  /**
    * creates a {@link XContentProvider} implementation object.
    * @param Service the name of the UNO service to be used to create the implementation of the content provider.
    * @returns a content provider.
    */
  def createContentProvider(Service: String): XContentProvider
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
}

