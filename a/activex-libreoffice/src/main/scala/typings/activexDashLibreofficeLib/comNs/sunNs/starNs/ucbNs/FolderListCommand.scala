package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The various commands to process on a list of folders.
  * @see FolderList
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait FolderListCommand extends js.Object

object FolderListCommand {
  /**
    * Get a list of all folders.
    *
    * HTTP request method as defined in [RFC 2616: Hypertext Transfer Protocol  -  HTTP/1.1]{@link url="http://tools.ietf.org/html/rfc2616#section-9.3"}
    */
  @scala.inline
  def GET: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** Get a list of subscribed folders. */
  @scala.inline
  def GET_SUBSCRIBED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** Set a list of folders. */
  @scala.inline
  def SET: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

