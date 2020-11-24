package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Completer extends js.Object {
  
  def getCompletions(editor: Editor, session: EditSession, position: Point, prefix: String, callback: CompleterCallback): Unit = js.native
}
object Completer {
  
  @scala.inline
  def apply(getCompletions: (Editor, EditSession, Point, String, CompleterCallback) => Unit): Completer = {
    val __obj = js.Dynamic.literal(getCompletions = js.Any.fromFunction5(getCompletions))
    __obj.asInstanceOf[Completer]
  }
  
  @scala.inline
  implicit class CompleterOps[Self <: Completer] (val x: Self) extends AnyVal {
    
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
    def setGetCompletions(value: (Editor, EditSession, Point, String, CompleterCallback) => Unit): Self = this.set("getCompletions", js.Any.fromFunction5(value))
  }
}
