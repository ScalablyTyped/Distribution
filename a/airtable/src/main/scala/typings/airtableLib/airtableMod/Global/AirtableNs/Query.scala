package typings
package airtableLib.airtableMod.Global.AirtableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[TFields /* <: js.Object */] extends js.Object {
  def all(): js.Promise[Response[TFields]]
  def firstPage(): js.Promise[Response[TFields]]
}

object Query {
  @scala.inline
  def apply[TFields /* <: js.Object */](all: () => js.Promise[Response[TFields]], firstPage: () => js.Promise[Response[TFields]]): Query[TFields] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), firstPage = js.Any.fromFunction0(firstPage))
  
    __obj.asInstanceOf[Query[TFields]]
  }
}

