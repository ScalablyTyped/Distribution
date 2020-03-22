package typings.algoliaRequesterCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.algoliaRequesterCommon.algoliaRequesterCommonStrings.DELETE
  - typings.algoliaRequesterCommon.algoliaRequesterCommonStrings.GET
  - typings.algoliaRequesterCommon.algoliaRequesterCommonStrings.POST
  - typings.algoliaRequesterCommon.algoliaRequesterCommonStrings.PUT
*/
trait MethodType extends js.Object

object MethodType {
  @scala.inline
  def DELETE: typings.algoliaRequesterCommon.algoliaRequesterCommonStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.algoliaRequesterCommon.algoliaRequesterCommonStrings.GET = this.cast("GET")
  @scala.inline
  def POST: typings.algoliaRequesterCommon.algoliaRequesterCommonStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.algoliaRequesterCommon.algoliaRequesterCommonStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

