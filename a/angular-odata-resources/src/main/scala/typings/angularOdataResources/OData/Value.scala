package typings.angularOdataResources.OData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends js.Object {
  
  /* private */ def escapeIllegalChars(haystack: js.Any): js.Any = js.native
  
  def execute(): String = js.native
  
  def executeWithType(): js.Any = js.native
  
  def executeWithUndefinedType(): js.Any = js.native
  
  /* private */ def generateDate(date: js.Any): js.Any = js.native
  
  var illegalChars: js.Any = js.native
  
  var `type`: js.Any = js.native
  
  var value: js.Any = js.native
}
object Value {
  
  @scala.inline
  def apply(
    escapeIllegalChars: js.Any => js.Any,
    execute: () => String,
    executeWithType: () => js.Any,
    executeWithUndefinedType: () => js.Any,
    generateDate: js.Any => js.Any,
    illegalChars: js.Any,
    `type`: js.Any,
    value: js.Any
  ): Value = {
    val __obj = js.Dynamic.literal(escapeIllegalChars = js.Any.fromFunction1(escapeIllegalChars), execute = js.Any.fromFunction0(execute), executeWithType = js.Any.fromFunction0(executeWithType), executeWithUndefinedType = js.Any.fromFunction0(executeWithUndefinedType), generateDate = js.Any.fromFunction1(generateDate), illegalChars = illegalChars.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    
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
    def setEscapeIllegalChars(value: js.Any => js.Any): Self = this.set("escapeIllegalChars", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecute(value: () => String): Self = this.set("execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteWithType(value: () => js.Any): Self = this.set("executeWithType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteWithUndefinedType(value: () => js.Any): Self = this.set("executeWithUndefinedType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateDate(value: js.Any => js.Any): Self = this.set("generateDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIllegalChars(value: js.Any): Self = this.set("illegalChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
