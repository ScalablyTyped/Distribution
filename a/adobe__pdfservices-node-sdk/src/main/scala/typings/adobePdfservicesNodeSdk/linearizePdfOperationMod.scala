package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearizePdfOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/linearize-pdf-operation", "LinearizePDFOperation")
  @js.native
  open class LinearizePDFOperation () extends StObject {
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object LinearizePDFOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/linearize-pdf-operation", "LinearizePDFOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link LinearizePDFOperation} instance.
      */
    inline def createNew(): LinearizePDFOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[LinearizePDFOperation]
  }
}
