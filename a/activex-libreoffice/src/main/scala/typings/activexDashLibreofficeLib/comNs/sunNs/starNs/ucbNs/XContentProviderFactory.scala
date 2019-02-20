package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a factory for a {@link XContentProvider} .
  * @author Kai Sommerfeld
  * @see XContentProvider
  * @version 1.0
  */
trait XContentProviderFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a {@link XContentProvider} implementation object.
    * @param Service the name of the UNO service to be used to create the implementation of the content provider.
    * @returns a content provider.
    */
  def createContentProvider(Service: java.lang.String): XContentProvider
}

