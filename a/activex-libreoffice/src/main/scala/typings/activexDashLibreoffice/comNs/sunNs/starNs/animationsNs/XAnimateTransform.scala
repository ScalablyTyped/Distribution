package typings.activexDashLibreoffice.comNs.sunNs.starNs.animationsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * animates a transformation attribute on a target element, thereby allowing animations to control translation, scaling, rotation and/or skewing.
  *
  * The member XAnimate::Attributes contains a short from {@link AnimationTransformType} .
  *
  * Depending on the value in XAnimate::Attributes, the members {@link XAnimate.From} , {@link XAnimate.To} , {@link XAnimate.By} or {@link
  * XAnimate.Values} contain the following
  *
  * {@link AnimationTransformType.TRANSLATE}; {@link ValuePair} of **tx** and **ty**{@link AnimationTransformType.SCALE}; {@link ValuePair} of **sx** and
  * **sy**{@link AnimationTransformType.ROTATE};  Values for a rotation angle{@link AnimationTransformType.SKEWX};  Values for a skew-angle{@link
  * AnimationTransformType.SKEWY};  Values for a skew-angle
  * @see http://www.w3.org/TR/SVG/animate.html#AnimateTransformElement
  */
trait XAnimateTransform extends XAnimate {
  /** @see AnimationTransformType */
  var TransformType: Double
}

object XAnimateTransform {
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
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Formula: String,
    From: js.Any,
    KeyTimes: SafeArray[Double],
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    SubItem: Double,
    Target: js.Any,
    TimeFilter: SafeArray[TimeFilterPair],
    To: js.Any,
    TransformType: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    ValueType: Double,
    Values: SafeArray[_],
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XAnimateTransform = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, Accumulate = Accumulate, Additive = Additive, AttributeName = AttributeName, AutoReverse = AutoReverse, Begin = Begin, By = By, CalcMode = CalcMode, Decelerate = Decelerate, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Formula = Formula, From = From, KeyTimes = KeyTimes, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, SubItem = SubItem, Target = Target, TimeFilter = TimeFilter, To = To, TransformType = TransformType, Type = Type, UserData = UserData, ValueType = ValueType, Values = Values, acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[XAnimateTransform]
  }
}

