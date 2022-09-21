package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.passwordProtectOptionsMod.PasswordProtectOptions
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protectPdfOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/protect-pdf-operation", "ProtectPDFOperation")
  @js.native
  open class ProtectPDFOperation protected () extends StObject {
    def this(options: Any) = this()
    
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
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object ProtectPDFOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/protect-pdf-operation", "ProtectPDFOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link ProtectPDFOperation} instance.
      */
    inline def createNew(options: PasswordProtectOptions): ProtectPDFOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")(options.asInstanceOf[js.Any]).asInstanceOf[ProtectPDFOperation]
  }
}
