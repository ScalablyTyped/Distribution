package typings
package adoneLib.adoneNs.assertionNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion extends LanguageChains {
  /**
                   * Causes following keys assertions to require that the target have all of the given keys
                   */
  var all: this.type = js.native
  /**
                   * Causes following keys assertions to only require that the target have at least one of the given keys
                   */
  var any: this.type = js.native
  /**
                   * Causes following assertions to use deep equality
                   */
  var deep: this.type = js.native
  /**
                   * Makes respondsTo behave like the target is not a function
                   */
  var itself: this.type = js.native
  /**
                   * Enables dot- and bracket-notation in following property and include assertions
                   */
  var nested: this.type = js.native
  /**
                   * Negates all following assertion in the chain
                   */
  var not: this.type = js.native
  /**
                   * Causes following members assertions to require that members be in the same order
                   */
  var ordered: this.type = js.native
  /**
                   * Causes following property and incude assertions to ignore inherited properties
                   */
  var own: this.type = js.native
  /**
                   * Asserts that the target is an arguments object
                   */
  def Arguments(): this.type = js.native
  /**
                   * Asserts that the target is NaN
                   */
  def NaN(): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def Throw(): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def Throw(errorLike: nodeLib.Error): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def Throw(errorLike: nodeLib.Error, errMsgMatcher: java.lang.String): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def Throw(errorLike: nodeLib.Error, errMsgMatcher: stdLib.RegExp): this.type = js.native
  /**
                   * Asserts that the target's type is `type`
                   */
  def a(`type`: PossibleTypes): this.type = js.native
  /**
                   * Asserts that the target's type is `type`
                   */
  def a(`type`: PossibleTypes, message: java.lang.String): this.type = js.native
  def a(`type`: java.lang.String): this.type = js.native
  def a(`type`: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that target > n
                   */
  def above(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target > n
                   */
  def above(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's type is `type`
                   */
  def an(`type`: PossibleTypes): this.type = js.native
  /**
                   * Asserts that the target's type is `type`
                   */
  def an(`type`: PossibleTypes, message: java.lang.String): this.type = js.native
  def an(`type`: java.lang.String): this.type = js.native
  def an(`type`: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is expected +/- delta
                   */
  def approximately(expected: scala.Double, delta: scala.Double): this.type = js.native
  /**
                   * Asserts that the target is expected +/- delta
                   */
  def approximately(expected: scala.Double, delta: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is an arguments object
                   */
  def arguments(): this.type = js.native
  /**
                   * Asserts that target < n
                   */
  def below(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target < n
                   */
  def below(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the value was decreased/increased by delta
                   */
  def by(delta: scala.Double): this.type = js.native
  /**
                   * Asserts that the value was decreased/increased by delta
                   */
  def by(delta: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that fn returns a different value after the target's invokation than before
                   */
  def change(fn: js.Function0[_]): this.type = js.native
  /**
                   * Asserts that fn returns a different value after the target's invokation than before
                   */
  def change(fn: js.Function0[_], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation changes subject's property
                   */
  def change(subject: js.Object, property: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation changes subject's property
                   */
  def change(subject: js.Object, property: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that fn returns a different value after the target's invokation than before
                   */
  def changes(fn: js.Function0[_]): this.type = js.native
  /**
                   * Asserts that fn returns a different value after the target's invokation than before
                   */
  def changes(fn: js.Function0[_], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation changes subject's property
                   */
  def changes(subject: js.Object, property: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation changes subject's property
                   */
  def changes(subject: js.Object, property: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is expected +/- delta
                   */
  def closeTo(expected: scala.Double, delta: scala.Double): this.type = js.native
  /**
                   * Asserts that the target is expected +/- delta
                   */
  def closeTo(expected: scala.Double, delta: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target contains the given value
                   */
  def contain(value: js.Any): this.type = js.native
  /**
                   * Asserts that the target contains the given value
                   */
  def contain(value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target contains the given value
                   */
  def contains(value: js.Any): this.type = js.native
  /**
                   * Asserts that the target contains the given value
                   */
  def contains(value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that fn returns a lesser number after the target's invokation than before
                   */
  def decrease(fn: js.Function0[scala.Double]): this.type = js.native
  /**
                   * Asserts that fn returns a lesser number after the target's invokation than before
                   */
  def decrease(fn: js.Function0[scala.Double], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation decreases subject's property
                   */
  def decrease(subject: js.Object): this.type = js.native
  /**
                   * Asserts that the target's invokation decreases subject's property
                   */
  def decrease(subject: js.Object, property: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation decreases subject's property
                   */
  def decrease(subject: js.Object, property: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that fn returns a lesser number after the target's invokation than before
                   */
  def decreases(fn: js.Function0[scala.Double]): this.type = js.native
  /**
                   * Asserts that fn returns a lesser number after the target's invokation than before
                   */
  def decreases(fn: js.Function0[scala.Double], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation decreases subject's property
                   */
  def decreases(subject: js.Object): this.type = js.native
  /**
                   * Asserts that the target's invokation decreases subject's property
                   */
  def decreases(subject: js.Object, property: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation decreases subject's property
                   */
  def decreases(subject: js.Object, property: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is empty
                   */
  def empty(): this.type = js.native
  /**
                   * Asserts that the target is strictly equal to value(===)
                   */
  def eq(value: js.Any): this.type = js.native
  /**
                   * Asserts that the target is strictly equal to value(===)
                   */
  def eq(value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is deeply equal to object
                   */
  def eql(`object`: js.Any): this.type = js.native
  /**
                   * Asserts that the target is deeply equal to object
                   */
  def eql(`object`: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has the same length length and elements as array in the same order
                   */
  def eqlArray(array: js.Array[_]): this.type = js.native
  /**
                   * Asserts that the target has the same length length and elements as array in the same order
                   */
  def eqlArray(array: js.Array[_], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is deeply equal to object
                   */
  def eqls(`object`: js.Any): this.type = js.native
  /**
                   * Asserts that the target is deeply equal to object
                   */
  def eqls(`object`: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is strictly equal to value(===)
                   */
  def equal(value: js.Any): this.type = js.native
  /**
                   * Asserts that the target is strictly equal to value(===)
                   */
  def equal(value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is strictly equal to value(===)
                   */
  def equals(value: js.Any): this.type = js.native
  /**
                   * Asserts that the target is strictly equal to value(===)
                   */
  def equals(value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is neither null nor undefined
                   */
  def exist(): this.type = js.native
  /**
                   * Asserts that the target is extensible
                   */
  def extensible(): this.type = js.native
  /**
                   * Asserts that the target is false
                   */
  def `false`(): this.type = js.native
  /**
                   * Asserts that the target is a finite number
                   */
  def finite(): this.type = js.native
  /**
                   * Asserts that the target is frozen
                   */
  def frozen(): this.type = js.native
  /**
                   * Asserts that target > n
                   */
  def greaterThan(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target > n
                   */
  def greaterThan(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that target > n
                   */
  def gt(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target > n
                   */
  def gt(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that target >= n
                   */
  def gte(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target >= n
                   */
  def gte(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has its own property name `name` with value `value`
                   */
  def haveOwnProperty(name: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has its own property name `name` with value `value`
                   */
  def haveOwnProperty(name: java.lang.String, value: js.Any): this.type = js.native
  /**
                   * Asserts that the target has its own property name `name` with value `value`
                   */
  def haveOwnProperty(name: java.lang.String, value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has its own property descriptor with name `name` and value `value`
                   */
  def haveOwnPropertyDescriptor(name: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has its own property descriptor with name `name` and value `value`
                   */
  def haveOwnPropertyDescriptor(name: java.lang.String, descriptor: js.Object): this.type = js.native
  /**
                   * Asserts that the target has its own property descriptor with name `name` and value `value`
                   */
  def haveOwnPropertyDescriptor(name: java.lang.String, descriptor: js.Object, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target includes the given value
                   */
  def include(value: js.Any): this.type = js.native
  /**
                   * Asserts that the target includes the given value
                   */
  def include(value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target includes the given value
                   */
  def includes(value: js.Any): this.type = js.native
  /**
                   * Asserts that the target includes the given value
                   */
  def includes(value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that fn returns a greater number after the target's invokation than before
                   */
  def increase(fn: js.Function0[scala.Double]): this.type = js.native
  /**
                   * Asserts that fn returns a greater number after the target's invokation than before
                   */
  def increase(fn: js.Function0[scala.Double], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation increases subject's property
                   */
  def increase(subject: js.Object): this.type = js.native
  /**
                   * Asserts that the target's invokation increases subject's property
                   */
  def increase(subject: js.Object, property: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation increases subject's property
                   */
  def increase(subject: js.Object, property: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that fn returns a greater number after the target's invokation than before
                   */
  def increases(fn: js.Function0[scala.Double]): this.type = js.native
  /**
                   * Asserts that fn returns a greater number after the target's invokation than before
                   */
  def increases(fn: js.Function0[scala.Double], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation increases subject's property
                   */
  def increases(subject: js.Object): this.type = js.native
  /**
                   * Asserts that the target's invokation increases subject's property
                   */
  def increases(subject: js.Object, property: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's invokation increases subject's property
                   */
  def increases(subject: js.Object, property: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is an instance of constructor
                   */
  def instanceOf(constructor: js.Object): this.type = js.native
  /**
                   * Asserts that the target is an instance of constructor
                   */
  def instanceOf(constructor: js.Object, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is an instance of constructor
                   */
  def instanceof(constructor: js.Object): this.type = js.native
  /**
                   * Asserts that the target is an instance of constructor
                   */
  def instanceof(constructor: js.Object, message: java.lang.String): this.type = js.native
  /**
                   * Assert that the target has the given keys
                   */
  def key(key: java.lang.String): this.type = js.native
  /**
                   * Assert that the target has the given keys
                   */
  def key(key: js.Array[java.lang.String]): this.type = js.native
  /**
                   * Assert that the target has the given keys
                   */
  def key(key: js.Object): this.type = js.native
  def key(keys: java.lang.String*): this.type = js.native
  /**
                   * Assert that the target has the given keys
                   */
  def keys(key: java.lang.String): this.type = js.native
  /**
                   * Assert that the target has the given keys
                   */
  def keys(key: js.Array[java.lang.String]): this.type = js.native
  /**
                   * Assert that the target has the given keys
                   */
  def keys(key: js.Object): this.type = js.native
  def keys(keys: java.lang.String*): this.type = js.native
  /**
                   * Asserts that target >= n
                   */
  def least(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target >= n
                   */
  def least(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's property length equal to n
                   */
  def length(n: scala.Double): this.type = js.native
  /**
                   * Asserts that the target's property length equal to n
                   */
  def length(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target's property length equal to n
                   */
  def lengthOf(n: scala.Double): this.type = js.native
  /**
                   * Asserts that the target's property length equal to n
                   */
  def lengthOf(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that target < n
                   */
  def lessThan(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target < n
                   */
  def lessThan(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that target < n
                   */
  def lt(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target < n
                   */
  def lt(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that target <= n
                   */
  def lte(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target <= n
                   */
  def lte(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target matches the regular expression regExp
                   */
  def `match`(regExp: stdLib.RegExp): this.type = js.native
  /**
                   * Asserts that the target matches the regular expression regExp
                   */
  def `match`(regExp: stdLib.RegExp, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target matches the regular expression regExp
                   */
  def matches(regExp: stdLib.RegExp): this.type = js.native
  /**
                   * Asserts that the target matches the regular expression regExp
                   */
  def matches(regExp: stdLib.RegExp, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target array has the same members as the given
                   */
  def members(set: js.Array[_]): this.type = js.native
  /**
                   * Asserts that the target array has the same members as the given
                   */
  def members(set: js.Array[_], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that target <= n
                   */
  def most(n: scala.Double): this.type = js.native
  /**
                   * Asserts that target <= n
                   */
  def most(n: scala.Double, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is null
                   */
  def `null`(): this.type = js.native
  /**
                   * Asserts that the target is non-strictly equal to true
                   */
  def ok(): this.type = js.native
  /**
                   * Asserts that the target is the member of list
                   */
  def oneOf(list: js.Array[_]): this.type = js.native
  /**
                   * Asserts that the target is the member of list
                   */
  def oneOf(list: js.Array[_], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has its own property name `name` with value `value`
                   */
  def ownProperty(name: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has its own property name `name` with value `value`
                   */
  def ownProperty(name: java.lang.String, value: js.Any): this.type = js.native
  /**
                   * Asserts that the target has its own property name `name` with value `value`
                   */
  def ownProperty(name: java.lang.String, value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has its own property descriptor with name `name` and value `value`
                   */
  def ownPropertyDescriptor(name: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has its own property descriptor with name `name` and value `value`
                   */
  def ownPropertyDescriptor(name: java.lang.String, descriptor: js.Object): this.type = js.native
  /**
                   * Asserts that the target has its own property descriptor with name `name` and value `value`
                   */
  def ownPropertyDescriptor(name: java.lang.String, descriptor: js.Object, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has a property name `name` with value `value`
                   */
  def property(name: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target has a property name `name` with value `value`
                   */
  def property(name: java.lang.String, value: js.Any): this.type = js.native
  /**
                   * Asserts that the target has a property name `name` with value `value`
                   */
  def property(name: java.lang.String, value: js.Any, message: java.lang.String): this.type = js.native
  /**
                   * Assert that the target has a method with name `method`. For functions checks the prototype
                   */
  def respondTo(method: java.lang.String): this.type = js.native
  /**
                   * Assert that the target has a method with name `method`. For functions checks the prototype
                   */
  def respondTo(method: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Assert that the target has a method with name `method`. For functions checks the prototype
                   */
  def respondsTo(method: java.lang.String): this.type = js.native
  /**
                   * Assert that the target has a method with name `method`. For functions checks the prototype
                   */
  def respondsTo(method: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that matches returns a truthy value with the target as the first argument
                   */
  def satisfies(matcher: js.Function0[scala.Boolean]): this.type = js.native
  /**
                   * Asserts that matches returns a truthy value with the target as the first argument
                   */
  def satisfies(matcher: js.Function0[scala.Boolean], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that matches returns a truthy value with the target as the first argument
                   */
  def satisfy(matcher: js.Function0[scala.Boolean]): this.type = js.native
  /**
                   * Asserts that matches returns a truthy value with the target as the first argument
                   */
  def satisfy(matcher: js.Function0[scala.Boolean], message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is sealed
                   */
  def `sealed`(): this.type = js.native
  /**
                   * Asserts that the target contains str as a substring
                   */
  def string(str: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target contains str as a substring
                   */
  def string(str: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def `throw`(): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def `throw`(errorLike: js.Object): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def `throw`(errorLike: js.Object, errMsgMatcher: java.lang.String): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def `throw`(errorLike: js.Object, errMsgMatcher: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def `throw`(errorLike: js.Object, errMsgMatcher: stdLib.RegExp): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def `throw`(errorLike: js.Object, errMsgMatcher: stdLib.RegExp, message: java.lang.String): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def throws(): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def throws(errorLike: js.Object): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def throws(errorLike: js.Object, errMsgMatcher: java.lang.String): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def throws(errorLike: js.Object, errMsgMatcher: java.lang.String, message: java.lang.String): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def throws(errorLike: js.Object, errMsgMatcher: stdLib.RegExp): this.type = js.native
  /**
                   * Assert that the target throws an error
                   */
  def throws(errorLike: js.Object, errMsgMatcher: stdLib.RegExp, message: java.lang.String): this.type = js.native
  /**
                   * Asserts that the target is true
                   */
  def `true`(): this.type = js.native
  /**
                   * Asserts that the target is undefined
                   */
  def undefined(): this.type = js.native
  /**
                   * Asserts that start <= target <= end
                   */
  def within(start: scala.Double, end: scala.Double): this.type = js.native
  /**
                   * Asserts that start <= target <= end
                   */
  def within(start: scala.Double, end: scala.Double, message: java.lang.String): this.type = js.native
}

@js.native
trait assertion extends js.Object {
  var AssertionError: adoneLib.adoneNs.assertionNs.AssertionError = js.native
  @JSName("assert")
  var assert_Original: AssertFunction = js.native
  var config: Config = js.native
  @JSName("expect")
  var expect_Original: ExpectFunction = js.native
  @JSName("loadAssertInterface")
  var loadAssertInterface_Original: LoadInterfaceFunction = js.native
  @JSName("loadExpectInterface")
  var loadExpectInterface_Original: LoadInterfaceFunction = js.native
  @JSName("loadMockInterface")
  var loadMockInterface_Original: LoadInterfaceFunction = js.native
  @JSName("use")
  var use_Original: UseFunction = js.native
  /**
                   * Asserts that value is truthy
                   */
  def assert(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is truthy
                   */
  def assert(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def expect(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): MockAssertions = js.native
  def expect(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy, message: java.lang.String): MockAssertions = js.native
  def expect(value: js.Any): Assertion = js.native
  def expect(value: js.Any, message: java.lang.String): Assertion = js.native
  def loadAssertInterface(): assertion = js.native
  def loadExpectInterface(): assertion = js.native
  def loadMockInterface(): assertion = js.native
  def use(fn: js.Function0[scala.Unit]): assertion = js.native
}

