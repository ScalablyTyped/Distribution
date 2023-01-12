package typings.antDesignProUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowKey[ComponentsType, Entity] extends StObject {
  
  var entity: Entity
  
  var isEditable: js.UndefOr[Boolean] = js.undefined
  
  var rowIndex: Double
  
  var rowKey: js.UndefOr[String] = js.undefined
  
  var `type`: ComponentsType
}
object RowKey {
  
  inline def apply[ComponentsType, Entity](entity: Entity, rowIndex: Double, `type`: ComponentsType): RowKey[ComponentsType, Entity] = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowKey[ComponentsType, Entity]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowKey[?, ?], ComponentsType, Entity] (val x: Self & (RowKey[ComponentsType, Entity])) extends AnyVal {
    
    inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setIsEditableUndefined: Self = StObject.set(x, "isEditable", js.undefined)
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowKey(value: String): Self = StObject.set(x, "rowKey", value.asInstanceOf[js.Any])
    
    inline def setRowKeyUndefined: Self = StObject.set(x, "rowKey", js.undefined)
    
    inline def setType(value: ComponentsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
