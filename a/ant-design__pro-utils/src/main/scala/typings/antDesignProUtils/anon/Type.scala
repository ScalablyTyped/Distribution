package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[ComponentsType] extends StObject {
  
  var isEditable: js.UndefOr[Boolean] = js.undefined
  
  var `type`: ComponentsType
}
object Type {
  
  inline def apply[ComponentsType](`type`: ComponentsType): Type[ComponentsType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type[ComponentsType]]
  }
  
  extension [Self <: Type[?], ComponentsType](x: Self & Type[ComponentsType]) {
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setIsEditableUndefined: Self = StObject.set(x, "isEditable", js.undefined)
    
    inline def setType(value: ComponentsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
