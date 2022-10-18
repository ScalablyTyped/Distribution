package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.docx
import typings.adobePdfservicesNodeSdk.adobePdfservicesNodeSdkStrings.pdf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationOptionDocumentmergeDocumentMergeOptionsMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/option/documentmerge/document-merge-options", "DocumentMergeOptions")
  @js.native
  open class DocumentMergeOptions protected () extends StObject {
    /**
      * Creates a new {@link DocumentMergeOptions} instance
      */
    def this(jsonDataForMerge: Any, outputFormat: String) = this()
    def this(jsonDataForMerge: Any, outputFormat: String, fragments: Any) = this()
    
    var fragments: Any = js.native
    
    var jsonDataForMerge: Any = js.native
    
    var outputFormat: String = js.native
    
    def validate(): Any = js.native
  }
  
  trait OutputFormat extends StObject {
    
    /**
      * Represents "application/vnd.openxmlformats-officedocument.wordprocessingml.document" media type
      */
    var DOCX: docx
    
    /**
      * Represents "application/pdf" media type
      */
    var PDF: pdf
  }
  object OutputFormat {
    
    inline def apply(): OutputFormat = {
      val __obj = js.Dynamic.literal(DOCX = "docx", PDF = "pdf")
      __obj.asInstanceOf[OutputFormat]
    }
    
    extension [Self <: OutputFormat](x: Self) {
      
      inline def setDOCX(value: docx): Self = StObject.set(x, "DOCX", value.asInstanceOf[js.Any])
      
      inline def setPDF(value: pdf): Self = StObject.set(x, "PDF", value.asInstanceOf[js.Any])
    }
  }
}
