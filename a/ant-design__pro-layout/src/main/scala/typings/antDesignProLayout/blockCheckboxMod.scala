package typings.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import typings.antDesignProLayout.anon.Key
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockCheckboxMod extends Shortcut {
  
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/BlockCheckbox", JSImport.Default)
  @js.native
  val default: FC[BlockCheckboxProps] = js.native
  
  trait BlockCheckboxProps extends StObject {
    
    var configType: String
    
    var list: js.UndefOr[js.Array[Key]] = js.undefined
    
    def onChange(key: String): Unit
    
    var prefixCls: String
    
    var value: String
  }
  object BlockCheckboxProps {
    
    inline def apply(configType: String, onChange: String => Unit, prefixCls: String, value: String): BlockCheckboxProps = {
      val __obj = js.Dynamic.literal(configType = configType.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockCheckboxProps]
    }
    
    extension [Self <: BlockCheckboxProps](x: Self) {
      
      inline def setConfigType(value: String): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
      
      inline def setList(value: js.Array[Key]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: Key*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      inline def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[BlockCheckboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `blockCheckboxMod.foo` */
  override def _to: FC[BlockCheckboxProps] = default
}
