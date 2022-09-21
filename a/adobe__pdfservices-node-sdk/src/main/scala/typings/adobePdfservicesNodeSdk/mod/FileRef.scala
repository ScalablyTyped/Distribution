package typings.adobePdfservicesNodeSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@adobe/pdfservices-node-sdk", "FileRef")
@js.native
open class FileRef protected ()
  extends typings.adobePdfservicesNodeSdk.pdfservicesSdkMod.FileRef {
  def this(input: Any) = this()
}
/* static members */
object FileRef {
  
  @JSImport("@adobe/pdfservices-node-sdk", "FileRef")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a FileRef instance from a local file path. If no media type is provided, it will be inferred from the file
    * extension.
    * <p>
    */
  inline def createFromLocalFile(filePath: String): typings.adobePdfservicesNodeSdk.fileRefMod.FileRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromLocalFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.adobePdfservicesNodeSdk.fileRefMod.FileRef]
  inline def createFromLocalFile(filePath: String, mediaType: String): typings.adobePdfservicesNodeSdk.fileRefMod.FileRef = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromLocalFile")(filePath.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any])).asInstanceOf[typings.adobePdfservicesNodeSdk.fileRefMod.FileRef]
  
  /**
    * Creates a FileRef instance from a readable stream using the specified media type.
    * <p>
    * The stream is not read by this method but by consumers of file content i.e. the execute method of
    * an operation such as {@link CreatePDFOperation#execute} .
    *
    */
  inline def createFromStream(inputStream: Any, mediaType: String): typings.adobePdfservicesNodeSdk.fileRefMod.FileRef = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(inputStream.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any])).asInstanceOf[typings.adobePdfservicesNodeSdk.fileRefMod.FileRef]
  
  /**
    * Creates a FileRef instance from the input URL and specified media type.
    *
    *
    */
  inline def createFromURL(url: String): typings.adobePdfservicesNodeSdk.fileRefMod.FileRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromURL")(url.asInstanceOf[js.Any]).asInstanceOf[typings.adobePdfservicesNodeSdk.fileRefMod.FileRef]
}
