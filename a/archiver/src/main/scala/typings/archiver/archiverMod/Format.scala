package typings.archiver.archiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.archiver.archiverStrings.zip
  - typings.archiver.archiverStrings.tar
*/
trait Format extends js.Object

object Format {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tar: typings.archiver.archiverStrings.tar = this.cast("tar")
  @scala.inline
  def zip: typings.archiver.archiverStrings.zip = this.cast("zip")
}

