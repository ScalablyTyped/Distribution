package typings.async

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.async.anon.RetryOptionsaritynumberun
import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async", "all")
  @js.native
  def all[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "all")
  @js.native
  def all[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "allLimit")
  @js.native
  def allLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "allLimit")
  @js.native
  def allLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "allSeries")
  @js.native
  def allSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "allSeries")
  @js.native
  def allSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "any")
  @js.native
  def any[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "any")
  @js.native
  def any[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "anyLimit")
  @js.native
  def anyLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "anyLimit")
  @js.native
  def anyLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "anySeries")
  @js.native
  def anySeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "anySeries")
  @js.native
  def anySeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "apply")
  @js.native
  def apply[E](fn: js.Function, args: js.Any*): AsyncFunction[_, E] = js.native
  
  @JSImport("async", "applyEach")
  @js.native
  def applyEach(fns: js.Array[js.Function], argsAndCallback: js.Any*): Unit = js.native
  
  @JSImport("async", "applyEachSeries")
  @js.native
  def applyEachSeries(fns: js.Array[js.Function], argsAndCallback: js.Any*): Unit = js.native
  
  @JSImport("async", "asyncify")
  @js.native
  def asyncify(fn: js.Function): js.Function1[/* repeated */ js.Any, _] = js.native
  
  @JSImport("async", "auto")
  @js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E]): Unit = js.native
  @JSImport("async", "auto")
  @js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], callback: AsyncResultCallback[R, E]): Unit = js.native
  @JSImport("async", "auto")
  @js.native
  def auto[R /* <: Dictionary[_] */, E](
    tasks: AsyncAutoTasks[R, E],
    concurrency: js.UndefOr[scala.Nothing],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  @JSImport("async", "auto")
  @js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double): Unit = js.native
  @JSImport("async", "auto")
  @js.native
  def auto[R /* <: Dictionary[_] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double, callback: AsyncResultCallback[R, E]): Unit = js.native
  
  @JSImport("async", "autoInject")
  @js.native
  def autoInject[E](tasks: js.Any): Unit = js.native
  @JSImport("async", "autoInject")
  @js.native
  def autoInject[E](tasks: js.Any, callback: AsyncResultCallback[_, E]): Unit = js.native
  
  @JSImport("async", "cargo")
  @js.native
  def cargo[E](worker: js.Function2[/* tasks */ js.Array[_], /* callback */ ErrorCallback[E], Unit]): AsyncCargo = js.native
  @JSImport("async", "cargo")
  @js.native
  def cargo[E](
    worker: js.Function2[/* tasks */ js.Array[_], /* callback */ ErrorCallback[E], Unit],
    payload: Double
  ): AsyncCargo = js.native
  
  @JSImport("async", "compose")
  @js.native
  def compose(fns: js.Function*): js.Function = js.native
  
  @JSImport("async", "concat")
  @js.native
  def concat[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = js.native
  @JSImport("async", "concat")
  @js.native
  def concat[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "concatLimit")
  @js.native
  def concatLimit[T, R, E](arr: IterableCollection[T], limit: Double, iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = js.native
  @JSImport("async", "concatLimit")
  @js.native
  def concatLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "concatSeries")
  @js.native
  def concatSeries[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = js.native
  @JSImport("async", "concatSeries")
  @js.native
  def concatSeries[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "constant")
  @js.native
  def constant(values: js.Any*): AsyncFunction[_, Error] = js.native
  
  @JSImport("async", "detect")
  @js.native
  def detect[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "detect")
  @js.native
  def detect[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "detectLimit")
  @js.native
  def detectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "detectLimit")
  @js.native
  def detectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "detectSeries")
  @js.native
  def detectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "detectSeries")
  @js.native
  def detectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "dir")
  @js.native
  def dir(fn: js.Function, args: js.Any*): Unit = js.native
  
  @JSImport("async", "doDuring")
  @js.native
  def doDuring[E](
    fn: AsyncVoidFunction[E],
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    callback: ErrorCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "doUntil")
  @js.native
  def doUntil[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = js.native
  @JSImport("async", "doUntil")
  @js.native
  def doUntil[T, R, E](fn: AsyncFunctionEx[T, E], test: js.Function1[/* repeated */ T, Boolean]): js.Promise[R] = js.native
  
  @JSImport("async", "doWhilst")
  @js.native
  def doWhilst[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = js.native
  @JSImport("async", "doWhilst")
  @js.native
  def doWhilst[T, R, E](fn: AsyncFunctionEx[T, E], test: js.Function1[/* repeated */ T, Boolean]): js.Promise[R] = js.native
  
  @JSImport("async", "during")
  @js.native
  def during[E](
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "each")
  @js.native
  def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "each")
  @js.native
  def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "eachLimit")
  @js.native
  def eachLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "eachLimit")
  @js.native
  def eachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "eachOf")
  @js.native
  def eachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "eachOf")
  @js.native
  def eachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "eachOfLimit")
  @js.native
  def eachOfLimit[T, E](obj: IterableCollection[T], limit: Double, iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "eachOfLimit")
  @js.native
  def eachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "eachOfSeries")
  @js.native
  def eachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "eachOfSeries")
  @js.native
  def eachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "eachSeries")
  @js.native
  def eachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "eachSeries")
  @js.native
  def eachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "ensureAsync")
  @js.native
  def ensureAsync(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function = js.native
  
  @JSImport("async", "every")
  @js.native
  def every[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "every")
  @js.native
  def every[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "everyLimit")
  @js.native
  def everyLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "everyLimit")
  @js.native
  def everyLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "everySeries")
  @js.native
  def everySeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "everySeries")
  @js.native
  def everySeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "filter")
  @js.native
  def filter[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "filter")
  @js.native
  def filter[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "filterLimit")
  @js.native
  def filterLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "filterLimit")
  @js.native
  def filterLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "filterSeries")
  @js.native
  def filterSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "filterSeries")
  @js.native
  def filterSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "find")
  @js.native
  def find[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "find")
  @js.native
  def find[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "findLimit")
  @js.native
  def findLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "findLimit")
  @js.native
  def findLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "findSeries")
  @js.native
  def findSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "findSeries")
  @js.native
  def findSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "foldl")
  @js.native
  def foldl[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "foldl")
  @js.native
  def foldl[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  @JSImport("async", "foldl")
  @js.native
  def foldl[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "foldl")
  @js.native
  def foldl[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "foldr")
  @js.native
  def foldr[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "foldr")
  @js.native
  def foldr[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  @JSImport("async", "foldr")
  @js.native
  def foldr[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "foldr")
  @js.native
  def foldr[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "forEach")
  @js.native
  def forEach[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "forEach")
  @js.native
  def forEach[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "forEachLimit")
  @js.native
  def forEachLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "forEachLimit")
  @js.native
  def forEachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "forEachOf")
  @js.native
  def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "forEachOf")
  @js.native
  def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "forEachOfLimit")
  @js.native
  def forEachOfLimit[T, E](obj: IterableCollection[T], limit: Double, iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "forEachOfLimit")
  @js.native
  def forEachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "forEachOfSeries")
  @js.native
  def forEachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "forEachOfSeries")
  @js.native
  def forEachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "forEachSeries")
  @js.native
  def forEachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = js.native
  @JSImport("async", "forEachSeries")
  @js.native
  def forEachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "forever")
  @js.native
  def forever[E](next: js.Function1[/* next */ ErrorCallback[E], Unit], errBack: ErrorCallback[E]): Unit = js.native
  
  @JSImport("async", "inject")
  @js.native
  def inject[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "inject")
  @js.native
  def inject[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  @JSImport("async", "inject")
  @js.native
  def inject[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "inject")
  @js.native
  def inject[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "log")
  @js.native
  def log(fn: js.Function, args: js.Any*): Unit = js.native
  
  @JSImport("async", "map")
  @js.native
  def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = js.native
  @JSImport("async", "map")
  @js.native
  def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = js.native
  @JSImport("async", "map")
  @js.native
  def map[T, R, E](arr: Dictionary[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = js.native
  @JSImport("async", "map")
  @js.native
  def map[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  @JSImport("async", "map")
  @js.native
  def map[T, R, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = js.native
  @JSImport("async", "map")
  @js.native
  def map[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "mapLimit")
  @js.native
  def mapLimit[T, R, E](arr: IterableCollection[T], limit: Double, iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = js.native
  @JSImport("async", "mapLimit")
  @js.native
  def mapLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "mapSeries")
  @js.native
  def mapSeries[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = js.native
  @JSImport("async", "mapSeries")
  @js.native
  def mapSeries[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = js.native
  @JSImport("async", "mapSeries")
  @js.native
  def mapSeries[T, R, E](arr: Dictionary[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = js.native
  @JSImport("async", "mapSeries")
  @js.native
  def mapSeries[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  @JSImport("async", "mapSeries")
  @js.native
  def mapSeries[T, R, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = js.native
  @JSImport("async", "mapSeries")
  @js.native
  def mapSeries[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "mapValues")
  @js.native
  def mapValues[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = js.native
  @JSImport("async", "mapValues")
  @js.native
  def mapValues[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "mapValuesLimit")
  @js.native
  def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: Double,
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = js.native
  @JSImport("async", "mapValuesLimit")
  @js.native
  def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: Double,
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "mapValuesSeries")
  @js.native
  def mapValuesSeries[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = js.native
  @JSImport("async", "mapValuesSeries")
  @js.native
  def mapValuesSeries[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "memoize")
  @js.native
  def memoize(fn: js.Function): js.Function = js.native
  @JSImport("async", "memoize")
  @js.native
  def memoize(fn: js.Function, hasher: js.Function): js.Function = js.native
  
  @JSImport("async", "nextTick")
  @js.native
  def nextTick(callback: js.Function, args: js.Any*): Unit = js.native
  
  @JSImport("async", "parallel")
  @js.native
  def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = js.native
  @JSImport("async", "parallel")
  @js.native
  def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  @JSImport("async", "parallel")
  @js.native
  def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = js.native
  @JSImport("async", "parallel")
  @js.native
  def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = js.native
  
  @JSImport("async", "parallelLimit")
  @js.native
  def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): Unit = js.native
  @JSImport("async", "parallelLimit")
  @js.native
  def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double, callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  @JSImport("async", "parallelLimit")
  @js.native
  def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): Unit = js.native
  @JSImport("async", "parallelLimit")
  @js.native
  def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double, callback: AsyncResultObjectCallback[T, E]): Unit = js.native
  @JSImport("async", "parallelLimit")
  @js.native
  def parallelLimit_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): js.Promise[R] = js.native
  @JSImport("async", "parallelLimit")
  @js.native
  def parallelLimit_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): js.Promise[R] = js.native
  
  @JSImport("async", "parallel")
  @js.native
  def parallel_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]]): js.Promise[R] = js.native
  @JSImport("async", "parallel")
  @js.native
  def parallel_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]]): js.Promise[R] = js.native
  
  @JSImport("async", "priorityQueue")
  @js.native
  def priorityQueue[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncPriorityQueue[T] = js.native
  
  @JSImport("async", "queue")
  @js.native
  def queue[T, E](worker: AsyncWorker[T, E]): AsyncQueue[T] = js.native
  @JSImport("async", "queue")
  @js.native
  def queue[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncQueue[T] = js.native
  @JSImport("async", "queue")
  @js.native
  def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E]): AsyncQueue[T] = js.native
  @JSImport("async", "queue")
  @js.native
  def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E], concurrency: Double): AsyncQueue[T] = js.native
  
  @JSImport("async", "race")
  @js.native
  def race[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultCallback[T, E]): Unit = js.native
  
  @JSImport("async", "reduce")
  @js.native
  def reduce[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "reduce")
  @js.native
  def reduce[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  @JSImport("async", "reduce")
  @js.native
  def reduce[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "reduce")
  @js.native
  def reduce[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "reduceRight")
  @js.native
  def reduceRight[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "reduceRight")
  @js.native
  def reduceRight[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  @JSImport("async", "reduceRight")
  @js.native
  def reduceRight[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  @JSImport("async", "reduceRight")
  @js.native
  def reduceRight[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  
  @JSImport("async", "reflect")
  @js.native
  def reflect[T, E](fn: AsyncFunction[T, E]): js.Function1[
    /* callback */ js.Function2[/* err */ Null, /* result */ typings.async.anon.Error[E, T], Unit], 
    Unit
  ] = js.native
  
  @JSImport("async", "reflectAll")
  @js.native
  def reflectAll[T, E](tasks: js.Array[AsyncFunction[T, E]]): js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ Null, /* result */ typings.async.anon.Error[E, T], Unit], 
      Unit
    ]
  ] = js.native
  
  @JSImport("async", "reject")
  @js.native
  def reject[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "reject")
  @js.native
  def reject[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "rejectLimit")
  @js.native
  def rejectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "rejectLimit")
  @js.native
  def rejectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "rejectSeries")
  @js.native
  def rejectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "rejectSeries")
  @js.native
  def rejectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](): js.Promise[Unit] = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](
    opts: js.UndefOr[scala.Nothing],
    task: js.UndefOr[scala.Nothing],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](
    opts: js.UndefOr[scala.Nothing],
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](
    opts: js.UndefOr[scala.Nothing],
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](opts: Double): js.Promise[Unit] = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](opts: Double, task: js.UndefOr[scala.Nothing], callback: AsyncResultCallback[_, E]): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](opts: RetryOptions): js.Promise[Unit] = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](opts: RetryOptions, task: js.UndefOr[scala.Nothing], callback: AsyncResultCallback[_, E]): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](
    opts: RetryOptions,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  @JSImport("async", "retry")
  @js.native
  def retry[T, E](
    opts: RetryOptions,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[_, E]
  ): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry_TE_Unit[T, E](): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry_TE_Unit[T, E](
    opts: js.UndefOr[scala.Nothing],
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry_TE_Unit[T, E](opts: Double): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry_TE_Unit[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry_TE_Unit[T, E](opts: RetryOptions): Unit = js.native
  @JSImport("async", "retry")
  @js.native
  def retry_TE_Unit[T, E](
    opts: RetryOptions,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): Unit = js.native
  
  @JSImport("async", "retryable")
  @js.native
  def retryable[T, E](opts: Double, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  @JSImport("async", "retryable")
  @js.native
  def retryable[T, E](opts: RetryOptionsaritynumberun, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  @JSImport("async", "retryable")
  @js.native
  def retryable[T, E](task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  
  @JSImport("async", "select")
  @js.native
  def select[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "select")
  @js.native
  def select[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "selectLimit")
  @js.native
  def selectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "selectLimit")
  @js.native
  def selectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "selectSeries")
  @js.native
  def selectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = js.native
  @JSImport("async", "selectSeries")
  @js.native
  def selectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "seq")
  @js.native
  def seq(fns: js.Function*): js.Function = js.native
  
  @JSImport("async", "series")
  @js.native
  def series[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = js.native
  @JSImport("async", "series")
  @js.native
  def series[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  @JSImport("async", "series")
  @js.native
  def series[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = js.native
  @JSImport("async", "series")
  @js.native
  def series[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = js.native
  @JSImport("async", "series")
  @js.native
  def series_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]]): js.Promise[R] = js.native
  @JSImport("async", "series")
  @js.native
  def series_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]]): js.Promise[R] = js.native
  
  @JSImport("async", "setImmediate")
  @js.native
  val setImmediate: js.Function2[/* callback */ js.Function, /* repeated */ js.Any, Unit] = js.native
  
  @JSImport("async", "some")
  @js.native
  def some[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "some")
  @js.native
  def some[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "someLimit")
  @js.native
  def someLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "someLimit")
  @js.native
  def someLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "someSeries")
  @js.native
  def someSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  @JSImport("async", "someSeries")
  @js.native
  def someSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = js.native
  
  @JSImport("async", "sortBy")
  @js.native
  def sortBy[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E]): Unit = js.native
  @JSImport("async", "sortBy")
  @js.native
  def sortBy[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  @JSImport("async", "sortBy")
  @js.native
  def sortBy[T, V, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, V, E]): Unit = js.native
  @JSImport("async", "sortBy")
  @js.native
  def sortBy[T, V, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, V, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "timeout")
  @js.native
  def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: Double): AsyncFunction[T, E] = js.native
  @JSImport("async", "timeout")
  @js.native
  def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: Double, info: js.Any): AsyncFunction[T, E] = js.native
  @JSImport("async", "timeout")
  @js.native
  def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double): AsyncResultIterator[T, R, E] = js.native
  @JSImport("async", "timeout")
  @js.native
  def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double, info: js.Any): AsyncResultIterator[T, R, E] = js.native
  
  @JSImport("async", "times")
  @js.native
  def times[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = js.native
  @JSImport("async", "times")
  @js.native
  def times[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  
  @JSImport("async", "timesLimit")
  @js.native
  def timesLimit[T, E](n: Double, limit: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = js.native
  @JSImport("async", "timesLimit")
  @js.native
  def timesLimit[T, E](
    n: Double,
    limit: Double,
    iterator: AsyncResultIterator[Double, T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
  
  @JSImport("async", "timesSeries")
  @js.native
  def timesSeries[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = js.native
  @JSImport("async", "timesSeries")
  @js.native
  def timesSeries[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  
  @JSImport("async", "transform")
  @js.native
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
  @JSImport("async", "transform")
  @js.native
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
  @JSImport("async", "transform")
  @js.native
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
  @JSImport("async", "transform")
  @js.native
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
  @JSImport("async", "transform")
  @js.native
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
  @JSImport("async", "transform")
  @js.native
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
  @JSImport("async", "transform")
  @js.native
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
  @JSImport("async", "transform")
  @js.native
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
  
  @JSImport("async", "unmemoize")
  @js.native
  def unmemoize(fn: js.Function): js.Function = js.native
  
  @JSImport("async", "until")
  @js.native
  def until[E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): Unit = js.native
  @JSImport("async", "until")
  @js.native
  def until[R, E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E]): js.Promise[R] = js.native
  
  @JSImport("async", "waterfall")
  @js.native
  def waterfall[T, E](tasks: js.Array[js.Function]): Unit = js.native
  @JSImport("async", "waterfall")
  @js.native
  def waterfall[T, E](tasks: js.Array[js.Function], callback: AsyncResultCallback[T, E]): Unit = js.native
  
  @JSImport("async", "whilst")
  @js.native
  def whilst[E](
    test: js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* truth */ Boolean, Boolean], Boolean],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  @JSImport("async", "whilst")
  @js.native
  def whilst[R, E](
    test: js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* truth */ Boolean, Boolean], Boolean],
    fn: AsyncVoidFunction[E]
  ): js.Promise[R] = js.native
  
  @JSImport("async", "wrapSync")
  @js.native
  def wrapSync(fn: js.Function): js.Function = js.native
  
  type AsyncAutoTask[R1, R /* <: Dictionary[_] */, E] = (AsyncAutoTaskFunctionWithoutDependencies[R1, E]) | (js.Array[(/* keyof R */ String) | (AsyncAutoTaskFunction[R1, R, E])])
  
  type AsyncAutoTaskFunction[R1, R /* <: Dictionary[_] */, E] = js.Function2[/* results */ R, /* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], Unit]
  
  type AsyncAutoTaskFunctionWithoutDependencies[R1, E] = js.Function1[/* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], Unit]
  
  type AsyncAutoTasks[R /* <: Dictionary[_] */, E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof R ]: async.async.AsyncAutoTask<R[K], R, E>}
    */ typings.async.asyncStrings.AsyncAutoTasks with TopLevel[R]
  
  type AsyncBooleanIterator[T, E] = js.Function2[/* item */ T, /* callback */ AsyncBooleanResultCallback[E], Unit]
  
  type AsyncBooleanResultCallback[E] = js.Function2[/* err */ js.UndefOr[E | Null], /* truthValue */ js.UndefOr[Boolean], Unit]
  
  @js.native
  trait AsyncCargo extends StObject {
    
    /**
      * a function that sets a callback that is called when the last item from the queue has returned from the worker.
      * If the callback is omitted, q.drain() returns a promise for the next occurrence.
      */
    def drain(): js.Promise[Unit] = js.native
    def drain(handler: js.Function0[Unit]): Unit = js.native
    
    def empty(): Unit = js.native
    
    def idle(): Boolean = js.native
    
    def kill(): Unit = js.native
    
    def length(): Double = js.native
    
    def pause(): Unit = js.native
    
    var payload: js.UndefOr[Double] = js.native
    
    def push(task: js.Any): Unit = js.native
    def push(task: js.Any, callback: js.Function): Unit = js.native
    
    def resume(): Unit = js.native
    
    def saturated(): Unit = js.native
  }
  
  type AsyncForEachOfIterator[T, E] = js.Function3[/* item */ T, /* key */ Double | String, /* callback */ ErrorCallback[E], Unit]
  
  type AsyncFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | Null], /* result */ js.UndefOr[T], Unit], 
    Unit
  ]
  
  type AsyncFunctionEx[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | Null], /* repeated */ T, Unit], 
    Unit
  ]
  
  type AsyncIterator[T, E] = js.Function2[/* item */ T, /* callback */ ErrorCallback[E], Unit]
  
  type AsyncMemoIterator[T, R, E] = js.Function3[/* memo */ js.UndefOr[R], /* item */ T, /* callback */ AsyncResultCallback[R, E], Unit]
  
  @js.native
  trait AsyncPriorityQueue[T] extends StObject {
    
    var buffer: Double = js.native
    
    var concurrency: Double = js.native
    
    def drain(): js.Any = js.native
    
    def empty(): js.Any = js.native
    
    def error(error: Error, data: js.Any): Unit = js.native
    
    def idle(): Boolean = js.native
    
    def kill(): Unit = js.native
    
    def length(): Double = js.native
    
    def pause(): Unit = js.native
    
    var paused: Boolean = js.native
    
    def push[R, E](task: T, priority: Double): Unit = js.native
    def push[R, E](task: T, priority: Double, callback: AsyncResultArrayCallback[R, E]): Unit = js.native
    def push[R, E](task: js.Array[T], priority: Double): Unit = js.native
    def push[R, E](task: js.Array[T], priority: Double, callback: AsyncResultArrayCallback[R, E]): Unit = js.native
    
    def resume(): Unit = js.native
    
    def running(): Double = js.native
    
    def saturated(): js.Any = js.native
    
    var started: Boolean = js.native
    
    def unsaturated(): Unit = js.native
    
    def workersList[TWorker /* <: DataContainer[T] */, CallbackContainer, PriorityContainer](): js.Array[TWorker] = js.native
  }
  
  @js.native
  trait AsyncQueue[T] extends StObject {
    
    var buffer: Double = js.native
    
    var concurrency: Double = js.native
    
    def drain(): js.Promise[Unit] = js.native
    def drain(handler: js.Function0[Unit]): Unit = js.native
    
    def empty(): js.Promise[Unit] = js.native
    def empty(handler: js.Function0[Unit]): Unit = js.native
    
    def error(): js.Promise[Unit] = js.native
    def error(handler: js.Function2[/* error */ Error, /* task */ T, Unit]): Unit = js.native
    
    def idle(): Boolean = js.native
    
    def kill(): Unit = js.native
    
    def length(): Double = js.native
    
    def pause(): Unit = js.native
    
    var paused: Boolean = js.native
    
    def push[R, E](task: T): Unit = js.native
    def push[R, E](task: T, callback: AsyncResultCallback[R, E]): Unit = js.native
    def push[R, E](task: js.Array[T]): Unit = js.native
    def push[R, E](task: js.Array[T], callback: AsyncResultCallback[R, E]): Unit = js.native
    
    def remove(filter: js.Function1[/* node */ DataContainer[T], Boolean]): Unit = js.native
    
    def resume(): Unit = js.native
    
    def running(): Double = js.native
    
    def saturated(): js.Promise[Unit] = js.native
    def saturated(handler: js.Function0[Unit]): Unit = js.native
    
    var started: Boolean = js.native
    
    def unsaturated(): Unit = js.native
    
    def unshift[E](task: T): Unit = js.native
    def unshift[E](task: T, callback: ErrorCallback[E]): Unit = js.native
    def unshift[E](task: js.Array[T]): Unit = js.native
    def unshift[E](task: js.Array[T], callback: ErrorCallback[E]): Unit = js.native
    
    def workersList[TWorker /* <: DataContainer[T] */, CallbackContainer](): js.Array[TWorker] = js.native
  }
  
  type AsyncResultArrayCallback[T, E] = js.Function2[
    /* err */ js.UndefOr[E | Null], 
    /* results */ js.UndefOr[js.Array[js.UndefOr[T]]], 
    Unit
  ]
  
  type AsyncResultCallback[T, E] = js.Function2[/* err */ js.UndefOr[E | Null], /* result */ js.UndefOr[T], Unit]
  
  type AsyncResultIterator[T, R, E] = js.Function2[/* item */ T, /* callback */ AsyncResultCallback[R, E], Unit]
  
  type AsyncResultObjectCallback[T, E] = js.Function2[/* err */ js.UndefOr[E], /* results */ Dictionary[js.UndefOr[T]], Unit]
  
  type AsyncVoidFunction[E] = js.Function1[/* callback */ ErrorCallback[E], Unit]
  
  type AsyncWorker[T, E] = js.Function2[/* task */ T, /* callback */ ErrorCallback[E], Unit]
  
  @js.native
  trait CallbackContainer extends StObject {
    
    var callback: js.Function = js.native
  }
  object CallbackContainer {
    
    @scala.inline
    def apply(callback: js.Function): CallbackContainer = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackContainer]
    }
    
    @scala.inline
    implicit class CallbackContainerMutableBuilder[Self <: CallbackContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataContainer[T] extends StObject {
    
    var data: T = js.native
  }
  object DataContainer {
    
    @scala.inline
    def apply[T](data: T): DataContainer[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataContainer[T]]
    }
    
    @scala.inline
    implicit class DataContainerMutableBuilder[Self <: DataContainer[_], T] (val x: Self with DataContainer[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  type ErrorCallback[E] = js.Function1[/* err */ js.UndefOr[E | Null], Unit]
  
  type IterableCollection[T] = js.Array[T] | IterableIterator[T] | Dictionary[T]
  
  @js.native
  trait PriorityContainer extends StObject {
    
    var priority: Double = js.native
  }
  object PriorityContainer {
    
    @scala.inline
    def apply(priority: Double): PriorityContainer = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[PriorityContainer]
    }
    
    @scala.inline
    implicit class PriorityContainerMutableBuilder[Self <: PriorityContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RetryOptions extends StObject {
    
    var errorFilter: js.UndefOr[js.Function1[/* error */ Error, Boolean]] = js.native
    
    var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.native
    
    var times: js.UndefOr[Double] = js.native
  }
  object RetryOptions {
    
    @scala.inline
    def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    @scala.inline
    implicit class RetryOptionsMutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorFilter(value: /* error */ Error => Boolean): Self = StObject.set(x, "errorFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorFilterUndefined: Self = StObject.set(x, "errorFilter", js.undefined)
      
      @scala.inline
      def setInterval(value: Double | (js.Function1[/* retryCount */ Double, Double])): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalFunction1(value: /* retryCount */ Double => Double): Self = StObject.set(x, "interval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setTimes(value: Double): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
}
