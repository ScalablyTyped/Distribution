package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Uri
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.GetPhotosParamType
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libImagePickerCameraRollPickerMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", JSImport.Default)
  @js.native
  open class default protected () extends CameraRollPicker {
    def this(props: CameraRollPickerProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.assetType")
      @js.native
      def assetType: String = js.native
      inline def assetType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assetType")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.backgroundColor")
      @js.native
      def backgroundColor: String = js.native
      inline def backgroundColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
      
      inline def callback(selectedImages: Any, currentImage: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("callback")(selectedImages.asInstanceOf[js.Any], currentImage.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.first")
      @js.native
      def first: Double = js.native
      inline def first_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("first")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.groupTypes")
      @js.native
      def groupTypes: String = js.native
      inline def groupTypes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.imageMargin")
      @js.native
      def imageMargin: Double = js.native
      inline def imageMargin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.imagesPerRow")
      @js.native
      def imagesPerRow: Double = js.native
      inline def imagesPerRow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagesPerRow")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.maximum")
      @js.native
      def maximum: Double = js.native
      inline def maximum_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximum")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.selectSingleItem")
      @js.native
      def selectSingleItem: Boolean = js.native
      inline def selectSingleItem_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectSingleItem")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.selected")
      @js.native
      def selected: js.Array[scala.Nothing] = js.native
      inline def selected_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CameraRollPicker extends Component[CameraRollPickerProps, CameraRollPickerState, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCameraRollPicker(nextProps: CameraRollPickerProps): Unit = js.native
    
    def _arrayObjectIndexOf(array: Any, property: String, value: Any): Any = js.native
    
    def _nEveryRow(data: Any, n: Double): js.Array[js.Array[Any]] = js.native
    
    def _renderImage(item: Any): Element = js.native
    
    def _selectImage(image: Uri): Unit = js.native
    
    var after: js.UndefOr[String] = js.native
    
    def onFetch(_underscore: Double, startFetch: Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
    def onFetch(_underscore: Unit, startFetch: Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
  }
  
  trait CameraRollPickerProps
    extends StObject
       with GetPhotosParamType {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var callback: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
    
    var containerWidth: js.UndefOr[Double] = js.undefined
    
    var imageMargin: Double
    
    var imagesPerRow: Double
    
    var maximum: Double
    
    var selectSingleItem: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[js.Array[Any]] = js.undefined
    
    var selectedMarker: js.UndefOr[ReactElement] = js.undefined
  }
  object CameraRollPickerProps {
    
    inline def apply(first: Double, imageMargin: Double, imagesPerRow: Double, maximum: Double): CameraRollPickerProps = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any])
      __obj.asInstanceOf[CameraRollPickerProps]
    }
    
    extension [Self <: CameraRollPickerProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setCallback(value: /* repeated */ Any => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      inline def setImageMargin(value: Double): Self = StObject.set(x, "imageMargin", value.asInstanceOf[js.Any])
      
      inline def setImagesPerRow(value: Double): Self = StObject.set(x, "imagesPerRow", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setSelectSingleItem(value: Boolean): Self = StObject.set(x, "selectSingleItem", value.asInstanceOf[js.Any])
      
      inline def setSelectSingleItemUndefined: Self = StObject.set(x, "selectSingleItem", js.undefined)
      
      inline def setSelected(value: js.Array[Any]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedMarker(value: ReactElement): Self = StObject.set(x, "selectedMarker", value.asInstanceOf[js.Any])
      
      inline def setSelectedMarkerUndefined: Self = StObject.set(x, "selectedMarker", js.undefined)
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: Any*): Self = StObject.set(x, "selected", js.Array(value*))
    }
  }
  
  trait CameraRollPickerState extends StObject {
    
    var images: js.Array[Any]
    
    var selected: Any
  }
  object CameraRollPickerState {
    
    inline def apply(images: js.Array[Any], selected: Any): CameraRollPickerState = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[CameraRollPickerState]
    }
    
    extension [Self <: CameraRollPickerState](x: Self) {
      
      inline def setImages(value: js.Array[Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setImagesVarargs(value: Any*): Self = StObject.set(x, "images", js.Array(value*))
      
      inline def setSelected(value: Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  trait CameraRollPickerStyle extends StObject {
    
    var marker: ViewStyle
    
    var row: ViewStyle
    
    var spinner: ViewStyle
    
    var wrapper: ViewStyle
  }
  object CameraRollPickerStyle {
    
    inline def apply(marker: ViewStyle, row: ViewStyle, spinner: ViewStyle, wrapper: ViewStyle): CameraRollPickerStyle = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[CameraRollPickerStyle]
    }
    
    extension [Self <: CameraRollPickerStyle](x: Self) {
      
      inline def setMarker(value: ViewStyle): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setRow(value: ViewStyle): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setSpinner(value: ViewStyle): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
