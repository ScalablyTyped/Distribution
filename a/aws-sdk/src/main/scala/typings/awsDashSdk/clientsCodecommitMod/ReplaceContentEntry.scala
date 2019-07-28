package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceContentEntry extends js.Object {
  /**
    * The base-64 encoded content to use when the replacement type is USE_NEW_CONTENT.
    */
  var content: js.UndefOr[FileContent] = js.undefined
  /**
    * The file mode to apply during conflict resoltion.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
  /**
    * The path of the conflicting file.
    */
  var filePath: Path
  /**
    * The replacement type to use when determining how to resolve the conflict.
    */
  var replacementType: ReplacementTypeEnum
}

object ReplaceContentEntry {
  @scala.inline
  def apply(
    filePath: Path,
    replacementType: ReplacementTypeEnum,
    content: FileContent = null,
    fileMode: FileModeTypeEnum = null
  ): ReplaceContentEntry = {
    val __obj = js.Dynamic.literal(filePath = filePath, replacementType = replacementType.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fileMode != null) __obj.updateDynamic("fileMode")(fileMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceContentEntry]
  }
}

