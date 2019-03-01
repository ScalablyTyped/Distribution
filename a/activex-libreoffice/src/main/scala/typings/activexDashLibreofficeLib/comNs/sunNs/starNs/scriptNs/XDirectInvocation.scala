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

object XDirectInvocation {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    directInvoke: js.Function2[java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], js.Any],
    hasMember: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDirectInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("directInvoke")(directInvoke)
    __obj.updateDynamic("hasMember")(hasMember)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDirectInvocation]
  }
}

