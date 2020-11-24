package typings.asynciterator.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asynciterator", "wrap")
@js.native
object wrap extends js.Object {
  
  def apply[T](source: js.Promise[EventEmitter]): TransformIterator[T, T] = js.native
  def apply[T](source: js.Promise[EventEmitter], options: TransformIteratorOptions[T]): TransformIterator[T, T] = js.native
  def apply[T](source: EventEmitter): TransformIterator[T, T] = js.native
  def apply[T](source: EventEmitter, options: TransformIteratorOptions[T]): TransformIterator[T, T] = js.native
}
