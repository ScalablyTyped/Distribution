package typings.adone.adoneNs.shaniNs.utilNs.INs

import typings.adone.adoneNs.metaNs.INs.PossibleTypes
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  /**
    * Matches anything
    */
  var any: Matcher = js.native
  /**
    * Requires the value to be an array.
    */
  var array: ArrayMatcher = js.native
  /**
    * Requires the value to be a boolean
    */
  var bool: Matcher = js.native
  /**
    * Requires the value to be a date object
    */
  var date: Matcher = js.native
  /**
    * Requires the value to be defined
    */
  var defined: Matcher = js.native
  /**
    * Requires the value to be falsy
    */
  var falsy: Matcher = js.native
  /**
    * Requires the value to be a function
    */
  var func: Matcher = js.native
  /**
    * Requires the value to be a map.
    */
  var map: MapMatcher = js.native
  /**
    * Requires the value to be a number
    */
  var number: Matcher = js.native
  /**
    * Requires the value to be an object
    */
  var `object`: Matcher = js.native
  /**
    * Requires the value to be a regular expression
    */
  var regexp: Matcher = js.native
  /**
    * Requires the value to be a set.
    */
  var set: SetMatcher = js.native
  /**
    * Requires the value to be a string
    */
  var string: Matcher = js.native
  /**
    * Requires the value to be a symbol
    */
  var symbol: Matcher = js.native
  /**
    * Requires the value to be truthy
    */
  var truthy: Matcher = js.native
  /**
    * Specify a custom matcher
    */
  def apply(callback: js.Function1[/* value */ js.Any, Boolean]): Matcher = js.native
  def apply(callback: js.Function1[/* value */ js.Any, Boolean], message: String): Matcher = js.native
  /**
    * Requires the value to be a string and match the given regular expression
    */
  def apply(expr: RegExp): Matcher = js.native
  /**
    * Requires the value to be not null or undefined and have at least the same properties as expectation
    */
  def apply(obj: js.Any): Matcher = js.native
  /**
    * Requires the value to be a string and have the expectation as a substring
    */
  def apply(value: String): Matcher = js.native
  /**
    * Requires the value to be == to the given number
    */
  def apply(value: Double): Matcher = js.native
  /**
    * Requires the value to define the given property
    */
  def has(property: String): Matcher = js.native
  def has(property: String, expect: js.Any): Matcher = js.native
  /**
    * Requires the value to define the given property by itself
    */
  def hasOwn(property: String): Matcher = js.native
  def hasOwn(property: String, expect: js.Any): Matcher = js.native
  /**
    * Requires the value to be an instance of the given type
    */
  def instanceOf(`type`: js.Any): Matcher = js.native
  /**
    * Requires the value to strictly equal obj
    */
  def same(obj: js.Any): Matcher = js.native
  def typeOf(`type`: String): Matcher = js.native
  /**
    * Requires the value to be of the given type
    */
  def typeOf(`type`: PossibleTypes): Matcher = js.native
}

