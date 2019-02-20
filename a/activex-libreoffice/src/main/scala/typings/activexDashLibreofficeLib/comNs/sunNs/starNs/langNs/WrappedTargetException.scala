package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a checked exception that wraps an exception thrown by the original target.
  *
  * Normally this exception is declared for generic methods.
  * @see com.sun.star.container.XIndexAccess
  * @see com.sun.star.container.XNameAccess
  * @see com.sun.star.beans.XPropertySet
  */
trait WrappedTargetException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The exception is thrown by the target. */
  var TargetException: js.Any
}

