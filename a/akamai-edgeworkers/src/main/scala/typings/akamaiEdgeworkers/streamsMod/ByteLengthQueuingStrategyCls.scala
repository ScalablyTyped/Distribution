package typings.akamaiEdgeworkers.streamsMod

import typings.akamaiEdgeworkers.anon.HighWaterMark
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("streams", "ByteLengthQueuingStrategy")
@js.native
class ByteLengthQueuingStrategyCls protected ()
  extends StObject
     with ByteLengthQueuingStrategy {
  def this(options: HighWaterMark) = this()
  
  /* CompleteClass */
  @JSName("highWaterMark")
  var highWaterMark_ByteLengthQueuingStrategy: Double = js.native
  
  /* CompleteClass */
  @JSName("size")
  override def size_MByteLengthQueuingStrategy(chunk: ArrayBufferView): Double = js.native
}
