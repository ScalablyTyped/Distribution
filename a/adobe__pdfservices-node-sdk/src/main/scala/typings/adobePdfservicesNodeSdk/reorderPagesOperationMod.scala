package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.PageRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reorderPagesOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/reorder-pages-operation", "ReorderPagesOperation")
  @js.native
  open class ReorderPagesOperation () extends StObject {
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    def getIncludeRanges(): js.Array[js.Array[Any]] = js.native
    
    def getSourceFileRefs(): js.Array[Any] = js.native
    
    var pageRanges: PageRanges = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    /**
      * Sets the order of the pages.
      */
    def setPagesOrder(pageRanges: PageRanges): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object ReorderPagesOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/reorder-pages-operation", "ReorderPagesOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * Constructs a {@link ReorderPagesOperation} instance.
      */
    inline def createNew(): ReorderPagesOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[ReorderPagesOperation]
  }
}
