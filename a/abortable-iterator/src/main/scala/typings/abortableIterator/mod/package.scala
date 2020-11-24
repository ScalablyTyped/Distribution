package typings.abortableIterator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Signals[T] = js.Array[typings.abortableIterator.anon.Options[T]]
  
  type Sink_[TSource, TReturn] = js.Function1[/* source */ typings.abortableIterator.mod.Source_[TSource], TReturn]
  
  type Source_[T] = typings.std.AsyncIterable[T] | typings.std.Iterable[T]
  
  type Transform_[TSourceIn, TSourceOut] = js.Function1[
    /* source */ typings.abortableIterator.mod.Source_[TSourceIn], 
    typings.abortableIterator.mod.Source_[TSourceOut]
  ]
}
