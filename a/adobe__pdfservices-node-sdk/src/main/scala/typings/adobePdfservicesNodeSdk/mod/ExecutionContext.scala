package typings.adobePdfservicesNodeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@adobe/pdfservices-node-sdk", "ExecutionContext")
@js.native
open class ExecutionContext ()
  extends typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
/* static members */
object ExecutionContext {
  
  @JSImport("@adobe/pdfservices-node-sdk", "ExecutionContext")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Creates a context instance using the provided {@link Credentials} and {@link ClientConfig}.
    *
    */
  inline def create(credentials: typings.adobePdfservicesNodeSdk.authCredentialsMod.Credentials): typings.adobePdfservicesNodeSdk.executionContextMod.ExecutionContext = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any]).asInstanceOf[typings.adobePdfservicesNodeSdk.executionContextMod.ExecutionContext]
  inline def create(
    credentials: typings.adobePdfservicesNodeSdk.authCredentialsMod.Credentials,
    clientConfig: typings.adobePdfservicesNodeSdk.clientConfigMod.ClientConfig
  ): typings.adobePdfservicesNodeSdk.executionContextMod.ExecutionContext = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[typings.adobePdfservicesNodeSdk.executionContextMod.ExecutionContext]
}
