package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.serviceAccountCredentialsBuilderMod.ServiceAccountCredentialsBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object credentialsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/auth/credentials", "Credentials")
  @js.native
  open class Credentials () extends StObject
  /* static members */
  object Credentials {
    
    @JSImport("@adobe/pdfservices-node-sdk/auth/credentials", "Credentials")
    @js.native
    val ^ : js.Any = js.native
    
    inline def serviceAccountCredentialsBuilder(): ServiceAccountCredentialsBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("serviceAccountCredentialsBuilder")().asInstanceOf[ServiceAccountCredentialsBuilder]
  }
}
