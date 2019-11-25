package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliDashOss.aliDashOssStrings.Standard
  - typings.aliDashOss.aliDashOssStrings.IA
  - typings.aliDashOss.aliDashOssStrings.Archive
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  def Archive: typings.aliDashOss.aliDashOssStrings.Archive = this.cast("Archive")
  @scala.inline
  def IA: typings.aliDashOss.aliDashOssStrings.IA = this.cast("IA")
  @scala.inline
  def Standard: typings.aliDashOss.aliDashOssStrings.Standard = this.cast("Standard")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

