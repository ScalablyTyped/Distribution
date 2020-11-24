package typings.airtable.mod.global.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[TFields /* <: js.Object */] extends js.Object {
  
  def all(): js.Promise[Records[TFields]] = js.native
  
  def eachPage(pageCallback: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit]): js.Promise[Unit] = js.native
  
  def firstPage(): js.Promise[Records[TFields]] = js.native
}
object Query {
  
  @scala.inline
  def apply[TFields /* <: js.Object */](
    all: () => js.Promise[Records[TFields]],
    eachPage: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit] => js.Promise[Unit],
    firstPage: () => js.Promise[Records[TFields]]
  ): Query[TFields] = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), eachPage = js.Any.fromFunction1(eachPage), firstPage = js.Any.fromFunction0(firstPage))
    __obj.asInstanceOf[Query[TFields]]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query[_], TFields /* <: js.Object */] (val x: Self with Query[TFields]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAll(value: () => js.Promise[Records[TFields]]): Self = this.set("all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEachPage(
      value: js.Function2[/* records */ Records[TFields], /* next */ js.Function0[Unit], Unit] => js.Promise[Unit]
    ): Self = this.set("eachPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirstPage(value: () => js.Promise[Records[TFields]]): Self = this.set("firstPage", js.Any.fromFunction0(value))
  }
}
