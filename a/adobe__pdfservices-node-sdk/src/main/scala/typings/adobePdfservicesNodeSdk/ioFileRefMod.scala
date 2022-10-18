package typings.adobePdfservicesNodeSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ioFileRefMod {
  
  @JSImport("@adobe/pdfservices-node-sdk/io/file-ref", "FileRef")
  @js.native
  open class FileRef protected () extends StObject {
    def this(input: Any) = this()
    
    /**
      *
      * Saves this file to the location specified by <code>destinationFilePath</code>.
      * If this FileRef instance refers to a temporary local file created by the SDK, that temporary file is deleted.
      * <p>
      * The directories mentioned in the specified argument are created if they do not exist.
      *
      *
      */
    def saveAsFile(destinationFilePath: String): js.Promise[Unit] = js.native
    
    /**
      * Writes the contents of this file to <code>writableStream</code>.
      * If this FileRef instance refers to a temporary local file created by the SDK, that temporary file is deleted.
      * <br>
      * Note: This method does not close the <code>writableStream</code>.
      *
      *
      */
    def writeToStream(writableStream: Any): Unit = js.native
  }
  /* static members */
  object FileRef {
    
    @JSImport("@adobe/pdfservices-node-sdk/io/file-ref", "FileRef")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a FileRef instance from a local file path. If no media type is provided, it will be inferred from the file
      * extension.
      * <p>
      */
    inline def createFromLocalFile(filePath: String): FileRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromLocalFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[FileRef]
    inline def createFromLocalFile(filePath: String, mediaType: String): FileRef = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromLocalFile")(filePath.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any])).asInstanceOf[FileRef]
    
    /**
      * Creates a FileRef instance from a readable stream using the specified media type.
      * <p>
      * The stream is not read by this method but by consumers of file content i.e. the execute method of
      * an operation such as {@link CreatePDFOperation#execute} .
      *
      */
    inline def createFromStream(inputStream: Any, mediaType: String): FileRef = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(inputStream.asInstanceOf[js.Any], mediaType.asInstanceOf[js.Any])).asInstanceOf[FileRef]
    
    /**
      * Creates a FileRef instance from the input URL and specified media type.
      *
      *
      */
    inline def createFromURL(url: String): FileRef = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromURL")(url.asInstanceOf[js.Any]).asInstanceOf[FileRef]
  }
}
