package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * details how excess special parent segments ( "`..`" ) are handled when resolving a relative URI reference to absolute form.
  * @see com.sun.star.uri.XUriReferenceFactory.makeAbsolute for a method that uses this enumeration.
  * @since OOo 2.0
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait RelativeUriExcessParentSegments extends js.Object

object RelativeUriExcessParentSegments {
  /** causes excess special parent segments to be treated as an error. */
  @scala.inline
  def ERROR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** causes excess special parent segments to be removed. */
  @scala.inline
  def REMOVE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** causes excess special parent segments to be retained, treating them like ordinary segments. */
  @scala.inline
  def RETAIN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

