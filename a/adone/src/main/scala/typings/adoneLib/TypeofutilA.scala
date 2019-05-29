package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofutilA extends js.Object {
  var Cloner: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.utilNs.Cloner] = js.native
  var Editor: TypeofClassEditor = js.native
  // terraformer: TODO
  val INs: TypeofIFakeClock = js.native
  /**
    * Represents a log file rotator
    */
  var LogRotator: org.scalablytyped.runtime.Instantiable2[
    /* target */ java.lang.String, 
    js.UndefOr[/* options */ Anon_CheckInterval], 
    adoneLib.adoneNs.utilNs.LogRotator
  ] = js.native
  @JSName("binarySearch")
  val binarySearch_Original: adoneLib.adoneNs.utilNs.INs.BinarySearchFunction = js.native
  @JSName("braces")
  val braces_Original: adoneLib.adoneNs.utilNs.INs.BracesFunction = js.native
  /**
    * buffer tools
    */
  val bufferNs: TypeofbufferA = js.native
  val fakeClock: adoneLib.adoneNs.utilNs.INs.fakeClockNs.FakeClock = js.native
  val iconvNs: Typeoficonv = js.native
  val inflectionNs: Typeofinflection = js.native
  val ltgtNs: Typeofltgt = js.native
  @JSName("match")
  val match_Original: adoneLib.adoneNs.utilNs.INs.MatchFunction = js.native
  val memcpyNs: Typeofmemcpy = js.native
  // pool: TODO
  val querystringNs: TypeofquerystringEscape = js.native
  val sqlstringNs: Typeofsqlstring = js.native
  val throttleNs: Typeofthrottle = js.native
  @JSName("toposort")
  val toposort_Original: adoneLib.adoneNs.utilNs.INs.ToposortFunction = js.native
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
    obj: org.scalablytyped.runtime.StringDictionary[T],
    iter: js.Function5[
      /* key */ java.lang.String, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* length */ scala.Double, 
      /* next */ js.Function0[scala.Unit], 
      scala.Unit
    ],
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def asyncIter[T](
    array: js.Array[T],
    iter: js.Function3[/* elem */ T, /* index */ scala.Double, /* cb */ js.Function0[scala.Unit], _],
    cb: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def asyncWaterfall[T](tasks: js.Array[adoneLib.adoneNs.utilNs.INs.WaterFallTask]): scala.Unit = js.native
  def asyncWaterfall[T](
    tasks: js.Array[adoneLib.adoneNs.utilNs.INs.WaterFallTask],
    callback: js.Function2[/* err */ js.UndefOr[stdLib.Error | scala.Null], /* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def binarySearch[T](aHaystack: js.Array[T], aNeedle: scala.Double): T = js.native
  def binarySearch[T](aHaystack: js.Array[T], aNeedle: scala.Double, aLow: scala.Double): T = js.native
  def binarySearch[T](aHaystack: js.Array[T], aNeedle: scala.Double, aLow: scala.Double, aHigh: scala.Double): T = js.native
  def binarySearch[T](
    aHaystack: js.Array[T],
    aNeedle: scala.Double,
    aLow: scala.Double,
    aHigh: scala.Double,
    aCompare: js.Function2[/* a */ T, /* b */ T, scala.Double]
  ): T = js.native
  def binarySearch[T](
    aHaystack: js.Array[T],
    aNeedle: scala.Double,
    aLow: scala.Double,
    aHigh: scala.Double,
    aCompare: js.Function2[/* a */ T, /* b */ T, scala.Double],
    aBias: scala.Double
  ): T = js.native
  def braces(pattern: java.lang.String): js.Array[java.lang.String] = js.native
  def braces(pattern: java.lang.String, options: adoneLib.adoneNs.utilNs.INs.BracesOptions): js.Array[java.lang.String] = js.native
  def clone(`object`: js.Any): js.Any = js.native
  def clone(`object`: js.Any, options: adoneLib.adoneNs.utilNs.INs.CloneOptions): js.Any = js.native
  /**
    * Creates a function that delays invoking of the given function until after "timeout" ms
    * have elapsed since the last invoking
    */
  def debounce[R](fn: js.Function0[R], timeout: scala.Double): js.Function0[R] = js.native
  def debounce[R](fn: js.Function0[R], timeout: scala.Double, options: adoneLib.adoneNs.utilNs.INs.DebounceOptions): js.Function0[R] = js.native
  def debounce[R](fn: js.Function1[/* repeated */ js.Any, R], timeout: scala.Double): js.Function1[/* repeated */ js.Any, R] = js.native
  def debounce[R](
    fn: js.Function1[/* repeated */ js.Any, R],
    timeout: scala.Double,
    options: adoneLib.adoneNs.utilNs.INs.DebounceOptions
  ): js.Function1[/* repeated */ js.Any, R] = js.native
  def debounce[T1, T2, R](fn: js.Function2[/* a */ T1, /* b */ T2, R], timeout: scala.Double): js.Function2[/* a */ T1, /* b */ T2, R] = js.native
  def debounce[T1, T2, R](
    fn: js.Function2[/* a */ T1, /* b */ T2, R],
    timeout: scala.Double,
    options: adoneLib.adoneNs.utilNs.INs.DebounceOptions
  ): js.Function2[/* a */ T1, /* b */ T2, R] = js.native
  def debounce[T1, T2, T3, R](fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R], timeout: scala.Double): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R] = js.native
  def debounce[T1, T2, T3, R](
    fn: js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R],
    timeout: scala.Double,
    options: adoneLib.adoneNs.utilNs.INs.DebounceOptions
  ): js.Function3[/* a */ T1, /* b */ T2, /* c */ T3, R] = js.native
  def debounce[T1, T2, T3, T4, R](fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R], timeout: scala.Double): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R] = js.native
  def debounce[T1, T2, T3, T4, R](
    fn: js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R],
    timeout: scala.Double,
    options: adoneLib.adoneNs.utilNs.INs.DebounceOptions
  ): js.Function4[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, R] = js.native
  def debounce[T1, T2, T3, T4, T5, R](
    fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R],
    timeout: scala.Double
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R] = js.native
  def debounce[T1, T2, T3, T4, T5, R](
    fn: js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R],
    timeout: scala.Double,
    options: adoneLib.adoneNs.utilNs.INs.DebounceOptions
  ): js.Function5[/* a */ T1, /* b */ T2, /* c */ T3, /* d */ T4, /* e */ T5, R] = js.native
  @JSName("debounce")
  def debounce_T1R[T1, R](fn: js.Function1[/* a */ T1, R], timeout: scala.Double): js.Function1[/* a */ T1, R] = js.native
  @JSName("debounce")
  def debounce_T1R[T1, R](
    fn: js.Function1[/* a */ T1, R],
    timeout: scala.Double,
    options: adoneLib.adoneNs.utilNs.INs.DebounceOptions
  ): js.Function1[/* a */ T1, R] = js.native
  def delegate(`object`: js.Object, property: java.lang.String): adoneLib.adoneNs.utilNs.INs.Delegator = js.native
  def entries(`object`: js.Object): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def entries(`object`: js.Object, options: adoneLib.adoneNs.utilNs.INs.KeysOptions): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  def enumerate[T](iterable: stdLib.Iterable[T]): stdLib.IterableIterator[js.Tuple2[scala.Double, T]] = js.native
  def enumerate[T](iterable: stdLib.Iterable[T], start: scala.Double): stdLib.IterableIterator[js.Tuple2[scala.Double, T]] = js.native
  def fillRange(from: java.lang.String, to: java.lang.String): js.Array[java.lang.String] = js.native
  def fillRange(
    from: java.lang.String,
    to: java.lang.String,
    options: adoneLib.adoneNs.utilNs.INs.FillRangeOptions
  ): js.Array[java.lang.String] = js.native
  def fillRange(from: java.lang.String, to: scala.Double): js.Array[java.lang.String | scala.Double] = js.native
  def fillRange(from: java.lang.String, to: scala.Double, options: adoneLib.adoneNs.utilNs.INs.FillRangeOptions): js.Array[java.lang.String | scala.Double] = js.native
  def fillRange(from: scala.Double, to: java.lang.String): js.Array[java.lang.String | scala.Double] = js.native
  def fillRange(from: scala.Double, to: java.lang.String, options: adoneLib.adoneNs.utilNs.INs.FillRangeOptions): js.Array[java.lang.String | scala.Double] = js.native
  def fillRange(from: scala.Double, to: scala.Double): js.Array[scala.Double] = js.native
  def fillRange(
    from: scala.Double,
    to: scala.Double,
    options: (adoneLib.adoneNs.utilNs.INs.FillRangeOptions with Anon_Stringify) | adoneLib.adoneNs.utilNs.INs.FillRangeOptions
  ): js.Array[java.lang.String] = js.native
  @JSName("fillRange")
  def fillRange_String(
    from: java.lang.String,
    to: java.lang.String,
    options: adoneLib.adoneNs.utilNs.INs.FillRangeOptions with Anon_ToRegex
  ): java.lang.String = js.native
  @JSName("fillRange")
  def fillRange_String(
    from: java.lang.String,
    to: scala.Double,
    options: adoneLib.adoneNs.utilNs.INs.FillRangeOptions with Anon_ToRegex
  ): java.lang.String = js.native
  @JSName("fillRange")
  def fillRange_String(
    from: scala.Double,
    to: java.lang.String,
    options: adoneLib.adoneNs.utilNs.INs.FillRangeOptions with Anon_ToRegex
  ): java.lang.String = js.native
  /**
    * Expands numbers and letters
    */
  @JSName("fillRange")
  def fillRange_String(
    from: scala.Double,
    to: scala.Double,
    options: adoneLib.adoneNs.utilNs.INs.FillRangeOptions with Anon_ToRegex
  ): java.lang.String = js.native
  def flatten(array: js.Array[_]): js.Array[_] = js.native
  def flatten(array: js.Array[_], options: adoneLib.adoneNs.utilNs.INs.FlattenOptions): js.Array[_] = js.native
  def functionName(fn: js.Function1[/* repeated */ js.Any, _]): java.lang.String = js.native
  def globParent(str: java.lang.String): java.lang.String = js.native
  def globize(path: java.lang.String): java.lang.String = js.native
  def globize(path: java.lang.String, options: adoneLib.adoneNs.utilNs.INs.GlobizeOptions): java.lang.String = js.native
  def invertObject(source: js.Object): js.Object = js.native
  def invertObject(source: js.Object, options: adoneLib.adoneNs.utilNs.INs.KeysOptions): js.Object = js.native
  def jsesc(argument: js.Any): java.lang.String = js.native
  def jsesc(argument: js.Any, options: adoneLib.adoneNs.utilNs.INs.JSEscOptions): java.lang.String = js.native
  def keys(`object`: js.Object): js.Array[java.lang.String] = js.native
  def keys(`object`: js.Object, options: adoneLib.adoneNs.utilNs.INs.KeysOptions): js.Array[java.lang.String] = js.native
  def machineId(): js.Promise[java.lang.String] = js.native
  def machineId(original: scala.Boolean): js.Promise[java.lang.String] = js.native
  /**
    * The main function takes a list of strings and one or more glob patterns to use for matching.
    *
    * @param list A list of strings to match
    * @param patterns One or more glob patterns to use for matching.
    * @param options See available options for changing how matches are performed
    * @returns Returns an array of matches
    */
  def `match`(list: js.Array[java.lang.String], patterns: java.lang.String): js.Array[java.lang.String] = js.native
  def `match`(
    list: js.Array[java.lang.String],
    patterns: java.lang.String,
    options: adoneLib.adoneNs.utilNs.INs.MatchOptions
  ): js.Array[java.lang.String] = js.native
  def `match`(list: js.Array[java.lang.String], patterns: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def `match`(
    list: js.Array[java.lang.String],
    patterns: js.Array[java.lang.String],
    options: adoneLib.adoneNs.utilNs.INs.MatchOptions
  ): js.Array[java.lang.String] = js.native
  def matchPath(criteria: js.Any): js.Function2[
    /* value */ js.Any, 
    /* options */ js.UndefOr[adoneLib.adoneNs.utilNs.INs.MatchPathOptions], 
    scala.Double | scala.Boolean
  ] = js.native
  def matchPath(criteria: js.Any, options: adoneLib.adoneNs.utilNs.INs.MatchPathOptions): js.Function2[
    /* value */ js.Any, 
    /* options */ js.UndefOr[adoneLib.adoneNs.utilNs.INs.MatchPathOptions], 
    scala.Double | scala.Boolean
  ] = js.native
  def matchPath(criteria: js.Any, value: js.Any): scala.Double | scala.Boolean = js.native
  def matchPath(criteria: js.Any, value: js.Any, options: adoneLib.adoneNs.utilNs.INs.MatchPathOptions): scala.Double | scala.Boolean = js.native
  def merge(target: js.Any, source: js.Any): js.Any = js.native
  def merge(target: js.Any, source: js.Any, options: adoneLib.adoneNs.utilNs.INs.MergeOptions): js.Any = js.native
  def normalizePath(str: java.lang.String): java.lang.String = js.native
  def normalizePath(str: java.lang.String, stripTrailing: scala.Boolean): java.lang.String = js.native
  def omit(obj: js.Any, props: java.lang.String): js.Object = js.native
  def omit(obj: js.Any, props: js.Array[java.lang.String]): js.Object = js.native
  def omit(obj: js.Any, props: js.Function1[/* v */ java.lang.String, scala.Boolean]): js.Object = js.native
  def once[T](fn: js.Function1[/* repeated */ js.Any, T]): js.Function1[/* repeated */ js.Any, T] = js.native
  def once[T](fn: js.Function1[/* repeated */ js.Any, T], options: adoneLib.adoneNs.utilNs.INs.OnceOptions): js.Function1[/* repeated */ js.Any, T] = js.native
  def parseMs(ms: scala.Double): adoneLib.adoneNs.utilNs.INs.ParseMsResult = js.native
  def parseSize(str: java.lang.String): scala.Double | scala.Null = js.native
  def parseSize(str: scala.Double): scala.Double | scala.Null = js.native
  def parseTime(`val`: js.Any): scala.Double | scala.Null = js.native
  def parseTime(`val`: scala.Double): scala.Double = js.native
  def pick(obj: js.Any, props: stdLib.Iterable[_]): js.Object = js.native
  def pluralizeWord(str: java.lang.String): java.lang.String = js.native
  def pluralizeWord(str: java.lang.String, plural: java.lang.String): java.lang.String = js.native
  def pluralizeWord(str: java.lang.String, plural: java.lang.String, count: scala.Double): java.lang.String = js.native
  def randomChoice[T](arrayLike: stdLib.ArrayLike[T]): T = js.native
  def randomChoice[T](arrayLike: stdLib.ArrayLike[T], from: scala.Double): T = js.native
  def randomChoice[T](arrayLike: stdLib.ArrayLike[T], from: scala.Double, to: scala.Double): T = js.native
  def range(): js.Array[scala.Double] = js.native
  def range(start: scala.Double): js.Array[scala.Double] = js.native
  def range(start: scala.Double, stop: scala.Double): js.Array[scala.Double] = js.native
  def range(start: scala.Double, stop: scala.Double, step: scala.Double): js.Array[scala.Double] = js.native
  def reFindAll(regexp: stdLib.RegExp, str: java.lang.String): js.Array[stdLib.RegExpExecArray] = js.native
  def regexNot(pattern: java.lang.String): stdLib.RegExp = js.native
  def regexNot(pattern: java.lang.String, options: adoneLib.adoneNs.utilNs.INs.RegexNotOptions): stdLib.RegExp = js.native
  def reinterval(callback: js.Function1[/* repeated */ js.Any, scala.Unit], interval: scala.Double): adoneLib.adoneNs.utilNs.INs.ReInterval = js.native
  def reinterval(
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    interval: scala.Double,
    args: js.Array[_]
  ): adoneLib.adoneNs.utilNs.INs.ReInterval = js.native
  def repeat[T](item: T, n: scala.Double): js.Array[T] = js.native
  def shebang(str: java.lang.String): java.lang.String | scala.Null = js.native
  def shuffleArray[T](array: js.Array[T]): js.Array[T] = js.native
  // retry: TODO
  def signalNameToCode(signame: java.lang.String): scala.Double = js.native
  def slice[T](args: js.Array[T]): js.Array[T] = js.native
  def slice[T](args: js.Array[T], sliceStart: scala.Double): js.Array[T] = js.native
  def slice[T](args: js.Array[T], sliceStart: scala.Double, sliceEnd: scala.Double): js.Array[T] = js.native
  def sortKeys(`object`: js.Object): js.Object = js.native
  def sortKeys(`object`: js.Object, options: adoneLib.adoneNs.utilNs.INs.SortKeysOptions): js.Object = js.native
  def spliceOne(list: js.Array[_], index: scala.Double): scala.Unit = js.native
  def splitBuffer(buf: java.lang.String, splitBuf: java.lang.String): js.Array[nodeLib.Buffer] = js.native
  def splitBuffer(buf: java.lang.String, splitBuf: java.lang.String, includeDelim: scala.Boolean): js.Array[nodeLib.Buffer] = js.native
  def splitBuffer(buf: java.lang.String, splitBuf: nodeLib.Buffer): js.Array[nodeLib.Buffer] = js.native
  def splitBuffer(buf: java.lang.String, splitBuf: nodeLib.Buffer, includeDelim: scala.Boolean): js.Array[nodeLib.Buffer] = js.native
  def splitBuffer(buf: nodeLib.Buffer, splitBuf: java.lang.String): js.Array[nodeLib.Buffer] = js.native
  def splitBuffer(buf: nodeLib.Buffer, splitBuf: java.lang.String, includeDelim: scala.Boolean): js.Array[nodeLib.Buffer] = js.native
  def splitBuffer(buf: nodeLib.Buffer, splitBuf: nodeLib.Buffer): js.Array[nodeLib.Buffer] = js.native
  def splitBuffer(buf: nodeLib.Buffer, splitBuf: nodeLib.Buffer, includeDelim: scala.Boolean): js.Array[nodeLib.Buffer] = js.native
  def splitString(str: java.lang.String): js.Array[java.lang.String] = js.native
  def splitString(str: java.lang.String, options: adoneLib.adoneNs.utilNs.INs.SplitStringOptions): js.Array[java.lang.String] = js.native
  def splitString(
    str: java.lang.String,
    options: adoneLib.adoneNs.utilNs.INs.SplitStringOptions,
    splitter: adoneLib.adoneNs.utilNs.INs.SplitStringSplitFunction
  ): js.Array[java.lang.String] = js.native
  def splitString(str: java.lang.String, splitter: adoneLib.adoneNs.utilNs.INs.SplitStringSplitFunction): js.Array[java.lang.String] = js.native
  def toDotNotation(`object`: js.Object): js.Object = js.native
  def toFastProperties(`object`: js.Object): js.Object = js.native
  def toRegex(patterns: java.lang.String): stdLib.RegExp = js.native
  def toRegex(patterns: java.lang.String, options: adoneLib.adoneNs.utilNs.INs.ToRegexOptions): stdLib.RegExp = js.native
  def toRegex(patterns: js.Array[java.lang.String]): stdLib.RegExp = js.native
  def toRegex(patterns: js.Array[java.lang.String], options: adoneLib.adoneNs.utilNs.INs.ToRegexOptions): stdLib.RegExp = js.native
  def toRegexRange(min: java.lang.String, max: java.lang.String): stdLib.RegExp = js.native
  def toRegexRange(
    min: java.lang.String,
    max: java.lang.String,
    options: adoneLib.adoneNs.utilNs.INs.ToRegexRangeOptions
  ): stdLib.RegExp = js.native
  def toRegexRange(min: java.lang.String, max: scala.Double): stdLib.RegExp = js.native
  def toRegexRange(min: java.lang.String, max: scala.Double, options: adoneLib.adoneNs.utilNs.INs.ToRegexRangeOptions): stdLib.RegExp = js.native
  def toRegexRange(min: scala.Double, max: java.lang.String): stdLib.RegExp = js.native
  def toRegexRange(min: scala.Double, max: java.lang.String, options: adoneLib.adoneNs.utilNs.INs.ToRegexRangeOptions): stdLib.RegExp = js.native
  def toRegexRange(min: scala.Double, max: scala.Double): stdLib.RegExp = js.native
  def toRegexRange(min: scala.Double, max: scala.Double, options: adoneLib.adoneNs.utilNs.INs.ToRegexRangeOptions): stdLib.RegExp = js.native
  def toposort(edges: js.Array[js.Tuple2[java.lang.String, java.lang.String]]): js.Array[java.lang.String] = js.native
  def unique[T](array: js.Array[T]): js.Array[T] = js.native
  def unique[T](array: js.Array[T], projection: js.Function1[/* a */ T, _]): js.Array[T] = js.native
  def unixifyPath(filePath: java.lang.String): java.lang.String = js.native
  def unixifyPath(filePath: java.lang.String, unescape: scala.Boolean): java.lang.String = js.native
  def values(`object`: js.Object): js.Array[_] = js.native
  def values(`object`: js.Object, options: adoneLib.adoneNs.utilNs.INs.KeysOptions): js.Array[_] = js.native
  def xrange(): stdLib.IterableIterator[scala.Double] = js.native
  def xrange(start: scala.Double): stdLib.IterableIterator[scala.Double] = js.native
  def xrange(start: scala.Double, stop: scala.Double): stdLib.IterableIterator[scala.Double] = js.native
  def xrange(start: scala.Double, stop: scala.Double, step: scala.Double): stdLib.IterableIterator[scala.Double] = js.native
  def zip(iterables: stdLib.Iterable[_]*): stdLib.IterableIterator[js.Array[_]] = js.native
  def zip[T1, T2](a: stdLib.Iterable[T1], b: stdLib.Iterable[T2]): stdLib.IterableIterator[js.Tuple2[T1, T2]] = js.native
  def zip[T1, T2, T3](a: stdLib.Iterable[T1], b: stdLib.Iterable[T2], c: stdLib.Iterable[T3]): stdLib.IterableIterator[js.Tuple3[T1, T2, T3]] = js.native
  def zip[T1, T2, T3, T4](a: stdLib.Iterable[T1], b: stdLib.Iterable[T2], c: stdLib.Iterable[T3], d: stdLib.Iterable[T4]): stdLib.IterableIterator[js.Tuple4[T1, T2, T3, T4]] = js.native
}

