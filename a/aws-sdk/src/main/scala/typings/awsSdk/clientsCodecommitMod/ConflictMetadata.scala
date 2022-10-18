package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConflictMetadata extends StObject {
  
  /**
    * A boolean value indicating whether there are conflicts in the content of a file.
    */
  var contentConflict: js.UndefOr[IsContentConflict] = js.undefined
  
  /**
    * A boolean value indicating whether there are conflicts in the file mode of a file.
    */
  var fileModeConflict: js.UndefOr[IsFileModeConflict] = js.undefined
  
  /**
    * The file modes of the file in the source, destination, and base of the merge.
    */
  var fileModes: js.UndefOr[FileModes] = js.undefined
  
  /**
    * The path of the file that contains conflicts.
    */
  var filePath: js.UndefOr[Path] = js.undefined
  
  /**
    * The file sizes of the file in the source, destination, and base of the merge.
    */
  var fileSizes: js.UndefOr[FileSizes] = js.undefined
  
  /**
    * A boolean value (true or false) indicating whether the file is binary or textual in the source, destination, and base of the merge.
    */
  var isBinaryFile: js.UndefOr[IsBinaryFile] = js.undefined
  
  /**
    * Whether an add, modify, or delete operation caused the conflict between the source and destination of the merge.
    */
  var mergeOperations: js.UndefOr[MergeOperations] = js.undefined
  
  /**
    * The number of conflicts, including both hunk conflicts and metadata conflicts.
    */
  var numberOfConflicts: js.UndefOr[NumberOfConflicts] = js.undefined
  
  /**
    * A boolean value (true or false) indicating whether there are conflicts between the branches in the object type of a file, folder, or submodule.
    */
  var objectTypeConflict: js.UndefOr[IsObjectTypeConflict] = js.undefined
  
  /**
    * Information about any object type conflicts in a merge operation.
    */
  var objectTypes: js.UndefOr[ObjectTypes] = js.undefined
}
object ConflictMetadata {
  
  inline def apply(): ConflictMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictMetadata]
  }
  
  extension [Self <: ConflictMetadata](x: Self) {
    
    inline def setContentConflict(value: IsContentConflict): Self = StObject.set(x, "contentConflict", value.asInstanceOf[js.Any])
    
    inline def setContentConflictUndefined: Self = StObject.set(x, "contentConflict", js.undefined)
    
    inline def setFileModeConflict(value: IsFileModeConflict): Self = StObject.set(x, "fileModeConflict", value.asInstanceOf[js.Any])
    
    inline def setFileModeConflictUndefined: Self = StObject.set(x, "fileModeConflict", js.undefined)
    
    inline def setFileModes(value: FileModes): Self = StObject.set(x, "fileModes", value.asInstanceOf[js.Any])
    
    inline def setFileModesUndefined: Self = StObject.set(x, "fileModes", js.undefined)
    
    inline def setFilePath(value: Path): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setFileSizes(value: FileSizes): Self = StObject.set(x, "fileSizes", value.asInstanceOf[js.Any])
    
    inline def setFileSizesUndefined: Self = StObject.set(x, "fileSizes", js.undefined)
    
    inline def setIsBinaryFile(value: IsBinaryFile): Self = StObject.set(x, "isBinaryFile", value.asInstanceOf[js.Any])
    
    inline def setIsBinaryFileUndefined: Self = StObject.set(x, "isBinaryFile", js.undefined)
    
    inline def setMergeOperations(value: MergeOperations): Self = StObject.set(x, "mergeOperations", value.asInstanceOf[js.Any])
    
    inline def setMergeOperationsUndefined: Self = StObject.set(x, "mergeOperations", js.undefined)
    
    inline def setNumberOfConflicts(value: NumberOfConflicts): Self = StObject.set(x, "numberOfConflicts", value.asInstanceOf[js.Any])
    
    inline def setNumberOfConflictsUndefined: Self = StObject.set(x, "numberOfConflicts", js.undefined)
    
    inline def setObjectTypeConflict(value: IsObjectTypeConflict): Self = StObject.set(x, "objectTypeConflict", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeConflictUndefined: Self = StObject.set(x, "objectTypeConflict", js.undefined)
    
    inline def setObjectTypes(value: ObjectTypes): Self = StObject.set(x, "objectTypes", value.asInstanceOf[js.Any])
    
    inline def setObjectTypesUndefined: Self = StObject.set(x, "objectTypes", js.undefined)
  }
}
