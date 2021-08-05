package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Data
import typings.antdMobile.menuPropsTypeMod.DataItem
import typings.antdMobile.menuPropsTypeMod.MenuProps
import typings.antdMobile.menuPropsTypeMod.ValueType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMod {
  
  @JSImport("antd-mobile/lib/menu", JSImport.Default)
  @js.native
  class default protected () extends Menu {
    def this(props: MenuProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/menu", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/menu", "default.defaultProps")
    @js.native
    def defaultProps: Data = js.native
    inline def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Menu
    extends Component[MenuProps, StateType, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MMenu(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MMenu(nextProps: MenuProps): Unit = js.native
    
    def getNewFsv(props: MenuProps): String = js.native
    
    def getSelectValue(dataItem: DataItem): js.Array[js.Any] = js.native
    
    def onClickFirstLevelItem(dataItem: DataItem): Unit = js.native
    
    def onClickSubMenuItem(dataItem: DataItem): Unit = js.native
    
    def onMenuCancel(): Unit = js.native
    
    def onMenuOk(): Unit = js.native
  }
  
  trait StateType extends StObject {
    
    var firstLevelSelectValue: String
    
    var height: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[ValueType] = js.undefined
  }
  object StateType {
    
    inline def apply(firstLevelSelectValue: String): StateType = {
      val __obj = js.Dynamic.literal(firstLevelSelectValue = firstLevelSelectValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    extension [Self <: StateType](x: Self) {
      
      inline def setFirstLevelSelectValue(value: String): Self = StObject.set(x, "firstLevelSelectValue", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
