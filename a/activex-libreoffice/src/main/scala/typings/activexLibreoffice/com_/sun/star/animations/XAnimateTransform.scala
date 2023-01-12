package typings.activexLibreoffice.com_.sun.star.animations

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait XAnimateTransform
  extends StObject
     with XAnimate {
  
  /** @see AnimationTransformType */
  var TransformType: Double
}
object XAnimateTransform {
  
  inline def apply(
    Acceleration: Double,
    Accumulate: Boolean,
    Additive: Double,
    AttributeName: String,
    AutoReverse: Boolean,
    Begin: Any,
    By: Any,
    CalcMode: Double,
    Decelerate: Double,
    Duration: Any,
    End: Any,
    EndSync: Any,
    Fill: Double,
    FillDefault: Double,
    Formula: String,
    From: Any,
    KeyTimes: SafeArray[Double],
    Parent: XInterface,
    RepeatCount: Any,
    RepeatDuration: Any,
    Restart: Double,
    RestartDefault: Double,
    SubItem: Double,
    Target: Any,
    TimeFilter: SafeArray[TimeFilterPair],
    To: Any,
    TransformType: Double,
    Type: Double,
    UserData: SafeArray[NamedValue],
    ValueType: Double,
    Values: SafeArray[Any],
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XAnimateTransform = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration.asInstanceOf[js.Any], Accumulate = Accumulate.asInstanceOf[js.Any], Additive = Additive.asInstanceOf[js.Any], AttributeName = AttributeName.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], Begin = Begin.asInstanceOf[js.Any], By = By.asInstanceOf[js.Any], CalcMode = CalcMode.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], EndSync = EndSync.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], FillDefault = FillDefault.asInstanceOf[js.Any], Formula = Formula.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], KeyTimes = KeyTimes.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RestartDefault = RestartDefault.asInstanceOf[js.Any], SubItem = SubItem.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeFilter = TimeFilter.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any], TransformType = TransformType.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserData = UserData.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
    __obj.asInstanceOf[XAnimateTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAnimateTransform] (val x: Self) extends AnyVal {
    
    inline def setTransformType(value: Double): Self = StObject.set(x, "TransformType", value.asInstanceOf[js.Any])
  }
}
