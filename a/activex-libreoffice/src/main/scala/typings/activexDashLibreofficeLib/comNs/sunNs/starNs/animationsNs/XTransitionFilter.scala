package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base members {@link XAnimate.Values} , {@link XAnimate.From} , {@link XAnimate.To} and {@link XAnimate.By} can be used with `double` values that set
  * the transition progress the specific amount of time.
  * @see http://www.w3.org/TR/smil20/smil-transitions.html#edef-transitionFilter
  */
trait XTransitionFilter extends XAnimate {
  /**
    * This specifies the direction the transition will run. ;  The legal values are `TRUE` for forward and `FALSE` for reverse. The default value is `TRUE`
    * . Note that this does not impact the media being transitioned to, but only affects the geometry of the transition. Transitions which do not have a
    * reverse interpretation should ignore the direction attribute and assume the default value of `TRUE` .
    */
  var Direction: scala.Boolean
  /**
    * If the value of the {@link Type} attribute is {@link TransitionType.FADE} and the value of the {@link Subtype} attribute is {@link
    * TransitionSubType.FADETOCOLOR} or {@link TransitionSubType.FADEFROMCOLOR} , then this attribute specifies the starting or ending color of the fade.
    * The default value is 0 (black).
    */
  var FadeColor: scala.Double
  /**
    * Indicates whether the transitionFilter's parent element will transition in or out. Legal values are `TRUE` indicating that the parent media will
    * become more visible as the transition progress increases and `FALSE` indicating that the parent media will become less visible as the transition
    * progress increases.
    *
    * The default value is `TRUE` .
    */
  var Mode: scala.Boolean
  /**
    * This is the subtype of the transition. ;  This must be one of the transition subtypes appropriate for the specified {@link Type} as listed in {@link
    * TransitionSubType} . {@link TransitionSubType.DEFAULT} is the default.
    */
  var Subtype: scala.Double
  /** This is the type or family of transition. ;  This attribute is required and must be one of the transition families listed in {@link TransitionType} . */
  var Transition: scala.Double
}

object XTransitionFilter {
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
    Direction: scala.Boolean,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    FadeColor: scala.Double,
    Fill: scala.Double,
    FillDefault: scala.Double,
    Formula: java.lang.String,
    From: js.Any,
    KeyTimes: activexDashInteropLib.SafeArray[scala.Double],
    Mode: scala.Boolean,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: scala.Double,
    RestartDefault: scala.Double,
    SubItem: scala.Double,
    Subtype: scala.Double,
    Target: js.Any,
    TimeFilter: activexDashInteropLib.SafeArray[TimeFilterPair],
    To: js.Any,
    Transition: scala.Double,
    Type: scala.Double,
    UserData: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ValueType: scala.Double,
    Values: activexDashInteropLib.SafeArray[_],
    acquire: js.Function0[scala.Unit],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XTransitionFilter = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, Accumulate = Accumulate, Additive = Additive, AttributeName = AttributeName, AutoReverse = AutoReverse, Begin = Begin, By = By, CalcMode = CalcMode, Decelerate = Decelerate, Direction = Direction, Duration = Duration, End = End, EndSync = EndSync, FadeColor = FadeColor, Fill = Fill, FillDefault = FillDefault, Formula = Formula, From = From, KeyTimes = KeyTimes, Mode = Mode, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, SubItem = SubItem, Subtype = Subtype, Target = Target, TimeFilter = TimeFilter, To = To, Transition = Transition, Type = Type, UserData = UserData, ValueType = ValueType, Values = Values, acquire = acquire, getParent = getParent, queryInterface = queryInterface, release = release, setParent = setParent)
  
    __obj.asInstanceOf[XTransitionFilter]
  }
}

