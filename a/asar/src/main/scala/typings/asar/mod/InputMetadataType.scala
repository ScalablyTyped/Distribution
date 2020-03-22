package typings.asar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.asar.asarStrings.directory
  - typings.asar.asarStrings.file
  - typings.asar.asarStrings.link
*/
trait InputMetadataType extends js.Object

object InputMetadataType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typings.asar.asarStrings.directory = this.cast("directory")
  @scala.inline
  def file: typings.asar.asarStrings.file = this.cast("file")
  @scala.inline
  def link: typings.asar.asarStrings.link = this.cast("link")
}

