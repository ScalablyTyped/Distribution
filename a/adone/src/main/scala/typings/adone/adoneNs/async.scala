package typings.adone.adoneNs

import org.scalablytyped.runtime.StringDictionary
import typings.async.Anon_Error
import typings.async.Anon_ErrorValue
import typings.async.Anon_Interval
import typings.async.asyncMod.AsyncAutoTasks
import typings.async.asyncMod.AsyncBooleanIterator
import typings.async.asyncMod.AsyncBooleanResultCallback
import typings.async.asyncMod.AsyncCargo
import typings.async.asyncMod.AsyncForEachOfIterator
import typings.async.asyncMod.AsyncFunction
import typings.async.asyncMod.AsyncFunctionEx
import typings.async.asyncMod.AsyncIterator
import typings.async.asyncMod.AsyncMemoIterator
import typings.async.asyncMod.AsyncPriorityQueue
import typings.async.asyncMod.AsyncQueue
import typings.async.asyncMod.AsyncResultArrayCallback
import typings.async.asyncMod.AsyncResultCallback
import typings.async.asyncMod.AsyncResultIterator
import typings.async.asyncMod.AsyncResultObjectCallback
import typings.async.asyncMod.AsyncVoidFunction
import typings.async.asyncMod.AsyncWorker
import typings.async.asyncMod.Dictionary
import typings.async.asyncMod.ErrorCallback
import typings.async.asyncMod.IterableCollection
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.async")
@js.native
object async extends js.Object {
  def all[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def all[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def allLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def allLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def allSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def allSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def any[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def any[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def anyLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def anyLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def anySeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def anySeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  @JSName("apply")
  def apply[E](fn: js.Function, args: js.Any*): AsyncFunction[_, E] = js.native
  def applyEach(fns: js.Array[js.Function], argsAndCallback: js.Any*): Unit = js.native
  def applyEachSeries(fns: js.Array[js.Function], argsAndCallback: js.Any*): Unit = js.native
  def asyncify(fn: js.Function): js.Function1[/* repeated */ js.Any, _] = js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E]): Unit = js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], callback: AsyncResultCallback[R, E]): Unit = js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double): Unit = js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double, callback: AsyncResultCallback[R, E]): Unit = js.native
  def autoInject[E](tasks: js.Any): Unit = js.native
  def autoInject[E](tasks: js.Any, callback: AsyncResultCallback[_, E]): Unit = js.native
  def cargo[E](worker: js.Function2[/* tasks */ js.Array[_], /* callback */ ErrorCallback[E], Unit]): AsyncCargo = js.native
  def cargo[E](
    worker: js.Function2[/* tasks */ js.Array[_], /* callback */ ErrorCallback[E], Unit],
    payload: Double
  ): AsyncCargo = js.native
  def compose(fns: js.Function*): js.Function = js.native
  def concat[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = js.native
  def concat[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def concatLimit[T, R, E](arr: IterableCollection[T], limit: Double, iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = js.native
  def concatLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def concatSeries[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = js.native
  def concatSeries[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def constant(values: js.Any*): js.Function = js.native
  def detect[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def detect[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  def detectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def detectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  def detectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def detectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  def dir(fn: js.Function, args: js.Any*): Unit = js.native
  def doDuring[E](
    fn: AsyncVoidFunction[E],
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def doUntil[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def doWhilst[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def during[E](
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): Unit = js.native
  def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def eachLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncIterator[T, E]): Unit = js.native
  def eachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def eachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def eachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def eachOfLimit[T, E](obj: IterableCollection[T], limit: Double, iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def eachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def eachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def eachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def eachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): Unit = js.native
  def eachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def ensureAsync(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function = js.native
  def every[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def every[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def everyLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def everyLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def everySeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def everySeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def filter[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def filter[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def filterLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def filterLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def filterSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def filterSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def find[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def find[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  def findLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def findLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  def findSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def findSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  def foldl[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def foldl[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def foldl[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def foldl[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def foldr[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def foldr[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def foldr[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def foldr[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def forEach[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): Unit = js.native
  def forEach[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def forEachLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncIterator[T, E]): Unit = js.native
  def forEachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def forEachOfLimit[T, E](obj: IterableCollection[T], limit: Double, iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def forEachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def forEachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def forEachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def forEachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): Unit = js.native
  def forEachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  def forever[E](next: js.Function1[/* next */ ErrorCallback[E], Unit], errBack: ErrorCallback[E]): Unit = js.native
  def inject[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def inject[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def inject[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def inject[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def log(fn: js.Function, args: js.Any*): Unit = js.native
  def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[R] = js.native
  def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = js.native
  def map[T, R, E](arr: Dictionary[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[R] = js.native
  def map[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def map[T, R, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[R] = js.native
  def map[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def mapLimit[T, R, E](arr: IterableCollection[T], limit: Double, iterator: AsyncResultIterator[T, R, E]): js.Promise[R] = js.native
  def mapLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def mapSeries[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[R] = js.native
  def mapSeries[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = js.native
  def mapSeries[T, R, E](arr: Dictionary[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[R] = js.native
  def mapSeries[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def mapSeries[T, R, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[R] = js.native
  def mapSeries[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  def mapValues[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = js.native
  def mapValues[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = js.native
  def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: Double,
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = js.native
  def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: Double,
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = js.native
  def mapValuesSeries[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = js.native
  def mapValuesSeries[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = js.native
  def memoize(fn: js.Function): js.Function = js.native
  def memoize(fn: js.Function, hasher: js.Function): js.Function = js.native
  def nextTick(callback: js.Function, args: js.Any*): Unit = js.native
  def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = js.native
  def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = js.native
  def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = js.native
  def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): Unit = js.native
  def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double, callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): Unit = js.native
  def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double, callback: AsyncResultObjectCallback[T, E]): Unit = js.native
  def priorityQueue[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncPriorityQueue[T] = js.native
  def queue[T, E](worker: AsyncWorker[T, E]): AsyncQueue[T] = js.native
  def queue[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E]): AsyncQueue[T] = js.native
  @JSName("queue")
  def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E], concurrency: Double): AsyncQueue[T] = js.native
  def race[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultCallback[T, E]): Unit = js.native
  def reduce[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def reduce[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def reduce[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def reduce[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def reduceRight[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def reduceRight[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def reduceRight[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def reduceRight[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def reflect[T, E](fn: AsyncFunction[T, E]): js.Function1[
    /* callback */ js.Function2[/* err */ Null, /* result */ Anon_ErrorValue[E, T], Unit], 
    Unit
  ] = js.native
  def reflectAll[T, E](tasks: js.Array[AsyncFunction[T, E]]): js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ Null, /* result */ Anon_ErrorValue[E, T], Unit], 
      Unit
    ]
  ] = js.native
  def reject[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def reject[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def rejectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def rejectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def rejectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def rejectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def retry[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
  def retry[T, E](
    opts: Anon_Error,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
  def retryable[T, E](opts: Double, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  def retryable[T, E](opts: Anon_Interval, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  def select[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def select[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def selectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def selectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def selectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def selectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def seq(fns: js.Function*): js.Function = js.native
  def series[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = js.native
  def series[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def series[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = js.native
  def series[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = js.native
  def setImmediate(callback: js.Function, args: js.Any*): Unit = js.native
  def some[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def some[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def someLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def someLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def someSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def someSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  def sortBy[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E]): Unit = js.native
  def sortBy[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def sortBy[T, V, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, V, E]): Unit = js.native
  def sortBy[T, V, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, V, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: Double): AsyncFunction[T, E] = js.native
  def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: Double, info: js.Any): AsyncFunction[T, E] = js.native
  def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double): AsyncResultIterator[T, R, E] = js.native
  def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double, info: js.Any): AsyncResultIterator[T, R, E] = js.native
  def times[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def timesLimit[T, E](
    n: Double,
    limit: Double,
    iterator: AsyncResultIterator[Double, T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def timesSeries[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    acc: js.Array[R],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = js.native
  def transform[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  def transform[T, R, E](
    arr: StringDictionary[T],
    acc: StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = js.native
  def transform[T, R, E](
    arr: StringDictionary[T],
    acc: StringDictionary[R],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultObjectCallback[T, E]
  ): Unit = js.native
  def transform[T, R, E](
    arr: StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = js.native
  def transform[T, R, E](
    arr: StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ],
    callback: AsyncResultObjectCallback[T, E]
  ): Unit = js.native
  def unmemoize(fn: js.Function): js.Function = js.native
  def until[E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function]): Unit = js.native
  def waterfall[T, E](tasks: js.Array[js.Function], callback: AsyncResultCallback[T, E]): Unit = js.native
  def whilst[E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): Unit = js.native
  def wrapSync(fn: js.Function): js.Function = js.native
}

