package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfPropertiesOptionsMod.PDFPropertiesOptions
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pdfPropertiesOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/pdf-properties-operation", "PDFPropertiesOperation")
  @js.native
  open class PDFPropertiesOperation () extends StObject {
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      */
    def execute(context: ExecutionContext): js.Promise[Any] = js.native
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def executeAndReturnFileRef(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    var isInvoked: Boolean = js.native
    
    var options: PDFPropertiesOptions = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    /**
      * Sets the options for this operation. See {@link PDFPropertiesOptions} for how to specify options for PDF Properties.
      *
      */
    def setOptions(): Unit = js.native
    def setOptions(options: PDFPropertiesOptions): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(): Unit = js.native
  }
  /* static members */
  object PDFPropertiesOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/pdf-properties-operation", "PDFPropertiesOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link PDFPropertiesOperation} instance.
      */
    inline def createNew(): PDFPropertiesOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[PDFPropertiesOperation]
  }
}
