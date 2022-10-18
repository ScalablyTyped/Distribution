package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.anon.`180`
import typings.adobePdfservicesNodeSdk.operationDeletePagesOperationMod.PageActions
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.PageRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationRotatePagesOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/rotate-pages-operation", "RotatePagesOperation")
  @js.native
  open class RotatePagesOperation () extends StObject {
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    var pageActions: PageActions = js.native
    
    /**
      * Sets angle (in clockwise direction) for rotating pages of the input PDF file; can be invoked
      * multiple times to set rotation angle for different set of pages.
      *
      * <p>
      * Multiple invocation of this method on the same set of pages can result in rotating pages multiple times.
      * <pre>
      * For e.g.:
      * PageRanges pageRanges = new PDFServicesSdk.PageRanges();
      * pageRanges.addSinglePage(1);
      * rotatePagesOperation.setAngleToRotatePagesBy(PDFServicesSdk.RotatePages.Angle._90, pageRanges);
      * rotatePagesOperation.setAngleToRotatePagesBy(PDFServicesSdk.RotatePages.Angle._180, pageRanges);
      * </pre>
      * Above invocations will effectively rotate pages (as specified by the page ranges) by 270 degrees.
      *
      * If <code>pageRanges</code> is not provided, all pages of the input PDF are rotated by the specified angle.
      */
    def setAngleToRotatePagesBy(angle: `180`): Unit = js.native
    def setAngleToRotatePagesBy(angle: `180`, pageRanges: PageRanges): Unit = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
    
    def validateAngleValue(angle: Any): Unit = js.native
  }
  /* static members */
  object RotatePagesOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/rotate-pages-operation", "RotatePagesOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link RotatePagesOperation} instance.
      */
    inline def createNew(): RotatePagesOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[RotatePagesOperation]
  }
}
