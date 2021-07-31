package typings.ava.mod

import typings.std.Error
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assertions extends StObject {
  
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). Comes with power-assert. */
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). Comes with power-assert. */
  def assert(actual: js.Any): Unit
  def assert(actual: js.Any, message: String): Unit
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). Comes with power-assert. */
  @JSName("assert")
  var assert_Original: AssertAssertion
  
  /** Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  /** Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  def deepEqual[ValueType](actual: ValueType, expected: ValueType): Unit
  def deepEqual[ValueType](actual: ValueType, expected: ValueType, message: String): Unit
  /** Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  @JSName("deepEqual")
  var deepEqual_Original: DeepEqualAssertion
  
  /** Fail the test. */
  /** Fail the test. */
  def fail(): Unit
  def fail(message: String): Unit
  /** Fail the test. */
  @JSName("fail")
  var fail_Original: FailAssertion
  
  /** Assert that `actual` is strictly false. */
  /** Assert that `actual` is strictly false. */
  def `false`(actual: js.Any): Unit
  def `false`(actual: js.Any, message: String): Unit
  /** Assert that `actual` is strictly false. */
  @JSName("false")
  var false_Original: FalseAssertion
  
  /** Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy). */
  /** Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy). */
  def falsy(actual: js.Any): Unit
  def falsy(actual: js.Any, message: String): Unit
  /** Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy). */
  @JSName("falsy")
  var falsy_Original: FalsyAssertion
  
  /**
  	 * Assert that `actual` is [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  /**
  	 * Assert that `actual` is [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  def is[ValueType](actual: ValueType, expected: ValueType): Unit
  def is[ValueType](actual: ValueType, expected: ValueType, message: String): Unit
  /**
  	 * Assert that `actual` is [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  @JSName("is")
  var is_Original: IsAssertion
  
  /** Assert that `value` is like `selector`. */
  /** Assert that `actual` is like `expected`. */
  def like(value: js.Any, selector: Record[String, js.Any]): Unit
  def like(value: js.Any, selector: Record[String, js.Any], message: String): Unit
  /** Assert that `actual` is like `expected`. */
  @JSName("like")
  var like_Original: LikeAssertion
  
  /**
  	 * Assert that `actual` is not [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  /**
  	 * Assert that `actual` is not [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  def not[ValueType](actual: ValueType, expected: ValueType): Unit
  def not[ValueType](actual: ValueType, expected: ValueType, message: String): Unit
  
  /** Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  /** Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  def notDeepEqual[ValueType](actual: ValueType, expected: ValueType): Unit
  def notDeepEqual[ValueType](actual: ValueType, expected: ValueType, message: String): Unit
  /** Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  @JSName("notDeepEqual")
  var notDeepEqual_Original: NotDeepEqualAssertion
  
  /** Assert that `string` does not match the regular expression. */
  /** Assert that `string` does not match the regular expression. */
  def notRegex(string: String, regex: RegExp): Unit
  def notRegex(string: String, regex: RegExp, message: String): Unit
  /** Assert that `string` does not match the regular expression. */
  @JSName("notRegex")
  var notRegex_Original: NotRegexAssertion
  
  /** Assert that the function does not throw. */
  /** Assert that the function does not throw. */
  def notThrows(fn: js.Function0[js.Any]): Unit
  def notThrows(fn: js.Function0[js.Any], message: String): Unit
  
  /** Assert that the async function does not throw. You must await the result. */
  /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
  def notThrowsAsync(fn: js.Function0[js.Thenable[js.Any]]): js.Promise[Unit]
  def notThrowsAsync(fn: js.Function0[js.Thenable[js.Any]], message: String): js.Promise[Unit]
  /** Assert that the promise does not reject. You must await the result. */
  /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
  def notThrowsAsync(promise: js.Thenable[js.Any]): js.Promise[Unit]
  def notThrowsAsync(promise: js.Thenable[js.Any], message: String): js.Promise[Unit]
  /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
  @JSName("notThrowsAsync")
  var notThrowsAsync_Original: NotThrowsAsyncAssertion
  
  /** Assert that the function does not throw. */
  @JSName("notThrows")
  var notThrows_Original: NotThrowsAssertion
  
  /**
  	 * Assert that `actual` is not [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  @JSName("not")
  var not_Original: NotAssertion
  
  /** Count a passing assertion. */
  /** Count a passing assertion. */
  def pass(): Unit
  def pass(message: String): Unit
  /** Count a passing assertion. */
  @JSName("pass")
  var pass_Original: PassAssertion
  
  /** Assert that `string` matches the regular expression. */
  /** Assert that `string` matches the regular expression. */
  def regex(string: String, regex: RegExp): Unit
  def regex(string: String, regex: RegExp, message: String): Unit
  /** Assert that `string` matches the regular expression. */
  @JSName("regex")
  var regex_Original: RegexAssertion
  
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  def snapshot(expected: js.Any): Unit
  def snapshot(expected: js.Any, message: String): Unit
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details) (selected
  	 * through `options.id` if provided), or if necessary record a new snapshot.
  	 */
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  def snapshot(expected: js.Any, options: SnapshotOptions): Unit
  def snapshot(expected: js.Any, options: SnapshotOptions, message: String): Unit
  /**
  	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
  	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
  	 * necessary record a new snapshot.
  	 */
  @JSName("snapshot")
  var snapshot_Original: SnapshotAssertion
  
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must satisfy all expectations.
  	 */
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  def throws[ThrownError /* <: Error */](fn: js.Function0[js.Any]): ThrownError
  def throws[ThrownError /* <: Error */](fn: js.Function0[js.Any], expectations: Null, message: String): ThrownError
  def throws[ThrownError /* <: Error */](fn: js.Function0[js.Any], expectations: Unit, message: String): ThrownError
  def throws[ThrownError /* <: Error */](fn: js.Function0[js.Any], expectations: ThrowsExpectation): ThrownError
  def throws[ThrownError /* <: Error */](fn: js.Function0[js.Any], expectations: ThrowsExpectation, message: String): ThrownError
  
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[js.Any]]): js.Promise[ThrownError]
  def throwsAsync[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[js.Any]], expectations: Null, message: String): js.Promise[ThrownError]
  def throwsAsync[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[js.Any]], expectations: Unit, message: String): js.Promise[ThrownError]
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must satisfy all expectations.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[js.Any]], expectations: ThrowsExpectation): js.Promise[ThrownError]
  def throwsAsync[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[js.Any]], expectations: ThrowsExpectation, message: String): js.Promise[ThrownError]
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: Error */](promise: js.Thenable[js.Any]): js.Promise[ThrownError]
  def throwsAsync[ThrownError /* <: Error */](promise: js.Thenable[js.Any], expectations: Null, message: String): js.Promise[ThrownError]
  def throwsAsync[ThrownError /* <: Error */](promise: js.Thenable[js.Any], expectations: Unit, message: String): js.Promise[ThrownError]
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must satisfy all expectations.
  	 */
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  def throwsAsync[ThrownError /* <: Error */](promise: js.Thenable[js.Any], expectations: ThrowsExpectation): js.Promise[ThrownError]
  def throwsAsync[ThrownError /* <: Error */](promise: js.Thenable[js.Any], expectations: ThrowsExpectation, message: String): js.Promise[ThrownError]
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
  	 * with one. If so, returns a promise for the error value, which must be awaited.
  	 */
  @JSName("throwsAsync")
  var throwsAsync_Original: ThrowsAsyncAssertion
  
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  @JSName("throws")
  var throws_Original: ThrowsAssertion
  
  /** Assert that `actual` is strictly true. */
  /** Assert that `actual` is strictly true. */
  def `true`(actual: js.Any): Unit
  def `true`(actual: js.Any, message: String): Unit
  /** Assert that `actual` is strictly true. */
  @JSName("true")
  var true_Original: TrueAssertion
  
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). */
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). */
  def truthy(actual: js.Any): Unit
  def truthy(actual: js.Any, message: String): Unit
  /** Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy). */
  @JSName("truthy")
  var truthy_Original: TruthyAssertion
}
object Assertions {
  
  @scala.inline
  def apply(
    assert: AssertAssertion,
    deepEqual: DeepEqualAssertion,
    fail: FailAssertion,
    `false`: FalseAssertion,
    falsy: FalsyAssertion,
    is: IsAssertion,
    like: LikeAssertion,
    not: NotAssertion,
    notDeepEqual: NotDeepEqualAssertion,
    notRegex: NotRegexAssertion,
    notThrows: NotThrowsAssertion,
    notThrowsAsync: NotThrowsAsyncAssertion,
    pass: PassAssertion,
    regex: RegexAssertion,
    snapshot: SnapshotAssertion,
    throws: ThrowsAssertion,
    throwsAsync: ThrowsAsyncAssertion,
    `true`: TrueAssertion,
    truthy: TruthyAssertion
  ): Assertions = {
    val __obj = js.Dynamic.literal(assert = assert.asInstanceOf[js.Any], deepEqual = deepEqual.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], falsy = falsy.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], like = like.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], notDeepEqual = notDeepEqual.asInstanceOf[js.Any], notRegex = notRegex.asInstanceOf[js.Any], notThrows = notThrows.asInstanceOf[js.Any], notThrowsAsync = notThrowsAsync.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], throws = throws.asInstanceOf[js.Any], throwsAsync = throwsAsync.asInstanceOf[js.Any], truthy = truthy.asInstanceOf[js.Any])
    __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
    __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assertions]
  }
  
  @scala.inline
  implicit class AssertionsMutableBuilder[Self <: Assertions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssert(value: AssertAssertion): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepEqual(value: DeepEqualAssertion): Self = StObject.set(x, "deepEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: FailAssertion): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalse(value: FalseAssertion): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalsy(value: FalsyAssertion): Self = StObject.set(x, "falsy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs(value: IsAssertion): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike(value: LikeAssertion): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNot(value: NotAssertion): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotDeepEqual(value: NotDeepEqualAssertion): Self = StObject.set(x, "notDeepEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotRegex(value: NotRegexAssertion): Self = StObject.set(x, "notRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotThrows(value: NotThrowsAssertion): Self = StObject.set(x, "notThrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotThrowsAsync(value: NotThrowsAsyncAssertion): Self = StObject.set(x, "notThrowsAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: PassAssertion): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegex(value: RegexAssertion): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshot(value: SnapshotAssertion): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrows(value: ThrowsAssertion): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowsAsync(value: ThrowsAsyncAssertion): Self = StObject.set(x, "throwsAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrue(value: TrueAssertion): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruthy(value: TruthyAssertion): Self = StObject.set(x, "truthy", value.asInstanceOf[js.Any])
  }
}
