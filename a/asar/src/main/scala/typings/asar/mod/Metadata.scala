package typings.asar.mod

import org.scalablytyped.runtime.StringDictionary
import typings.asar.asarBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.asar.mod.DirectoryMetadata
  - typings.asar.mod.FileMetadata
  - typings.asar.mod.LinkMetadata
*/
trait Metadata extends js.Object

object Metadata {
  @scala.inline
  def DirectoryMetadata(files: StringDictionary[EntryMetadata], unpacked: Boolean): Metadata = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], unpacked = unpacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  def FileMetadata(
    unpacked: Boolean,
    executable: `true` = null,
    offset: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined
  ): Metadata = {
    val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
    if (executable != null) __obj.updateDynamic("executable")(executable.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  def LinkMetadata(link: String): Metadata = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

