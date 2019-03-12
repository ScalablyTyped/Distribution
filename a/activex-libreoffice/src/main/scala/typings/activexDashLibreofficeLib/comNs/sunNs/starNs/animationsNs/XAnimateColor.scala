package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

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
  var ColorInterpolation: scala.Double
  /**
    * defines the direction which is used to perform the interpolation inside the color space defined with {@link ColorInterpolation} . ;  Values could be
    * `TRUE` for clockwise and `FALSE` for counterclockwise.
    *
    * This attribute will be ignored for color spaces where this does not make any sense.
    */
  var Direction: scala.Boolean
}

object XAnimateColor {
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
    ColorInterpolation: scala.Double,
    Decelerate: scala.Double,
    Direction: scala.Boolean,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: scala.Double,
    FillDefault: scala.Double,
    Formula: java.lang.String,
    From: js.Any,
    KeyTimes: stdLib.SafeArray[scala.Double],
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: scala.Double,
    RestartDefault: scala.Double,
    SubItem: scala.Double,
    Target: js.Any,
    TimeFilter: stdLib.SafeArray[TimeFilterPair],
    To: js.Any,
    Type: scala.Double,
    UserData: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ValueType: scala.Double,
    Values: stdLib.SafeArray[_],
    acquire: () => scala.Unit,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit
  ): XAnimateColor = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, Accumulate = Accumulate, Additive = Additive, AttributeName = AttributeName, AutoReverse = AutoReverse, Begin = Begin, By = By, CalcMode = CalcMode, ColorInterpolation = ColorInterpolation, Decelerate = Decelerate, Direction = Direction, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Formula = Formula, From = From, KeyTimes = KeyTimes, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, SubItem = SubItem, Target = Target, TimeFilter = TimeFilter, To = To, Type = Type, UserData = UserData, ValueType = ValueType, Values = Values, acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[XAnimateColor]
  }
}

