package typings.asar.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def FileMetadata(unpacked: Boolean): Metadata = {
    val __obj = js.Dynamic.literal(unpacked = unpacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  def LinkMetadata(link: String): Metadata = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}
