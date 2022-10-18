package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationRemoveProtectionOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/remove-protection-operation", "RemoveProtectionOperation")
  @js.native
  open class RemoveProtectionOperation protected () extends StObject {
    def this(password: Any) = this()
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    var password: Any = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    /**
      * Specifies the intended password depending on the type of password security attached to the input PDF document.
      */
    def setPassword(password: String): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object RemoveProtectionOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/remove-protection-operation", "RemoveProtectionOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link RemoveProtectionOperation} instance.
      *
      */
    inline def createNew(): RemoveProtectionOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[RemoveProtectionOperation]
  }
}
