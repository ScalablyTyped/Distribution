package typings.activexLibreoffice.com_.sun.star.animations

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for animation by defining color changes over time. ;  Only color value will be legal values for the following members {@link
  * XAnimate.Values}{@link XAnimate.From}{@link XAnimate.To}{@link XAnimate.By}
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animateColor
  */
@js.native
trait XAnimateColor extends XAnimate {
  
  /**
    * defines the color space which is used to perform the interpolation. ;
    * @see AnimationColorSpace
    */
  var ColorInterpolation: Double = js.native
  
  /**
    * defines the direction which is used to perform the interpolation inside the color space defined with {@link ColorInterpolation} . ;  Values could be
    * `TRUE` for clockwise and `FALSE` for counterclockwise.
    *
    * This attribute will be ignored for color spaces where this does not make any sense.
    */
  var Direction: Boolean = js.native
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
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], CalcMode = CalcMode.asInstanceOf[js.Any], ColorInterpolation = ColorInterpolation.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], KeyTimes = KeyTimes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeFilter = TimeFilter.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XAnimateColor]
  }
  
  @scala.inline
  implicit class XAnimateColorMutableBuilder[Self <: XAnimateColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorInterpolation(value: Double): Self = StObject.set(x, "ColorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: Boolean): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
  }
}
