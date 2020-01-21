package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliOss.aliOssStrings.`public-read-write`
  - typings.aliOss.aliOssStrings.`public-read`
  - typings.aliOss.aliOssStrings.`private`
*/
trait ACLType extends js.Object

object ACLType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typings.aliOss.aliOssStrings.`private` = this.cast("private")
  @scala.inline
  def `public-read`: typings.aliOss.aliOssStrings.`public-read` = this.cast("public-read")
  @scala.inline
  def `public-read-write`: typings.aliOss.aliOssStrings.`public-read-write` = this.cast("public-read-write")
}

