package typings.activexDashLibreoffice.comNs.sunNs.starNs.animationsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for animation by defining color changes over time. ;  Only color value will be legal values for the following members {@link
  * XAnimate.Values}{@link XAnimate.From}{@link XAnimate.To}{@link XAnimate.By}
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animateColor
  */
trait XAnimateColor extends XAnimate {
  /**
    * defines the color space which is used to perform the interpolation. ;
    * @see AnimationColorSpace
    */
  var ColorInterpolation: Double
  /**
    * defines the direction which is used to perform the interpolation inside the color space defined with {@link ColorInterpolation} . ;  Values could be
    * `TRUE` for clockwise and `FALSE` for counterclockwise.
    *
    * This attribute will be ignored for color spaces where this does not make any sense.
    */
  var Direction: Boolean
}

object XAnimateColor {
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
    ColorInterpolation: Double,
    Decelerate: Double,
    Direction: Boolean,
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
    Type: Double,
    UserData: SafeArray[NamedValue],
    ValueType: Double,
    Values: SafeArray[_],
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XAnimateColor = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, Accumulate = Accumulate, Additive = Additive, AttributeName = AttributeName, AutoReverse = AutoReverse, Begin = Begin, By = By, CalcMode = CalcMode, ColorInterpolation = ColorInterpolation, Decelerate = Decelerate, Direction = Direction, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Formula = Formula, From = From, KeyTimes = KeyTimes, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, SubItem = SubItem, Target = Target, TimeFilter = TimeFilter, To = To, Type = Type, UserData = UserData, ValueType = ValueType, Values = Values, acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[XAnimateColor]
  }
}

