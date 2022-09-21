package typings.adobePdfservicesNodeSdk.mod

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.PdfFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProtectPDF {
  
  @JSImport("@adobe/pdfservices-node-sdk", "ProtectPDF.SupportedSourceFormat")
  @js.native
  val SupportedSourceFormat: PdfFormat = js.native
  
  object options {
    
    @JSImport("@adobe/pdfservices-node-sdk", "ProtectPDF.options.ContentEncryption")
    @js.native
    val ContentEncryption: typings.adobePdfservicesNodeSdk.passwordProtectOptionsMod.ContentEncryption = js.native
    
    @JSImport("@adobe/pdfservices-node-sdk", "ProtectPDF.options.EncryptionAlgorithm")
    @js.native
    val EncryptionAlgorithm: typings.adobePdfservicesNodeSdk.passwordProtectOptionsMod.EncryptionAlgorithm = js.native
    
    @JSImport("@adobe/pdfservices-node-sdk", "ProtectPDF.options.Permission")
    @js.native
    val Permission: typings.adobePdfservicesNodeSdk.passwordProtectOptionsMod.Permission = js.native
  }
}
