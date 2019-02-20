package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.systemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Implementations of this interface do provide access to a simple mail client if there is one available
  * @see com.sun.star.system.XSimpleMailClient
  */
trait XSimpleMailClientSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Allows a client to query for an object that implements {@link XSimpleMailClient} .
    * @returns An interface to a simple mail client if there is one available on the system or an empty reference else.
    * @see com.sun.star.system.XSimpleMailClient
    */
  def querySimpleMailClient(): XSimpleMailClient
}

