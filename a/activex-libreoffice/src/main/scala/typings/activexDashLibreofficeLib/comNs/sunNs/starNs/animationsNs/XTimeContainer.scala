package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Supported modules BasicInlineTimingEventTimingFillDefaultMultiArcTimingRepeatTiming ** The deprecated repeat is not supported.
  * **RestartDefaultRestartTimingTimeContainerAttributes
  * @see http://www.w3.org/TR/smil20/smil-timing.html
  * @see http://www.w3.org/TR/smil20/smil-timing.html#Timing-TimingConcepts
  */
trait XTimeContainer extends XAnimationNode {
  def appendChild(newChild: XAnimationNode): XAnimationNode
  def insertAfter(newChild: XAnimationNode, refChild: XAnimationNode): XAnimationNode
  def insertBefore(newChild: XAnimationNode, refChild: XAnimationNode): XAnimationNode
  def removeChild(oldChild: XAnimationNode): XAnimationNode
  def replaceChild(newChild: XAnimationNode, oldChild: XAnimationNode): XAnimationNode
}

object XTimeContainer {
  @scala.inline
  def apply(
    Acceleration: scala.Double,
    AutoReverse: scala.Boolean,
    Begin: js.Any,
    Decelerate: scala.Double,
    Duration: js.Any,
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
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    insertAfter: js.Function2[XAnimationNode, XAnimationNode, XAnimationNode],
    insertBefore: js.Function2[XAnimationNode, XAnimationNode, XAnimationNode],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChild: js.Function1[XAnimationNode, XAnimationNode],
    replaceChild: js.Function2[XAnimationNode, XAnimationNode, XAnimationNode],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XTimeContainer = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, AutoReverse = AutoReverse, Begin = Begin, Decelerate = Decelerate, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, Type = Type, UserData = UserData, acquire = acquire, appendChild = appendChild, getParent = getParent, insertAfter = insertAfter, insertBefore = insertBefore, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, setParent = setParent)
  
    __obj.asInstanceOf[XTimeContainer]
  }
}

