package typings.angular.angularMod

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod._Global_.Function
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
/* name */ StringDictionary[js.Any] {
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
  def $addClass(classVal: String): Unit
  /**
    * Converts an attribute name (e.g. dash/colon/underscore-delimited string, optionally prefixed with x- or data-) to its normalized, camelCase form.
    *
    * Also there is special case for Moz prefix starting with upper case letter.
    *
    * For further information check out the guide on @see https://docs.angularjs.org/guide/directive#matching-directives
    */
  @JSName("$normalize")
  def $normalize(name: String): String
  /**
    * Observes an interpolated attribute.
    * The observer function will be invoked once during the next $digest
    * following compilation. The observer is then invoked whenever the
    * interpolated value changes.
    */
  @JSName("$observe")
  def $observe[T](name: String, fn: js.Function1[/* value */ js.UndefOr[T], _]): Function
  /**
    * Removes the CSS class value specified by the classVal parameter from the
    * element. If animations are enabled then an animation will be triggered for
    * the class removal.
    */
  @JSName("$removeClass")
  def $removeClass(classVal: String): Unit
  /**
    * Set DOM element attribute value.
    */
  @JSName("$set")
  def $set(key: String, value: js.Any): Unit
  /**
    * Adds and removes the appropriate CSS class values to the element based on the difference between
    * the new and old CSS class values (specified as newClasses and oldClasses).
    */
  @JSName("$updateClass")
  def $updateClass(newClasses: String, oldClasses: String): Unit
}

object IAttributes {
  @scala.inline
  def apply(
    $addClass: String => Unit,
    $attr: js.Object,
    $normalize: String => String,
    $observe: (String, js.Function1[/* value */ js.UndefOr[js.Any], _]) => Function,
    $removeClass: String => Unit,
    $set: (String, js.Any) => Unit,
    $updateClass: (String, String) => Unit,
    StringDictionary: /**
    * this is necessary to be able to access the scoped attributes. it's not very elegant
    * because you have to use attrs['foo'] instead of attrs.foo but I don't know of a better way
    * this should really be limited to return string but it creates this problem: http://stackoverflow.com/q/17201854/165656
    */
  /* name */ StringDictionary[js.Any] = null
  ): IAttributes = {
    val __obj = js.Dynamic.literal($addClass = js.Any.fromFunction1($addClass), $attr = $attr, $normalize = js.Any.fromFunction1($normalize), $observe = js.Any.fromFunction2($observe), $removeClass = js.Any.fromFunction1($removeClass), $set = js.Any.fromFunction2($set), $updateClass = js.Any.fromFunction2($updateClass))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IAttributes]
  }
}

