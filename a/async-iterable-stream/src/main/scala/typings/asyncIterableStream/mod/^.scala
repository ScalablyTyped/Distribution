package typings.asyncIterableStream.mod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-iterable-stream", JSImport.Namespace)
@js.native
abstract class ^[T] () extends AsyncIterableStream[T] {
  /* CompleteClass */
  override def next(): js.Promise[IteratorResult[T, _]] = js.native
  /* CompleteClass */
  override def `return`(): Unit = js.native
}

