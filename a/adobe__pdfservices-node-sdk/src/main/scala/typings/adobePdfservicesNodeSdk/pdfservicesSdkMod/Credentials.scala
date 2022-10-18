package typings.adobePdfservicesNodeSdk.pdfservicesSdkMod

import typings.adobePdfservicesNodeSdk.authServiceAccountCredentialsBuilderMod.ServiceAccountCredentialsBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@adobe/pdfservices-node-sdk/pdfservices-sdk", "Credentials")
@js.native
open class Credentials ()
  extends typings.adobePdfservicesNodeSdk.authCredentialsMod.Credentials
/* static members */
object Credentials {
  
  @JSImport("@adobe/pdfservices-node-sdk/pdfservices-sdk", "Credentials")
  @js.native
  val ^ : js.Any = js.native
  
  inline def serviceAccountCredentialsBuilder(): ServiceAccountCredentialsBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("serviceAccountCredentialsBuilder")().asInstanceOf[ServiceAccountCredentialsBuilder]
}
