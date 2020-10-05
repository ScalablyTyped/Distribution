package typings.antd.anon

import typings.std.MediaQueryList
import typings.std.MediaQueryListEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listener extends js.Object {
  var listener: (js.ThisFunction1[/* this */ MediaQueryList, /* ev */ MediaQueryListEvent, _]) | Null = js.native
  var mql: MediaQueryList = js.native
}

object Listener {
  @scala.inline
  def apply(mql: MediaQueryList): Listener = {
    val __obj = js.Dynamic.literal(mql = mql.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener]
  }
  @scala.inline
  implicit class ListenerOps[Self <: Listener] (val x: Self) extends AnyVal {
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
    def setMql(value: MediaQueryList): Self = this.set("mql", value.asInstanceOf[js.Any])
    @scala.inline
    def setListener(value: js.ThisFunction1[/* this */ MediaQueryList, /* ev */ MediaQueryListEvent, _]): Self = this.set("listener", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenerNull: Self = this.set("listener", null)
  }
  
}

