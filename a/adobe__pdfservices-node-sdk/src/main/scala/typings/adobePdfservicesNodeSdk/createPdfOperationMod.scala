package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.createPdfFromExcelOptionsMod.CreatePDFFromExcelOptions
import typings.adobePdfservicesNodeSdk.createPdfFromHtmlOptionsMod.CreatePDFFromHtmlOptions
import typings.adobePdfservicesNodeSdk.createPdfFromPptOptionsMod.CreatePDFFromPPTOptions
import typings.adobePdfservicesNodeSdk.createPdfFromWordOptionsMod.CreatePDFFromWordOptions
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPdfOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/create-pdf-operation", "CreatePDFOperation")
  @js.native
  open class CreatePDFOperation () extends StObject {
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      *
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    var options: Any = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    def setOptions(options: CreatePDFFromExcelOptions): Unit = js.native
    /**
      * Sets the conversion parameters for this operation.
      * on the source format of the file which is being converted to PDF. For example, for HTML to PDF conversions,
      * the type will be {@link CreatePDFFromHtmlOptions}. For other supported options, refer the <code>options</code> key.
      * in {@link module:PDFServicesSDK#CreatePDF}.
      */
    def setOptions(options: CreatePDFFromHtmlOptions): Unit = js.native
    def setOptions(options: CreatePDFFromPPTOptions): Unit = js.native
    def setOptions(options: CreatePDFFromWordOptions): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object CreatePDFOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/create-pdf-operation", "CreatePDFOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a CreatePDFOperation instance.
      *
      */
    inline def createNew(): CreatePDFOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[CreatePDFOperation]
  }
}
