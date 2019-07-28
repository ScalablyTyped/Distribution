package typings.activexDashLibreoffice.comNs.sunNs.starNs.ioNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set the size of the underlying data of a stream to zero. */
trait XTruncate extends XInterface {
  /** sets the size of the underlying data of the stream to zero. */
  def truncate(): Unit
}

object XTruncate {
  @scala.inline
  def apply(acquire: () => Unit, queryInterface: `type` => js.Any, release: () => Unit, truncate: () => Unit): XTruncate = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), truncate = js.Any.fromFunction0(truncate))
  
    __obj.asInstanceOf[XTruncate]
  }
}

