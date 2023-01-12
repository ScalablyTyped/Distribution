package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.HIGH
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.LOW
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.MEDIUM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationOptionCompresspdfCompressPdfOptionsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/compresspdf/compress-pdf-options", "CompressPDFOptions")
  @js.native
  open class CompressPDFOptions protected () extends StObject {
    def this(builder: Any) = this()
    
    var compressionLevel: Any = js.native
    
    def validate(): Any = js.native
  }
  
  trait CompressionLevel extends StObject {
    
    /**
      * Reduces the file size of pdf by reducing resolution of the coloured and grayscale images above 100 dpi to 72 dpi (dots per inch).
      * This option uses JPEG medium quality compression.
      * Output pdf will not contain hidden layers, document structure, metadata, javascript, user properties and print settings.
      */
    var HIGH: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.HIGH
    
    /**
      * Reduces the file size of pdf by reducing resolution of the coloured and grayscale images above 250 dpi to 200 dpi (dots per inch).
      * This option uses JP2K high quality compression.
      */
    var LOW: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.LOW
    
    /**
      * Reduces the file size of pdf by reducing resolution of the coloured and grayscale images above 200 dpi to 144 dpi (dots per inch).
      * This option uses JP2K medium quality compression.
      */
    var MEDIUM: typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.MEDIUM
  }
  object CompressionLevel {
    
    inline def apply(): CompressionLevel = {
      val __obj = js.Dynamic.literal(HIGH = "HIGH", LOW = "LOW", MEDIUM = "MEDIUM")
      __obj.asInstanceOf[CompressionLevel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompressionLevel] (val x: Self) extends AnyVal {
      
      inline def setHIGH(value: HIGH): Self = StObject.set(x, "HIGH", value.asInstanceOf[js.Any])
      
      inline def setLOW(value: LOW): Self = StObject.set(x, "LOW", value.asInstanceOf[js.Any])
      
      inline def setMEDIUM(value: MEDIUM): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
    }
  }
}
