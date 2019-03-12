package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVbaMethodParameter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the value of the parameter with the specified name. */
  def getVbaMethodParameter(PropertyName: java.lang.String): js.Any
  /** sets the value of the parameter with the specified name. */
  def setVbaMethodParameter(PropertyName: java.lang.String, Value: js.Any): scala.Unit
}

object XVbaMethodParameter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getVbaMethodParameter: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setVbaMethodParameter: (java.lang.String, js.Any) => scala.Unit
  ): XVbaMethodParameter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getVbaMethodParameter = js.Any.fromFunction1(getVbaMethodParameter), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setVbaMethodParameter = js.Any.fromFunction2(setVbaMethodParameter))
  
    __obj.asInstanceOf[XVbaMethodParameter]
  }
}

