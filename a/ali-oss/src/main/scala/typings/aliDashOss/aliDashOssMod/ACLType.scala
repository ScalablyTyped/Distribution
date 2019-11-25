package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliDashOss.aliDashOssStrings.`public-read-write`
  - typings.aliDashOss.aliDashOssStrings.`public-read`
  - typings.aliDashOss.aliDashOssStrings.`private`
*/
trait ACLType extends js.Object

object ACLType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.aliDashOss.aliDashOssStrings.`private` = this.cast("private")
  @scala.inline
  def `public-read`: typings.aliDashOss.aliDashOssStrings.`public-read` = this.cast("public-read")
  @scala.inline
  def `public-read-write`: typings.aliDashOss.aliDashOssStrings.`public-read-write` = this.cast("public-read-write")
}

