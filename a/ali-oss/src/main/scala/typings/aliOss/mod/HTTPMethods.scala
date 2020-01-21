package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliOss.aliOssStrings.GET
  - typings.aliOss.aliOssStrings.POST
  - typings.aliOss.aliOssStrings.DELETE
  - typings.aliOss.aliOssStrings.PUT
*/
trait HTTPMethods extends js.Object

object HTTPMethods {
  @scala.inline
  def DELETE: typings.aliOss.aliOssStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.aliOss.aliOssStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.aliOss.aliOssStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.aliOss.aliOssStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

