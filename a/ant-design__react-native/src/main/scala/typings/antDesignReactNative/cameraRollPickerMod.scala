package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Uri
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.GetPhotosParamType
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cameraRollPickerMod {
  
  @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", JSImport.Default)
  @js.native
  class default protected () extends CameraRollPicker {
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
      @scala.inline
      def assetType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("assetType")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.backgroundColor")
      @js.native
      def backgroundColor: String = js.native
      @scala.inline
      def backgroundColor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.callback")
      @js.native
      def callback(selectedImages: js.Any, currentImage: js.Any): Unit = js.native
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.first")
      @js.native
      def first: Double = js.native
      @scala.inline
      def first_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("first")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.groupTypes")
      @js.native
      def groupTypes: String = js.native
      @scala.inline
      def groupTypes_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupTypes")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.imageMargin")
      @js.native
      def imageMargin: Double = js.native
      @scala.inline
      def imageMargin_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageMargin")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.imagesPerRow")
      @js.native
      def imagesPerRow: Double = js.native
      @scala.inline
      def imagesPerRow_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagesPerRow")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.maximum")
      @js.native
      def maximum: Double = js.native
      @scala.inline
      def maximum_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maximum")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.selectSingleItem")
      @js.native
      def selectSingleItem: Boolean = js.native
      @scala.inline
      def selectSingleItem_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectSingleItem")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/image-picker/CameraRollPicker", "default.defaultProps.selected")
      @js.native
      def selected: js.Array[scala.Nothing] = js.native
      @scala.inline
      def selected_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CameraRollPicker
    extends Component[CameraRollPickerProps, CameraRollPickerState, js.Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCameraRollPicker(nextProps: CameraRollPickerProps): Unit = js.native
    
    def _arrayObjectIndexOf(array: js.Any, property: String, value: js.Any): js.Any = js.native
    
    def _nEveryRow(data: js.Any, n: Double): js.Array[js.Array[_]] = js.native
    
    def _renderImage(item: js.Any): Element = js.native
    
    def _selectImage(image: Uri): Unit = js.native
    
    var after: js.UndefOr[String] = js.native
    
    def onFetch(_underscore: js.UndefOr[scala.Nothing], startFetch: js.Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
    def onFetch(_underscore: Double, startFetch: js.Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait CameraRollPickerProps extends GetPhotosParamType {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var callback: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var containerWidth: js.UndefOr[Double] = js.native
    
    var imageMargin: Double = js.native
    
    var imagesPerRow: Double = js.native
    
    var maximum: Double = js.native
    
    var selectSingleItem: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[js.Array[_]] = js.native
    
    var selectedMarker: js.UndefOr[Element] = js.native
  }
  object CameraRollPickerProps {
    
    @scala.inline
    def apply(first: Double, imageMargin: Double, imagesPerRow: Double, maximum: Double): CameraRollPickerProps = {
      val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any])
      __obj.asInstanceOf[CameraRollPickerProps]
    }
    
    @scala.inline
    implicit class CameraRollPickerPropsMutableBuilder[Self <: CameraRollPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setCallback(value: /* repeated */ js.Any => _): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      @scala.inline
      def setImageMargin(value: Double): Self = StObject.set(x, "imageMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesPerRow(value: Double): Self = StObject.set(x, "imagesPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectSingleItem(value: Boolean): Self = StObject.set(x, "selectSingleItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectSingleItemUndefined: Self = StObject.set(x, "selectSingleItem", js.undefined)
      
      @scala.inline
      def setSelected(value: js.Array[_]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedMarker(value: Element): Self = StObject.set(x, "selectedMarker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedMarkerUndefined: Self = StObject.set(x, "selectedMarker", js.undefined)
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSelectedVarargs(value: js.Any*): Self = StObject.set(x, "selected", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CameraRollPickerState extends StObject {
    
    var images: js.Array[_] = js.native
    
    var selected: js.Any = js.native
  }
  object CameraRollPickerState {
    
    @scala.inline
    def apply(images: js.Array[_], selected: js.Any): CameraRollPickerState = {
      val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[CameraRollPickerState]
    }
    
    @scala.inline
    implicit class CameraRollPickerStateMutableBuilder[Self <: CameraRollPickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImages(value: js.Array[_]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagesVarargs(value: js.Any*): Self = StObject.set(x, "images", js.Array(value :_*))
      
      @scala.inline
      def setSelected(value: js.Any): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CameraRollPickerStyle extends StObject {
    
    var marker: ViewStyle = js.native
    
    var row: ViewStyle = js.native
    
    var spinner: ViewStyle = js.native
    
    var wrapper: ViewStyle = js.native
  }
  object CameraRollPickerStyle {
    
    @scala.inline
    def apply(marker: ViewStyle, row: ViewStyle, spinner: ViewStyle, wrapper: ViewStyle): CameraRollPickerStyle = {
      val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
      __obj.asInstanceOf[CameraRollPickerStyle]
    }
    
    @scala.inline
    implicit class CameraRollPickerStyleMutableBuilder[Self <: CameraRollPickerStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMarker(value: ViewStyle): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: ViewStyle): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinner(value: ViewStyle): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapper(value: ViewStyle): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    }
  }
}
