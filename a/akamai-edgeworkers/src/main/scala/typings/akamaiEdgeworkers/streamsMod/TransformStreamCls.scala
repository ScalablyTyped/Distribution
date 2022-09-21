package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("streams", "TransformStream")
@js.native
open class TransformStreamCls[I, O] ()
  extends StObject
     with TransformStream[I, O] {
  def this(transformer: Transformer[I, O]) = this()
  def this(transformer: Unit, writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: QueuingStrategy[I]) = this()
  def this(transformer: Unit, writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
  def this(transformer: Unit, writableStrategy: QueuingStrategy[I], readableStrategy: QueuingStrategy[O]) = this()
  def this(transformer: Transformer[I, O], writableStrategy: Unit, readableStrategy: QueuingStrategy[O]) = this()
  def this(
    transformer: Transformer[I, O],
    writableStrategy: QueuingStrategy[I],
    readableStrategy: QueuingStrategy[O]
  ) = this()
  
  /* CompleteClass */
  override val readable: ReadableStream[O] = js.native
  
  /* CompleteClass */
  override val writable: WritableStream[I] = js.native
}
