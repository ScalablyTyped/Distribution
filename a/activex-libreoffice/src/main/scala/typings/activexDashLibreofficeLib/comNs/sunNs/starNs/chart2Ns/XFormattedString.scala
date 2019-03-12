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
    acquire: () => scala.Unit,
    getString: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): XFormattedString = {
    val __obj = js.Dynamic.literal(String = String, acquire = js.Any.fromFunction0(acquire), getString = js.Any.fromFunction0(getString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XFormattedString]
  }
}

