package typings.antDesignReactNative

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageItemMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", JSImport.Default)
  @js.native
  class default protected () extends ImageItem {
    def this(props: ImageItemProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/image-picker/ImageItem", "default.defaultProps.selected")
      @js.native
      def selected: Boolean = js.native
      inline def selected_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ImageItem
    extends Component[ImageItemProps, js.Object, js.Any] {
    
    @JSName("UNSAFE_componentWillMount")
    def UNSAFE_componentWillMount_MImageItem(): Unit = js.native
    
    def _handleClick(item: js.Any): Unit = js.native
    
    var _imageSize: Double = js.native
  }
  
  trait ImageItemProps extends StObject {
    
    var containerWidth: js.UndefOr[Double] = js.undefined
    
    var imageMargin: Double
    
    var imagesPerRow: Double
    
    var item: js.UndefOr[js.Any] = js.undefined
    
    var onPress: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectedMarker: js.UndefOr[Element] = js.undefined
  }
  object ImageItemProps {
    
    inline def apply(imageMargin: Double, imagesPerRow: Double): ImageItemProps = {
      val __obj = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageItemProps]
    }
    
    extension [Self <: ImageItemProps](x: Self) {
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      inline def setImageMargin(value: Double): Self = StObject.set(x, "imageMargin", value.asInstanceOf[js.Any])
      
      inline def setImagesPerRow(value: Double): Self = StObject.set(x, "imagesPerRow", value.asInstanceOf[js.Any])
      
      inline def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
      
      inline def setOnPress(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedMarker(value: Element): Self = StObject.set(x, "selectedMarker", value.asInstanceOf[js.Any])
      
      inline def setSelectedMarkerUndefined: Self = StObject.set(x, "selectedMarker", js.undefined)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
