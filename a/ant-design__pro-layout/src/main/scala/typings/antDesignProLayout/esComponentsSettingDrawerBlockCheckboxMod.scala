package typings.antDesignProLayout

import typings.antDesignProLayout.anon.Icon
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsSettingDrawerBlockCheckboxMod {
  
  @JSImport("@ant-design/pro-layout/es/components/SettingDrawer/BlockCheckbox", "BlockCheckbox")
  @js.native
  val BlockCheckbox: FC[BlockCheckboxProps] = js.native
  
  trait BlockCheckboxProps extends StObject {
    
    var configType: String
    
    var hashId: String
    
    var list: js.UndefOr[js.Array[Icon]] = js.undefined
    
    def onChange(key: String): Unit
    
    var prefixCls: String
    
    var value: String
  }
  object BlockCheckboxProps {
    
    inline def apply(configType: String, hashId: String, onChange: String => Unit, prefixCls: String, value: String): BlockCheckboxProps = {
      val __obj = js.Dynamic.literal(configType = configType.asInstanceOf[js.Any], hashId = hashId.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockCheckboxProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockCheckboxProps] (val x: Self) extends AnyVal {
      
      inline def setConfigType(value: String): Self = StObject.set(x, "configType", value.asInstanceOf[js.Any])
      
      inline def setHashId(value: String): Self = StObject.set(x, "hashId", value.asInstanceOf[js.Any])
      
      inline def setList(value: js.Array[Icon]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: Icon*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setOnChange(value: String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
