package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An iterate container iterates over subitems of a given target object and animates them by subsequently executes the contained effects on them. ;  This
  * could be used to animate a target text word by word or letter by letter.
  */
trait XIterateContainer extends XTimeContainer {
  /** the time interval in percentage of the containers running time before the next iterated content is animated. */
  var IterateInterval: scala.Double
  /** the type of iteration, this depends on the target. ;  See documentation of used animation engine for supported iteration types. */
  var IterateType: scala.Double
  /**
    * This attribute specifies an optional subitem from the target element that should be animated. ;  A value of zero should always be the default and
    * animate the complete target. ;  See documentation of used animation engine for supported subitems.
    */
  var SubItem: scala.Double
  /** a target that contains iterable contents, f.e. a paragraph. ;  See documentation of used animation engine for supported targets. */
  var Target: js.Any
}

object XIterateContainer {
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
    IterateInterval: scala.Double,
    IterateType: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: scala.Double,
    RestartDefault: scala.Double,
    SubItem: scala.Double,
    Target: js.Any,
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
  ): XIterateContainer = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, AutoReverse = AutoReverse, Begin = Begin, Decelerate = Decelerate, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, IterateInterval = IterateInterval, IterateType = IterateType, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, SubItem = SubItem, Target = Target, Type = Type, UserData = UserData, acquire = acquire, appendChild = appendChild, getParent = getParent, insertAfter = insertAfter, insertBefore = insertBefore, queryInterface = queryInterface, release = release, removeChild = removeChild, replaceChild = replaceChild, setParent = setParent)
  
    __obj.asInstanceOf[XIterateContainer]
  }
}

