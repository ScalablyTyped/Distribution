package typings.arrayifyStream

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts a Node readable stream into an array that is returned as a promise.
    */
  @scala.inline
  def apply(input: Readable): js.Promise[js.Array[js.Any]] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[js.Any]]]
  
  @JSImport("arrayify-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
