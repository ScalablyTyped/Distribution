package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextMode extends js.Object {
  
  def autoOutdent(state: js.Any, doc: js.Any, row: js.Any): Unit = js.native
  
  def checkOutdent(state: js.Any, line: js.Any, input: js.Any): Boolean = js.native
  
  def createModeDelegates(mapping: js.Any): Unit = js.native
  
  def createWorker(session: js.Any): js.Any = js.native
  
  def getNextLineIndent(state: js.Any, line: js.Any, tab: js.Any): String = js.native
  
  def getTokenizer(): js.Any = js.native
  
  def toggleCommentLines(state: js.Any, doc: js.Any, startRow: js.Any, endRow: js.Any): Unit = js.native
  
  def transformAction(state: js.Any, action: js.Any, editor: js.Any, session: js.Any, param: js.Any): js.Any = js.native
}
object TextMode {
  
  @scala.inline
  def apply(
    autoOutdent: (js.Any, js.Any, js.Any) => Unit,
    checkOutdent: (js.Any, js.Any, js.Any) => Boolean,
    createModeDelegates: js.Any => Unit,
    createWorker: js.Any => js.Any,
    getNextLineIndent: (js.Any, js.Any, js.Any) => String,
    getTokenizer: () => js.Any,
    toggleCommentLines: (js.Any, js.Any, js.Any, js.Any) => Unit,
    transformAction: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
  ): TextMode = {
    val __obj = js.Dynamic.literal(autoOutdent = js.Any.fromFunction3(autoOutdent), checkOutdent = js.Any.fromFunction3(checkOutdent), createModeDelegates = js.Any.fromFunction1(createModeDelegates), createWorker = js.Any.fromFunction1(createWorker), getNextLineIndent = js.Any.fromFunction3(getNextLineIndent), getTokenizer = js.Any.fromFunction0(getTokenizer), toggleCommentLines = js.Any.fromFunction4(toggleCommentLines), transformAction = js.Any.fromFunction5(transformAction))
    __obj.asInstanceOf[TextMode]
  }
  
  @scala.inline
  implicit class TextModeOps[Self <: TextMode] (val x: Self) extends AnyVal {
    
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
    def setAutoOutdent(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("autoOutdent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCheckOutdent(value: (js.Any, js.Any, js.Any) => Boolean): Self = this.set("checkOutdent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateModeDelegates(value: js.Any => Unit): Self = this.set("createModeDelegates", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWorker(value: js.Any => js.Any): Self = this.set("createWorker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNextLineIndent(value: (js.Any, js.Any, js.Any) => String): Self = this.set("getNextLineIndent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetTokenizer(value: () => js.Any): Self = this.set("getTokenizer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleCommentLines(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = this.set("toggleCommentLines", js.Any.fromFunction4(value))
    
    @scala.inline
    def setTransformAction(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = this.set("transformAction", js.Any.fromFunction5(value))
  }
}
