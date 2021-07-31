package typings.async

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.async.anon.RetryOptionsaritynumberun
import typings.std.Error
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def all[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def all[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def allLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def allLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def allSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def allSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def any[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def any[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("any")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def anyLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anyLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def anyLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anyLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def anySeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anySeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def anySeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("anySeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def apply[E](fn: js.Function, args: js.Any*): AsyncFunction[js.Any, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[js.Any, E]]
  
  @scala.inline
  def applyEach(fns: js.Array[js.Function], argsAndCallback: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEach")(fns.asInstanceOf[js.Any], argsAndCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def applyEachSeries(fns: js.Array[js.Function], argsAndCallback: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEachSeries")(fns.asInstanceOf[js.Any], argsAndCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def asyncify(fn: js.Function): js.Function1[/* repeated */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncify")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ js.Any, js.Any]]
  
  @scala.inline
  def auto[R /* <: Dictionary[js.Any] */, E](tasks: AsyncAutoTasks[R, E]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def auto[R /* <: Dictionary[js.Any] */, E](tasks: AsyncAutoTasks[R, E], callback: AsyncResultCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def auto[R /* <: Dictionary[js.Any] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def auto[R /* <: Dictionary[js.Any] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Double, callback: AsyncResultCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def auto[R /* <: Dictionary[js.Any] */, E](tasks: AsyncAutoTasks[R, E], concurrency: Unit, callback: AsyncResultCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("auto")(tasks.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def autoInject[E](tasks: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("autoInject")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def autoInject[E](tasks: js.Any, callback: AsyncResultCallback[js.Any, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoInject")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def cargo[E](worker: js.Function2[/* tasks */ js.Array[js.Any], /* callback */ ErrorCallback[E], Unit]): AsyncCargo = ^.asInstanceOf[js.Dynamic].applyDynamic("cargo")(worker.asInstanceOf[js.Any]).asInstanceOf[AsyncCargo]
  @scala.inline
  def cargo[E](
    worker: js.Function2[/* tasks */ js.Array[js.Any], /* callback */ ErrorCallback[E], Unit],
    payload: Double
  ): AsyncCargo = (^.asInstanceOf[js.Dynamic].applyDynamic("cargo")(worker.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[AsyncCargo]
  
  @scala.inline
  def compose(fns: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(fns.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def concat[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def concat[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def concatLimit[T, R, E](arr: IterableCollection[T], limit: Double, iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concatLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def concatLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concatLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def concatSeries[T, R, E](arr: IterableCollection[T], iterator: AsyncResultIterator[T, js.Array[R], E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concatSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def concatSeries[T, R, E](
    arr: IterableCollection[T],
    iterator: AsyncResultIterator[T, js.Array[R], E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("concatSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def constant(values: js.Any*): AsyncFunction[js.Any, Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(values.asInstanceOf[js.Any]).asInstanceOf[AsyncFunction[js.Any, Error]]
  
  @scala.inline
  def detect[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def detect[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detect")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def detectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def detectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def detectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def detectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def dir(fn: js.Function, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dir")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def doDuring[E](
    fn: AsyncVoidFunction[E],
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doDuring")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def doUntil[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doUntil")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doUntil[T, R, E](fn: AsyncFunctionEx[T, E], test: js.Function1[/* repeated */ T, Boolean]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("doUntil")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  @scala.inline
  def doWhilst[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doWhilst")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def doWhilst[T, R, E](fn: AsyncFunctionEx[T, E], test: js.Function1[/* repeated */ T, Boolean]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("doWhilst")(fn.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  @scala.inline
  def during[E](
    test: js.Function1[/* testCallback */ AsyncBooleanResultCallback[E], Unit],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("during")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def each[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def eachLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def eachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def eachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOf")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def eachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOf")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def eachOfLimit[T, E](obj: IterableCollection[T], limit: Double, iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOfLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def eachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOfLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def eachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOfSeries")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def eachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachOfSeries")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def eachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def eachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("eachSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ensureAsync(fn: js.Function1[/* repeated */ js.Any, Unit]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def every[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def every[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def everyLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("everyLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def everyLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("everyLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def everySeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("everySeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def everySeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("everySeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def filter[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def filter[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def filterLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def filterLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def filterSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def filterSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("filterSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def find[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def find[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def findLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def findLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def findSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def findSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def foldl[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def foldl[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def foldl[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def foldl[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldl")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def foldr[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def foldr[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def foldr[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def foldr[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("foldr")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def forEach[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forEach[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def forEachLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forEachLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOf")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forEachOf[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOf")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def forEachOfLimit[T, E](obj: IterableCollection[T], limit: Double, iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOfLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forEachOfLimit[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOfLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def forEachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOfSeries")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forEachOfSeries[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachOfSeries")(obj.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def forEachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def forEachSeries[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def forever[E](next: js.Function1[/* next */ ErrorCallback[E], Unit], errBack: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forever")(next.asInstanceOf[js.Any], errBack.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def inject[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def inject[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def inject[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def inject[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def log(fn: js.Function, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(fn.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  @scala.inline
  def map[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def map[T, R, E](arr: Dictionary[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  @scala.inline
  def map[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def map[T, R, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  @scala.inline
  def map[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mapLimit[T, R, E](arr: IterableCollection[T], limit: Double, iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  @scala.inline
  def mapLimit[T, R, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mapSeries[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  @scala.inline
  def mapSeries[T, R, E](arr: js.Array[T], iterator: AsyncResultIterator[T, R, E], callback: AsyncResultArrayCallback[R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mapSeries[T, R, E](arr: Dictionary[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  @scala.inline
  def mapSeries[T, R, E](
    arr: Dictionary[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mapSeries[T, R, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, R, E]): js.Promise[js.Array[R]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[R]]]
  @scala.inline
  def mapSeries[T, R, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, R, E],
    callback: AsyncResultArrayCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mapValues[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(obj.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  @scala.inline
  def mapValues[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(obj.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: Double,
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValuesLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  @scala.inline
  def mapValuesLimit[T, R, E](
    obj: Dictionary[T],
    limit: Double,
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValuesLimit")(obj.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mapValuesSeries[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValuesSeries")(obj.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  @scala.inline
  def mapValuesSeries[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValuesSeries")(obj.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def memoize(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  @scala.inline
  def memoize(fn: js.Function, hasher: js.Function): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("memoize")(fn.asInstanceOf[js.Any], hasher.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def nextTick(callback: js.Function, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def parallel[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def parallel[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def parallelLimit[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double, callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def parallelLimit[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double, callback: AsyncResultObjectCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parallelLimit_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  @scala.inline
  def parallelLimit_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("parallelLimit")(tasks.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  @scala.inline
  def parallel_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  @scala.inline
  def parallel_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("parallel")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  
  @scala.inline
  def priorityQueue[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncPriorityQueue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("priorityQueue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[AsyncPriorityQueue[T]]
  
  @scala.inline
  def queue[T, E](worker: AsyncWorker[T, E]): AsyncQueue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any]).asInstanceOf[AsyncQueue[T]]
  @scala.inline
  def queue[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncQueue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[AsyncQueue[T]]
  
  @scala.inline
  def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E]): AsyncQueue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any]).asInstanceOf[AsyncQueue[T]]
  @scala.inline
  def queue_TRE[T, R, E](worker: AsyncResultIterator[T, R, E], concurrency: Double): AsyncQueue[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("queue")(worker.asInstanceOf[js.Any], concurrency.asInstanceOf[js.Any])).asInstanceOf[AsyncQueue[T]]
  
  @scala.inline
  def race[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("race")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reduce[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reduce[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reduce[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reduce[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reduceRight[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reduceRight[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reduceRight[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def reduceRight[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceRight")(arr.asInstanceOf[js.Any], memo.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def reflect[T, E](fn: AsyncFunction[T, E]): js.Function1[
    /* callback */ js.Function2[/* err */ Null, /* result */ typings.async.anon.Error[E, T], Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflect")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* callback */ js.Function2[/* err */ Null, /* result */ typings.async.anon.Error[E, T], Unit], 
    Unit
  ]]
  
  @scala.inline
  def reflectAll[T, E](tasks: js.Array[AsyncFunction[T, E]]): js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ Null, /* result */ typings.async.anon.Error[E, T], Unit], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("reflectAll")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    js.Function1[
      /* callback */ js.Function2[/* err */ Null, /* result */ typings.async.anon.Error[E, T], Unit], 
      Unit
    ]
  ]]
  
  @scala.inline
  def reject[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def reject[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reject")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def rejectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def rejectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def rejectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def rejectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rejectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def retry[T, E](): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def retry[T, E](opts: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def retry[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def retry[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[js.Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def retry[T, E](opts: Double, task: Unit, callback: AsyncResultCallback[js.Any, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def retry[T, E](
    opts: Unit,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def retry[T, E](
    opts: Unit,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[js.Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def retry[T, E](opts: Unit, task: Unit, callback: AsyncResultCallback[js.Any, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def retry[T, E](opts: RetryOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def retry[T, E](
    opts: RetryOptions,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def retry[T, E](
    opts: RetryOptions,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit],
    callback: AsyncResultCallback[js.Any, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def retry[T, E](opts: RetryOptions, task: Unit, callback: AsyncResultCallback[js.Any, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def retry_TE_Unit[T, E](): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[Unit]
  @scala.inline
  def retry_TE_Unit[T, E](opts: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def retry_TE_Unit[T, E](
    opts: Double,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def retry_TE_Unit[T, E](
    opts: Unit,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def retry_TE_Unit[T, E](opts: RetryOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def retry_TE_Unit[T, E](
    opts: RetryOptions,
    task: js.Function2[/* callback */ AsyncResultCallback[T, E], /* results */ js.Any, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("retry")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def retryable[T, E](opts: Double, task: AsyncFunction[T, E]): AsyncFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryable")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[T, E]]
  @scala.inline
  def retryable[T, E](opts: RetryOptionsaritynumberun, task: AsyncFunction[T, E]): AsyncFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryable")(opts.asInstanceOf[js.Any], task.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[T, E]]
  @scala.inline
  def retryable[T, E](task: AsyncFunction[T, E]): AsyncFunction[T, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryable")(task.asInstanceOf[js.Any]).asInstanceOf[AsyncFunction[T, E]]
  
  @scala.inline
  def select[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def select[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def selectLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def selectLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def selectSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): js.Promise[js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[T]]]
  @scala.inline
  def selectSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("selectSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def seq(fns: js.Function*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("seq")(fns.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def series[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def series[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def series[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def series[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def series_TRE_Promise[T, R, E](tasks: js.Array[AsyncFunction[T, E]]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  @scala.inline
  def series_TRE_Promise[T, R, E](tasks: Dictionary[AsyncFunction[T, E]]): js.Promise[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("series")(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[R]]
  
  @JSImport("async", "setImmediate")
  @js.native
  val setImmediate: js.Function2[/* callback */ js.Function, /* repeated */ js.Any, Unit] = js.native
  
  @scala.inline
  def some[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def some[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def someLimit[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("someLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def someLimit[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("someLimit")(arr.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def someSeries[T, E](arr: IterableCollection[T], iterator: AsyncBooleanIterator[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("someSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def someSeries[T, E](
    arr: IterableCollection[T],
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncBooleanResultCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("someSeries")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def sortBy[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sortBy[T, V, E](arr: js.Array[T], iterator: AsyncResultIterator[T, V, E], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sortBy[T, V, E](arr: IterableIterator[T], iterator: AsyncResultIterator[T, V, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def sortBy[T, V, E](
    arr: IterableIterator[T],
    iterator: AsyncResultIterator[T, V, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(arr.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: Double): AsyncFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(fn.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[T, E]]
  @scala.inline
  def timeout[T, E](fn: AsyncFunction[T, E], milliseconds: Double, info: js.Any): AsyncFunction[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(fn.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[AsyncFunction[T, E]]
  @scala.inline
  def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double): AsyncResultIterator[T, R, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(fn.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any])).asInstanceOf[AsyncResultIterator[T, R, E]]
  @scala.inline
  def timeout[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double, info: js.Any): AsyncResultIterator[T, R, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(fn.asInstanceOf[js.Any], milliseconds.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[AsyncResultIterator[T, R, E]]
  
  @scala.inline
  def times[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(n.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def times[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(n.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def timesLimit[T, E](n: Double, limit: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timesLimit")(n.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def timesLimit[T, E](
    n: Double,
    limit: Double,
    iterator: AsyncResultIterator[Double, T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timesLimit")(n.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def timesSeries[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E]): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("timesSeries")(n.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  @scala.inline
  def timesSeries[T, E](n: Double, iterator: AsyncResultIterator[Double, T, E], callback: AsyncResultArrayCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timesSeries")(n.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def transform[T, R, E](
    arr: js.Array[T],
    iteratee: js.Function4[
      /* acc */ js.Array[R], 
      /* item */ T, 
      /* key */ Double, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], acc.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def transform[T, R, E](
    arr: StringDictionary[T],
    iteratee: js.Function4[
      /* acc */ StringDictionary[R], 
      /* item */ T, 
      /* key */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[E], Unit], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
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
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(arr.asInstanceOf[js.Any], iteratee.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unmemoize(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("unmemoize")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def until[E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("until")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def until[R, E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E]): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("until")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  @scala.inline
  def waterfall[T, E](tasks: js.Array[js.Function]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("waterfall")(tasks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def waterfall[T, E](tasks: js.Array[js.Function], callback: AsyncResultCallback[T, E]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("waterfall")(tasks.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def whilst[E](
    test: js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* truth */ Boolean, Boolean], Boolean],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("whilst")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def whilst[R, E](
    test: js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* truth */ Boolean, Boolean], Boolean],
    fn: AsyncVoidFunction[E]
  ): js.Promise[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("whilst")(test.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[R]]
  
  @scala.inline
  def wrapSync(fn: js.Function): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapSync")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  type AsyncAutoTask[R1, R /* <: Dictionary[js.Any] */, E] = (AsyncAutoTaskFunctionWithoutDependencies[R1, E]) | (js.Array[(/* keyof R */ String) | (AsyncAutoTaskFunction[R1, R, E])])
  
  type AsyncAutoTaskFunction[R1, R /* <: Dictionary[js.Any] */, E] = js.Function2[/* results */ R, /* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], Unit]
  
  type AsyncAutoTaskFunctionWithoutDependencies[R1, E] = js.Function1[/* cb */ (AsyncResultCallback[R1, E]) | ErrorCallback[E], Unit]
  
  type AsyncAutoTasks[R /* <: Dictionary[js.Any] */, E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof R ]: async.async.AsyncAutoTask<R[K], R, E>}
    */ typings.async.asyncStrings.AsyncAutoTasks & TopLevel[R]
  
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
  
  trait CallbackContainer extends StObject {
    
    var callback: js.Function
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
  
  trait DataContainer[T] extends StObject {
    
    var data: T
  }
  object DataContainer {
    
    @scala.inline
    def apply[T](data: T): DataContainer[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataContainer[T]]
    }
    
    @scala.inline
    implicit class DataContainerMutableBuilder[Self <: DataContainer[?], T] (val x: Self & DataContainer[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  type ErrorCallback[E] = js.Function1[/* err */ js.UndefOr[E | Null], Unit]
  
  type IterableCollection[T] = js.Array[T] | IterableIterator[T] | Dictionary[T]
  
  trait PriorityContainer extends StObject {
    
    var priority: Double
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
  
  trait RetryOptions extends StObject {
    
    var errorFilter: js.UndefOr[js.Function1[/* error */ Error, Boolean]] = js.undefined
    
    var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.undefined
    
    var times: js.UndefOr[Double] = js.undefined
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
