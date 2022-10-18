package typings.adobePdfservicesNodeSdk

import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.ExecutionContext
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef
import typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.PageRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operationSplitPdfOperationMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/operation/split-pdf-operation", "SplitPDFOperation")
  @js.native
  open class SplitPDFOperation () extends StObject {
    
    /**
      * Executes this operation synchronously using the supplied context and returns a new list of FileRef instances for the resultant PDF files.
      *
      * The resultant files may be stored in the system temporary directory (per the os.tempdir(), symlinks are resolved
      * to the actual path).
      * See {@link FileRef} for how temporary resources are cleaned up.
      */
    def execute(context: ExecutionContext): js.Promise[js.Array[FileRef]] = js.native
    
    var fileCount: Double = js.native
    
    var pageCount: Double = js.native
    
    var pageRanges: PageRanges = js.native
    
    /**
      * Sets the number of documents to split the input PDF.
      */
    def setFileCount(fileCount: Double): Unit = js.native
    
    /**
      * Sets an input file.
      */
    def setInput(sourceFileRef: FileRef): Unit = js.native
    
    /**
      * Sets the maximum number of pages each of the output files can have.
      */
    def setPageCount(pageCount: Double): Unit = js.native
    
    /**
      * Sets the page ranges on the basis of which to split the input PDF file.
      * Each page range corresponds to a single output file having the pages specified in the page range.
      */
    def setPageRanges(pageRanges: PageRanges): Unit = js.native
    
    var sourceFileRef: Any = js.native
    
    def validate(context: Any): Unit = js.native
  }
  /* static members */
  object SplitPDFOperation {
    
    @JSImport("@adobe/pdfservices-node-sdk/operation/split-pdf-operation", "SplitPDFOperation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a {@link SplitPDFOperation} instance.
      */
    inline def createNew(): SplitPDFOperation = ^.asInstanceOf[js.Dynamic].applyDynamic("createNew")().asInstanceOf[SplitPDFOperation]
  }
}
