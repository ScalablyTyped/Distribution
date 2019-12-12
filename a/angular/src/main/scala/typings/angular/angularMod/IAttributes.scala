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
@js.native
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
  var $attr: js.Object = js.native
  /**
    * Adds the CSS class value specified by the classVal parameter to the
    * element. If animations are enabled then an animation will be triggered
    * for the class addition.
    */
  @JSName("$addClass")
  def $addClass(classVal: String): Unit = js.native
  /**
    * Converts an attribute name (e.g. dash/colon/underscore-delimited string, optionally prefixed with x- or data-) to its normalized, camelCase form.
    *
    * Also there is special case for Moz prefix starting with upper case letter.
    *
    * For further information check out the guide on @see https://docs.angularjs.org/guide/directive#matching-directives
    */
  @JSName("$normalize")
  def $normalize(name: String): String = js.native
  /**
    * Observes an interpolated attribute.
    * The observer function will be invoked once during the next $digest
    * following compilation. The observer is then invoked whenever the
    * interpolated value changes.
    */
  @JSName("$observe")
  def $observe[T](name: String, fn: js.Function1[/* value */ js.UndefOr[T], _]): Function = js.native
  /**
    * Removes the CSS class value specified by the classVal parameter from the
    * element. If animations are enabled then an animation will be triggered for
    * the class removal.
    */
  @JSName("$removeClass")
  def $removeClass(classVal: String): Unit = js.native
  /**
    * Set DOM element attribute value.
    */
  @JSName("$set")
  def $set(key: String, value: js.Any): Unit = js.native
  /**
    * Adds and removes the appropriate CSS class values to the element based on the difference between
    * the new and old CSS class values (specified as newClasses and oldClasses).
    */
  @JSName("$updateClass")
  def $updateClass(newClasses: String, oldClasses: String): Unit = js.native
}

