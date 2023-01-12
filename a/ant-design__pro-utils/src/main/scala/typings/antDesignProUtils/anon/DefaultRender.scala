package typings.antDesignProUtils.anon

import typings.antDesignProUtils.esTypingMod.ProSchema
import typings.react.mod.Key
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultRender[ComponentsType, Entity, ExtraProps, ValueType] extends StObject {
  
  def defaultRender(newItem: ProSchema[Entity, ExtraProps, ComponentsType, ValueType, Any]): Element | Null
  
  var isEditable: js.UndefOr[Boolean] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
  
  var record: js.UndefOr[Entity] = js.undefined
  
  var recordKey: js.UndefOr[Key | js.Array[Key]] = js.undefined
  
  var `type`: ComponentsType
  
  var value: js.UndefOr[Any] = js.undefined
}
object DefaultRender {
  
  inline def apply[ComponentsType, Entity, ExtraProps, ValueType](
    defaultRender: ProSchema[Entity, ExtraProps, ComponentsType, ValueType, Any] => Element | Null,
    `type`: ComponentsType
  ): DefaultRender[ComponentsType, Entity, ExtraProps, ValueType] = {
    val __obj = js.Dynamic.literal(defaultRender = js.Any.fromFunction1(defaultRender))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultRender[ComponentsType, Entity, ExtraProps, ValueType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultRender[?, ?, ?, ?], ComponentsType, Entity, ExtraProps, ValueType] (val x: Self & (DefaultRender[ComponentsType, Entity, ExtraProps, ValueType])) extends AnyVal {
    
    inline def setDefaultRender(value: ProSchema[Entity, ExtraProps, ComponentsType, ValueType, Any] => Element | Null): Self = StObject.set(x, "defaultRender", js.Any.fromFunction1(value))
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setIsEditableUndefined: Self = StObject.set(x, "isEditable", js.undefined)
    
    inline def setOnChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnSelect(value: /* value */ Any => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setRecord(value: Entity): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    inline def setRecordKey(value: Key | js.Array[Key]): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKeyUndefined: Self = StObject.set(x, "recordKey", js.undefined)
    
    inline def setRecordKeyVarargs(value: Key*): Self = StObject.set(x, "recordKey", js.Array(value*))
    
    inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    inline def setType(value: ComponentsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
