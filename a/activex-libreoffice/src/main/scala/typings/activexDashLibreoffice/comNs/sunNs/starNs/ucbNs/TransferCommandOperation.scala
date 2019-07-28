package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These are the possible values for {@link GlobalTransferCommandArgument.Operation} . */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
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
  def COPY: `0` = this.cast(0)
  /** Create a link in the target folder. The link's target is the source object. */
  @scala.inline
  def LINK: `2` = this.cast(2)
  /**
    * Move the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.9"}
    */
  @scala.inline
  def MOVE: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

