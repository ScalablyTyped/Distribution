package typings.antDesignReactNative.cameraRollPickerMod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.GetPhotosParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class CameraRollPickerPropsOps[Self <: CameraRollPickerProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImageMargin(value: Double): Self = this.set("imageMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesPerRow(value: Double): Self = this.set("imagesPerRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setCallback(value: /* repeated */ js.Any => _): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerWidth: Self = this.set("containerWidth", js.undefined)
    
    @scala.inline
    def setSelectSingleItem(value: Boolean): Self = this.set("selectSingleItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectSingleItem: Self = this.set("selectSingleItem", js.undefined)
    
    @scala.inline
    def setSelectedVarargs(value: js.Any*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[_]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectedMarker(value: Element): Self = this.set("selectedMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedMarker: Self = this.set("selectedMarker", js.undefined)
  }
}
