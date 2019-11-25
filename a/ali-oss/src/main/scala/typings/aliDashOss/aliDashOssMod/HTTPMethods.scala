package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.aliDashOss.aliDashOssStrings.GET
  - typings.aliDashOss.aliDashOssStrings.POST
  - typings.aliDashOss.aliDashOssStrings.DELETE
  - typings.aliDashOss.aliDashOssStrings.PUT
*/
trait HTTPMethods extends js.Object

object HTTPMethods {
  @scala.inline
  def DELETE: typings.aliDashOss.aliDashOssStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.aliDashOss.aliDashOssStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.aliDashOss.aliDashOssStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.aliDashOss.aliDashOssStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

