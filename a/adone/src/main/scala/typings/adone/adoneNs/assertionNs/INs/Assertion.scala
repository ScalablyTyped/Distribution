package typings.adone.adoneNs.assertionNs.INs

import typings.adone.adoneNs.shaniNs.utilNs.INs.Spy
import typings.std.Error
import typings.std.RegExp
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
  def Throw(errorLike: Error): this.type = js.native
  def Throw(errorLike: Error, errMsgMatcher: String): this.type = js.native
  def Throw(errorLike: Error, errMsgMatcher: RegExp): this.type = js.native
  def a(`type`: String): this.type = js.native
  def a(`type`: String, message: String): this.type = js.native
  /**
    * Asserts that the target's type is `type`
    */
  def a(`type`: PossibleTypes): this.type = js.native
  def a(`type`: PossibleTypes, message: String): this.type = js.native
  /**
    * Asserts that target > n
    */
  def above(n: Double): this.type = js.native
  def above(n: Double, message: String): this.type = js.native
  def an(`type`: String): this.type = js.native
  def an(`type`: String, message: String): this.type = js.native
  /**
    * Asserts that the target's type is `type`
    */
  def an(`type`: PossibleTypes): this.type = js.native
  def an(`type`: PossibleTypes, message: String): this.type = js.native
  /**
    * Asserts that the target is expected +/- delta
    */
  def approximately(expected: Double, delta: Double): this.type = js.native
  def approximately(expected: Double, delta: Double, message: String): this.type = js.native
  /**
    * Asserts that the target is an arguments object
    */
  def arguments(): this.type = js.native
  /**
    * Asserts that target < n
    */
  def below(n: Double): this.type = js.native
  def below(n: Double, message: String): this.type = js.native
  /**
    * Asserts that the value was decreased/increased by delta
    */
  def by(delta: Double): this.type = js.native
  def by(delta: Double, message: String): this.type = js.native
  /**
    * Asserts that fn returns a different value after the target's invokation than before
    */
  def change(fn: js.Function0[_]): this.type = js.native
  def change(fn: js.Function0[_], message: String): this.type = js.native
  /**
    * Asserts that the target's invokation changes subject's property
    */
  def change(subject: js.Object, property: String): this.type = js.native
  def change(subject: js.Object, property: String, message: String): this.type = js.native
  /**
    * Asserts that fn returns a different value after the target's invokation than before
    */
  def changes(fn: js.Function0[_]): this.type = js.native
  def changes(fn: js.Function0[_], message: String): this.type = js.native
  /**
    * Asserts that the target's invokation changes subject's property
    */
  def changes(subject: js.Object, property: String): this.type = js.native
  def changes(subject: js.Object, property: String, message: String): this.type = js.native
  /**
    * Asserts that the target is expected +/- delta
    */
  def closeTo(expected: Double, delta: Double): this.type = js.native
  def closeTo(expected: Double, delta: Double, message: String): this.type = js.native
  /**
    * Asserts that the target contains the given value
    */
  def contain(value: js.Any): this.type = js.native
  def contain(value: js.Any, message: String): this.type = js.native
  /**
    * Asserts that the target contains the given value
    */
  def contains(value: js.Any): this.type = js.native
  def contains(value: js.Any, message: String): this.type = js.native
  /**
    * Asserts that fn returns a lesser number after the target's invokation than before
    */
  def decrease(fn: js.Function0[Double]): this.type = js.native
  def decrease(fn: js.Function0[Double], message: String): this.type = js.native
  /**
    * Asserts that the target's invokation decreases subject's property
    */
  def decrease(subject: js.Object): this.type = js.native
  def decrease(subject: js.Object, property: String): this.type = js.native
  def decrease(subject: js.Object, property: String, message: String): this.type = js.native
  /**
    * Asserts that fn returns a lesser number after the target's invokation than before
    */
  def decreases(fn: js.Function0[Double]): this.type = js.native
  def decreases(fn: js.Function0[Double], message: String): this.type = js.native
  /**
    * Asserts that the target's invokation decreases subject's property
    */
  def decreases(subject: js.Object): this.type = js.native
  def decreases(subject: js.Object, property: String): this.type = js.native
  def decreases(subject: js.Object, property: String, message: String): this.type = js.native
  /**
    * Asserts that the target is empty
    */
  def empty(): this.type = js.native
  /**
    * Asserts that the target is strictly equal to value(===)
    */
  def eq(value: js.Any): this.type = js.native
  def eq(value: js.Any, message: String): this.type = js.native
  /**
    * Asserts that the target is deeply equal to object
    */
  def eql(`object`: js.Any): this.type = js.native
  def eql(`object`: js.Any, message: String): this.type = js.native
  /**
    * Asserts that the target has the same length length and elements as array in the same order
    */
  def eqlArray(array: js.Array[_]): this.type = js.native
  def eqlArray(array: js.Array[_], message: String): this.type = js.native
  /**
    * Asserts that the target is deeply equal to object
    */
  def eqls(`object`: js.Any): this.type = js.native
  def eqls(`object`: js.Any, message: String): this.type = js.native
  /**
    * Asserts that the target is strictly equal to value(===)
    */
  def equal(value: js.Any): this.type = js.native
  def equal(value: js.Any, message: String): this.type = js.native
  /**
    * Asserts that the target is strictly equal to value(===)
    */
  def equals(value: js.Any): this.type = js.native
  def equals(value: js.Any, message: String): this.type = js.native
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
  def greaterThan(n: Double): this.type = js.native
  def greaterThan(n: Double, message: String): this.type = js.native
  /**
    * Asserts that target > n
    */
  def gt(n: Double): this.type = js.native
  def gt(n: Double, message: String): this.type = js.native
  /**
    * Asserts that target >= n
    */
  def gte(n: Double): this.type = js.native
  def gte(n: Double, message: String): this.type = js.native
  /**
    * Asserts that the target has its own property name `name` with value `value`
    */
  def haveOwnProperty(name: String): this.type = js.native
  def haveOwnProperty(name: String, value: js.Any): this.type = js.native
  def haveOwnProperty(name: String, value: js.Any, message: String): this.type = js.native
  /**
    * Asserts that the target has its own property descriptor with name `name` and value `value`
    */
  def haveOwnPropertyDescriptor(name: String): this.type = js.native
  def haveOwnPropertyDescriptor(name: String, descriptor: js.Object): this.type = js.native
  def haveOwnPropertyDescriptor(name: String, descriptor: js.Object, message: String): this.type = js.native
  /**
    * Asserts that the target includes the given value
    */
  def include(value: js.Any): this.type = js.native
  def include(value: js.Any, message: String): this.type = js.native
  /**
    * Asserts that the target includes the given value
    */
  def includes(value: js.Any): this.type = js.native
  def includes(value: js.Any, message: String): this.type = js.native
  /**
    * Asserts that fn returns a greater number after the target's invokation than before
    */
  def increase(fn: js.Function0[Double]): this.type = js.native
  def increase(fn: js.Function0[Double], message: String): this.type = js.native
  /**
    * Asserts that the target's invokation increases subject's property
    */
  def increase(subject: js.Object): this.type = js.native
  def increase(subject: js.Object, property: String): this.type = js.native
  def increase(subject: js.Object, property: String, message: String): this.type = js.native
  /**
    * Asserts that fn returns a greater number after the target's invokation than before
    */
  def increases(fn: js.Function0[Double]): this.type = js.native
  def increases(fn: js.Function0[Double], message: String): this.type = js.native
  /**
    * Asserts that the target's invokation increases subject's property
    */
  def increases(subject: js.Object): this.type = js.native
  def increases(subject: js.Object, property: String): this.type = js.native
  def increases(subject: js.Object, property: String, message: String): this.type = js.native
  /**
    * Asserts that the target is an instance of constructor
    */
  def instanceOf(constructor: js.Object): this.type = js.native
  def instanceOf(constructor: js.Object, message: String): this.type = js.native
  /**
    * Asserts that the target is an instance of constructor
    */
  def instanceof(constructor: js.Object): this.type = js.native
  def instanceof(constructor: js.Object, message: String): this.type = js.native
  /**
    * Assert that the target has the given keys
    */
  def key(key: String): this.type = js.native
  def key(key: js.Array[String]): this.type = js.native
  def key(key: js.Object): this.type = js.native
  def key(keys: String*): this.type = js.native
  /**
    * Assert that the target has the given keys
    */
  def keys(key: String): this.type = js.native
  def keys(key: js.Array[String]): this.type = js.native
  def keys(key: js.Object): this.type = js.native
  def keys(keys: String*): this.type = js.native
  /**
    * Asserts that target >= n
    */
  def least(n: Double): this.type = js.native
  def least(n: Double, message: String): this.type = js.native
  /**
    * Asserts that the target's property length equal to n
    */
  def length(n: Double): this.type = js.native
  def length(n: Double, message: String): this.type = js.native
  /**
    * Asserts that the target's property length equal to n
    */
  def lengthOf(n: Double): this.type = js.native
  def lengthOf(n: Double, message: String): this.type = js.native
  /**
    * Asserts that target < n
    */
  def lessThan(n: Double): this.type = js.native
  def lessThan(n: Double, message: String): this.type = js.native
  /**
    * Asserts that target < n
    */
  def lt(n: Double): this.type = js.native
  def lt(n: Double, message: String): this.type = js.native
  /**
    * Asserts that target <= n
    */
  def lte(n: Double): this.type = js.native
  def lte(n: Double, message: String): this.type = js.native
  /**
    * Asserts that the target matches the regular expression regExp
    */
  def `match`(regExp: RegExp): this.type = js.native
  def `match`(regExp: RegExp, message: String): this.type = js.native
  /**
    * Asserts that the target matches the regular expression regExp
    */
  def matches(regExp: RegExp): this.type = js.native
  def matches(regExp: RegExp, message: String): this.type = js.native
  /**
    * Asserts that the target array has the same members as the given
    */
  def members(set: js.Array[_]): this.type = js.native
  def members(set: js.Array[_], message: String): this.type = js.native
  /**
    * Asserts that target <= n
    */
  def most(n: Double): this.type = js.native
  def most(n: Double, message: String): this.type = js.native
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
  def oneOf(list: js.Array[_], message: String): this.type = js.native
  /**
    * Asserts that the target has its own property name `name` with value `value`
    */
  def ownProperty(name: String): this.type = js.native
  def ownProperty(name: String, value: js.Any): this.type = js.native
  def ownProperty(name: String, value: js.Any, message: String): this.type = js.native
  /**
    * Asserts that the target has its own property descriptor with name `name` and value `value`
    */
  def ownPropertyDescriptor(name: String): this.type = js.native
  def ownPropertyDescriptor(name: String, descriptor: js.Object): this.type = js.native
  def ownPropertyDescriptor(name: String, descriptor: js.Object, message: String): this.type = js.native
  /**
    * Asserts that the target has a property name `name` with value `value`
    */
  def property(name: String): this.type = js.native
  def property(name: String, value: js.Any): this.type = js.native
  def property(name: String, value: js.Any, message: String): this.type = js.native
  /**
    * Assert that the target has a method with name `method`. For functions checks the prototype
    */
  def respondTo(method: String): this.type = js.native
  def respondTo(method: String, message: String): this.type = js.native
  /**
    * Assert that the target has a method with name `method`. For functions checks the prototype
    */
  def respondsTo(method: String): this.type = js.native
  def respondsTo(method: String, message: String): this.type = js.native
  /**
    * Asserts that matches returns a truthy value with the target as the first argument
    */
  def satisfies(matcher: js.Function0[Boolean]): this.type = js.native
  def satisfies(matcher: js.Function0[Boolean], message: String): this.type = js.native
  /**
    * Asserts that matches returns a truthy value with the target as the first argument
    */
  def satisfy(matcher: js.Function0[Boolean]): this.type = js.native
  def satisfy(matcher: js.Function0[Boolean], message: String): this.type = js.native
  /**
    * Asserts that the target is sealed
    */
  def `sealed`(): this.type = js.native
  /**
    * Asserts that the target contains str as a substring
    */
  def string(str: String): this.type = js.native
  def string(str: String, message: String): this.type = js.native
  /**
    * Assert that the target throws an error
    */
  def `throw`(): this.type = js.native
  def `throw`(errorLike: js.Object): this.type = js.native
  def `throw`(errorLike: js.Object, errMsgMatcher: String): this.type = js.native
  def `throw`(errorLike: js.Object, errMsgMatcher: String, message: String): this.type = js.native
  def `throw`(errorLike: js.Object, errMsgMatcher: RegExp): this.type = js.native
  def `throw`(errorLike: js.Object, errMsgMatcher: RegExp, message: String): this.type = js.native
  /**
    * Assert that the target throws an error
    */
  def throws(): this.type = js.native
  def throws(errorLike: js.Object): this.type = js.native
  def throws(errorLike: js.Object, errMsgMatcher: String): this.type = js.native
  def throws(errorLike: js.Object, errMsgMatcher: String, message: String): this.type = js.native
  def throws(errorLike: js.Object, errMsgMatcher: RegExp): this.type = js.native
  def throws(errorLike: js.Object, errMsgMatcher: RegExp, message: String): this.type = js.native
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
  def within(start: Double, end: Double): this.type = js.native
  def within(start: Double, end: Double, message: String): this.type = js.native
}

@js.native
trait assertion extends js.Object {
  var AssertionError: typings.adone.adoneNs.assertionNs.AssertionError = js.native
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
  def assert(value: js.Any): Unit = js.native
  def assert(value: js.Any, message: String): Unit = js.native
  def expect(value: js.Any): Assertion = js.native
  def expect(value: js.Any, message: String): Assertion = js.native
  def expect(value: Spy): MockAssertions = js.native
  def expect(value: Spy, message: String): MockAssertions = js.native
  def loadAssertInterface(): assertion = js.native
  def loadExpectInterface(): assertion = js.native
  def loadMockInterface(): assertion = js.native
  def use(fn: js.Function0[Unit]): assertion = js.native
}

