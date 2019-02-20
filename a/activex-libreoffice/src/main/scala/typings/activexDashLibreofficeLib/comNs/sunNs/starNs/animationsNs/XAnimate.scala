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

