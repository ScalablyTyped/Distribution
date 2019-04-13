package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFolderOutput extends js.Object {
  /**
    * The full commit ID used as a reference for which version of the folder content is returned.
    */
  var commitId: ObjectId
  /**
    * The list of files that exist in the specified folder, if any.
    */
  var files: js.UndefOr[FileList] = js.undefined
  /**
    * The fully-qualified path of the folder whose contents are returned.
    */
  var folderPath: Path
  /**
    * The list of folders that exist beneath the specified folder, if any.
    */
  var subFolders: js.UndefOr[FolderList] = js.undefined
  /**
    * The list of submodules that exist in the specified folder, if any.
    */
  var subModules: js.UndefOr[SubModuleList] = js.undefined
  /**
    * The list of symbolic links to other files and folders that exist in the specified folder, if any.
    */
  var symbolicLinks: js.UndefOr[SymbolicLinkList] = js.undefined
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the folder.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}

object GetFolderOutput {
  @scala.inline
  def apply(
    commitId: ObjectId,
    folderPath: Path,
    files: FileList = null,
    subFolders: FolderList = null,
    subModules: SubModuleList = null,
    symbolicLinks: SymbolicLinkList = null,
    treeId: ObjectId = null
  ): GetFolderOutput = {
    val __obj = js.Dynamic.literal(commitId = commitId, folderPath = folderPath)
    if (files != null) __obj.updateDynamic("files")(files)
    if (subFolders != null) __obj.updateDynamic("subFolders")(subFolders)
    if (subModules != null) __obj.updateDynamic("subModules")(subModules)
    if (symbolicLinks != null) __obj.updateDynamic("symbolicLinks")(symbolicLinks)
    if (treeId != null) __obj.updateDynamic("treeId")(treeId)
    __obj.asInstanceOf[GetFolderOutput]
  }
}

