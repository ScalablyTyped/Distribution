package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliOss.aliOssStrings.Standard
  - typings.aliOss.aliOssStrings.IA
  - typings.aliOss.aliOssStrings.Archive
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  def Archive: typings.aliOss.aliOssStrings.Archive = this.cast("Archive")
  @scala.inline
  def IA: typings.aliOss.aliOssStrings.IA = this.cast("IA")
  @scala.inline
  def Standard: typings.aliOss.aliOssStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

