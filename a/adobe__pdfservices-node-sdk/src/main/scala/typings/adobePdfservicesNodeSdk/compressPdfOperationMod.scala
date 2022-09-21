package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compressPdfOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/compress-pdf-operation", "CompressPDFOperation")
  @js.native
  open class CompressPDFOperation () extends StObject {
    
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
    
    /**
      * Sets the options for this operation. See {@link CompressPDFOptions} for how to specify the
      * options for the different compression levels.
      */
    def setOptions(): Unit = js.native
    def setOptions(options: Any): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object CompressPDFOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/compress-pdf-operation", "CompressPDFOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link CompressPDFOperation} instance.
      */
    inline def createNew(): CompressPDFOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[CompressPDFOperation]
  }
}
