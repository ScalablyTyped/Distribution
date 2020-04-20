package typings.asar.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined asar.asar.EntryMetadata & {  files  :{[property: string] : asar.asar.EntryMetadata}} */
trait DirectoryMetadata extends Metadata {
  var files: StringDictionary[EntryMetadata]
  var unpacked: Boolean
}

object DirectoryMetadata {
  @scala.inline
  def apply(files: StringDictionary[EntryMetadata], unpacked: Boolean): DirectoryMetadata = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], unpacked = unpacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryMetadata]
  }
}

