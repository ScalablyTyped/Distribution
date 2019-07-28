package typings.activexDashLibreoffice.comNs.sunNs.starNs.uriNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * details how excess special parent segments ( "`..`" ) are handled when resolving a relative URI reference to absolute form.
  * @see com.sun.star.uri.XUriReferenceFactory.makeAbsolute for a method that uses this enumeration.
  * @since OOo 2.0
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait RelativeUriExcessParentSegments extends js.Object

object RelativeUriExcessParentSegments {
  /** causes excess special parent segments to be treated as an error. */
  @scala.inline
  def ERROR: `0` = this.cast(0)
  /** causes excess special parent segments to be removed. */
  @scala.inline
  def REMOVE: `2` = this.cast(2)
  /** causes excess special parent segments to be retained, treating them like ordinary segments. */
  @scala.inline
  def RETAIN: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

