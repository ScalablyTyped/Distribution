package typings.adone

import typings.adone.adoneNs.INs.LazifyOptions
import typings.adone.adoneNs.INs.Runtime
import typings.adone.adoneNs.INs.Tag
import typings.adone.adoneNs.INs.datetimeNs.Datetime
import typings.adone.adoneNs.INs.datetimeNs.DatetimeFormatSpecification
import typings.adone.adoneNs.INs.datetimeNs.DatetimeFunction
import typings.adone.adoneNs.INs.datetimeNs.DatetimeInput
import typings.adone.adoneNs.assertionNs.INs.AssertFunction
import typings.adone.adoneNs.assertionNs.INs.Assertion
import typings.adone.adoneNs.assertionNs.INs.ExpectFunction
import typings.adone.adoneNs.assertionNs.INs.MockAssertions
import typings.adone.adoneNs.shaniNs.utilNs.INs.Spy
import typings.adone.adoneNumbers.`false`
import typings.adone.adoneNumbers.`true`
import typings.lodash.lodashMod.LoDashImplicitWrapper
import typings.lodash.lodashMod.LoDashStatic
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone", JSImport.Namespace)
@js.native
object adoneMod extends js.Object {
  @js.native
  object adone extends js.Object {
    val EMPTY_BUFFER: Buffer = js.native
    val ETC_PATH: String = js.native
    val INs: TypeofI = js.native
    val ROOT_PATH: String = js.native
    val _null: js.Symbol = js.native
    val appNs: Typeofapp = js.native
    /**
      * Various archivers
      */
    val archiveNs: Typeofarchive = js.native
    @JSName("assert")
    val assert_Original: AssertFunction = js.native
    /**
      * assertion functions
      */
    val assertionNs: Typeofassertion = js.native
    val bad: typings.adone.adoneStrings.bad = js.native
    /**
      * Data structures
      */
    val collectionNs: Typeofcollection = js.native
    /**
      * Various compressors
      */
    val compressorNs: Typeofcompressor = js.native
    val configuration: js.Object = js.native
    val cryptoNs: TypeofcryptoAsn1 = js.native
    /**
      * Various data [de]serializers
      */
    val dataNs: Typeofdata = js.native
    /**
      * Creates a new datetime object
      */
    @JSName("datetime")
    val datetime_Original: DatetimeFunction = js.native
    val errorNs: Typeoferror = js.native
    val eventNs: Typeofevent = js.native
    @JSName("expect")
    val expect_Original: ExpectFunction = js.native
    val fakeNs: Typeoffake = js.native
    /**
      * Filesystem Automation Streaming Templates/Transforms
      */
    val fastNs: Typeoffast = js.native
    /**
      * File system stuff
      */
    val fsNs: TypeoffsAbstractRandomAccessReader = js.native
    /**
      * predicates
      */
    val isNs: Typeofis = js.native
    @JSName("lodash")
    val lodash_Original: LoDashStatic = js.native
    /**
      * math related things
      */
    val mathNs: Typeofmath = js.native
    val metaNs: Typeofmeta = js.native
    val netNs: TypeofnetHttp = js.native
    val ok: typings.adone.adoneStrings.ok = js.native
    val `package`: js.Object = js.native
    val prettyNs: Typeofpretty = js.native
    /**
      * promise helpers
      */
    val promiseNs: Typeofpromise = js.native
    val regexNs: Typeofregex = js.native
    val runtime: Runtime = js.native
    val semverNs: Typeofsemver = js.native
    /**
      * testing framework
      */
    val shaniNs: Typeofshani = js.native
    val streamNs: TypeofstreamCore = js.native
    val systemNs: TypeofsystemEnv = js.native
    val tag: Tag = js.native
    val templatingNs: Typeoftemplating = js.native
    val textNs: Typeoftext = js.native
    /**
      * various utility functions
      */
    val utilNs: TypeofutilA = js.native
    val vaultNs: Typeofvault = js.native
    /**
      * Asserts that value is truthy
      */
    def assert(value: js.Any): Unit = js.native
    def assert(value: js.Any, message: String): Unit = js.native
    /**
      * Creates a new datetime object
      */
    def datetime(): Datetime = js.native
    def datetime(inp: DatetimeInput): Datetime = js.native
    def datetime(inp: DatetimeInput, format: DatetimeFormatSpecification): Datetime = js.native
    def datetime(inp: DatetimeInput, format: DatetimeFormatSpecification, language: String): Datetime = js.native
    def datetime(inp: DatetimeInput, format: DatetimeFormatSpecification, language: String, strict: Boolean): Datetime = js.native
    def datetime(inp: DatetimeInput, format: DatetimeFormatSpecification, strict: Boolean): Datetime = js.native
    def definePrivate(modules: js.Object, obj: js.Object): js.Object = js.native
    def expect(value: js.Any): Assertion = js.native
    def expect(value: js.Any, message: String): Assertion = js.native
    def expect(value: Spy): MockAssertions = js.native
    def expect(value: Spy, message: String): MockAssertions = js.native
    def falsely(): `false` = js.native
    def getAssetAbsolutePath(relPath: String): String = js.native
    def identity[T](x: T): T = js.native
    def lazify(modules: js.Object): js.Object = js.native
    def lazify(modules: js.Object, obj: js.Object): js.Object = js.native
    def lazify(modules: js.Object, obj: js.Object, require: js.Function1[/* path */ String, _]): js.Object = js.native
    def lazify(
      modules: js.Object,
      obj: js.Object,
      require: js.Function1[/* path */ String, _],
      options: LazifyOptions
    ): js.Object = js.native
    def lazifyPrivate(modules: js.Object): js.Object = js.native
    def lazifyPrivate(modules: js.Object, obj: js.Object): js.Object = js.native
    def lazifyPrivate(modules: js.Object, obj: js.Object, require: js.Function1[/* path */ String, _]): js.Object = js.native
    def lazifyPrivate(
      modules: js.Object,
      obj: js.Object,
      require: js.Function1[/* path */ String, _],
      options: LazifyOptions
    ): js.Object = js.native
    def loadAsset(relPath: String): String | Buffer = js.native
    /**
      * Creates a lodash object which wraps value to enable implicit method chain sequences.
      * Methods that operate on and return arrays, collections, and functions can be chained together.
      * Methods that retrieve a single value or may return a primitive value will automatically end the
      * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
      *
      * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
      *
      * The execution of chained methods is lazy, that is, it's deferred until value() is
      * implicitly or explicitly called.
      *
      * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
      * is an optimization to merge iteratee calls; this avoids the creation of intermediate
      * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
      * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
      * accept only one argument. The heuristic for whether a section qualifies for shortcut
      * fusion is subject to change.
      *
      * Chaining is supported in custom builds as long as the value() method is directly or
      * indirectly included in the build.
      *
      * In addition to lodash methods, wrappers have Array and String methods.
      * The wrapper Array methods are:
      * concat, join, pop, push, shift, sort, splice, and unshift.
      * The wrapper String methods are:
      * replace and split.
      *
      * The wrapper methods that support shortcut fusion are:
      * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
      * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
      *
      * The chainable wrapper methods are:
      * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
      * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
      * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
      * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
      * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
      * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
      * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
      * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
      * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
      * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
      * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
      * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
      * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
      * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
      * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
      * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
      *
      * The wrapper methods that are not chainable by default are:
      * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
      * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
      * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
      * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
      * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
      * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
      * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
      * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
      * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
      * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
      * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
      * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
      * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
      * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
      * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
      * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
      * upperFirst, value, and words.
      **/
    def lodash[T](value: T): LoDashImplicitWrapper[T] = js.native
    def log(args: js.Any*): Unit = js.native
    def logDebug(args: js.Any*): Unit = js.native
    def logError(args: js.Any*): Unit = js.native
    def logFatal(args: js.Any*): Unit = js.native
    def logInfo(args: js.Any*): Unit = js.native
    def logTrace(args: js.Any*): Unit = js.native
    def logWarn(args: js.Any*): Unit = js.native
    def noop(): Unit = js.native
    def o(props: js.Any*): js.Object = js.native
    def `private`(obj: js.Object): js.Any = js.native
    def require(path: String): js.Object = js.native
    def sprintf(format: String, args: js.Any*): String = js.native
    def truly(): `true` = js.native
  }
  
}

