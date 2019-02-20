package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeUriExcessParentSegments extends js.Object

/**
  * details how excess special parent segments ( "`..`" ) are handled when resolving a relative URI reference to absolute form.
  * @see com.sun.star.uri.XUriReferenceFactory.makeAbsolute for a method that uses this enumeration.
  * @since OOo 2.0
  */
@JSGlobal("com.sun.star.uri.RelativeUriExcessParentSegments")
@js.native
object RelativeUriExcessParentSegments extends js.Object {
  /** causes excess special parent segments to be treated as an error. */
  @js.native
  sealed trait ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.RelativeUriExcessParentSegments
  
  /** causes excess special parent segments to be removed. */
  @js.native
  sealed trait REMOVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.RelativeUriExcessParentSegments
  
  /** causes excess special parent segments to be retained, treating them like ordinary segments. */
  @js.native
  sealed trait RETAIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.RelativeUriExcessParentSegments
  
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 2 */ val REMOVE: REMOVE with scala.Double = js.native
  /* 1 */ val RETAIN: RETAIN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.uriNs.RelativeUriExcessParentSegments with scala.Double
  ] = js.native
}

