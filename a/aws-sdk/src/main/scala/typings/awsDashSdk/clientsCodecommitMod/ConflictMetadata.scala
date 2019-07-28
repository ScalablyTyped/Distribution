package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConflictMetadata extends js.Object {
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
  @scala.inline
  def apply(
    contentConflict: js.UndefOr[IsContentConflict] = js.undefined,
    fileModeConflict: js.UndefOr[IsFileModeConflict] = js.undefined,
    fileModes: FileModes = null,
    filePath: Path = null,
    fileSizes: FileSizes = null,
    isBinaryFile: IsBinaryFile = null,
    mergeOperations: MergeOperations = null,
    numberOfConflicts: js.UndefOr[NumberOfConflicts] = js.undefined,
    objectTypeConflict: js.UndefOr[IsObjectTypeConflict] = js.undefined,
    objectTypes: ObjectTypes = null
  ): ConflictMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(contentConflict)) __obj.updateDynamic("contentConflict")(contentConflict)
    if (!js.isUndefined(fileModeConflict)) __obj.updateDynamic("fileModeConflict")(fileModeConflict)
    if (fileModes != null) __obj.updateDynamic("fileModes")(fileModes)
    if (filePath != null) __obj.updateDynamic("filePath")(filePath)
    if (fileSizes != null) __obj.updateDynamic("fileSizes")(fileSizes)
    if (isBinaryFile != null) __obj.updateDynamic("isBinaryFile")(isBinaryFile)
    if (mergeOperations != null) __obj.updateDynamic("mergeOperations")(mergeOperations)
    if (!js.isUndefined(numberOfConflicts)) __obj.updateDynamic("numberOfConflicts")(numberOfConflicts)
    if (!js.isUndefined(objectTypeConflict)) __obj.updateDynamic("objectTypeConflict")(objectTypeConflict)
    if (objectTypes != null) __obj.updateDynamic("objectTypes")(objectTypes)
    __obj.asInstanceOf[ConflictMetadata]
  }
}

