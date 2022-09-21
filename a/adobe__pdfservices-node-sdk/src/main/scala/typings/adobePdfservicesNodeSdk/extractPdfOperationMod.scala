package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.extractPdfOptionsMod.ExtractPdfOptions
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractPdfOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/extract-pdf-operation", "ExtractPdfOperation")
  @js.native
  open class ExtractPdfOperation () extends StObject {
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[Any] = js.native
    
    var isInvoked: Boolean = js.native
    
    var options: ExtractPdfOptions = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    /**
      * Sets the options for Extract PDF operation
      */
    def setOptions(options: ExtractPdfOptions): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(): Unit = js.native
  }
  /* static members */
  object ExtractPdfOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/extract-pdf-operation", "ExtractPdfOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link ExtractPdfOperation} instance.
      */
    inline def createNew(): ExtractPdfOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[ExtractPdfOperation]
  }
}
