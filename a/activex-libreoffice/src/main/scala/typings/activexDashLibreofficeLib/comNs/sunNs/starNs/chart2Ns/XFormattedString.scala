package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XFormattedString
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  var String: java.lang.String
  def getString(): java.lang.String
  def setString(String: java.lang.String): scala.Unit
}

object XFormattedString {
  @scala.inline
  def apply(
    String: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getString: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XFormattedString = {
    val __obj = js.Dynamic.literal(String = String, acquire = acquire, getString = getString, queryInterface = queryInterface, release = release, setString = setString)
  
    __obj.asInstanceOf[XFormattedString]
  }
}

