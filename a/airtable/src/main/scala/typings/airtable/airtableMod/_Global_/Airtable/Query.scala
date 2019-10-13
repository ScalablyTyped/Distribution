package typings.airtable.airtableMod._Global_.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[TFields /* <: js.Object */] extends js.Object {
  def all(): js.Promise[Response[TFields]]
  def eachPage(pageCallback: js.Function2[/* records */ Response[TFields], /* next */ js.Function0[Unit], Unit]): js.Promise[Unit]
  def firstPage(): js.Promise[Response[TFields]]
}

object Query {
  @scala.inline
  def apply[TFields /* <: js.Object */](
    all: () => js.Promise[Response[TFields]],
    eachPage: js.Function2[/* records */ Response[TFields], /* next */ js.Function0[Unit], Unit] => js.Promise[Unit],
    firstPage: () => js.Promise[Response[TFields]]
  ): Query[TFields] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), eachPage = js.Any.fromFunction1(eachPage), firstPage = js.Any.fromFunction0(firstPage))
  
    __obj.asInstanceOf[Query[TFields]]
  }
}

