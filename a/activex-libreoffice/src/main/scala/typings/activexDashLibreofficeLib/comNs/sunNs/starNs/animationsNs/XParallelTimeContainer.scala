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
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, AutoReverse = AutoReverse, Begin = Begin, Decelerate = Decelerate, Duration = Duration, ElementType = ElementType, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, Type = Type, UserData = UserData, acquire = acquire, appendChild = appendChild, createEnumeration = createEnumeration, getElementType = getElementType, getParent = getParent, hasElements = hasElements, insertAfter = insertAfter, insertBefore = insertBefore, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, setParent = setParent)
  
    __obj.asInstanceOf[XParallelTimeContainer]
  }
}

