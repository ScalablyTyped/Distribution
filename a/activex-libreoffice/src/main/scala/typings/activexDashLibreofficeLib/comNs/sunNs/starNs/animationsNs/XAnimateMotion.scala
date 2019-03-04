package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for animation by defining motion on a path.
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animateMotion
  */
trait XAnimateMotion extends XAnimate {
  /** Specifies the origin of motion for the animation. The values and semantics of this attribute are dependent upon the used animation engine. */
  var Origin: js.Any
  /**
    * Specifies an optional path. ;  If a path is used, the {@link From} , {@link To} and {@link By} members are ignored. The value type of the path depends
    * on the used rendering system. Possible types maybe a svg:d path encoded in a string.
    */
  var Path: js.Any
}

object XAnimateMotion {
  @scala.inline
  def apply(
    Acceleration: scala.Double,
    Accumulate: scala.Boolean,
    Additive: scala.Double,
    AttributeName: java.lang.String,
    AutoReverse: scala.Boolean,
    Begin: js.Any,
    By: js.Any,
    CalcMode: scala.Double,
    Decelerate: scala.Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: scala.Double,
    FillDefault: scala.Double,
    Formula: java.lang.String,
    From: js.Any,
    KeyTimes: activexDashInteropLib.SafeArray[scala.Double],
    Origin: js.Any,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Path: js.Any,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: scala.Double,
    RestartDefault: scala.Double,
    SubItem: scala.Double,
    Target: js.Any,
    TimeFilter: activexDashInteropLib.SafeArray[TimeFilterPair],
    To: js.Any,
    Type: scala.Double,
    UserData: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ValueType: scala.Double,
    Values: activexDashInteropLib.SafeArray[_],
    acquire: js.Function0[scala.Unit],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XAnimateMotion = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, Accumulate = Accumulate, Additive = Additive, AttributeName = AttributeName, AutoReverse = AutoReverse, Begin = Begin, By = By, CalcMode = CalcMode, Decelerate = Decelerate, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Formula = Formula, From = From, KeyTimes = KeyTimes, Origin = Origin, Parent = Parent, Path = Path, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, SubItem = SubItem, Target = Target, TimeFilter = TimeFilter, To = To, Type = Type, UserData = UserData, ValueType = ValueType, Values = Values, acquire = acquire, getParent = getParent, queryInterface = queryInterface, release = release, setParent = setParent)
  
    __obj.asInstanceOf[XAnimateMotion]
  }
}

