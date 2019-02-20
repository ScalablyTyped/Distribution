package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FolderListCommand extends js.Object

/**
  * The various commands to process on a list of folders.
  * @see FolderList
  */
@JSGlobal("com.sun.star.ucb.FolderListCommand")
@js.native
object FolderListCommand extends js.Object {
  /**
    * Get a list of all folders.
    *
    * HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.3"}
    */
  @js.native
  sealed trait GET
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FolderListCommand
  
  /** Get a list of subscribed folders. */
  @js.native
  sealed trait GET_SUBSCRIBED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FolderListCommand
  
  /** Set a list of folders. */
  @js.native
  sealed trait SET
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FolderListCommand
  
  /* 0 */ val GET: GET with scala.Double = js.native
  /* 1 */ val GET_SUBSCRIBED: GET_SUBSCRIBED with scala.Double = js.native
  /* 2 */ val SET: SET with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.FolderListCommand with scala.Double
  ] = js.native
}

