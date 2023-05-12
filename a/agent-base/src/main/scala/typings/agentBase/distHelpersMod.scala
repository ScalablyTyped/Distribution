package typings.agentBase

import typings.agentBase.anon.FnCall
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpsMod.RequestOptions
import typings.node.streamMod.Readable
import typings.std.PromiseLike
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersMod {
  
  @JSImport("agent-base/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def json(stream: Readable): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def req(url: String): ThenableRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(url.asInstanceOf[js.Any]).asInstanceOf[ThenableRequest]
  inline def req(url: String, opts: RequestOptions): ThenableRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("req")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThenableRequest]
  inline def req(url: URL): ThenableRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(url.asInstanceOf[js.Any]).asInstanceOf[ThenableRequest]
  inline def req(url: URL, opts: RequestOptions): ThenableRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("req")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ThenableRequest]
  
  inline def toBuffer(stream: Readable): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBuffer")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  @js.native
  trait ThenableRequest extends ClientRequest {
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ IncomingMessage, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ IncomingMessage, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: FnCall = js.native
  }
}
