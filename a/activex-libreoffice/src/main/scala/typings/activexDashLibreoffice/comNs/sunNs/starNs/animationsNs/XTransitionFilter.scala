package typings.activexDashLibreoffice.comNs.sunNs.starNs.animationsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
  var Direction: Boolean
  /**
    * If the value of the {@link Type} attribute is {@link TransitionType.FADE} and the value of the {@link Subtype} attribute is {@link
    * TransitionSubType.FADETOCOLOR} or {@link TransitionSubType.FADEFROMCOLOR} , then this attribute specifies the starting or ending color of the fade.
    * The default value is 0 (black).
    */
  var FadeColor: Double
  /**
    * Indicates whether the transitionFilter's parent element will transition in or out. Legal values are `TRUE` indicating that the parent media will
    * become more visible as the transition progress increases and `FALSE` indicating that the parent media will become less visible as the transition
    * progress increases.
    *
    * The default value is `TRUE` .
    */
  var Mode: Boolean
  /**
    * This is the subtype of the transition. ;  This must be one of the transition subtypes appropriate for the specified {@link Type} as listed in {@link
    * TransitionSubType} . {@link TransitionSubType.DEFAULT} is the default.
    */
  var Subtype: Double
  /** This is the type or family of transition. ;  This attribute is required and must be one of the transition families listed in {@link TransitionType} . */
  var Transition: Double
}

object XTransitionFilter {
  @scala.inline
  def apply(
    Acceleration: Double,
    Accumulate: Boolean,
    Additive: Double,
    AttributeName: String,
    AutoReverse: Boolean,
    Begin: js.Any,
    By: js.Any,
    CalcMode: Double,
    Decelerate: Double,
    Direction: Boolean,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    FadeColor: Double,
    Fill: Double,
    FillDefault: Double,
    Formula: String,
    From: js.Any,
    KeyTimes: SafeArray[Double],
    Mode: Boolean,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    SubItem: Double,
    Subtype: Double,
    Target: js.Any,
    TimeFilter: SafeArray[TimeFilterPair],
    To: js.Any,
    Transition: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    ValueType: Double,
    Values: SafeArray[_],
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XTransitionFilter = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, Accumulate = Accumulate, Additive = Additive, AttributeName = AttributeName, AutoReverse = AutoReverse, Begin = Begin, By = By, CalcMode = CalcMode, Decelerate = Decelerate, Direction = Direction, Duration = Duration, End = End, EndSync = EndSync, FadeColor = FadeColor, Fill = Fill, FillDefault = FillDefault, Formula = Formula, From = From, KeyTimes = KeyTimes, Mode = Mode, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, SubItem = SubItem, Subtype = Subtype, Target = Target, TimeFilter = TimeFilter, To = To, Transition = Transition, Type = Type, UserData = UserData, ValueType = ValueType, Values = Values, acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[XTransitionFilter]
  }
}

