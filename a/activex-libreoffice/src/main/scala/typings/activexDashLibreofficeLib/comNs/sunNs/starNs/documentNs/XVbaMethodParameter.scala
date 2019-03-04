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
    acquire: js.Function0[scala.Unit],
    getVbaMethodParameter: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setVbaMethodParameter: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XVbaMethodParameter = {
    val __obj = js.Dynamic.literal(acquire = acquire, getVbaMethodParameter = getVbaMethodParameter, queryInterface = queryInterface, release = release, setVbaMethodParameter = setVbaMethodParameter)
  
    __obj.asInstanceOf[XVbaMethodParameter]
  }
}

