package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// Attributes
// see http://docs.angularjs.org/api/ng.$compile.directive.Attributes
///////////////////////////////////////////////////////////////////////////
trait IAttributes
  extends /**
  * this is necessary to be able to access the scoped attributes. it's not very elegant
  * because you have to use attrs['foo'] instead of attrs.foo but I don't know of a better way
  * this should really be limited to return string but it creates this problem: http://stackoverflow.com/q/17201854/165656
  */
/* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * A map of DOM element attribute names to the normalized name. This is needed
    * to do reverse lookup from normalized name back to actual name.
    */
  @JSName("$attr")
  var $attr: js.Object
  /**
    * Adds the CSS class value specified by the classVal parameter to the
    * element. If animations are enabled then an animation will be triggered
    * for the class addition.
    */
  @JSName("$addClass")
  def $addClass(classVal: java.lang.String): scala.Unit
  /**
    * Converts an attribute name (e.g. dash/colon/underscore-delimited string, optionally prefixed with x- or data-) to its normalized, camelCase form.
    *
    * Also there is special case for Moz prefix starting with upper case letter.
    *
    * For further information check out the guide on @see https://docs.angularjs.org/guide/directive#matching-directives
    */
  @JSName("$normalize")
  def $normalize(name: java.lang.String): java.lang.String
  /**
    * Observes an interpolated attribute.
    * The observer function will be invoked once during the next $digest
    * following compilation. The observer is then invoked whenever the
    * interpolated value changes.
    */
  @JSName("$observe")
  def $observe[T](name: java.lang.String, fn: js.Function1[/* value */ js.UndefOr[T], _]): angularLib.angularMod.Global.Function
  /**
    * Removes the CSS class value specified by the classVal parameter from the
    * element. If animations are enabled then an animation will be triggered for
    * the class removal.
    */
  @JSName("$removeClass")
  def $removeClass(classVal: java.lang.String): scala.Unit
  /**
    * Set DOM element attribute value.
    */
  @JSName("$set")
  def $set(key: java.lang.String, value: js.Any): scala.Unit
  /**
    * Adds and removes the appropriate CSS class values to the element based on the difference between
    * the new and old CSS class values (specified as newClasses and oldClasses).
    */
  @JSName("$updateClass")
  def $updateClass(newClasses: java.lang.String, oldClasses: java.lang.String): scala.Unit
}

object IAttributes {
  @scala.inline
  def apply(
    $addClass: js.Function1[java.lang.String, scala.Unit],
    $attr: js.Object,
    $normalize: js.Function1[java.lang.String, java.lang.String],
    $observe: js.Function2[
      java.lang.String, 
      js.Function1[/* value */ js.UndefOr[js.Any], _], 
      angularLib.angularMod.Global.Function
    ],
    $removeClass: js.Function1[java.lang.String, scala.Unit],
    $set: js.Function2[java.lang.String, js.Any, scala.Unit],
    $updateClass: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    StringDictionary: /**
    * this is necessary to be able to access the scoped attributes. it's not very elegant
    * because you have to use attrs['foo'] instead of attrs.foo but I don't know of a better way
    * this should really be limited to return string but it creates this problem: http://stackoverflow.com/q/17201854/165656
    */
  /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IAttributes = {
    val __obj = js.Dynamic.literal($addClass = $addClass, $attr = $attr, $normalize = $normalize, $observe = $observe, $removeClass = $removeClass, $set = $set, $updateClass = $updateClass)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IAttributes]
  }
}

