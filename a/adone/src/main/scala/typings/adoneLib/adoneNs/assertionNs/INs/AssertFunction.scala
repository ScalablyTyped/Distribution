package typings
package adoneLib.adoneNs.assertionNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertFunction extends js.Object {
  /**
                   * Asserts that value is truthy
                   */
  def apply(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is truthy
                   */
  def apply(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is NaN
                   */
  def NaN(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is NaN
                   */
  def NaN(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not NaN
                   */
  def NotNaN(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not NaN
                   */
  def NotNaN(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value > above
                   */
  def above(value: js.Any, above: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value > above
                   */
  def above(value: js.Any, above: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that actual is expect +/- delta
                   */
  def approximately(actual: scala.Double, expected: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that actual is expect +/- delta
                   */
  def approximately(actual: scala.Double, expected: scala.Double, delta: scala.Double, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is an array
                   */
  def array(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is an array
                   */
  def array(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value >= atLeast
                   */
  def atLeast(value: js.Any, atLeast: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value >= atLeast
                   */
  def atLeast(value: js.Any, atLeast: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value <= atMost
                   */
  def atMost(value: js.Any, atMost: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value <= atMost
                   */
  def atMost(value: js.Any, atMost: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value < below
                   */
  def below(value: js.Any, below: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value < below
                   */
  def below(value: js.Any, below: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is a boolean
                   */
  def boolean(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is a boolean
                   */
  def boolean(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function changes the value of a property
                   */
  def changes(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function changes the value of a property
                   */
  def changes(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function does not change the value of a property or of a function’s return value by delta
                   */
  def changesButNotBy(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that a function does not change the value of a property or of a function’s return value by delta
                   */
  def changesButNotBy(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    delta: scala.Double,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function changes the value of a property by delta
                   */
  def changesBy(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that a function changes the value of a property by delta
                   */
  def changesBy(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    delta: scala.Double,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that actual is expected +/- delta
                   */
  def closeTo(actual: scala.Double, expected: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that actual is expected +/- delta
                   */
  def closeTo(actual: scala.Double, expected: scala.Double, delta: scala.Double, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllDeepKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllDeepKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllDeepKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllDeepKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object has all the keys provided but maybe more
                   */
  def containsAllKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function decreases the value of a property
                   */
  def decreases(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function decreases the value of a property
                   */
  def decreases(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function does not decreases a numeric object property or a function’s return value by delta
                   */
  def decreasesButNotBy(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that a function does not decreases a numeric object property or a function’s return value by delta
                   */
  def decreasesButNotBy(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    delta: scala.Double,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function decreases the value of a property by delta
                   */
  def decreasesBy(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that a function decreases the value of a property by delta
                   */
  def decreasesBy(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    delta: scala.Double,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that actual is deeply equal to expected
                   */
  def deepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
                   * Asserts that actual is deeply equal to expected
                   */
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def deepInclude(expected: java.lang.String, inc: java.lang.String): scala.Unit = js.native
  def deepInclude(expected: java.lang.String, inc: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected includes inc
                   */
  def deepInclude[T](expected: js.Array[T], inc: T): scala.Unit = js.native
  /**
                   * Asserts that expected includes inc
                   */
  def deepInclude[T](expected: js.Array[T], inc: T, message: java.lang.String): scala.Unit = js.native
  /**
                   * Assert that expected includes inc
                   */
  def deepNestedInclude(expected: js.Object, inc: js.Object): scala.Unit = js.native
  /**
                   * Assert that expected includes inc
                   */
  def deepNestedInclude(expected: js.Object, inc: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property` with value `value`
                   */
  def deepNestedPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property` with value `value`
                   */
  def deepNestedPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Assert that expected includes inc
                   */
  def deepOwnInclude(expected: js.Object, inc: js.Object): scala.Unit = js.native
  /**
                   * Assert that expected includes inc
                   */
  def deepOwnInclude(expected: js.Object, inc: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has an owned property named `property` with value `value`
                   */
  def deepOwnPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object has an owned property named `property` with value `value`
                   */
  def deepOwnPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property` with a value `value`
                   */
  def deepPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property` with a value `value`
                   */
  def deepPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that actual is deeply equal to expected
                   */
  def deepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
                   * Asserts that actual is deeply equal to expected
                   */
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not undefined
                   */
  def defined(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not undefined
                   */
  def defined(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function does not changes the value of a property
                   */
  def doesNotChange(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function does not changes the value of a property
                   */
  def doesNotChange(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function does not decrease the value of a property
                   */
  def doesNotDecrease(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function does not decrease the value of a property
                   */
  def doesNotDecrease(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function does not decrease the value of a property or a function's return value by delta
                   */
  def doesNotDecreaseBy(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that a function does not decrease the value of a property or a function's return value by delta
                   */
  def doesNotDecreaseBy(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    delta: scala.Double,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllDeepKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object does not have all the keys provided
                   */
  def doesNotHaveAllKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyDeepKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object does not have any provided key
                   */
  def doesNotHaveAnyKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function does not increase a numeric object property
                   */
  def doesNotIncrease(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function does not increase a numeric object property
                   */
  def doesNotIncrease(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function or an async function does not throw an error
                   */
  def doesNotThrow(fn: js.Function0[js.Promise[scala.Unit]]): js.Promise[_] = js.native
  /**
                   * Asserts that a function or an async function does not throw an error
                   */
  def doesNotThrow(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object): js.Promise[_] = js.native
  /**
                   * Asserts that a function or an async function does not throw an error
                   */
  def doesNotThrow(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object, errMsgMatcher: java.lang.String): js.Promise[_] = js.native
  /**
                   * Asserts that a function or an async function does not throw an error
                   */
  def doesNotThrow(
    fn: js.Function0[js.Promise[scala.Unit]],
    errorLike: js.Object,
    errMsgMatcher: java.lang.String,
    message: java.lang.String
  ): js.Promise[_] = js.native
  /**
                   * Asserts that a function or an async function does not throw an error
                   */
  def doesNotThrow(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object, errMsgMatcher: stdLib.RegExp): js.Promise[_] = js.native
  /**
                   * Asserts that a function or an async function does not throw an error
                   */
  def doesNotThrow(
    fn: js.Function0[js.Promise[scala.Unit]],
    errorLike: js.Object,
    errMsgMatcher: stdLib.RegExp,
    message: java.lang.String
  ): js.Promise[_] = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[scala.Unit]): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[scala.Unit], errorLike: js.Object): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[scala.Unit], errorLike: js.Object, errMsgMatcher: java.lang.String): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(
    fn: js.Function0[scala.Unit],
    errorLike: js.Object,
    errMsgMatcher: java.lang.String,
    message: java.lang.String
  ): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(fn: js.Function0[scala.Unit], errorLike: js.Object, errMsgMatcher: stdLib.RegExp): js.Any = js.native
  @JSName("doesNotThrow")
  def doesNotThrow_Any(
    fn: js.Function0[scala.Unit],
    errorLike: js.Object,
    errMsgMatcher: stdLib.RegExp,
    message: java.lang.String
  ): js.Any = js.native
  /**
                   * Asserts that value is empty
                   */
  def empty(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is empty
                   */
  def empty(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts non-strict equality
                   */
  def equal(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
                   * Asserts non-strict equality
                   */
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that actual and expected have the same length and the same members (===)
                   */
  def equalArrays(actual: js.Array[_], expected: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that actual and expected have the same length and the same members (===)
                   */
  def equalArrays(actual: js.Array[_], expected: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is neither null nor undefined
                   */
  def exists(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is neither null nor undefined
                   */
  def exists(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object is extensible
                   */
  def extensible(`object`: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object is extensible
                   */
  def extensible(`object`: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Throws an AssertionError, like node.js
                   */
  def fail(): scala.Unit = js.native
  /**
                   * Throws an AssertionError, like node.js
                   */
  def fail(actual: js.Any): scala.Unit = js.native
  /**
                   * Throws an AssertionError, like node.js
                   */
  def fail(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
                   * Throws an AssertionError, like node.js
                   */
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Throws an AssertionError, like node.js
                   */
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is false
                   */
  def `false`(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is false
                   */
  def `false`(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is a finite number
                   */
  def finite(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is a finite number
                   */
  def finite(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object is frozen
                   */
  def frozen(`object`: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object is frozen
                   */
  def frozen(`object`: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is a function
                   */
  def function(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is a function
                   */
  def function(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllDeepKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllDeepKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllDeepKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllDeepKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object has all and only all of the keys provided
                   */
  def hasAllKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has at least one of the keys provided
                   */
  def hasAnyDeepKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has at least one of the keys provided
                   */
  def hasAnyDeepKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has at least one of the keys provided
                   */
  def hasAnyDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object has at least one of the keys provided
                   */
  def hasAnyDeepKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has at least one of the keys provided
                   */
  def hasAnyDeepKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object has at least one of the keys provided
                   */
  def hasAnyDeepKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has at least one key from `keys`
                   */
  def hasAnyKeys(`object`: js.Object, keys: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has at least one key from `keys`
                   */
  def hasAnyKeys(`object`: js.Object, keys: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has at least one key from `keys`
                   */
  def hasAnyKeys(`object`: js.Object, keys: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Asserts that object has at least one key from `keys`
                   */
  def hasAnyKeys(`object`: js.Object, keys: js.Array[java.lang.String], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has at least one key from `keys`
                   */
  def hasAnyKeys(`object`: js.Object, keys: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object has at least one key from `keys`
                   */
  def hasAnyKeys(`object`: js.Object, keys: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Throws an error if value is truthy
                   */
  def ifError(value: js.Any): scala.Unit = js.native
  def include(expected: java.lang.String, inc: java.lang.String): scala.Unit = js.native
  def include(expected: java.lang.String, inc: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected includes inc
                   */
  def include[T](expected: js.Array[T], inc: T): scala.Unit = js.native
  /**
                   * Asserts that expected includes inc
                   */
  def include[T](expected: js.Array[T], inc: T, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that subset is included in superset in any order
                   */
  def includeDeepMembers(superset: js.Array[_], subset: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that subset is included in superset in any order
                   */
  def includeDeepMembers(superset: js.Array[_], subset: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that subset is included in superset in the same order
                   */
  def includeDeepOrderedMembers(superset: js.Array[_], subset: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that subset is included in superset in the same order
                   */
  def includeDeepOrderedMembers(superset: js.Array[_], subset: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that subset is included in superset in any order (===)
                   */
  def includeMembers(superset: js.Array[_], subset: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that subset is included in superset in any order (===)
                   */
  def includeMembers(superset: js.Array[_], subset: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that subset is included in superset in the same order (===)
                   */
  def includeOrderedMembers(superset: js.Array[_], subset: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that subset is included in superset in the same order (===)
                   */
  def includeOrderedMembers(superset: js.Array[_], subset: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function increases a numeric object property
                   */
  def increases(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that a function increases a numeric object property
                   */
  def increases(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function does not increase a numeric object property or function’s return value by delta
                   */
  def increasesButNotBy(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that a function does not increase a numeric object property or function’s return value by delta
                   */
  def increasesButNotBy(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    delta: scala.Double,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that a function increases a numeric object property or a function’s return value by delta
                   */
  def increasesBy(fn: js.Function0[scala.Unit], `object`: js.Object, property: java.lang.String, delta: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that a function increases a numeric object property or a function’s return value by delta
                   */
  def increasesBy(
    fn: js.Function0[scala.Unit],
    `object`: js.Object,
    property: java.lang.String,
    delta: scala.Double,
    message: java.lang.String
  ): scala.Unit = js.native
  /**
                   * Asserts that value is an instance of constructor
                   */
  def instanceOf(value: js.Any, constructor: js.Object): scala.Unit = js.native
  /**
                   * Asserts that value is an instance of constructor
                   */
  def instanceOf(value: js.Any, constructor: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected has a length property with value `length`
                   */
  def lengthOf(expected: js.Any, length: scala.Double): scala.Unit = js.native
  /**
                   * Asserts that expected has a length property with value `length`
                   */
  def lengthOf(expected: js.Any, length: scala.Double, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected matches the regular expression regExp
                   */
  def `match`(expected: js.Any, regExp: stdLib.RegExp): scala.Unit = js.native
  /**
                   * Asserts that expected matches the regular expression regExp
                   */
  def `match`(expected: js.Any, regExp: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected includes inc
                   */
  def nestedInclude(expected: js.Object, inc: js.Object): scala.Unit = js.native
  /**
                   * Asserts that expected includes inc
                   */
  def nestedInclude(expected: js.Object, inc: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property`
                   */
  def nestedProperty(`object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property`
                   */
  def nestedProperty(`object`: js.Object, property: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property` with value `value`(===)
                   */
  def nestedPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property` with value `value`(===)
                   */
  def nestedPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not an array
                   */
  def notArray(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not an array
                   */
  def notArray(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not a boolean
                   */
  def notBoolean(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not a boolean
                   */
  def notBoolean(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that actual is not deeply equal to expected
                   */
  def notDeepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
                   * Asserts that actual is not deeply equal to expected
                   */
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notDeepInclude(expected: java.lang.String, inc: java.lang.String): scala.Unit = js.native
  def notDeepInclude(expected: java.lang.String, inc: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected does not include inc
                   */
  def notDeepInclude[T](expected: js.Array[T], inc: T): scala.Unit = js.native
  /**
                   * Asserts that expected does not include inc
                   */
  def notDeepInclude[T](expected: js.Array[T], inc: T, message: java.lang.String): scala.Unit = js.native
  /**
                   * Assert that expected includes inc
                   */
  def notDeepNestedInclude(expected: js.Object, inc: js.Object): scala.Unit = js.native
  /**
                   * Assert that expected includes inc
                   */
  def notDeepNestedInclude(expected: js.Object, inc: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property` with value `value`
                   */
  def notDeepNestedPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property` with value `value`
                   */
  def notDeepNestedPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Assert that expected does not include inc
                   */
  def notDeepOwnInclude(expected: js.Object, inc: js.Object): scala.Unit = js.native
  /**
                   * Assert that expected does not include inc
                   */
  def notDeepOwnInclude(expected: js.Object, inc: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have an owned property named `property` with value `value`(===)
                   */
  def notDeepOwnPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object does not have an owned property named `property` with value `value`(===)
                   */
  def notDeepOwnPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property` with value `value`
                   */
  def notDeepPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property` with value `value`
                   */
  def notDeepPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not empty
                   */
  def notEmpty(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not empty
                   */
  def notEmpty(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts non-strict inequality
                   */
  def notEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
                   * Asserts non-strict inequality
                   */
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is either null or undefined
                   */
  def notExists(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is either null or undefined
                   */
  def notExists(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object is not extensible
                   */
  def notExtensible(`object`: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object is not extensible
                   */
  def notExtensible(`object`: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not false
                   */
  def notFalse(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not false
                   */
  def notFalse(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object is not frozen
                   */
  def notFrozen(`object`: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object is not frozen
                   */
  def notFrozen(`object`: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not a function
                   */
  def notFunction(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not a function
                   */
  def notFunction(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def notInclude(expected: java.lang.String, inc: java.lang.String): scala.Unit = js.native
  def notInclude(expected: java.lang.String, inc: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected does not include inc
                   */
  def notInclude[T](expected: js.Array[T], inc: T): scala.Unit = js.native
  /**
                   * Asserts that expected does not include inc
                   */
  def notInclude[T](expected: js.Array[T], inc: T, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that subset is not included in superset in any order
                   */
  def notIncludeDeepMembers(superset: js.Array[_], subset: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that subset is not included in superset in any order
                   */
  def notIncludeDeepMembers(superset: js.Array[_], subset: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that subset is not included in superset in the same order
                   */
  def notIncludeDeepOrderedMembers(superset: js.Array[_], subset: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that subset is not included in superset in the same order
                   */
  def notIncludeDeepOrderedMembers(superset: js.Array[_], subset: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that subset is not included in superset in any order (===)
                   */
  def notIncludeMembers(superset: js.Array[_], subset: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that subset is not included in superset in any order (===)
                   */
  def notIncludeMembers(superset: js.Array[_], subset: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that subset is not included in superset in the same order (===)
                   */
  def notIncludeOrderedMembers(superset: js.Array[_], subset: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that subset is not included in superset in the same order (===)
                   */
  def notIncludeOrderedMembers(superset: js.Array[_], subset: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not an instance of constructor
                   */
  def notInstanceOf(value: js.Any, constructor: js.Object): scala.Unit = js.native
  /**
                   * Asserts that value is not an instance of constructor
                   */
  def notInstanceOf(value: js.Any, constructor: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected does not match the regular expression regExp
                   */
  def notMatch(expected: js.Any, regExp: stdLib.RegExp): scala.Unit = js.native
  /**
                   * Asserts that expected does not match the regular expression regExp
                   */
  def notMatch(expected: js.Any, regExp: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that expected does not include inc
                   */
  def notNestedInclude(expected: js.Object, inc: js.Object): scala.Unit = js.native
  /**
                   * Asserts that expected does not include inc
                   */
  def notNestedInclude(expected: js.Object, inc: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property`
                   */
  def notNestedProperty(`object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property`
                   */
  def notNestedProperty(`object`: js.Object, property: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property` with value `value`(===)
                   */
  def notNestedPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property` with value `value`(===)
                   */
  def notNestedPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that valus is not null
                   */
  def notNull(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that valus is not null
                   */
  def notNull(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not a number
                   */
  def notNumber(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not a number
                   */
  def notNumber(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not an object of type Object
                   */
  def notObject(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not an object of type Object
                   */
  def notObject(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is falsy
                   */
  def notOk(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is falsy
                   */
  def notOk(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Assert that expected does not include inc
                   */
  def notOwnInclude(expected: js.Object, inc: js.Object): scala.Unit = js.native
  /**
                   * Assert that expected does not include inc
                   */
  def notOwnInclude(expected: js.Object, inc: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have an owned property named `property`
                   */
  def notOwnProperty(`object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have an owned property named `property`
                   */
  def notOwnProperty(`object`: js.Object, property: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have an owned property named `property` with value `value`(===)
                   */
  def notOwnPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object does not have an owned property named `property` with value `value`(===)
                   */
  def notOwnPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property`
                   */
  def notProperty(`object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property`
                   */
  def notProperty(`object`: js.Object, property: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property` with value `value` (===)
                   */
  def notPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object does not have a property named `property` with value `value` (===)
                   */
  def notPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that arrays do not have the same members in any order
                   */
  def notSameDeepMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that arrays do not have the same members in any order
                   */
  def notSameDeepMembers(set1: js.Array[_], set2: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that arrays do not have the same members in the same order
                   */
  def notSameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that arrays do not have the same members in the same order
                   */
  def notSameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that arrays do not have the same members in any order (===)
                   */
  def notSameMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that arrays do not have the same members in any order (===)
                   */
  def notSameMembers(set1: js.Array[_], set2: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that arrays do not have the same members in the same order (===)
                   */
  def notSameOrderedMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that arrays do not have the same members in the same order (===)
                   */
  def notSameOrderedMembers(set1: js.Array[_], set2: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object is not sealed
                   */
  def notSealed(`object`: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object is not sealed
                   */
  def notSealed(`object`: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts strict inequality
                   */
  def notStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
                   * Asserts strict inequality
                   */
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not a string
                   */
  def notString(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not a string
                   */
  def notString(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is not true
                   */
  def notTrue(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is not true
                   */
  def notTrue(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Assert that value's type is not `type`
                   */
  def notTypeOf(value: js.Any, `type`: PossibleTypes): scala.Unit = js.native
  /**
                   * Assert that value's type is not `type`
                   */
  def notTypeOf(value: js.Any, `type`: PossibleTypes, message: java.lang.String): scala.Unit = js.native
  def notTypeOf(value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def notTypeOf(value: js.Any, `type`: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is null
                   */
  def `null`(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is null
                   */
  def `null`(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is a number
                   */
  def number(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is a number
                   */
  def number(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is an object of type Object
                   */
  def `object`(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is an object of type Object
                   */
  def `object`(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is truthy
                   */
  def ok(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is truthy
                   */
  def ok(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that list includes inList
                   */
  def oneOf(inList: js.Any, list: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that list includes inList
                   */
  def oneOf(inList: js.Any, list: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Compares two values using operator
                   */
  def operator(value: js.Any, operator: java.lang.String, val2: js.Any): scala.Unit = js.native
  /**
                   * Compares two values using operator
                   */
  def operator(value: js.Any, operator: java.lang.String, val2: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Assert that expected includes inc
                   */
  def ownInclude(expected: js.Object, inc: js.Object): scala.Unit = js.native
  /**
                   * Assert that expected includes inc
                   */
  def ownInclude(expected: js.Object, inc: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has an owned property named `property`
                   */
  def ownProperty(`object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has an owned property named `property`
                   */
  def ownProperty(`object`: js.Object, property: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has an owned property named `property` with value `value`(===)
                   */
  def ownPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object has an owned property named `property` with value `value`(===)
                   */
  def ownPropertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property`
                   */
  def property(`object`: js.Object, property: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property`
                   */
  def property(`object`: js.Object, property: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property` with value `value` (===)
                   */
  def propertyVal(`object`: js.Object, property: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that object has a property named `property` with value `value` (===)
                   */
  def propertyVal(`object`: js.Object, property: java.lang.String, value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that arrays have the same members in any order
                   */
  def sameDeepMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that arrays have the same members in any order
                   */
  def sameDeepMembers(set1: js.Array[_], set2: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that arrays have the same members in the same order
                   */
  def sameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that arrays have the same members in the same order
                   */
  def sameDeepOrderedMembers(set1: js.Array[_], set2: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that arrays have the same members in any order (===)
                   */
  def sameMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that arrays have the same members in any order (===)
                   */
  def sameMembers(set1: js.Array[_], set2: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that arrays have the same members in the same order (===)
                   */
  def sameOrderedMembers(set1: js.Array[_], set2: js.Array[_]): scala.Unit = js.native
  /**
                   * Asserts that arrays have the same members in the same order (===)
                   */
  def sameOrderedMembers(set1: js.Array[_], set2: js.Array[_], message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that object is sealed
                   */
  def `sealed`(`object`: js.Object): scala.Unit = js.native
  /**
                   * Asserts that object is sealed
                   */
  def `sealed`(`object`: js.Object, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts strict equality
                   */
  def strictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
                   * Asserts strict equality
                   */
  def strictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is a string
                   */
  def string(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is a string
                   */
  def string(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def `throw`(fn: js.Function0[js.Promise[scala.Unit]]): js.Promise[_] = js.native
  def `throw`(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object): js.Promise[_] = js.native
  def `throw`(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object, errMsgMatcher: java.lang.String): js.Promise[_] = js.native
  def `throw`(
    fn: js.Function0[js.Promise[scala.Unit]],
    errorLike: js.Object,
    errMsgMatcher: java.lang.String,
    message: java.lang.String
  ): js.Promise[_] = js.native
  def `throw`(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object, errMsgMatcher: stdLib.RegExp): js.Promise[_] = js.native
  def `throw`(
    fn: js.Function0[js.Promise[scala.Unit]],
    errorLike: js.Object,
    errMsgMatcher: stdLib.RegExp,
    message: java.lang.String
  ): js.Promise[_] = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throw")
  def throw_Any(fn: js.Function0[scala.Unit]): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throw")
  def throw_Any(fn: js.Function0[scala.Unit], errorLike: js.Object): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throw")
  def throw_Any(fn: js.Function0[scala.Unit], errorLike: js.Object, errMsgMatcher: java.lang.String): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throw")
  def throw_Any(
    fn: js.Function0[scala.Unit],
    errorLike: js.Object,
    errMsgMatcher: java.lang.String,
    message: java.lang.String
  ): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throw")
  def throw_Any(fn: js.Function0[scala.Unit], errorLike: js.Object, errMsgMatcher: stdLib.RegExp): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throw")
  def throw_Any(
    fn: js.Function0[scala.Unit],
    errorLike: js.Object,
    errMsgMatcher: stdLib.RegExp,
    message: java.lang.String
  ): js.Any = js.native
  def throws(fn: js.Function0[js.Promise[scala.Unit]]): js.Promise[_] = js.native
  def throws(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object): js.Promise[_] = js.native
  def throws(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object, errMsgMatcher: java.lang.String): js.Promise[_] = js.native
  def throws(
    fn: js.Function0[js.Promise[scala.Unit]],
    errorLike: js.Object,
    errMsgMatcher: java.lang.String,
    message: java.lang.String
  ): js.Promise[_] = js.native
  def throws(fn: js.Function0[js.Promise[scala.Unit]], errorLike: js.Object, errMsgMatcher: stdLib.RegExp): js.Promise[_] = js.native
  def throws(
    fn: js.Function0[js.Promise[scala.Unit]],
    errorLike: js.Object,
    errMsgMatcher: stdLib.RegExp,
    message: java.lang.String
  ): js.Promise[_] = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throws")
  def throws_Any(fn: js.Function0[scala.Unit]): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throws")
  def throws_Any(fn: js.Function0[scala.Unit], errorLike: js.Object): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throws")
  def throws_Any(fn: js.Function0[scala.Unit], errorLike: js.Object, errMsgMatcher: java.lang.String): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throws")
  def throws_Any(
    fn: js.Function0[scala.Unit],
    errorLike: js.Object,
    errMsgMatcher: java.lang.String,
    message: java.lang.String
  ): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throws")
  def throws_Any(fn: js.Function0[scala.Unit], errorLike: js.Object, errMsgMatcher: stdLib.RegExp): js.Any = js.native
  /**
                   * Asserts that a function or an async functions throws an error
                   */
  @JSName("throws")
  def throws_Any(
    fn: js.Function0[scala.Unit],
    errorLike: js.Object,
    errMsgMatcher: stdLib.RegExp,
    message: java.lang.String
  ): js.Any = js.native
  /**
                   * Asserts that value is true
                   */
  def `true`(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is true
                   */
  def `true`(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value's type is `type`
                   */
  def typeOf(value: js.Any, `type`: PossibleTypes): scala.Unit = js.native
  /**
                   * Asserts that value's type is `type`
                   */
  def typeOf(value: js.Any, `type`: PossibleTypes, message: java.lang.String): scala.Unit = js.native
  def typeOf(value: js.Any, `type`: java.lang.String): scala.Unit = js.native
  def typeOf(value: js.Any, `type`: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
                   * Asserts that value is undefined
                   */
  def undefined(value: js.Any): scala.Unit = js.native
  /**
                   * Asserts that value is undefined
                   */
  def undefined(value: js.Any, message: java.lang.String): scala.Unit = js.native
}

