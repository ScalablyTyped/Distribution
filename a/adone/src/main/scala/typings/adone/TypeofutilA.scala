package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.adone.adoneNs.utilNs.INs.BinarySearchFunction
import typings.adone.adoneNs.utilNs.INs.BracesFunction
import typings.adone.adoneNs.utilNs.INs.BracesOptions
import typings.adone.adoneNs.utilNs.INs.CloneOptions
import typings.adone.adoneNs.utilNs.INs.DebounceOptions
import typings.adone.adoneNs.utilNs.INs.Delegator
import typings.adone.adoneNs.utilNs.INs.FillRangeOptions
import typings.adone.adoneNs.utilNs.INs.FlattenOptions
import typings.adone.adoneNs.utilNs.INs.GlobizeOptions
import typings.adone.adoneNs.utilNs.INs.JSEscOptions
import typings.adone.adoneNs.utilNs.INs.KeysOptions
import typings.adone.adoneNs.utilNs.INs.MatchFunction
import typings.adone.adoneNs.utilNs.INs.MatchOptions
import typings.adone.adoneNs.utilNs.INs.MatchPathOptions
import typings.adone.adoneNs.utilNs.INs.MergeOptions
import typings.adone.adoneNs.utilNs.INs.OnceOptions
import typings.adone.adoneNs.utilNs.INs.ParseMsResult
import typings.adone.adoneNs.utilNs.INs.ReInterval
import typings.adone.adoneNs.utilNs.INs.RegexNotOptions
import typings.adone.adoneNs.utilNs.INs.SortKeysOptions
import typings.adone.adoneNs.utilNs.INs.SplitStringOptions
import typings.adone.adoneNs.utilNs.INs.SplitStringSplitFunction
import typings.adone.adoneNs.utilNs.INs.ToRegexOptions
import typings.adone.adoneNs.utilNs.INs.ToRegexRangeOptions
import typings.adone.adoneNs.utilNs.INs.ToposortFunction
import typings.adone.adoneNs.utilNs.INs.WaterFallTask
import typings.adone.adoneNs.utilNs.INs.fakeClockNs.FakeClock
import typings.node.Buffer
import typings.std.ArrayLike
import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.RegExp
import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofutilA extends js.Object {
  var Cloner: Instantiable0[typings.adone.adoneNs.utilNs.Cloner] = js.native
  var Editor: TypeofClassEditor = js.native
  // terraformer: TODO
  val INs: TypeofIFakeClock = js.native
  /**
    * Represents a log file rotator
    */
  var LogRotator: Instantiable2[
    /* target */ String, 
    js.UndefOr[/* options */ Anon_CheckInterval], 
    typings.adone.adoneNs.utilNs.LogRotator
  ] = js.native
  @JSName("binarySearch")
  val binarySearch_Original: BinarySearchFunction = js.native
  @JSName("braces")
  val braces_Original: BracesFunction = js.native
  /**
    * buffer tools
    */
  val bufferNs: TypeofbufferA = js.native
  val fakeClock: FakeClock = js.native
  val iconvNs: Typeoficonv = js.native
  val inflectionNs: Typeofinflection = js.native
  val ltgtNs: Typeofltgt = js.native
  @JSName("match")
  val match_Original: MatchFunction = js.native
  val memcpyNs: Typeofmemcpy = js.native
  // pool: TODO
  val querystringNs: TypeofquerystringEscape = js.native
  val sqlstringNs: Typeofsqlstring = js.native
  val throttleNs: Typeofthrottle = js.native
  @JSName("toposort")
  val toposort_Original: ToposortFunction = js.native
  val uuidNs: Typeofuuid = js.native
  val xorDistanceNs: TypeofxorDistance = js.native
  /**
    * Finds difference between the given arrays
    */
  def arrayDiff[T](arrays: js.Array[T]*): js.Array[T] = js.native
  def arrify[T](`val`: T): js.Array[T] = js.native
  def arrify[T](`val`: js.Array[T]): js.Array[T] = js.native
  def assignDeep[T](target: T, sources: js.Object*): T = js.native
  def asyncFor[T](
    obj: StringDictionary[T],
    iter: js.Function5[
      /* key */ String, 
      /* value */ T, 
      /* index */ Double, 
      /* length */ Double, 
      /* next */ js.Function0[Unit], 
      Unit
    ],
    cb: js.Function0[Unit]
  ): Unit = js.native
  def asyncIter[T](
    array: js.Array[T],
    iter: js.Function3[/* elem */ T, /* index */ Double, /* cb */ js.Function0[Unit], _],
    cb: js.Function0[Unit]
  ): Unit = js.native
  def asyncWaterfall[T](tasks: js.Array[WaterFallTask]): Unit = js.native
  def asyncWaterfall[T](
    tasks: js.Array[WaterFallTask],
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* repeated */ js.Any, Unit]
  ): Unit = js.native
  def binarySearch[T](aHaystack: js.Array[T], aNeedle: Double): T = js.native
  def binarySearch[T](aHaystack: js.Array[T], aNeedle: Double, aLow: Double): T = js.native
  def binarySearch[T](aHaystack: js.Array[T], aNeedle: Double, aLow: Double, aHigh: Double): T = js.native
  def binarySearch[T](
    aHaystack: js.Array[T],
    aNeedle: Double,
    aLow: Double,
    aHigh: Double,
    aCompare: js.Function2[/* a */ T, /* b */ T, Double]
  ): T = js.native
  def binarySearch[T](
    aHaystack: js.Array[T],
    aNeedle: Double,
    aLow: Double,
    aHigh: Double,
    aCompare: js.Function2[/* a */ T, /* b */ T, Double],
    aBias: Double
  ): T = js.native
  def braces(pattern: String): js.Array[String] = js.native
  def braces(pattern: String, options: BracesOptions): js.Array[String] = js.native
  def clone(`object`: js.Any): js.Any = js.native
  def clone(`object`: js.Any, options: CloneOptions): js.Any = js.native
  /**
    * Creates a function that delays invoking of the given function until after "timeout" ms
    * have elapsed since the last invoking
    */
  def debounce[R](fn: js.Function0[R], timeout: Double): js.Function0[R] = js.native
  def debounce[R](fn: js.Function0[R], timeout: Double, options: DebounceOptions): js.Function0[R] = js.native
  def debounce[R](fn: js.Function1[/* repeated */ js.Any, R], timeout: Double): js.Function1[/* repeated */ js.Any, R] = js.native
  def debounce[R](fn: js.Function1[/* repeated */ js.Any, R], timeout: Double, options: DebounceOptions): js.Function1[/* repeated */ js.Any, R] = js.native
  def debounce[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, R], timeout: Double): js.Function2[/* a */ T1, /* b */ T2, R] = js.native
  def debounce[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, R], timeout: Double, options: DebounceOptions): js.Function2[/* a */ T1, /* b */ T2, R] = js.native
  def debounce[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R], timeout: Double): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R] = js.native
  def debounce[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R], timeout: Double, options: DebounceOptions): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R] = js.native
  def debounce[T1, T2, T3, T4, R](fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R], timeout: Double): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R] = js.native
  def debounce[T1, T2, T3, T4, R](
    fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R],
    timeout: Double,
    options: DebounceOptions
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R] = js.native
  def debounce[T1, T2, T3, T4, T5, R](fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R], timeout: Double): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R] = js.native
  def debounce[T1, T2, T3, T4, T5, R](
    fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R],
    timeout: Double,
    options: DebounceOptions
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R] = js.native
  @JSName("debounce")
  def debounce_T1R[T1, R](fn: js.Function1[/* a */ T1, R], timeout: Double): js.Function1[/* a */ T1, R] = js.native
  @JSName("debounce")
  def debounce_T1R[T1, R](fn: js.Function1[/* a */ T1, R], timeout: Double, options: DebounceOptions): js.Function1[/* a */ T1, R] = js.native
  def delegate(`object`: js.Object, property: String): Delegator = js.native
  def entries(`object`: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  def entries(`object`: js.Object, options: KeysOptions): js.Array[js.Tuple2[String, _]] = js.native
  def enumerate[T](iterable: Iterable[T]): IterableIterator[js.Tuple2[Double, T]] = js.native
  def enumerate[T](iterable: Iterable[T], start: Double): IterableIterator[js.Tuple2[Double, T]] = js.native
  def fillRange(from: String, to: String): js.Array[String] = js.native
  def fillRange(from: String, to: String, options: FillRangeOptions): js.Array[String] = js.native
  def fillRange(from: String, to: Double): js.Array[String | Double] = js.native
  def fillRange(from: String, to: Double, options: FillRangeOptions): js.Array[String | Double] = js.native
  def fillRange(from: Double, to: String): js.Array[String | Double] = js.native
  def fillRange(from: Double, to: String, options: FillRangeOptions): js.Array[String | Double] = js.native
  def fillRange(from: Double, to: Double): js.Array[Double] = js.native
  def fillRange(from: Double, to: Double, options: (FillRangeOptions with Anon_Stringify) | FillRangeOptions): js.Array[String] = js.native
  @JSName("fillRange")
  def fillRange_String(from: String, to: String, options: FillRangeOptions with Anon_ToRegex): String = js.native
  @JSName("fillRange")
  def fillRange_String(from: String, to: Double, options: FillRangeOptions with Anon_ToRegex): String = js.native
  @JSName("fillRange")
  def fillRange_String(from: Double, to: String, options: FillRangeOptions with Anon_ToRegex): String = js.native
  /**
    * Expands numbers and letters
    */
  @JSName("fillRange")
  def fillRange_String(from: Double, to: Double, options: FillRangeOptions with Anon_ToRegex): String = js.native
  def flatten(array: js.Array[_]): js.Array[_] = js.native
  def flatten(array: js.Array[_], options: FlattenOptions): js.Array[_] = js.native
  def functionName(fn: js.Function1[/* repeated */ js.Any, _]): String = js.native
  def globParent(str: String): String = js.native
  def globize(path: String): String = js.native
  def globize(path: String, options: GlobizeOptions): String = js.native
  def invertObject(source: js.Object): js.Object = js.native
  def invertObject(source: js.Object, options: KeysOptions): js.Object = js.native
  def jsesc(argument: js.Any): String = js.native
  def jsesc(argument: js.Any, options: JSEscOptions): String = js.native
  def keys(`object`: js.Object): js.Array[String] = js.native
  def keys(`object`: js.Object, options: KeysOptions): js.Array[String] = js.native
  def machineId(): js.Promise[String] = js.native
  def machineId(original: Boolean): js.Promise[String] = js.native
  /**
    * The main function takes a list of strings and one or more glob patterns to use for matching.
    *
    * @param list A list of strings to match
    * @param patterns One or more glob patterns to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns an array of matches
    */
  def `match`(list: js.Array[String], patterns: String): js.Array[String] = js.native
  def `match`(list: js.Array[String], patterns: String, options: MatchOptions): js.Array[String] = js.native
  def `match`(list: js.Array[String], patterns: js.Array[String]): js.Array[String] = js.native
  def `match`(list: js.Array[String], patterns: js.Array[String], options: MatchOptions): js.Array[String] = js.native
  def matchPath(criteria: js.Any): js.Function2[/* value */ js.Any, /* options */ js.UndefOr[MatchPathOptions], Double | Boolean] = js.native
  def matchPath(criteria: js.Any, options: MatchPathOptions): js.Function2[/* value */ js.Any, /* options */ js.UndefOr[MatchPathOptions], Double | Boolean] = js.native
  def matchPath(criteria: js.Any, value: js.Any): Double | Boolean = js.native
  def matchPath(criteria: js.Any, value: js.Any, options: MatchPathOptions): Double | Boolean = js.native
  def merge(target: js.Any, source: js.Any): js.Any = js.native
  def merge(target: js.Any, source: js.Any, options: MergeOptions): js.Any = js.native
  def normalizePath(str: String): String = js.native
  def normalizePath(str: String, stripTrailing: Boolean): String = js.native
  def omit(obj: js.Any, props: String): js.Object = js.native
  def omit(obj: js.Any, props: js.Array[String]): js.Object = js.native
  def omit(obj: js.Any, props: js.Function1[/* v */ String, Boolean]): js.Object = js.native
  def once[T](fn: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, T] = js.native
  def once[T](fn: js.Function1[/* repeated */ js.Any, T], options: OnceOptions): js.Function1[/* repeated */ js.Any, T] = js.native
  def parseMs(ms: Double): ParseMsResult = js.native
  def parseSize(str: String): Double | Null = js.native
  def parseSize(str: Double): Double | Null = js.native
  def parseTime(`val`: js.Any): Double | Null = js.native
  def parseTime(`val`: Double): Double = js.native
  def pick(obj: js.Any, props: Iterable[_]): js.Object = js.native
  def pluralizeWord(str: String): String = js.native
  def pluralizeWord(str: String, plural: String): String = js.native
  def pluralizeWord(str: String, plural: String, count: Double): String = js.native
  def randomChoice[T](arrayLike: ArrayLike[T]): T = js.native
  def randomChoice[T](arrayLike: ArrayLike[T], from: Double): T = js.native
  def randomChoice[T](arrayLike: ArrayLike[T], from: Double, to: Double): T = js.native
  def range(): js.Array[Double] = js.native
  def range(start: Double): js.Array[Double] = js.native
  def range(start: Double, stop: Double): js.Array[Double] = js.native
  def range(start: Double, stop: Double, step: Double): js.Array[Double] = js.native
  def reFindAll(regexp: RegExp, str: String): js.Array[RegExpExecArray] = js.native
  def regexNot(pattern: String): RegExp = js.native
  def regexNot(pattern: String, options: RegexNotOptions): RegExp = js.native
  def reinterval(callback: js.Function1[/* repeated */ js.Any, Unit], interval: Double): ReInterval = js.native
  def reinterval(callback: js.Function1[/* repeated */ js.Any, Unit], interval: Double, args: js.Array[_]): ReInterval = js.native
  def repeat[T](item: T, n: Double): js.Array[T] = js.native
  def shebang(str: String): String | Null = js.native
  def shuffleArray[T](array: js.Array[T]): js.Array[T] = js.native
  // retry: TODO
  def signalNameToCode(signame: String): Double = js.native
  def slice[T](args: js.Array[T]): js.Array[T] = js.native
  def slice[T](args: js.Array[T], sliceStart: Double): js.Array[T] = js.native
  def slice[T](args: js.Array[T], sliceStart: Double, sliceEnd: Double): js.Array[T] = js.native
  def sortKeys(`object`: js.Object): js.Object = js.native
  def sortKeys(`object`: js.Object, options: SortKeysOptions): js.Object = js.native
  def spliceOne(list: js.Array[_], index: Double): Unit = js.native
  def splitBuffer(buf: String, splitBuf: String): js.Array[Buffer] = js.native
  def splitBuffer(buf: String, splitBuf: String, includeDelim: Boolean): js.Array[Buffer] = js.native
  def splitBuffer(buf: String, splitBuf: Buffer): js.Array[Buffer] = js.native
  def splitBuffer(buf: String, splitBuf: Buffer, includeDelim: Boolean): js.Array[Buffer] = js.native
  def splitBuffer(buf: Buffer, splitBuf: String): js.Array[Buffer] = js.native
  def splitBuffer(buf: Buffer, splitBuf: String, includeDelim: Boolean): js.Array[Buffer] = js.native
  def splitBuffer(buf: Buffer, splitBuf: Buffer): js.Array[Buffer] = js.native
  def splitBuffer(buf: Buffer, splitBuf: Buffer, includeDelim: Boolean): js.Array[Buffer] = js.native
  def splitString(str: String): js.Array[String] = js.native
  def splitString(str: String, options: SplitStringOptions): js.Array[String] = js.native
  def splitString(str: String, options: SplitStringOptions, splitter: SplitStringSplitFunction): js.Array[String] = js.native
  def splitString(str: String, splitter: SplitStringSplitFunction): js.Array[String] = js.native
  def toDotNotation(`object`: js.Object): js.Object = js.native
  def toFastProperties(`object`: js.Object): js.Object = js.native
  def toRegex(patterns: String): RegExp = js.native
  def toRegex(patterns: String, options: ToRegexOptions): RegExp = js.native
  def toRegex(patterns: js.Array[String]): RegExp = js.native
  def toRegex(patterns: js.Array[String], options: ToRegexOptions): RegExp = js.native
  def toRegexRange(min: String, max: String): RegExp = js.native
  def toRegexRange(min: String, max: String, options: ToRegexRangeOptions): RegExp = js.native
  def toRegexRange(min: String, max: Double): RegExp = js.native
  def toRegexRange(min: String, max: Double, options: ToRegexRangeOptions): RegExp = js.native
  def toRegexRange(min: Double, max: String): RegExp = js.native
  def toRegexRange(min: Double, max: String, options: ToRegexRangeOptions): RegExp = js.native
  def toRegexRange(min: Double, max: Double): RegExp = js.native
  def toRegexRange(min: Double, max: Double, options: ToRegexRangeOptions): RegExp = js.native
  def toposort(edges: js.Array[js.Tuple2[String, String]]): js.Array[String] = js.native
  def unique[T](array: js.Array[T]): js.Array[T] = js.native
  def unique[T](array: js.Array[T], projection: js.Function1[/* a */ T, _]): js.Array[T] = js.native
  def unixifyPath(filePath: String): String = js.native
  def unixifyPath(filePath: String, unescape: Boolean): String = js.native
  def values(`object`: js.Object): js.Array[_] = js.native
  def values(`object`: js.Object, options: KeysOptions): js.Array[_] = js.native
  def xrange(): IterableIterator[Double] = js.native
  def xrange(start: Double): IterableIterator[Double] = js.native
  def xrange(start: Double, stop: Double): IterableIterator[Double] = js.native
  def xrange(start: Double, stop: Double, step: Double): IterableIterator[Double] = js.native
  def zip(iterables: Iterable[_]*): IterableIterator[js.Array[_]] = js.native
  def zip[T1, T2](a: Iterable[T1], b: Iterable[T2]): IterableIterator[js.Tuple2[T1, T2]] = js.native
  def zip[T1, T2, T3](a: Iterable[T1], b: Iterable[T2], c: Iterable[T3]): IterableIterator[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, T3, T4](a: Iterable[T1], b: Iterable[T2], c: Iterable[T3], d: Iterable[T4]): IterableIterator[js.Tuple4[T1, T2, T3, T4]] = js.native
}

