package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.HEAD
  - typings.arangodb.arangodbStrings.GET
  - typings.arangodb.arangodbStrings.POST
  - typings.arangodb.arangodbStrings.PUT
  - typings.arangodb.arangodbStrings.PATCH
  - typings.arangodb.arangodbStrings.DELETE
  - typings.arangodb.arangodbStrings.OPTIONS
*/
trait HttpMethod extends js.Object

object HttpMethod {
  @scala.inline
  def DELETE: typings.arangodb.arangodbStrings.DELETE = this.cast("DELETE")
  @scala.inline
  def GET: typings.arangodb.arangodbStrings.GET = this.cast("GET")
  @scala.inline
  def HEAD: typings.arangodb.arangodbStrings.HEAD = this.cast("HEAD")
  @scala.inline
  def OPTIONS: typings.arangodb.arangodbStrings.OPTIONS = this.cast("OPTIONS")
  @scala.inline
  def PATCH: typings.arangodb.arangodbStrings.PATCH = this.cast("PATCH")
  @scala.inline
  def POST: typings.arangodb.arangodbStrings.POST = this.cast("POST")
  @scala.inline
  def PUT: typings.arangodb.arangodbStrings.PUT = this.cast("PUT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

