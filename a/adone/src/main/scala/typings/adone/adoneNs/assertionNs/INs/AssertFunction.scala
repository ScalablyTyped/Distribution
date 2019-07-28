package typings.adone.adoneNs.assertionNs.INs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertFunction extends js.Object {
  /**
    * Asserts that value is truthy
    */
  def apply(value: js.Any): Unit = js.native
  def apply(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is NaN
    */
  def NaN(value: js.Any): Unit = js.native
  def NaN(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not NaN
    */
  def NotNaN(value: js.Any): Unit = js.native
  def NotNaN(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value > above
    */
  def above(value: js.Any, above: js.Any): Unit = js.native
  def above(value: js.Any, above: js.Any, message: String): Unit = js.native
  /**
    * Asserts that actual is expect +/- delta
    */
  def approximately(actual: Double, expected: Double, delta: Double): Unit = js.native
  def approximately(actual: Double, expected: Double, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that value is an array
    */
  def array(value: js.Any): Unit = js.native
  def array(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value >= atLeast
    */
  def atLeast(value: js.Any, atLeast: js.Any): Unit = js.native
  def atLeast(value: js.Any, atLeast: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value <= atMost
    */
  def atMost(value: js.Any, atMost: js.Any): Unit = js.native
  def atMost(value: js.Any, atMost: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value < below
    */
  def below(value: js.Any, below: js.Any): Unit = js.native
  def below(value: js.Any, below: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is a boolean
    */
  def boolean(value: js.Any): Unit = js.native
  def boolean(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that a function changes the value of a property
    */
  def changes(fn: js.Function0[Unit], `object`: js.Object, property: String): Unit = js.native
  def changes(fn: js.Function0[Unit], `object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that a function does not change the value of a property or of a function’s return value by delta
    */
  def changesButNotBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double): Unit = js.native
  def changesButNotBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that a function changes the value of a property by delta
    */
  def changesBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double): Unit = js.native
  def changesBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that actual is expected +/- delta
    */
  def closeTo(actual: Double, expected: Double, delta: Double): Unit = js.native
  def closeTo(actual: Double, expected: Double, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that object has all the keys provided but maybe more
    */
  def containsAllDeepKeys(`object`: js.Object, keys: String): Unit = js.native
  def containsAllDeepKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def containsAllDeepKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def containsAllDeepKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def containsAllDeepKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def containsAllDeepKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object has all the keys provided but maybe more
    */
  def containsAllKeys(`object`: js.Object, keys: String): Unit = js.native
  def containsAllKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def containsAllKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def containsAllKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def containsAllKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def containsAllKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that a function decreases the value of a property
    */
  def decreases(fn: js.Function0[Unit], `object`: js.Object, property: String): Unit = js.native
  def decreases(fn: js.Function0[Unit], `object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that a function does not decreases a numeric object property or a function’s return value by delta
    */
  def decreasesButNotBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double): Unit = js.native
  def decreasesButNotBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that a function decreases the value of a property by delta
    */
  def decreasesBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double): Unit = js.native
  def decreasesBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that actual is deeply equal to expected
    */
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def deepInclude(expected: String, inc: String): Unit = js.native
  def deepInclude(expected: String, inc: String, message: String): Unit = js.native
  /**
    * Asserts that expected includes inc
    */
  def deepInclude[T](expected: js.Array[T], inc: T): Unit = js.native
  def deepInclude[T](expected: js.Array[T], inc: T, message: String): Unit = js.native
  /**
    * Assert that expected includes inc
    */
  def deepNestedInclude(expected: js.Object, inc: js.Object): Unit = js.native
  def deepNestedInclude(expected: js.Object, inc: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object has a property named `property` with value `value`
    */
  def deepNestedPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def deepNestedPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Assert that expected includes inc
    */
  def deepOwnInclude(expected: js.Object, inc: js.Object): Unit = js.native
  def deepOwnInclude(expected: js.Object, inc: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object has an owned property named `property` with value `value`
    */
  def deepOwnPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def deepOwnPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object has a property named `property` with a value `value`
    */
  def deepPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def deepPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that actual is deeply equal to expected
    */
  def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not undefined
    */
  def defined(value: js.Any): Unit = js.native
  def defined(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that a function does not changes the value of a property
    */
  def doesNotChange(fn: js.Function0[Unit], `object`: js.Object, property: String): Unit = js.native
  def doesNotChange(fn: js.Function0[Unit], `object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that a function does not decrease the value of a property
    */
  def doesNotDecrease(fn: js.Function0[Unit], `object`: js.Object, property: String): Unit = js.native
  def doesNotDecrease(fn: js.Function0[Unit], `object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that a function does not decrease the value of a property or a function's return value by delta
    */
  def doesNotDecreaseBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double): Unit = js.native
  def doesNotDecreaseBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that object does not have all the keys provided
    */
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: String): Unit = js.native
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object does not have all the keys provided
    */
  def doesNotHaveAllKeys(`object`: js.Object, keys: String): Unit = js.native
  def doesNotHaveAllKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def doesNotHaveAllKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def doesNotHaveAllKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def doesNotHaveAllKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def doesNotHaveAllKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object does not have any provided key
    */
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: String): Unit = js.native
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object does not have any provided key
    */
  def doesNotHaveAnyKeys(`object`: js.Object, keys: String): Unit = js.native
  def doesNotHaveAnyKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def doesNotHaveAnyKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def doesNotHaveAnyKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def doesNotHaveAnyKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def doesNotHaveAnyKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that a function does not increase a numeric object property
    */
  def doesNotIncrease(fn: js.Function0[Unit], `object`: js.Object, property: String): Unit = js.native
  def doesNotIncrease(fn: js.Function0[Unit], `object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that a function or an async function does not throw an error
    */
  def doesNotThrow(fn: js.Function0[js.Promise[Unit]]): js.Promise[_] = js.native
  def doesNotThrow(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object): js.Promise[_] = js.native
  def doesNotThrow(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: String): js.Promise[_] = js.native
  def doesNotThrow(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: String, message: String): js.Promise[_] = js.native
  def doesNotThrow(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: RegExp): js.Promise[_] = js.native
  def doesNotThrow(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: RegExp, message: String): js.Promise[_] = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[Unit]): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[Unit], errorLike: js.Object): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: String): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: String, message: String): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: RegExp): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: RegExp, message: String): js.Any = js.native
  /**
    * Asserts that value is empty
    */
  def empty(value: js.Any): Unit = js.native
  def empty(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts non-strict equality
    */
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  /**
    * Asserts that actual and expected have the same length and the same members (===)
    */
  def equalArrays(actual: js.Array[_], expected: js.Array[_]): Unit = js.native
  def equalArrays(actual: js.Array[_], expected: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that value is neither null nor undefined
    */
  def exists(value: js.Any): Unit = js.native
  def exists(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object is extensible
    */
  def extensible(`object`: js.Object): Unit = js.native
  def extensible(`object`: js.Object, message: String): Unit = js.native
  /**
    * Throws an AssertionError, like node.js
    */
  def fail(): Unit = js.native
  def fail(actual: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: js.Any): Unit = js.native
  /**
    * Asserts that value is false
    */
  def `false`(value: js.Any): Unit = js.native
  def `false`(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is a finite number
    */
  def finite(value: js.Any): Unit = js.native
  def finite(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object is frozen
    */
  def frozen(`object`: js.Object): Unit = js.native
  def frozen(`object`: js.Object, message: String): Unit = js.native
  /**
    * Asserts that value is a function
    */
  def function(value: js.Any): Unit = js.native
  def function(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object has all and only all of the keys provided
    */
  def hasAllDeepKeys(`object`: js.Object, keys: String): Unit = js.native
  def hasAllDeepKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def hasAllDeepKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def hasAllDeepKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def hasAllDeepKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def hasAllDeepKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object has all and only all of the keys provided
    */
  def hasAllKeys(`object`: js.Object, keys: String): Unit = js.native
  def hasAllKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def hasAllKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def hasAllKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def hasAllKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def hasAllKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object has at least one of the keys provided
    */
  def hasAnyDeepKeys(`object`: js.Object, keys: String): Unit = js.native
  def hasAnyDeepKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def hasAnyDeepKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def hasAnyDeepKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def hasAnyDeepKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def hasAnyDeepKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object has at least one key from `keys`
    */
  def hasAnyKeys(`object`: js.Object, keys: String): Unit = js.native
  def hasAnyKeys(`object`: js.Object, keys: String, message: String): Unit = js.native
  def hasAnyKeys(`object`: js.Object, keys: js.Array[String]): Unit = js.native
  def hasAnyKeys(`object`: js.Object, keys: js.Array[String], message: String): Unit = js.native
  def hasAnyKeys(`object`: js.Object, keys: js.Object): Unit = js.native
  def hasAnyKeys(`object`: js.Object, keys: js.Object, message: String): Unit = js.native
  /**
    * Throws an error if value is truthy
    */
  def ifError(value: js.Any): Unit = js.native
  def include(expected: String, inc: String): Unit = js.native
  def include(expected: String, inc: String, message: String): Unit = js.native
  /**
    * Asserts that expected includes inc
    */
  def include[T](expected: js.Array[T], inc: T): Unit = js.native
  def include[T](expected: js.Array[T], inc: T, message: String): Unit = js.native
  /**
    * Asserts that subset is included in superset in any order
    */
  def includeDeepMembers(superset: js.Array[_], subset: js.Array[_]): Unit = js.native
  def includeDeepMembers(superset: js.Array[_], subset: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that subset is included in superset in the same order
    */
  def includeDeepOrderedMembers(superset: js.Array[_], subset: js.Array[_]): Unit = js.native
  def includeDeepOrderedMembers(superset: js.Array[_], subset: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that subset is included in superset in any order (===)
    */
  def includeMembers(superset: js.Array[_], subset: js.Array[_]): Unit = js.native
  def includeMembers(superset: js.Array[_], subset: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that subset is included in superset in the same order (===)
    */
  def includeOrderedMembers(superset: js.Array[_], subset: js.Array[_]): Unit = js.native
  def includeOrderedMembers(superset: js.Array[_], subset: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that a function increases a numeric object property
    */
  def increases(fn: js.Function0[Unit], `object`: js.Object, property: String): Unit = js.native
  def increases(fn: js.Function0[Unit], `object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that a function does not increase a numeric object property or function’s return value by delta
    */
  def increasesButNotBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double): Unit = js.native
  def increasesButNotBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that a function increases a numeric object property or a function’s return value by delta
    */
  def increasesBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double): Unit = js.native
  def increasesBy(fn: js.Function0[Unit], `object`: js.Object, property: String, delta: Double, message: String): Unit = js.native
  /**
    * Asserts that value is an instance of constructor
    */
  def instanceOf(value: js.Any, constructor: js.Object): Unit = js.native
  def instanceOf(value: js.Any, constructor: js.Object, message: String): Unit = js.native
  /**
    * Asserts that expected has a length property with value `length`
    */
  def lengthOf(expected: js.Any, length: Double): Unit = js.native
  def lengthOf(expected: js.Any, length: Double, message: String): Unit = js.native
  /**
    * Asserts that expected matches the regular expression regExp
    */
  def `match`(expected: js.Any, regExp: RegExp): Unit = js.native
  def `match`(expected: js.Any, regExp: RegExp, message: String): Unit = js.native
  /**
    * Asserts that expected includes inc
    */
  def nestedInclude(expected: js.Object, inc: js.Object): Unit = js.native
  def nestedInclude(expected: js.Object, inc: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object has a property named `property`
    */
  def nestedProperty(`object`: js.Object, property: String): Unit = js.native
  def nestedProperty(`object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that object has a property named `property` with value `value`(===)
    */
  def nestedPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def nestedPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not an array
    */
  def notArray(value: js.Any): Unit = js.native
  def notArray(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not a boolean
    */
  def notBoolean(value: js.Any): Unit = js.native
  def notBoolean(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that actual is not deeply equal to expected
    */
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notDeepInclude(expected: String, inc: String): Unit = js.native
  def notDeepInclude(expected: String, inc: String, message: String): Unit = js.native
  /**
    * Asserts that expected does not include inc
    */
  def notDeepInclude[T](expected: js.Array[T], inc: T): Unit = js.native
  def notDeepInclude[T](expected: js.Array[T], inc: T, message: String): Unit = js.native
  /**
    * Assert that expected includes inc
    */
  def notDeepNestedInclude(expected: js.Object, inc: js.Object): Unit = js.native
  def notDeepNestedInclude(expected: js.Object, inc: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object does not have a property named `property` with value `value`
    */
  def notDeepNestedPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def notDeepNestedPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Assert that expected does not include inc
    */
  def notDeepOwnInclude(expected: js.Object, inc: js.Object): Unit = js.native
  def notDeepOwnInclude(expected: js.Object, inc: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object does not have an owned property named `property` with value `value`(===)
    */
  def notDeepOwnPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def notDeepOwnPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object does not have a property named `property` with value `value`
    */
  def notDeepPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def notDeepPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not empty
    */
  def notEmpty(value: js.Any): Unit = js.native
  def notEmpty(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts non-strict inequality
    */
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is either null or undefined
    */
  def notExists(value: js.Any): Unit = js.native
  def notExists(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object is not extensible
    */
  def notExtensible(`object`: js.Object): Unit = js.native
  def notExtensible(`object`: js.Object, message: String): Unit = js.native
  /**
    * Asserts that value is not false
    */
  def notFalse(value: js.Any): Unit = js.native
  def notFalse(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object is not frozen
    */
  def notFrozen(`object`: js.Object): Unit = js.native
  def notFrozen(`object`: js.Object, message: String): Unit = js.native
  /**
    * Asserts that value is not a function
    */
  def notFunction(value: js.Any): Unit = js.native
  def notFunction(value: js.Any, message: String): Unit = js.native
  def notInclude(expected: String, inc: String): Unit = js.native
  def notInclude(expected: String, inc: String, message: String): Unit = js.native
  /**
    * Asserts that expected does not include inc
    */
  def notInclude[T](expected: js.Array[T], inc: T): Unit = js.native
  def notInclude[T](expected: js.Array[T], inc: T, message: String): Unit = js.native
  /**
    * Asserts that subset is not included in superset in any order
    */
  def notIncludeDeepMembers(superset: js.Array[_], subset: js.Array[_]): Unit = js.native
  def notIncludeDeepMembers(superset: js.Array[_], subset: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that subset is not included in superset in the same order
    */
  def notIncludeDeepOrderedMembers(superset: js.Array[_], subset: js.Array[_]): Unit = js.native
  def notIncludeDeepOrderedMembers(superset: js.Array[_], subset: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that subset is not included in superset in any order (===)
    */
  def notIncludeMembers(superset: js.Array[_], subset: js.Array[_]): Unit = js.native
  def notIncludeMembers(superset: js.Array[_], subset: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that subset is not included in superset in the same order (===)
    */
  def notIncludeOrderedMembers(superset: js.Array[_], subset: js.Array[_]): Unit = js.native
  def notIncludeOrderedMembers(superset: js.Array[_], subset: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that value is not an instance of constructor
    */
  def notInstanceOf(value: js.Any, constructor: js.Object): Unit = js.native
  def notInstanceOf(value: js.Any, constructor: js.Object, message: String): Unit = js.native
  /**
    * Asserts that expected does not match the regular expression regExp
    */
  def notMatch(expected: js.Any, regExp: RegExp): Unit = js.native
  def notMatch(expected: js.Any, regExp: RegExp, message: String): Unit = js.native
  /**
    * Asserts that expected does not include inc
    */
  def notNestedInclude(expected: js.Object, inc: js.Object): Unit = js.native
  def notNestedInclude(expected: js.Object, inc: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object does not have a property named `property`
    */
  def notNestedProperty(`object`: js.Object, property: String): Unit = js.native
  def notNestedProperty(`object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that object does not have a property named `property` with value `value`(===)
    */
  def notNestedPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def notNestedPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that valus is not null
    */
  def notNull(value: js.Any): Unit = js.native
  def notNull(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not a number
    */
  def notNumber(value: js.Any): Unit = js.native
  def notNumber(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not an object of type Object
    */
  def notObject(value: js.Any): Unit = js.native
  def notObject(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is falsy
    */
  def notOk(value: js.Any): Unit = js.native
  def notOk(value: js.Any, message: String): Unit = js.native
  /**
    * Assert that expected does not include inc
    */
  def notOwnInclude(expected: js.Object, inc: js.Object): Unit = js.native
  def notOwnInclude(expected: js.Object, inc: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object does not have an owned property named `property`
    */
  def notOwnProperty(`object`: js.Object, property: String): Unit = js.native
  def notOwnProperty(`object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that object does not have an owned property named `property` with value `value`(===)
    */
  def notOwnPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def notOwnPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object does not have a property named `property`
    */
  def notProperty(`object`: js.Object, property: String): Unit = js.native
  def notProperty(`object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that object does not have a property named `property` with value `value` (===)
    */
  def notPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def notPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that arrays do not have the same members in any order
    */
  def notSameDeepMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def notSameDeepMembers(set1: js.Array[_], set2: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that arrays do not have the same members in the same order
    */
  def notSameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def notSameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that arrays do not have the same members in any order (===)
    */
  def notSameMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def notSameMembers(set1: js.Array[_], set2: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that arrays do not have the same members in the same order (===)
    */
  def notSameOrderedMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def notSameOrderedMembers(set1: js.Array[_], set2: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that object is not sealed
    */
  def notSealed(`object`: js.Object): Unit = js.native
  def notSealed(`object`: js.Object, message: String): Unit = js.native
  /**
    * Asserts strict inequality
    */
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not a string
    */
  def notString(value: js.Any): Unit = js.native
  def notString(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is not true
    */
  def notTrue(value: js.Any): Unit = js.native
  def notTrue(value: js.Any, message: String): Unit = js.native
  def notTypeOf(value: js.Any, `type`: String): Unit = js.native
  def notTypeOf(value: js.Any, `type`: String, message: String): Unit = js.native
  /**
    * Assert that value's type is not `type`
    */
  def notTypeOf(value: js.Any, `type`: PossibleTypes): Unit = js.native
  def notTypeOf(value: js.Any, `type`: PossibleTypes, message: String): Unit = js.native
  /**
    * Asserts that value is null
    */
  def `null`(value: js.Any): Unit = js.native
  def `null`(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is a number
    */
  def number(value: js.Any): Unit = js.native
  def number(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is an object of type Object
    */
  def `object`(value: js.Any): Unit = js.native
  def `object`(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is truthy
    */
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that list includes inList
    */
  def oneOf(inList: js.Any, list: js.Array[_]): Unit = js.native
  def oneOf(inList: js.Any, list: js.Array[_], message: String): Unit = js.native
  /**
    * Compares two values using operator
    */
  def operator(value: js.Any, operator: String, val2: js.Any): Unit = js.native
  def operator(value: js.Any, operator: String, val2: js.Any, message: String): Unit = js.native
  /**
    * Assert that expected includes inc
    */
  def ownInclude(expected: js.Object, inc: js.Object): Unit = js.native
  def ownInclude(expected: js.Object, inc: js.Object, message: String): Unit = js.native
  /**
    * Asserts that object has an owned property named `property`
    */
  def ownProperty(`object`: js.Object, property: String): Unit = js.native
  def ownProperty(`object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that object has an owned property named `property` with value `value`(===)
    */
  def ownPropertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def ownPropertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that object has a property named `property`
    */
  def property(`object`: js.Object, property: String): Unit = js.native
  def property(`object`: js.Object, property: String, message: String): Unit = js.native
  /**
    * Asserts that object has a property named `property` with value `value` (===)
    */
  def propertyVal(`object`: js.Object, property: String, value: js.Any): Unit = js.native
  def propertyVal(`object`: js.Object, property: String, value: js.Any, message: String): Unit = js.native
  /**
    * Asserts that arrays have the same members in any order
    */
  def sameDeepMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def sameDeepMembers(set1: js.Array[_], set2: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that arrays have the same members in the same order
    */
  def sameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def sameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that arrays have the same members in any order (===)
    */
  def sameMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def sameMembers(set1: js.Array[_], set2: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that arrays have the same members in the same order (===)
    */
  def sameOrderedMembers(set1: js.Array[_], set2: js.Array[_]): Unit = js.native
  def sameOrderedMembers(set1: js.Array[_], set2: js.Array[_], message: String): Unit = js.native
  /**
    * Asserts that object is sealed
    */
  def `sealed`(`object`: js.Object): Unit = js.native
  def `sealed`(`object`: js.Object, message: String): Unit = js.native
  /**
    * Asserts strict equality
    */
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  /**
    * Asserts that value is a string
    */
  def string(value: js.Any): Unit = js.native
  def string(value: js.Any, message: String): Unit = js.native
  def `throw`(fn: js.Function0[js.Promise[Unit]]): js.Promise[_] = js.native
  def `throw`(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object): js.Promise[_] = js.native
  def `throw`(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: String): js.Promise[_] = js.native
  def `throw`(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: String, message: String): js.Promise[_] = js.native
  def `throw`(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: RegExp): js.Promise[_] = js.native
  def `throw`(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: RegExp, message: String): js.Promise[_] = js.native
  /**
    * Asserts that a function or an async functions throws an error
    */
  @JSName("throw")
  def throw_Any(fn: js.Function0[Unit]): js.Any = js.native
  @JSName("throw")
  def throw_Any(fn: js.Function0[Unit], errorLike: js.Object): js.Any = js.native
  @JSName("throw")
  def throw_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: String): js.Any = js.native
  @JSName("throw")
  def throw_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: String, message: String): js.Any = js.native
  @JSName("throw")
  def throw_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: RegExp): js.Any = js.native
  @JSName("throw")
  def throw_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: RegExp, message: String): js.Any = js.native
  def throws(fn: js.Function0[js.Promise[Unit]]): js.Promise[_] = js.native
  def throws(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object): js.Promise[_] = js.native
  def throws(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: String): js.Promise[_] = js.native
  def throws(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: String, message: String): js.Promise[_] = js.native
  def throws(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: RegExp): js.Promise[_] = js.native
  def throws(fn: js.Function0[js.Promise[Unit]], errorLike: js.Object, errMsgMatcher: RegExp, message: String): js.Promise[_] = js.native
  /**
    * Asserts that a function or an async functions throws an error
    */
  @JSName("throws")
  def throws_Any(fn: js.Function0[Unit]): js.Any = js.native
  @JSName("throws")
  def throws_Any(fn: js.Function0[Unit], errorLike: js.Object): js.Any = js.native
  @JSName("throws")
  def throws_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: String): js.Any = js.native
  @JSName("throws")
  def throws_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: String, message: String): js.Any = js.native
  @JSName("throws")
  def throws_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: RegExp): js.Any = js.native
  @JSName("throws")
  def throws_Any(fn: js.Function0[Unit], errorLike: js.Object, errMsgMatcher: RegExp, message: String): js.Any = js.native
  /**
    * Asserts that value is true
    */
  def `true`(value: js.Any): Unit = js.native
  def `true`(value: js.Any, message: String): Unit = js.native
  def typeOf(value: js.Any, `type`: String): Unit = js.native
  def typeOf(value: js.Any, `type`: String, message: String): Unit = js.native
  /**
    * Asserts that value's type is `type`
    */
  def typeOf(value: js.Any, `type`: PossibleTypes): Unit = js.native
  def typeOf(value: js.Any, `type`: PossibleTypes, message: String): Unit = js.native
  /**
    * Asserts that value is undefined
    */
  def undefined(value: js.Any): Unit = js.native
  def undefined(value: js.Any, message: String): Unit = js.native
}

