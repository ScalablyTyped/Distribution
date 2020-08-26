package typings.activexLibreoffice.com_.sun.star.animations

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base members {@link XAnimate.Values} , {@link XAnimate.From} , {@link XAnimate.To} and {@link XAnimate.By} can be used with `double` values that set
  * the transition progress the specific amount of time.
  * @see http://www.w3.org/TR/smil20/smil-transitions.html#edef-transitionFilter
  */
@js.native
trait XTransitionFilter extends XAnimate {
  /**
    * This specifies the direction the transition will run. ;  The legal values are `TRUE` for forward and `FALSE` for reverse. The default value is `TRUE`
    * . Note that this does not impact the media being transitioned to, but only affects the geometry of the transition. Transitions which do not have a
    * reverse interpretation should ignore the direction attribute and assume the default value of `TRUE` .
    */
  var Direction: Boolean = js.native
  /**
    * If the value of the {@link Type} attribute is {@link TransitionType.FADE} and the value of the {@link Subtype} attribute is {@link
    * TransitionSubType.FADETOCOLOR} or {@link TransitionSubType.FADEFROMCOLOR} , then this attribute specifies the starting or ending color of the fade.
    * The default value is 0 (black).
    */
  var FadeColor: Double = js.native
  /**
    * Indicates whether the transitionFilter's parent element will transition in or out. Legal values are `TRUE` indicating that the parent media will
    * become more visible as the transition progress increases and `FALSE` indicating that the parent media will become less visible as the transition
    * progress increases.
    *
    * The default value is `TRUE` .
    */
  var Mode: Boolean = js.native
  /**
    * This is the subtype of the transition. ;  This must be one of the transition subtypes appropriate for the specified {@link Type} as listed in {@link
    * TransitionSubType} . {@link TransitionSubType.DEFAULT} is the default.
    */
  var Subtype: Double = js.native
  /** This is the type or family of transition. ;  This attribute is required and must be one of the transition families listed in {@link TransitionType} . */
  var Transition: Double = js.native
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
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], CalcMode = CalcMode.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], FadeColor = FadeColor.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], KeyTimes = KeyTimes.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Subtype = Subtype.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeFilter = TimeFilter.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Transition = Transition.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XTransitionFilter]
  }
  @scala.inline
  implicit class XTransitionFilterOps[Self <: XTransitionFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: Boolean): Self = this.set("Direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFadeColor(value: Double): Self = this.set("FadeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Boolean): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtype(value: Double): Self = this.set("Subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: Double): Self = this.set("Transition", value.asInstanceOf[js.Any])
  }
  
}

