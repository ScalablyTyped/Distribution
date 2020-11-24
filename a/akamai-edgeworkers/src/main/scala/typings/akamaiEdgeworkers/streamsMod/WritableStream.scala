package typings.akamaiEdgeworkers.streamsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableStream[W] extends js.Object {
  
  def abort(): js.Promise[Unit] = js.native
  def abort(reason: js.Any): js.Promise[Unit] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def getWriter(): WritableStreamDefaultWriter[W] = js.native
  
  val locked: Boolean = js.native
}
@JSImport("streams", "WritableStream")
@js.native
object WritableStream
  extends Instantiable0[WritableStream[js.Object]]
     with Instantiable1[/* underlyingSink */ UnderlyingSink[js.Object], WritableStream[js.Object]]
     with Instantiable2[
      js.UndefOr[/* underlyingSink */ UnderlyingSink[js.Object]], 
      /* strategy */ QueuingStrategy[js.Object], 
      WritableStream[js.Object]
    ]
