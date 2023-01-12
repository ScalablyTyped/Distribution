package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutFileEntry extends StObject {
  
  /**
    * The content of the file, if a source file is not specified.
    */
  var fileContent: js.UndefOr[FileContent] = js.undefined
  
  /**
    * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  
  /**
    * The full path to the file in the repository, including the name of the file.
    */
  var filePath: Path
  
  /**
    * The name and full path of the file that contains the changes you want to make as part of the commit, if you are not providing the file content directly.
    */
  var sourceFile: js.UndefOr[SourceFileSpecifier] = js.undefined
}
object PutFileEntry {
  
  inline def apply(filePath: Path): PutFileEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutFileEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutFileEntry] (val x: Self) extends AnyVal {
    
    inline def setFileContent(value: FileContent): Self = StObject.set(x, "fileContent", value.asInstanceOf[js.Any])
    
    inline def setFileContentUndefined: Self = StObject.set(x, "fileContent", js.undefined)
    
    inline def setFileMode(value: FileModeTypeEnum): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
    
    inline def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
    
    inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setSourceFile(value: SourceFileSpecifier): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
  }
}
