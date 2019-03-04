package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set the size of the underlying data of a stream to zero. */
trait XTruncate
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** sets the size of the underlying data of the stream to zero. */
  def truncate(): scala.Unit
}

object XTruncate {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    truncate: js.Function0[scala.Unit]
  ): XTruncate = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, truncate = truncate)
  
    __obj.asInstanceOf[XTruncate]
  }
}

