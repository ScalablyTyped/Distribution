package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransferCommandOperation extends js.Object

/** These are the possible values for {@link GlobalTransferCommandArgument.Operation} . */
@JSGlobal("com.sun.star.ucb.TransferCommandOperation")
@js.native
object TransferCommandOperation extends js.Object {
  /**
    * Copy the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.8"}
    */
  @js.native
  sealed trait COPY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransferCommandOperation
  
  /** Create a link in the target folder. The link's target is the source object. */
  @js.native
  sealed trait LINK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransferCommandOperation
  
  /**
    * Move the source to the target folder.
    *
    * WebDAV methods as defined in [HTTP Extensions for Web Distributed Authoring and Versioning (WebDAV)]{@link
    * url="http://tools.ietf.org/html/rfc4918#section-9.9"}
    */
  @js.native
  sealed trait MOVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransferCommandOperation
  
  /* 0 */ val COPY: COPY with scala.Double = js.native
  /* 2 */ val LINK: LINK with scala.Double = js.native
  /* 1 */ val MOVE: MOVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.TransferCommandOperation with scala.Double
  ] = js.native
}

