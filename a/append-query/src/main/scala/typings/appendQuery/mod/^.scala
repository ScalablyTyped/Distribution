package typings.appendQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("append-query", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @param url a string URL to append to
    * @param query a string or object containing query params to append
    */
  def apply(url: String, query: String): String = js.native
  def apply(url: String, query: String, options: Options): String = js.native
  def apply(url: String, query: Query): String = js.native
  def apply(url: String, query: Query, options: Options): String = js.native
}

