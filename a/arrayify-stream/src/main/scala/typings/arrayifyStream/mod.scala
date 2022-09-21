package typings.arrayifyStream

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts a Node readable stream into an array that is returned as a promise.
    */
  inline def apply(input: EventEmitter): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  
  @JSImport("arrayify-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
