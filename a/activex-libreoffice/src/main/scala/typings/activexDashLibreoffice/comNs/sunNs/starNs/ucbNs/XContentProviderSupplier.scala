package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a supplier for a content provider.
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderSupplier extends XInterface {
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
  @scala.inline
  def apply(
    ContentProvider: XContentProvider,
    acquire: () => Unit,
    getContentProvider: () => XContentProvider,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentProviderSupplier = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider, acquire = js.Any.fromFunction0(acquire), getContentProvider = js.Any.fromFunction0(getContentProvider), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XContentProviderSupplier]
  }
}

