package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These are the possible values for {@link GlobalTransferCommandArgument.Operation} . */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait TransferCommandOperation extends js.Object

object TransferCommandOperation {
  /**
    * Copy the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.8"}
    */
  @scala.inline
  def COPY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** Create a link in the target folder. The link's target is the source object. */
  @scala.inline
  def LINK: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * Move the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.9"}
    */
  @scala.inline
  def MOVE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

