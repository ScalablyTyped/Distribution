package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginProps[ComponentsType] extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var isEditable: js.UndefOr[Boolean] = js.undefined
  
  var originProps: js.UndefOr[Any] = js.undefined
  
  var `type`: ComponentsType
}
object OriginProps {
  
  inline def apply[ComponentsType](`type`: ComponentsType): OriginProps[ComponentsType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginProps[ComponentsType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginProps[?], ComponentsType] (val x: Self & OriginProps[ComponentsType]) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setIsEditableUndefined: Self = StObject.set(x, "isEditable", js.undefined)
    
    inline def setOriginProps(value: Any): Self = StObject.set(x, "originProps", value.asInstanceOf[js.Any])
    
    inline def setOriginPropsUndefined: Self = StObject.set(x, "originProps", js.undefined)
    
    inline def setType(value: ComponentsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
