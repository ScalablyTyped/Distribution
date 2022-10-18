package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.anon.DOC
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationExportPdfOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/export-pdf-operation", "ExportPDFOperation")
  @js.native
  open class ExportPDFOperation protected () extends StObject {
    def this(targetFormat: Any) = this()
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    /**
      * Sets an input PDF file (media type "application/pdf").
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    var targetFormat: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object ExportPDFOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/export-pdf-operation", "ExportPDFOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs an {@link ExportPDFOperation} instance.
      */
    inline def createNew(targetFormat: DOC): ExportPDFOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")(targetFormat.asInstanceOf[js.Any]).asInstanceOf[ExportPDFOperation]
    
    inline def getTargetFormats(): DOC = ^.asInstanceOf[js.Dynamic].applyDynamic("getTargetFormats")().asInstanceOf[DOC]
  }
}
