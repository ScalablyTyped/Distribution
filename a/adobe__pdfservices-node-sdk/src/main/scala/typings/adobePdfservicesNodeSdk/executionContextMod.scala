package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.clientConfigMod.ClientConfig
import typings.adobePdfservicesNodeSdk.credentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executionContextMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/execution-context", "ExecutionContext")
  @js.native
  open class ExecutionContext () extends StObject
  /* static members */
  object ExecutionContext {
    
    @JSImport("@adobe/pdfservices-node-sdk/execution-context", "ExecutionContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * Creates a context instance using the provided {@link Credentials} and {@link ClientConfig}.
      *
      */
    inline def create(credentials: Credentials): ExecutionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any]).asInstanceOf[ExecutionContext]
    inline def create(credentials: Credentials, clientConfig: ClientConfig): ExecutionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[ExecutionContext]
  }
}
