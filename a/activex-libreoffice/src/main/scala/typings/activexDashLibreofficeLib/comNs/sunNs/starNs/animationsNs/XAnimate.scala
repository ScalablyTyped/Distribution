package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for generic animation.
  * @see http://www.w3.org/TR/smil20/animation.html#edef-animate
  */
trait XAnimate extends XAnimationNode {
  /**
    * Controls whether or not the animation is cumulative.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-accumulate
    */
  var Accumulate: scala.Boolean
  /**
    * Controls whether or not the animation is additive.
    * @see AnimationAdditiveMode
    * @see http://www.w3.org/TR/smil20/animation.html#adef-additive
    */
  var Additive: scala.Double
  /**
    * Specifies the target attribute.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-attributeName
    */
  var AttributeName: java.lang.String
  /**
    * Specifies a relative offset value for the animation. ;  Must be a legal value of a domain for which addition to the attributeType domain is defined
    * and which yields a value in the attributeType domain. Ignored if the values attribute is specified. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-by
    */
  var By: js.Any
  /**
    * Specifies the interpolation mode for the animation. ;  If the target attribute does not support linear interpolation (e.g. for strings), or if the
    * values attribute has only one value, the CalcMode attribute is ignored and discrete interpolation is used.
    * @see AnimationCalcMode;
    */
  var CalcMode: scala.Double
  /**
    * if this string is set, its contents will be parsed as a formula. All values are used as a parameter for this formula and the computed result will be
    * used.
    */
  var Formula: java.lang.String
  /**
    * Specifies the starting value of the animation. ;  Must be a legal value for the specified attribute. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-from
    */
  var From: js.Any
  var KeyTimes: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * This attribute specifies an optional subitem from the target element that should be animated. ;  A value of zero should always be the default and
    * animate the complete target. ;  See documentation of used animation engine for supported subitems.
    */
  var SubItem: scala.Double
  /** This attribute specifies the target element to be animated. ;  See documentation of used animation engine for supported targets. */
  var Target: js.Any
  /** todo: timeFilter="0,0; 0.14,0.36; 0.43,0.73; 0.71,0.91; 1.0,1.0" ? */
  var TimeFilter: activexDashInteropLib.SafeArray[TimeFilterPair]
  /**
    * Specifies the ending value of the animation. ;  Must be a legal value for the specified attribute. Ignored if the {@link Values} attribute is
    * specified.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-to
    */
  var To: js.Any
  /** @see AnimationValueType */
  var ValueType: scala.Double
  /**
    * A sequence of one or more values, each of which must be a legal value for the specified attribute.
    * @see http://www.w3.org/TR/smil20/animation.html#adef-values
    */
  var Values: activexDashInteropLib.SafeArray[_]
}

object XAnimate {
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
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
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
  ): XAnimate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Acceleration")(Acceleration)
    __obj.updateDynamic("Accumulate")(Accumulate)
    __obj.updateDynamic("Additive")(Additive)
    __obj.updateDynamic("AttributeName")(AttributeName)
    __obj.updateDynamic("AutoReverse")(AutoReverse)
    __obj.updateDynamic("Begin")(Begin)
    __obj.updateDynamic("By")(By)
    __obj.updateDynamic("CalcMode")(CalcMode)
    __obj.updateDynamic("Decelerate")(Decelerate)
    __obj.updateDynamic("Duration")(Duration)
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("EndSync")(EndSync)
    __obj.updateDynamic("Fill")(Fill)
    __obj.updateDynamic("FillDefault")(FillDefault)
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("From")(From)
    __obj.updateDynamic("KeyTimes")(KeyTimes)
    __obj.updateDynamic("Parent")(Parent)
    __obj.updateDynamic("RepeatCount")(RepeatCount)
    __obj.updateDynamic("RepeatDuration")(RepeatDuration)
    __obj.updateDynamic("Restart")(Restart)
    __obj.updateDynamic("RestartDefault")(RestartDefault)
    __obj.updateDynamic("SubItem")(SubItem)
    __obj.updateDynamic("Target")(Target)
    __obj.updateDynamic("TimeFilter")(TimeFilter)
    __obj.updateDynamic("To")(To)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UserData")(UserData)
    __obj.updateDynamic("ValueType")(ValueType)
    __obj.updateDynamic("Values")(Values)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setParent")(setParent)
    __obj.asInstanceOf[XAnimate]
  }
}

