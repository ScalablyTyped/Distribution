package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.testNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUITest extends js.Object {
  val TopFocusWindow: XUIObject
  def executeCommand(command: java.lang.String): scala.Unit
  def getTopFocusWindow(): XUIObject
}

object XUITest {
  @scala.inline
  def apply(
    TopFocusWindow: XUIObject,
    executeCommand: js.Function1[java.lang.String, scala.Unit],
    getTopFocusWindow: js.Function0[XUIObject]
  ): XUITest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TopFocusWindow")(TopFocusWindow)
    __obj.updateDynamic("executeCommand")(executeCommand)
    __obj.updateDynamic("getTopFocusWindow")(getTopFocusWindow)
    __obj.asInstanceOf[XUITest]
  }
}

