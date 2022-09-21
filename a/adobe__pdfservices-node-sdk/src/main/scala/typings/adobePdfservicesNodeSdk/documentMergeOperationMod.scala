package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.documentMergeOptionsMod.DocumentMergeOptions
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMergeOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/document-merge-operation", "DocumentMergeOperation")
  @js.native
  open class DocumentMergeOperation protected () extends StObject {
    def this(options: DocumentMergeOptions) = this()
    
    var documentTemplate: Any = js.native
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    var options: Any = js.native
    
    /**
      * Sets the input DOCX based document template.
      */
    def setInput(documentTemplate: FileRef): Unit = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object DocumentMergeOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/document-merge-operation", "DocumentMergeOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link DocumentMergeOperation} instance.
      *
      */
    inline def createNew(options: DocumentMergeOptions): DocumentMergeOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")(options.asInstanceOf[js.Any]).asInstanceOf[DocumentMergeOperation]
  }
}
