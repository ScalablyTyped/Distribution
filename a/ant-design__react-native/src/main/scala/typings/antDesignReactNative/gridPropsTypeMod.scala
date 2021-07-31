package typings.antDesignReactNative

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridPropsTypeMod {
  
  trait DataItem
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var icon: js.UndefOr[js.Any] = js.undefined
    
    var text: js.UndefOr[js.Any] = js.undefined
  }
  object DataItem {
    
    @scala.inline
    def apply(): DataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataItem]
    }
    
    @scala.inline
    implicit class DataItemMutableBuilder[Self <: DataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: js.Any): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait GridPropsType extends StObject {
    
    var carouselMaxRow: Double
    
    var columnNum: Double
    
    var data: js.UndefOr[js.Array[js.UndefOr[DataItem]]] = js.undefined
    
    var hasLine: js.UndefOr[Boolean] = js.undefined
    
    var isCarousel: js.UndefOr[Boolean] = js.undefined
    
    var onPress: js.UndefOr[js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, Unit]] = js.undefined
    
    var renderItem: js.UndefOr[
        js.Function2[/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double, ReactElement]
      ] = js.undefined
  }
  object GridPropsType {
    
    @scala.inline
    def apply(carouselMaxRow: Double, columnNum: Double): GridPropsType = {
      val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridPropsType]
    }
    
    @scala.inline
    implicit class GridPropsTypeMutableBuilder[Self <: GridPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarouselMaxRow(value: Double): Self = StObject.set(x, "carouselMaxRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNum(value: Double): Self = StObject.set(x, "columnNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[js.UndefOr[DataItem]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: js.UndefOr[DataItem]*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setHasLine(value: Boolean): Self = StObject.set(x, "hasLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLineUndefined: Self = StObject.set(x, "hasLine", js.undefined)
      
      @scala.inline
      def setIsCarousel(value: Boolean): Self = StObject.set(x, "isCarousel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCarouselUndefined: Self = StObject.set(x, "isCarousel", js.undefined)
      
      @scala.inline
      def setOnPress(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setRenderItem(value: (/* dataItem */ js.UndefOr[DataItem], /* itemIndex */ Double) => ReactElement): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
    }
  }
}
