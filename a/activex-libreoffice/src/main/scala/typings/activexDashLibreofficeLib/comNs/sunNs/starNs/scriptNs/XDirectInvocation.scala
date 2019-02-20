package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to an object's methods and properties. */
trait XDirectInvocation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides access to methods and properties exposed by an object.
    * @param aName the method to invoke
    * @param aParams all parameters, out parameters are not supported
    */
  def directInvoke(aName: java.lang.String, aParams: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]): js.Any
  /** returns `TRUE` if the method or property with the specified name exists, else `FALSE` . */
  def hasMember(aName: java.lang.String): scala.Boolean
}

