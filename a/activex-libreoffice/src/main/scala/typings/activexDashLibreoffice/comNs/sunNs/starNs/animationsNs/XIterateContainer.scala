package typings.activexDashLibreoffice.comNs.sunNs.starNs.animationsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An iterate container iterates over subitems of a given target object and animates them by subsequently executes the contained effects on them. ;  This
  * could be used to animate a target text word by word or letter by letter.
  */
trait XIterateContainer extends XTimeContainer {
  /** the time interval in percentage of the containers running time before the next iterated content is animated. */
  var IterateInterval: Double
  /** the type of iteration, this depends on the target. ;  See documentation of used animation engine for supported iteration types. */
  var IterateType: Double
  /**
    * This attribute specifies an optional subitem from the target element that should be animated. ;  A value of zero should always be the default and
    * animate the complete target. ;  See documentation of used animation engine for supported subitems.
    */
  var SubItem: Double
  /** a target that contains iterable contents, f.e. a paragraph. ;  See documentation of used animation engine for supported targets. */
  var Target: js.Any
}

object XIterateContainer {
  @scala.inline
  def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: js.Any,
    Decelerate: Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    IterateInterval: Double,
    IterateType: Double,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    SubItem: Double,
    Target: js.Any,
    Type: Double,
    UserData: SafeArray[NamedValue],
    acquire: () => Unit,
    appendChild: XAnimationNode => XAnimationNode,
    getParent: () => XInterface,
    insertAfter: (XAnimationNode, XAnimationNode) => XAnimationNode,
    insertBefore: (XAnimationNode, XAnimationNode) => XAnimationNode,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChild: XAnimationNode => XAnimationNode,
    replaceChild: (XAnimationNode, XAnimationNode) => XAnimationNode,
    setParent: XInterface => Unit
  ): XIterateContainer = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, AutoReverse = AutoReverse, Begin = Begin, Decelerate = Decelerate, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, IterateInterval = IterateInterval, IterateType = IterateType, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, SubItem = SubItem, Target = Target, Type = Type, UserData = UserData, acquire = js.Any.fromFunction0(acquire), appendChild = js.Any.fromFunction1(appendChild), getParent = js.Any.fromFunction0(getParent), insertAfter = js.Any.fromFunction2(insertAfter), insertBefore = js.Any.fromFunction2(insertBefore), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChild = js.Any.fromFunction1(removeChild), replaceChild = js.Any.fromFunction2(replaceChild), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[XIterateContainer]
  }
}

