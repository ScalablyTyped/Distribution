package typings.ansiColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolsType extends js.Object {
  
  var check: String = js.native
  
  var cross: String = js.native
  
  var info: String = js.native
  
  var line: String = js.native
  
  var pointer: String = js.native
  
  var pointerSmall: String = js.native
  
  var question: String = js.native
  
  var warning: String = js.native
}
object SymbolsType {
  
  @scala.inline
  def apply(
    check: String,
    cross: String,
    info: String,
    line: String,
    pointer: String,
    pointerSmall: String,
    question: String,
    warning: String
  ): SymbolsType = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], cross = cross.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any], pointerSmall = pointerSmall.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolsType]
  }
  
  @scala.inline
  implicit class SymbolsTypeOps[Self <: SymbolsType] (val x: Self) extends AnyVal {
    
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
    def setCheck(value: String): Self = this.set("check", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCross(value: String): Self = this.set("cross", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: String): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointer(value: String): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerSmall(value: String): Self = this.set("pointerSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuestion(value: String): Self = this.set("question", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
