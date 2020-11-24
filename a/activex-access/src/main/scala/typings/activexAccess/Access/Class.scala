package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Class extends js.Object {
  
  @JSName("Access.Class_typekey")
  var AccessDotClass_typekey: Class = js.native
}
object Class {
  
  @scala.inline
  def apply(AccessDotClass_typekey: Class): Class = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Access.Class_typekey")(AccessDotClass_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
    
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
    def setAccessDotClass_typekey(value: Class): Self = this.set("Access.Class_typekey", value.asInstanceOf[js.Any])
  }
}
