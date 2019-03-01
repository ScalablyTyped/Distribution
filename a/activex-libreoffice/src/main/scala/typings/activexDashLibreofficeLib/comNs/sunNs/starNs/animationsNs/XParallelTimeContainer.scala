package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XParallelTimeContainer
  extends XTimeContainer
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess

object XParallelTimeContainer {
  @scala.inline
  def apply(
    Acceleration: scala.Double,
    AutoReverse: scala.Boolean,
    Begin: js.Any,
    Decelerate: scala.Double,
    Duration: js.Any,
    ElementType: activexDashLibreofficeLib.`type`,
    End: js.Any,
    EndSync: js.Any,
    Fill: scala.Double,
    FillDefault: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: scala.Double,
    RestartDefault: scala.Double,
    Type: scala.Double,
    UserData: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    acquire: js.Function0[scala.Unit],
    appendChild: js.Function1[XAnimationNode, XAnimationNode],
    createEnumeration: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    hasElements: js.Function0[scala.Boolean],
    insertAfter: js.Function2[XAnimationNode, XAnimationNode, XAnimationNode],
    insertBefore: js.Function2[XAnimationNode, XAnimationNode, XAnimationNode],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChild: js.Function1[XAnimationNode, XAnimationNode],
    replaceChild: js.Function2[XAnimationNode, XAnimationNode, XAnimationNode],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XParallelTimeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Acceleration")(Acceleration)
    __obj.updateDynamic("AutoReverse")(AutoReverse)
    __obj.updateDynamic("Begin")(Begin)
    __obj.updateDynamic("Decelerate")(Decelerate)
    __obj.updateDynamic("Duration")(Duration)
    __obj.updateDynamic("ElementType")(ElementType)
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("EndSync")(EndSync)
    __obj.updateDynamic("Fill")(Fill)
    __obj.updateDynamic("FillDefault")(FillDefault)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("RepeatCount")(RepeatCount)
    __obj.updateDynamic("RepeatDuration")(RepeatDuration)
    __obj.updateDynamic("Restart")(Restart)
    __obj.updateDynamic("RestartDefault")(RestartDefault)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UserData")(UserData)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("appendChild")(appendChild)
    __obj.updateDynamic("createEnumeration")(createEnumeration)
    __obj.updateDynamic("getElementType")(getElementType)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("hasElements")(hasElements)
    __obj.updateDynamic("insertAfter")(insertAfter)
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeChild")(removeChild)
    __obj.updateDynamic("replaceChild")(replaceChild)
    __obj.updateDynamic("setParent")(setParent)
    __obj.asInstanceOf[XParallelTimeContainer]
  }
}

