package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  /**
    * The fully-qualified path of the folder in the repository.
    */
  var absolutePath: js.UndefOr[Path] = js.undefined
  /**
    * The relative path of the specified folder from the folder where the query originated.
    */
  var relativePath: js.UndefOr[Path] = js.undefined
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the folder.
    */
  var treeId: js.UndefOr[ObjectId] = js.undefined
}

object Folder {
  @scala.inline
  def apply(absolutePath: Path = null, relativePath: Path = null, treeId: ObjectId = null): Folder = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath)
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath)
    if (treeId != null) __obj.updateDynamic("treeId")(treeId)
    __obj.asInstanceOf[Folder]
  }
}

