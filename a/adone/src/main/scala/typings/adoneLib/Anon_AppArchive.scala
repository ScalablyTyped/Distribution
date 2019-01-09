package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AppArchive extends js.Object {
  val EMPTY_BUFFER: nodeLib.Buffer = js.native
  val ETC_PATH: java.lang.String = js.native
  val INs: Anon_Datetime = js.native
  val ROOT_PATH: java.lang.String = js.native
  val _null: js.Symbol = js.native
  val appNs: Anon_App = js.native
  /**
    * Various archivers
    */
  val archiveNs: Anon_Tar = js.native
  @JSName("assert")
  val assert_Original: adoneLib.adoneNs.assertionNs.INs.AssertFunction = js.native
  /**
    * assertion functions
    */
  val assertionNs: Anon_AssertAssertionError = js.native
  val bad: adoneLib.adoneLibStrings.bad = js.native
  /**
    * Data structures
    */
  val collectionNs: Anon_AAVLTree = js.native
  /**
    * Various compressors
    */
  val compressorNs: Anon_Brotli = js.native
  val configuration: js.Object = js.native
  val cryptoNs: Anon_Asn1 = js.native
  /**
    * Various data [de]serializers
    */
  val dataNs: Anon_AlphabetBase32 = js.native
  /**
    * Creates a new datetime object
    */
  @JSName("datetime")
  val datetime_Original: adoneLib.adoneNs.INs.datetimeNs.DatetimeFunction = js.native
  val errorNs: Anon_Bind = js.native
  val eventNs: Anon_AsyncEmitter = js.native
  @JSName("expect")
  val expect_Original: adoneLib.adoneNs.assertionNs.INs.ExpectFunction = js.native
  val fakeNs: Anon_AddressCommerce = js.native
  /**
    * Filesystem Automation Streaming Templates/Transforms
    */
  val fastNs: Anon_File = js.native
  /**
    * File system stuff
    */
  val fsNs: Anon_AbstractRandomAccessReader = js.native
  /**
    * predicates
    */
  val isNs: Anon_1 = js.native
  @JSName("lodash")
  val lodash_Original: lodashLib.lodashMod.underscoreNs.LoDashStatic = js.native
  /**
    * math related things
    */
  val mathNs: Anon_ArrayBigNumber = js.native
  val metaNs: Anon_I = js.native
  val netNs: Anon_Http = js.native
  val ok: adoneLib.adoneLibStrings.ok = js.native
  val `package`: js.Object = js.native
  val prettyNs: Anon_DataI = js.native
  /**
    * promise helpers
    */
  val promiseNs: Anon_AArgs = js.native
  val regexNs: Anon_Ansi = js.native
  val runtime: adoneLib.adoneNs.INs.Runtime = js.native
  val semverNs: Anon_01 = js.native
  /**
    * testing framework
    */
  val shaniNs: Anon_Engine = js.native
  val streamNs: Anon_Core = js.native
  val systemNs: Anon_Env = js.native
  val tag: adoneLib.adoneNs.INs.Tag = js.native
  val templatingNs: Anon_Dot = js.native
  val textNs: Anon_CamelCaseToDashed = js.native
  /**
    * various utility functions
    */
  val utilNs: Anon_AABias = js.native
  val vaultNs: Anon_IId = js.native
  /**
    * Asserts that value is truthy
    */
  def assert(value: js.Any): scala.Unit = js.native
  def assert(value: js.Any, message: java.lang.String): scala.Unit = js.native
  /**
    * Creates a new datetime object
    */
  def datetime(): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
  def datetime(inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
  def datetime(
    inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput,
    format: adoneLib.adoneNs.INs.datetimeNs.DatetimeFormatSpecification
  ): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
  def datetime(
    inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput,
    format: adoneLib.adoneNs.INs.datetimeNs.DatetimeFormatSpecification,
    language: java.lang.String
  ): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
  def datetime(
    inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput,
    format: adoneLib.adoneNs.INs.datetimeNs.DatetimeFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
  def datetime(
    inp: adoneLib.adoneNs.INs.datetimeNs.DatetimeInput,
    format: adoneLib.adoneNs.INs.datetimeNs.DatetimeFormatSpecification,
    strict: scala.Boolean
  ): adoneLib.adoneNs.INs.datetimeNs.Datetime = js.native
  def definePrivate(modules: js.Object, obj: js.Object): js.Object = js.native
  def expect(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy): adoneLib.adoneNs.assertionNs.INs.MockAssertions = js.native
  def expect(value: adoneLib.adoneNs.shaniNs.utilNs.INs.Spy, message: java.lang.String): adoneLib.adoneNs.assertionNs.INs.MockAssertions = js.native
  def expect(value: js.Any): adoneLib.adoneNs.assertionNs.INs.Assertion = js.native
  def expect(value: js.Any, message: java.lang.String): adoneLib.adoneNs.assertionNs.INs.Assertion = js.native
  def falsely(): adoneLib.adoneLibNumbers.`false` = js.native
  def getAssetAbsolutePath(relPath: java.lang.String): java.lang.String = js.native
  def identity[T](x: T): T = js.native
  def lazify(modules: js.Object): js.Object = js.native
  def lazify(modules: js.Object, obj: js.Object): js.Object = js.native
  def lazify(modules: js.Object, obj: js.Object, require: js.Function1[/* path */ java.lang.String, _]): js.Object = js.native
  def lazify(
    modules: js.Object,
    obj: js.Object,
    require: js.Function1[/* path */ java.lang.String, _],
    options: adoneLib.adoneNs.INs.LazifyOptions
  ): js.Object = js.native
  def lazifyPrivate(modules: js.Object): js.Object = js.native
  def lazifyPrivate(modules: js.Object, obj: js.Object): js.Object = js.native
  def lazifyPrivate(modules: js.Object, obj: js.Object, require: js.Function1[/* path */ java.lang.String, _]): js.Object = js.native
  def lazifyPrivate(
    modules: js.Object,
    obj: js.Object,
    require: js.Function1[/* path */ java.lang.String, _],
    options: adoneLib.adoneNs.INs.LazifyOptions
  ): js.Object = js.native
  def loadAsset(relPath: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
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
  def lodash[T](value: T): lodashLib.lodashMod.underscoreNs.LoDashImplicitWrapper[T] = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def logDebug(args: js.Any*): scala.Unit = js.native
  def logError(args: js.Any*): scala.Unit = js.native
  def logFatal(args: js.Any*): scala.Unit = js.native
  def logInfo(args: js.Any*): scala.Unit = js.native
  def logTrace(args: js.Any*): scala.Unit = js.native
  def logWarn(args: js.Any*): scala.Unit = js.native
  def noop(): scala.Unit = js.native
  def o(props: js.Any*): js.Object = js.native
  def `private`(obj: js.Object): js.Any = js.native
  def require(path: java.lang.String): js.Object = js.native
  def sprintf(format: java.lang.String, args: js.Any*): java.lang.String = js.native
  def truly(): adoneLib.adoneLibNumbers.`true` = js.native
}

