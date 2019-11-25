package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.auth0.auth0Strings.csv
  - typings.auth0.auth0Strings.json
*/
trait JobFormat extends js.Object

object JobFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def csv: typings.auth0.auth0Strings.csv = this.cast("csv")
  @scala.inline
  def json: typings.auth0.auth0Strings.json = this.cast("json")
}

