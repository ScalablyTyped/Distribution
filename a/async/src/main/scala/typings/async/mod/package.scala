package typings.async

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncAutoTask[R1, R /* <: typings.async.mod.Dictionary[_] */, E] = (typings.async.mod.AsyncAutoTaskFunctionWithoutDependencies[R1, E]) | (js.Array[java.lang.String | (typings.async.mod.AsyncAutoTaskFunction[R1, R, E])])
  type AsyncAutoTaskFunction[R1, R /* <: typings.async.mod.Dictionary[_] */, E] = js.Function2[
    /* results */ R, 
    /* cb */ (typings.async.mod.AsyncResultCallback[R1, E]) | typings.async.mod.ErrorCallback[E], 
    scala.Unit
  ]
  type AsyncAutoTaskFunctionWithoutDependencies[R1, E] = js.Function1[
    /* cb */ (typings.async.mod.AsyncResultCallback[R1, E]) | typings.async.mod.ErrorCallback[E], 
    scala.Unit
  ]
  type AsyncAutoTasks[R /* <: typings.async.mod.Dictionary[_] */, E] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof R ]: async.async.AsyncAutoTask<R[K], R, E>}
    */ typings.async.asyncStrings.AsyncAutoTasks with R
  type AsyncBooleanIterator[T, E] = js.Function2[
    /* item */ T, 
    /* callback */ typings.async.mod.AsyncBooleanResultCallback[E], 
    scala.Unit
  ]
  type AsyncBooleanResultCallback[E] = js.Function2[
    /* err */ js.UndefOr[E | scala.Null], 
    /* truthValue */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  type AsyncForEachOfIterator[T, E] = js.Function3[
    /* item */ T, 
    /* key */ scala.Double | java.lang.String, 
    /* callback */ typings.async.mod.ErrorCallback[E], 
    scala.Unit
  ]
  type AsyncFunction[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | scala.Null], /* result */ js.UndefOr[T], scala.Unit], 
    scala.Unit
  ]
  type AsyncFunctionEx[T, E] = js.Function1[
    /* callback */ js.Function2[/* err */ js.UndefOr[E | scala.Null], /* repeated */ T, scala.Unit], 
    scala.Unit
  ]
  type AsyncIterator[T, E] = js.Function2[/* item */ T, /* callback */ typings.async.mod.ErrorCallback[E], scala.Unit]
  type AsyncMemoIterator[T, R, E] = js.Function3[
    /* memo */ js.UndefOr[R], 
    /* item */ T, 
    /* callback */ typings.async.mod.AsyncResultCallback[R, E], 
    scala.Unit
  ]
  type AsyncResultArrayCallback[T, E] = js.Function2[
    /* err */ js.UndefOr[E | scala.Null], 
    /* results */ js.UndefOr[js.Array[js.UndefOr[T]]], 
    scala.Unit
  ]
  type AsyncResultCallback[T, E] = js.Function2[/* err */ js.UndefOr[E | scala.Null], /* result */ js.UndefOr[T], scala.Unit]
  type AsyncResultIterator[T, R, E] = js.Function2[/* item */ T, /* callback */ typings.async.mod.AsyncResultCallback[R, E], scala.Unit]
  type AsyncResultObjectCallback[T, E] = js.Function2[
    /* err */ js.UndefOr[E], 
    /* results */ typings.async.mod.Dictionary[js.UndefOr[T]], 
    scala.Unit
  ]
  type AsyncVoidFunction[E] = js.Function1[/* callback */ typings.async.mod.ErrorCallback[E], scala.Unit]
  type AsyncWorker[T, E] = js.Function2[/* task */ T, /* callback */ typings.async.mod.ErrorCallback[E], scala.Unit]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ErrorCallback[E] = js.Function1[/* err */ js.UndefOr[E | scala.Null], scala.Unit]
  type IterableCollection[T] = js.Array[T] | typings.std.IterableIterator[T] | typings.async.mod.Dictionary[T]
}
