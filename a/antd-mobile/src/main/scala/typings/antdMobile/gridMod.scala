package typings.antdMobile

import typings.antdMobile.anon.CarouselMaxRow
import typings.antdMobile.anon.InitialSlideWidth
import typings.antdMobile.gridPropsTypeMod.GridPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("antd-mobile/lib/grid", JSImport.Default)
  @js.native
  class default () extends Grid
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/grid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/grid", "default.defaultProps")
    @js.native
    def defaultProps: CarouselMaxRow = js.native
    inline def defaultProps_=(x: CarouselMaxRow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Grid
    extends Component[GridProps, js.Any, js.Any] {
    
    @JSName("componentDidMount")
    def componentDidMount_MGrid(): Unit = js.native
    
    def getRows(rowCount: Double, dataLength: Double): js.Array[js.Any] = js.native
    
    def renderCarousel(rowsArr: js.Array[js.Any], pageCount: Double, rowCount: Double): js.Array[js.Any] = js.native
    
    def renderItem(dataItem: js.Any, index: Double, columnNum: Double, renderItem: js.Any): Element = js.native
    
    @JSName("state")
    var state_Grid: InitialSlideWidth = js.native
  }
  
  trait GridProps
    extends StObject
       with GridPropsType {
    
    var activeClassName: js.UndefOr[String] = js.undefined
    
    var activeStyle: js.UndefOr[Boolean | CSSProperties] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var itemStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var square: js.UndefOr[Boolean] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    extension [Self <: GridProps](x: Self) {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveStyle(value: Boolean | CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setItemStyle(value: CSSProperties): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
      
      inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    }
  }
}
