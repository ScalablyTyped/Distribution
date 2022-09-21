package typings.adobePdfservicesNodeSdk.pdfservicesSdkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExportPDFToImages {
  
  object SupportedSourceFormat {
    
    @JSImport("@adobe/pdfservices-node-sdk/pdfservices-sdk", "ExportPDFToImages.SupportedSourceFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@adobe/pdfservices-node-sdk/pdfservices-sdk", "ExportPDFToImages.SupportedSourceFormat.pdf")
    @js.native
    def pdf: String = js.native
    inline def pdf_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pdf")(x.asInstanceOf[js.Any])
  }
  
  object SupportedTargetFormats {
    
    @JSImport("@adobe/pdfservices-node-sdk/pdfservices-sdk", "ExportPDFToImages.SupportedTargetFormats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@adobe/pdfservices-node-sdk/pdfservices-sdk", "ExportPDFToImages.SupportedTargetFormats.JPEG")
    @js.native
    def JPEG: Any = js.native
    inline def JPEG_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JPEG")(x.asInstanceOf[js.Any])
    
    @JSImport("@adobe/pdfservices-node-sdk/pdfservices-sdk", "ExportPDFToImages.SupportedTargetFormats.PNG")
    @js.native
    def PNG: Any = js.native
    inline def PNG_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PNG")(x.asInstanceOf[js.Any])
  }
}
