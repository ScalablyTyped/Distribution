package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.Data
import typings.antdMobile.menuPropsTypeMod.DataItem
import typings.antdMobile.menuPropsTypeMod.MenuProps
import typings.antdMobile.menuPropsTypeMod.ValueType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/menu", "default.defaultProps")
    @js.native
    def defaultProps: Data = js.native
    @scala.inline
    def defaultProps_=(x: Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Menu
    extends Component[MenuProps, StateType, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MMenu(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MMenu(nextProps: MenuProps): Unit = js.native
    
    def getNewFsv(props: MenuProps): String = js.native
    
    def getSelectValue(dataItem: DataItem): js.Array[_] = js.native
    
    def onClickFirstLevelItem(dataItem: DataItem): Unit = js.native
    
    def onClickSubMenuItem(dataItem: DataItem): Unit = js.native
    
    def onMenuCancel(): Unit = js.native
    
    def onMenuOk(): Unit = js.native
  }
  
  @js.native
  trait StateType extends StObject {
    
    var firstLevelSelectValue: String = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[ValueType] = js.native
  }
  object StateType {
    
    @scala.inline
    def apply(firstLevelSelectValue: String): StateType = {
      val __obj = js.Dynamic.literal(firstLevelSelectValue = firstLevelSelectValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    @scala.inline
    implicit class StateTypeMutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstLevelSelectValue(value: String): Self = StObject.set(x, "firstLevelSelectValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
