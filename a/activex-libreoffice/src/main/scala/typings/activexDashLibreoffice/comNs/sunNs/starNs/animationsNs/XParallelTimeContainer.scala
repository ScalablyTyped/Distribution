package typings.activexDashLibreoffice.comNs.sunNs.starNs.animationsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XParallelTimeContainer
  extends XTimeContainer
     with XEnumerationAccess

object XParallelTimeContainer {
  @scala.inline
  def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: js.Any,
    Decelerate: Double,
    Duration: js.Any,
    ElementType: `type`,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: () => Unit,
    appendChild: XAnimationNode => XAnimationNode,
    createEnumeration: () => XEnumeration,
    getElementType: () => `type`,
    getParent: () => XInterface,
    hasElements: () => Boolean,
    insertAfter: (XAnimationNode, XAnimationNode) => XAnimationNode,
    insertBefore: (XAnimationNode, XAnimationNode) => XAnimationNode,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XAnimationNode => XAnimationNode,
    replaceChild: (XAnimationNode, XAnimationNode) => XAnimationNode,
    setParent: XInterface => Unit
  ): XParallelTimeContainer = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, AutoReverse = AutoReverse, Begin = Begin, Decelerate = Decelerate, Duration = Duration, ElementType = ElementType, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, Type = Type, UserData = UserData, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), createEnumeration = js.Any.fromFunction0(createEnumeration), getElementType = js.Any.fromFunction0(getElementType), getParent = js.Any.fromFunction0(getParent), hasElements = js.Any.fromFunction0(hasElements), insertAfter = js.Any.fromFunction2(insertAfter), insertBefore = js.Any.fromFunction2(insertBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[XParallelTimeContainer]
  }
}

