package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.PageRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineFileOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/combine-file-operation", "CombineFilesOperation")
  @js.native
  open class CombineFilesOperation () extends StObject {
    
    /**
      * Specifies particular pages of a PDF file (media type "application/pdf") to be combined with other files. The pages
      * will be added after the pages of any previously specified files. If the <code>pageRanges</code> argument is not
      * provided, all pages of the PDF will be added in the combined PDF.
      * <p>
      *
      */
    def addInput(sourceFileRef: FileRef): Unit = js.native
    def addInput(sourceFileRef: FileRef, pageRanges: PageRanges): Unit = js.native
    
    /**
      * Executes this operation using the supplied context and returns a Promise which resolves to the operation result.
      *
      * The resulting file may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      *
      */
    def execute(context: ExecutionContext): js.Promise[FileRef] = js.native
    
    var filesToCombine: js.Array[Any] = js.native
    
    def getIncludeRanges(): js.Array[Any] = js.native
    
    def getSourceFileRefs(): js.Array[Any] = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object CombineFilesOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/combine-file-operation", "CombineFilesOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *
      * Constructs a {@link CombineFilesOperation} instance.
      *
      */
    inline def createNew(): CombineFilesOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[CombineFilesOperation]
  }
}
