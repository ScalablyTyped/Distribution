package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.PageRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationDeletePagesOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/delete-pages-operation", "DeletePagesOperation")
  @js.native
  open class DeletePagesOperation () extends StObject {
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    var options: PageActions = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    /**
      * Specifies the pages to delete from the input PDF file.
      *
      */
    def setPageRanges(pageRanges: PageRanges): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object DeletePagesOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/delete-pages-operation", "DeletePagesOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link DeletePagesOperation} instance.
      *
      */
    inline def createNew(): DeletePagesOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[DeletePagesOperation]
  }
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/delete-pages-operation", "PageActions")
  @js.native
  open class PageActions () extends StObject {
    
    var pageActions: js.Array[Any] = js.native
    
    def withDeleteAction(pageRanges: Any): PageActions = js.native
    
    def withRotateAction(pageRanges: Any, angle: Any): PageActions = js.native
  }
}
