package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a supplier for a content provider.
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
    acquire: js.Function0[scala.Unit],
    getContentProvider: js.Function0[XContentProvider],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XContentProviderSupplier = {
    val __obj = js.Dynamic.literal(ContentProvider = ContentProvider, acquire = acquire, getContentProvider = getContentProvider, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XContentProviderSupplier]
  }
}

