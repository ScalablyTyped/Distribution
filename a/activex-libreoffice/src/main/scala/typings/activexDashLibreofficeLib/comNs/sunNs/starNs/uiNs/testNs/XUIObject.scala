package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.testNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XUIObject extends js.Object {
  val Children: activexDashInteropLib.SafeArray[java.lang.String]
  val State: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  val Type: java.lang.String
  def executeAction(
    action: java.lang.String,
    propValues: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  ): scala.Unit
  def getChild(id: java.lang.String): XUIObject
  def getChildren(): activexDashInteropLib.SafeArray[java.lang.String]
  def getState(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues
  def getType(): java.lang.String
}

object XUIObject {
  @scala.inline
  def apply(
    Children: activexDashInteropLib.SafeArray[java.lang.String],
    State: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues,
    Type: java.lang.String,
    executeAction: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      scala.Unit
    ],
    getChild: js.Function1[java.lang.String, XUIObject],
    getChildren: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getState: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues],
    getType: js.Function0[java.lang.String]
  ): XUIObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Children")(Children)
    __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("executeAction")(executeAction)
    __obj.updateDynamic("getChild")(getChild)
    __obj.updateDynamic("getChildren")(getChildren)
    __obj.updateDynamic("getState")(getState)
    __obj.updateDynamic("getType")(getType)
    __obj.asInstanceOf[XUIObject]
  }
}

