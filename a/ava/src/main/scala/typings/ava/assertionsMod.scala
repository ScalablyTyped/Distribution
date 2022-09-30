package typings.ava

import org.scalablytyped.runtime.Instantiable1
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertionsMod {
  
  @js.native
  trait AssertAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    def apply(actual: Any): Boolean = js.native
    def apply(actual: Any, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any): Unit = js.native
    def skip(actual: Any, message: String): Unit = js.native
  }
  
  trait Assertions extends StObject {
    
    /**
    	 * Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    def assert(actual: Any): Boolean
    def assert(actual: Any, message: String): Boolean
    /**
    	 * Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    @JSName("assert")
    var assert_Original: AssertAssertion
    
    /**
    	 * Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to
    	 * `expected`, returning a boolean indicating whether the assertion passed.
    	 */
    def deepEqual[Actual, Expected /* <: Actual */](actual: Actual, expected: Expected): /* is Expected */ Boolean
    def deepEqual[Actual, Expected /* <: Actual */](actual: Actual, expected: Expected, message: String): /* is Expected */ Boolean
    /**
    	 * Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to
    	 * `expected`, returning a boolean indicating whether the assertion passed.
    	 */
    @JSName("deepEqual")
    var deepEqual_Original: DeepEqualAssertion
    
    /** Fail the test, always returning `false`. */
    /** Fail the test, always returning `false`. */
    def fail(): Boolean
    def fail(message: String): Boolean
    /** Fail the test, always returning `false`. */
    @JSName("fail")
    var fail_Original: FailAssertion
    
    /**
    	 * Assert that `actual` is strictly false, returning a boolean indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `actual` is strictly false, returning a boolean indicating whether the assertion passed.
    	 */
    def `false`(actual: Any): Boolean
    def `false`(actual: Any, message: String): Boolean
    /**
    	 * Assert that `actual` is strictly false, returning a boolean indicating whether the assertion passed.
    	 */
    @JSName("false")
    var false_Original: FalseAssertion
    
    /**
    	 * Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    def falsy(actual: Any): Boolean
    def falsy(actual: Any, message: String): Boolean
    /**
    	 * Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    @JSName("falsy")
    var falsy_Original: FalsyAssertion
    
    /**
    	 * Assert that `actual` is [the same
    	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`,
    	 * returning a boolean indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `actual` is [the same
    	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`,
    	 * returning a boolean indicating whether the assertion passed.
    	 */
    def is[Actual, Expected /* <: Actual */](actual: Actual, expected: Expected): /* is Expected */ Boolean
    def is[Actual, Expected /* <: Actual */](actual: Actual, expected: Expected, message: String): /* is Expected */ Boolean
    /**
    	 * Assert that `actual` is [the same
    	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`,
    	 * returning a boolean indicating whether the assertion passed.
    	 */
    @JSName("is")
    var is_Original: IsAssertion
    
    /**
    	 * Assert that `value` is like `selector`, returning a boolean indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `value` is like `selector`, returning a boolean indicating whether the assertion passed.
    	 */
    def like[Expected /* <: Record[String, Any] */](value: Any, selector: Expected): /* is Expected */ Boolean
    def like[Expected /* <: Record[String, Any] */](value: Any, selector: Expected, message: String): /* is Expected */ Boolean
    /**
    	 * Assert that `value` is like `selector`, returning a boolean indicating whether the assertion passed.
    	 */
    @JSName("like")
    var like_Original: LikeAssertion
    
    /**
    	 * Assert that `actual` is not [the same
    	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`,
    	 * returning a boolean indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `actual` is not [the same
    	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`,
    	 * returning a boolean indicating whether the assertion passed.
    	 */
    def not[Actual, Expected](actual: Actual, expected: Expected): Boolean
    def not[Actual, Expected](actual: Actual, expected: Expected, message: String): Boolean
    
    /**
    	 * Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to
    	 * `expected`, returning a boolean indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to
    	 * `expected`, returning a boolean indicating whether the assertion passed.
    	 */
    def notDeepEqual[Actual, Expected](actual: Actual, expected: Expected): Boolean
    def notDeepEqual[Actual, Expected](actual: Actual, expected: Expected, message: String): Boolean
    /**
    	 * Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to
    	 * `expected`, returning a boolean indicating whether the assertion passed.
    	 */
    @JSName("notDeepEqual")
    var notDeepEqual_Original: NotDeepEqualAssertion
    
    /**
    	 * Assert that `string` does not match the regular expression, returning a boolean indicating whether the assertion
    	 * passed.
    	 */
    /**
    	 * Assert that `string` does not match the regular expression, returning a boolean indicating whether the assertion
    	 * passed.
    	 */
    def notRegex(string: String, regex: js.RegExp): Boolean
    def notRegex(string: String, regex: js.RegExp, message: String): Boolean
    /**
    	 * Assert that `string` does not match the regular expression, returning a boolean indicating whether the assertion
    	 * passed.
    	 */
    @JSName("notRegex")
    var notRegex_Original: NotRegexAssertion
    
    /** Assert that the function does not throw. */
    /** Assert that the function does not throw. */
    def notThrows(fn: js.Function0[Any]): Unit
    def notThrows(fn: js.Function0[Any], message: String): Unit
    
    /** Assert that the async function does not throw. You must await the result. */
    /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
    def notThrowsAsync(fn: js.Function0[PromiseLike[Any]]): js.Promise[Unit]
    def notThrowsAsync(fn: js.Function0[PromiseLike[Any]], message: String): js.Promise[Unit]
    /** Assert that the promise does not reject. You must await the result. */
    /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
    def notThrowsAsync(promise: PromiseLike[Any]): js.Promise[Unit]
    def notThrowsAsync(promise: PromiseLike[Any], message: String): js.Promise[Unit]
    /** Assert that the async function does not throw, or that the promise does not reject. Must be awaited. */
    @JSName("notThrowsAsync")
    var notThrowsAsync_Original: NotThrowsAsyncAssertion
    
    /** Assert that the function does not throw. */
    @JSName("notThrows")
    var notThrows_Original: NotThrowsAssertion
    
    /**
    	 * Assert that `actual` is not [the same
    	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`,
    	 * returning a boolean indicating whether the assertion passed.
    	 */
    @JSName("not")
    var not_Original: NotAssertion
    
    /** Count a passing assertion, always returning `true`. */
    /** Count a passing assertion, always returning `true`. */
    def pass(): Boolean
    def pass(message: String): Boolean
    /** Count a passing assertion, always returning `true`. */
    @JSName("pass")
    var pass_Original: PassAssertion
    
    /**
    	 * Assert that `string` matches the regular expression, returning a boolean indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `string` matches the regular expression, returning a boolean indicating whether the assertion passed.
    	 */
    def regex(string: String, regex: js.RegExp): Boolean
    def regex(string: String, regex: js.RegExp, message: String): Boolean
    /**
    	 * Assert that `string` matches the regular expression, returning a boolean indicating whether the assertion passed.
    	 */
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
    def snapshot(expected: Any): Unit
    def snapshot(expected: Any, message: String): Unit
    /**
    	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
    	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
    	 * necessary record a new snapshot.
    	 */
    @JSName("snapshot")
    var snapshot_Original: SnapshotAssertion
    
    /**
    	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
    	 * The error must satisfy all expectations. Returns undefined when the assertion fails.
    	 */
    /**
    	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
    	 */
    def throws[ThrownError /* <: js.Error */](fn: js.Function0[Any]): js.UndefOr[ThrownError]
    def throws[ThrownError /* <: js.Error */](fn: js.Function0[Any], expectations: Unit, message: String): js.UndefOr[ThrownError]
    def throws[ThrownError /* <: js.Error */](fn: js.Function0[Any], expectations: ThrowsExpectation): js.UndefOr[ThrownError]
    def throws[ThrownError /* <: js.Error */](fn: js.Function0[Any], expectations: ThrowsExpectation, message: String): js.UndefOr[ThrownError]
    
    /**
    	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
    	 * value. Returns undefined when the assertion fails. You must await the result. The error must satisfy all expectations.
    	 */
    /**
    	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
    	 * with one. If so, returns a promise for the error value, which must be awaited.
    	 */
    def throwsAsync[ThrownError /* <: js.Error */](fn: js.Function0[PromiseLike[Any]]): js.Promise[js.UndefOr[ThrownError]]
    def throwsAsync[ThrownError /* <: js.Error */](fn: js.Function0[PromiseLike[Any]], expectations: Unit, message: String): js.Promise[js.UndefOr[ThrownError]]
    def throwsAsync[ThrownError /* <: js.Error */](fn: js.Function0[PromiseLike[Any]], expectations: ThrowsExpectation): js.Promise[js.UndefOr[ThrownError]]
    def throwsAsync[ThrownError /* <: js.Error */](fn: js.Function0[PromiseLike[Any]], expectations: ThrowsExpectation, message: String): js.Promise[js.UndefOr[ThrownError]]
    /**
    	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
    	 * rejection reason. Returns undefined when the assertion fails. You must await the result. The error must satisfy all
    	 * expectations.
    	 */
    /**
    	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error), or the promise rejects
    	 * with one. If so, returns a promise for the error value, which must be awaited.
    	 */
    def throwsAsync[ThrownError /* <: js.Error */](promise: PromiseLike[Any]): js.Promise[js.UndefOr[ThrownError]]
    def throwsAsync[ThrownError /* <: js.Error */](promise: PromiseLike[Any], expectations: Unit, message: String): js.Promise[js.UndefOr[ThrownError]]
    def throwsAsync[ThrownError /* <: js.Error */](promise: PromiseLike[Any], expectations: ThrowsExpectation): js.Promise[js.UndefOr[ThrownError]]
    def throwsAsync[ThrownError /* <: js.Error */](promise: PromiseLike[Any], expectations: ThrowsExpectation, message: String): js.Promise[js.UndefOr[ThrownError]]
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
    
    /**
    	 * Assert that `actual` is strictly true, returning a boolean indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `actual` is strictly true, returning a boolean indicating whether the assertion passed.
    	 */
    def `true`(actual: Any): Boolean
    def `true`(actual: Any, message: String): Boolean
    /**
    	 * Assert that `actual` is strictly true, returning a boolean indicating whether the assertion passed.
    	 */
    @JSName("true")
    var true_Original: TrueAssertion
    
    /**
    	 * Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    /**
    	 * Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    def truthy(actual: Any): Boolean
    def truthy(actual: Any, message: String): Boolean
    /**
    	 * Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    @JSName("truthy")
    var truthy_Original: TruthyAssertion
  }
  object Assertions {
    
    inline def apply(
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
    
    extension [Self <: Assertions](x: Self) {
      
      inline def setAssert(value: AssertAssertion): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
      
      inline def setDeepEqual(value: DeepEqualAssertion): Self = StObject.set(x, "deepEqual", value.asInstanceOf[js.Any])
      
      inline def setFail(value: FailAssertion): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
      
      inline def setFalse(value: FalseAssertion): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
      
      inline def setFalsy(value: FalsyAssertion): Self = StObject.set(x, "falsy", value.asInstanceOf[js.Any])
      
      inline def setIs(value: IsAssertion): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setLike(value: LikeAssertion): Self = StObject.set(x, "like", value.asInstanceOf[js.Any])
      
      inline def setNot(value: NotAssertion): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      inline def setNotDeepEqual(value: NotDeepEqualAssertion): Self = StObject.set(x, "notDeepEqual", value.asInstanceOf[js.Any])
      
      inline def setNotRegex(value: NotRegexAssertion): Self = StObject.set(x, "notRegex", value.asInstanceOf[js.Any])
      
      inline def setNotThrows(value: NotThrowsAssertion): Self = StObject.set(x, "notThrows", value.asInstanceOf[js.Any])
      
      inline def setNotThrowsAsync(value: NotThrowsAsyncAssertion): Self = StObject.set(x, "notThrowsAsync", value.asInstanceOf[js.Any])
      
      inline def setPass(value: PassAssertion): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: RegexAssertion): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(value: SnapshotAssertion): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setThrows(value: ThrowsAssertion): Self = StObject.set(x, "throws", value.asInstanceOf[js.Any])
      
      inline def setThrowsAsync(value: ThrowsAsyncAssertion): Self = StObject.set(x, "throwsAsync", value.asInstanceOf[js.Any])
      
      inline def setTrue(value: TrueAssertion): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
      
      inline def setTruthy(value: TruthyAssertion): Self = StObject.set(x, "truthy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeepEqualAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to
    	 * `expected`, returning a boolean indicating whether the assertion passed.
    	 */
    def apply[Actual, Expected /* <: Actual */](actual: Actual, expected: Expected): /* is Expected */ Boolean = js.native
    def apply[Actual, Expected /* <: Actual */](actual: Actual, expected: Expected, message: String): /* is Expected */ Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any, expected: Any): Unit = js.native
    def skip(actual: Any, expected: Any, message: String): Unit = js.native
  }
  
  type ErrorConstructor = Instantiable1[/* args (repeated) */ Any, js.Error]
  
  @js.native
  trait FailAssertion extends StObject {
    
    /** Fail the test, always returning `false`. */
    def apply(): Boolean = js.native
    def apply(message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(): Unit = js.native
    def skip(message: String): Unit = js.native
  }
  
  @js.native
  trait FalseAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is strictly false, returning a boolean indicating whether the assertion passed.
    	 */
    def apply(actual: Any): Boolean = js.native
    def apply(actual: Any, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any): Unit = js.native
    def skip(actual: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait FalsyAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    def apply(actual: Any): Boolean = js.native
    def apply(actual: Any, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any): Unit = js.native
    def skip(actual: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait IsAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is [the same
    	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`,
    	 * returning a boolean indicating whether the assertion passed.
    	 */
    def apply[Actual, Expected /* <: Actual */](actual: Actual, expected: Expected): /* is Expected */ Boolean = js.native
    def apply[Actual, Expected /* <: Actual */](actual: Actual, expected: Expected, message: String): /* is Expected */ Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any, expected: Any): Unit = js.native
    def skip(actual: Any, expected: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait LikeAssertion extends StObject {
    
    /**
    	 * Assert that `value` is like `selector`, returning a boolean indicating whether the assertion passed.
    	 */
    def apply[Expected /* <: Record[String, Any] */](value: Any, selector: Expected): /* is Expected */ Boolean = js.native
    def apply[Expected /* <: Record[String, Any] */](value: Any, selector: Expected, message: String): /* is Expected */ Boolean = js.native
    
    /** Skip this assertion. */
    def skip(value: Any, selector: Any): Unit = js.native
    def skip(value: Any, selector: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait NotAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is not [the same
    	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`,
    	 * returning a boolean indicating whether the assertion passed.
    	 */
    def apply[Actual, Expected](actual: Actual, expected: Expected): Boolean = js.native
    def apply[Actual, Expected](actual: Actual, expected: Expected, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any, expected: Any): Unit = js.native
    def skip(actual: Any, expected: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait NotDeepEqualAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to
    	 * `expected`, returning a boolean indicating whether the assertion passed.
    	 */
    def apply[Actual, Expected](actual: Actual, expected: Expected): Boolean = js.native
    def apply[Actual, Expected](actual: Actual, expected: Expected, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any, expected: Any): Unit = js.native
    def skip(actual: Any, expected: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait NotRegexAssertion extends StObject {
    
    /**
    	 * Assert that `string` does not match the regular expression, returning a boolean indicating whether the assertion
    	 * passed.
    	 */
    def apply(string: String, regex: js.RegExp): Boolean = js.native
    def apply(string: String, regex: js.RegExp, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(string: String, regex: js.RegExp): Unit = js.native
    def skip(string: String, regex: js.RegExp, message: String): Unit = js.native
  }
  
  @js.native
  trait NotThrowsAssertion extends StObject {
    
    /** Assert that the function does not throw. */
    def apply(fn: js.Function0[Any]): Unit = js.native
    def apply(fn: js.Function0[Any], message: String): Unit = js.native
    
    /** Skip this assertion. */
    def skip(fn: js.Function0[Any]): Unit = js.native
    def skip(fn: js.Function0[Any], message: String): Unit = js.native
  }
  
  @js.native
  trait NotThrowsAsyncAssertion extends StObject {
    
    /** Assert that the async function does not throw. You must await the result. */
    def apply(fn: js.Function0[PromiseLike[Any]]): js.Promise[Unit] = js.native
    def apply(fn: js.Function0[PromiseLike[Any]], message: String): js.Promise[Unit] = js.native
    /** Assert that the promise does not reject. You must await the result. */
    def apply(promise: PromiseLike[Any]): js.Promise[Unit] = js.native
    def apply(promise: PromiseLike[Any], message: String): js.Promise[Unit] = js.native
    
    /** Skip this assertion. */
    def skip(nonThrower: Any): Unit = js.native
    def skip(nonThrower: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait PassAssertion extends StObject {
    
    /** Count a passing assertion, always returning `true`. */
    def apply(): Boolean = js.native
    def apply(message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(): Unit = js.native
    def skip(message: String): Unit = js.native
  }
  
  @js.native
  trait RegexAssertion extends StObject {
    
    /**
    	 * Assert that `string` matches the regular expression, returning a boolean indicating whether the assertion passed.
    	 */
    def apply(string: String, regex: js.RegExp): Boolean = js.native
    def apply(string: String, regex: js.RegExp, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(string: String, regex: js.RegExp): Unit = js.native
    def skip(string: String, regex: js.RegExp, message: String): Unit = js.native
  }
  
  @js.native
  trait SnapshotAssertion extends StObject {
    
    /**
    	 * Assert that `expected` is [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to a
    	 * previously recorded [snapshot](https://github.com/concordancejs/concordance#serialization-details), or if
    	 * necessary record a new snapshot.
    	 */
    def apply(expected: Any): Unit = js.native
    def apply(expected: Any, message: String): Unit = js.native
    
    /** Skip this assertion. */
    def skip(expected: Any): Unit = js.native
    def skip(expected: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait ThrowsAssertion extends StObject {
    
    /**
    	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
    	 * The error must satisfy all expectations. Returns undefined when the assertion fails.
    	 */
    def apply[ThrownError /* <: js.Error */](fn: js.Function0[Any]): js.UndefOr[ThrownError] = js.native
    def apply[ThrownError /* <: js.Error */](fn: js.Function0[Any], expectations: Unit, message: String): js.UndefOr[ThrownError] = js.native
    def apply[ThrownError /* <: js.Error */](fn: js.Function0[Any], expectations: ThrowsExpectation): js.UndefOr[ThrownError] = js.native
    def apply[ThrownError /* <: js.Error */](fn: js.Function0[Any], expectations: ThrowsExpectation, message: String): js.UndefOr[ThrownError] = js.native
    
    /** Skip this assertion. */
    def skip(fn: js.Function0[Any]): Unit = js.native
    def skip(fn: js.Function0[Any], expectations: Any): Unit = js.native
    def skip(fn: js.Function0[Any], expectations: Any, message: String): Unit = js.native
    def skip(fn: js.Function0[Any], expectations: Unit, message: String): Unit = js.native
  }
  
  @js.native
  trait ThrowsAsyncAssertion extends StObject {
    
    /**
    	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
    	 * value. Returns undefined when the assertion fails. You must await the result. The error must satisfy all expectations.
    	 */
    def apply[ThrownError /* <: js.Error */](fn: js.Function0[PromiseLike[Any]]): js.Promise[js.UndefOr[ThrownError]] = js.native
    def apply[ThrownError /* <: js.Error */](fn: js.Function0[PromiseLike[Any]], expectations: Unit, message: String): js.Promise[js.UndefOr[ThrownError]] = js.native
    def apply[ThrownError /* <: js.Error */](fn: js.Function0[PromiseLike[Any]], expectations: ThrowsExpectation): js.Promise[js.UndefOr[ThrownError]] = js.native
    def apply[ThrownError /* <: js.Error */](fn: js.Function0[PromiseLike[Any]], expectations: ThrowsExpectation, message: String): js.Promise[js.UndefOr[ThrownError]] = js.native
    /**
    	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
    	 * rejection reason. Returns undefined when the assertion fails. You must await the result. The error must satisfy all
    	 * expectations.
    	 */
    def apply[ThrownError /* <: js.Error */](promise: PromiseLike[Any]): js.Promise[js.UndefOr[ThrownError]] = js.native
    def apply[ThrownError /* <: js.Error */](promise: PromiseLike[Any], expectations: Unit, message: String): js.Promise[js.UndefOr[ThrownError]] = js.native
    def apply[ThrownError /* <: js.Error */](promise: PromiseLike[Any], expectations: ThrowsExpectation): js.Promise[js.UndefOr[ThrownError]] = js.native
    def apply[ThrownError /* <: js.Error */](promise: PromiseLike[Any], expectations: ThrowsExpectation, message: String): js.Promise[js.UndefOr[ThrownError]] = js.native
    
    /** Skip this assertion. */
    def skip(thrower: Any): Unit = js.native
    def skip(thrower: Any, expectations: Any): Unit = js.native
    def skip(thrower: Any, expectations: Any, message: String): Unit = js.native
    def skip(thrower: Any, expectations: Unit, message: String): Unit = js.native
  }
  
  trait ThrowsExpectation extends StObject {
    
    /** The thrown error must have a code that equals the given string or number. */
    var code: js.UndefOr[String | Double] = js.undefined
    
    /** The thrown error must be an instance of this constructor. */
    var instanceOf: js.UndefOr[ErrorConstructor] = js.undefined
    
    /** The thrown error must be strictly equal to this value. */
    var is: js.UndefOr[js.Error] = js.undefined
    
    /** The thrown error must have a message that equals the given string, or matches the regular expression. */
    var message: js.UndefOr[String | js.RegExp | (js.Function1[/* message */ String, Boolean])] = js.undefined
    
    /** The thrown error must have a name that equals the given string. */
    var name: js.UndefOr[String] = js.undefined
  }
  object ThrowsExpectation {
    
    inline def apply(): ThrowsExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrowsExpectation]
    }
    
    extension [Self <: ThrowsExpectation](x: Self) {
      
      inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setInstanceOf(value: ErrorConstructor): Self = StObject.set(x, "instanceOf", value.asInstanceOf[js.Any])
      
      inline def setInstanceOfUndefined: Self = StObject.set(x, "instanceOf", js.undefined)
      
      inline def setIs(value: js.Error): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      inline def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      inline def setMessage(value: String | js.RegExp | (js.Function1[/* message */ String, Boolean])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageFunction1(value: /* message */ String => Boolean): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait TrueAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is strictly true, returning a boolean indicating whether the assertion passed.
    	 */
    def apply(actual: Any): Boolean = js.native
    def apply(actual: Any, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any): Unit = js.native
    def skip(actual: Any, message: String): Unit = js.native
  }
  
  @js.native
  trait TruthyAssertion extends StObject {
    
    /**
    	 * Assert that `actual` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), returning a boolean
    	 * indicating whether the assertion passed.
    	 */
    def apply(actual: Any): Boolean = js.native
    def apply(actual: Any, message: String): Boolean = js.native
    
    /** Skip this assertion. */
    def skip(actual: Any): Unit = js.native
    def skip(actual: Any, message: String): Unit = js.native
  }
}
