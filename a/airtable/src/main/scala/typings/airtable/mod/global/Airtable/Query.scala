package typings.airtable.mod.global.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[TFields /* <: js.Object */] extends js.Object {
  def all(): js.Promise[Records[TFields]]
  def eachPage(pageCallback: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit]): js.Promise[Unit]
  def firstPage(): js.Promise[Records[TFields]]
}

object Query {
  @scala.inline
  def apply[TFields](
    all: () => js.Promise[Records[TFields]],
    eachPage: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit] => js.Promise[Unit],
    firstPage: () => js.Promise[Records[TFields]]
  ): Query[TFields] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), eachPage = js.Any.fromFunction1(eachPage), firstPage = js.Any.fromFunction0(firstPage))
    __obj.asInstanceOf[Query[TFields]]
  }
}

