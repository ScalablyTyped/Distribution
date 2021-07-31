package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Class extends StObject {
  
  @JSName("Access.Class_typekey")
  var AccessDotClass_typekey: Class
}
object Class {
  
  @scala.inline
  def apply(AccessDotClass_typekey: Class): Class = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Access.Class_typekey")(AccessDotClass_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  
  @scala.inline
  implicit class ClassMutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessDotClass_typekey(value: Class): Self = StObject.set(x, "Access.Class_typekey", value.asInstanceOf[js.Any])
  }
}
