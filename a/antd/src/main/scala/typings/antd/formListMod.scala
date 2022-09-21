package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.Errors
import typings.rcFieldForm.interfaceMod.StoreValue
import typings.rcFieldForm.interfaceMod.ValidatorRule
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formListMod extends Shortcut {
  
  @JSImport("antd/lib/form/FormList", JSImport.Default)
  @js.native
  val default: FC[FormListProps] = js.native
  
  trait FormListFieldData extends StObject {
    
    /** @deprecated No need anymore Use key instead */
    var fieldKey: js.UndefOr[Double] = js.undefined
    
    var key: Double
    
    var name: Double
  }
  object FormListFieldData {
    
    inline def apply(key: Double, name: Double): FormListFieldData = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormListFieldData]
    }
    
    extension [Self <: FormListFieldData](x: Self) {
      
      inline def setFieldKey(value: Double): Self = StObject.set(x, "fieldKey", value.asInstanceOf[js.Any])
      
      inline def setFieldKeyUndefined: Self = StObject.set(x, "fieldKey", js.undefined)
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormListOperation extends StObject {
    
    def add(): Unit = js.native
    def add(defaultValue: Unit, insertIndex: Double): Unit = js.native
    def add(defaultValue: StoreValue): Unit = js.native
    def add(defaultValue: StoreValue, insertIndex: Double): Unit = js.native
    
    def move(from: Double, to: Double): Unit = js.native
    
    def remove(index: js.Array[Double]): Unit = js.native
    def remove(index: Double): Unit = js.native
  }
  
  trait FormListProps extends StObject {
    
    def children(fields: js.Array[FormListFieldData], operation: FormListOperation, meta: Errors): ReactNode
    
    var initialValue: js.UndefOr[js.Array[Any]] = js.undefined
    
    var name: String | Double | (js.Array[String | Double])
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rules: js.UndefOr[js.Array[ValidatorRule]] = js.undefined
  }
  object FormListProps {
    
    inline def apply(
      children: (js.Array[FormListFieldData], FormListOperation, Errors) => ReactNode,
      name: String | Double | (js.Array[String | Double])
    ): FormListProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormListProps]
    }
    
    extension [Self <: FormListProps](x: Self) {
      
      inline def setChildren(value: (js.Array[FormListFieldData], FormListOperation, Errors) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setInitialValue(value: js.Array[Any]): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setInitialValueVarargs(value: Any*): Self = StObject.set(x, "initialValue", js.Array(value*))
      
      inline def setName(value: String | Double | (js.Array[String | Double])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRules(value: js.Array[ValidatorRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: ValidatorRule*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
  
  type _To = FC[FormListProps]
  
  /* This means you don't have to write `default`, but can instead just say `formListMod.foo` */
  override def _to: FC[FormListProps] = default
}
