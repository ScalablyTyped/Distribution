package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.PageRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationReplacePagesOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/replace-pages-operation", "ReplacePagesOperation")
  @js.native
  open class ReplacePagesOperation () extends StObject {
    
    /**
      * Adds the pages of the input PDF file for replacing the page of the base PDF file.
      * <p>
      * This method can be invoked multiple times with the same or different input PDF files.
      * <p>
      * If <code>pageRanges</code> is not provided, the specified page of the base PDF file will be replaced
      * by all the pages of the input PDF file.
      */
    def addPagesForReplace(basePageToReplace: Double, inputFile: FileRef): Unit = js.native
    def addPagesForReplace(basePageToReplace: Double, inputFile: FileRef, pageRanges: PageRanges): Unit = js.native
    
    var baseSourceFileRef: Any = js.native
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    /**
      * Sets a base input file.
      */
    def setBaseInput(baseSourceFileRef: FileRef): Unit = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object ReplacePagesOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/replace-pages-operation", "ReplacePagesOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link ReplacePagesOperation} instance.
      */
    inline def createNew(): ReplacePagesOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[ReplacePagesOperation]
  }
}
