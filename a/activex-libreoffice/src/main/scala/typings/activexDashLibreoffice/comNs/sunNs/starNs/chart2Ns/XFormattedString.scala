package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XFormattedString extends XInterface {
  var String: java.lang.String
  def getString(): String
  def setString(String: String): Unit
}

object XFormattedString {
  @scala.inline
  def apply(
    String: String,
    acquire: () => Unit,
    getString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XFormattedString = {
    val __obj = js.Dynamic.literal(String = String, acquire = js.Any.fromFunction0(acquire), getString = js.Any.fromFunction0(getString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XFormattedString]
  }
}

