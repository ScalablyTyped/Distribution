package typings.angularBootstrapLightbox

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object bootstrap {
    
    object lightbox {
      
      @js.native
      trait IImageDimensionLimits extends StObject {
        
        var maxHeight: js.UndefOr[Double] = js.native
        
        var maxWidth: js.UndefOr[Double] = js.native
        
        var minHeight: js.UndefOr[Double] = js.native
        
        var minWidth: js.UndefOr[Double] = js.native
      }
      object IImageDimensionLimits {
        
        @scala.inline
        def apply(): IImageDimensionLimits = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IImageDimensionLimits]
        }
        
        @scala.inline
        implicit class IImageDimensionLimitsMutableBuilder[Self <: IImageDimensionLimits] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
          
          @scala.inline
          def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
          
          @scala.inline
          def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
          
          @scala.inline
          def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
        }
      }
      
      @js.native
      trait IImageDimensionParameter extends StObject {
        
        var imageHeight: Double = js.native
        
        var imageWidth: Double = js.native
        
        var windowHeight: Double = js.native
        
        var windowWidth: Double = js.native
      }
      object IImageDimensionParameter {
        
        @scala.inline
        def apply(imageHeight: Double, imageWidth: Double, windowHeight: Double, windowWidth: Double): IImageDimensionParameter = {
          val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
          __obj.asInstanceOf[IImageDimensionParameter]
        }
        
        @scala.inline
        implicit class IImageDimensionParameterMutableBuilder[Self <: IImageDimensionParameter] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ILightBoxProvider extends StObject {
        
        def calculateImageDimensionLimits(dimensions: IImageDimensionParameter): IImageDimensionLimits = js.native
        
        def calculateModalDimensions(dimensions: IModalDimensionsParameter): IModalDimensions = js.native
        
        var templateUrl: String = js.native
      }
      object ILightBoxProvider {
        
        @scala.inline
        def apply(
          calculateImageDimensionLimits: IImageDimensionParameter => IImageDimensionLimits,
          calculateModalDimensions: IModalDimensionsParameter => IModalDimensions,
          templateUrl: String
        ): ILightBoxProvider = {
          val __obj = js.Dynamic.literal(calculateImageDimensionLimits = js.Any.fromFunction1(calculateImageDimensionLimits), calculateModalDimensions = js.Any.fromFunction1(calculateModalDimensions), templateUrl = templateUrl.asInstanceOf[js.Any])
          __obj.asInstanceOf[ILightBoxProvider]
        }
        
        @scala.inline
        implicit class ILightBoxProviderMutableBuilder[Self <: ILightBoxProvider] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCalculateImageDimensionLimits(value: IImageDimensionParameter => IImageDimensionLimits): Self = StObject.set(x, "calculateImageDimensionLimits", js.Any.fromFunction1(value))
          
          @scala.inline
          def setCalculateModalDimensions(value: IModalDimensionsParameter => IModalDimensions): Self = StObject.set(x, "calculateModalDimensions", js.Any.fromFunction1(value))
          
          @scala.inline
          def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ILightbox extends StObject {
        
        def openModal(images: js.Array[ILightboxImageInfo], index: Double): Unit = js.native
        def openModal(images: js.Array[ILightboxImageInfo], index: Double, modalParams: StringDictionary[js.Any]): Unit = js.native
      }
      
      @js.native
      trait ILightboxImageInfo extends StObject {
        
        var caption: js.UndefOr[String] = js.native
        
        var height: Double = js.native
        
        var thumbUrl: js.UndefOr[String] = js.native
        
        var url: String = js.native
        
        var width: Double = js.native
      }
      object ILightboxImageInfo {
        
        @scala.inline
        def apply(height: Double, url: String, width: Double): ILightboxImageInfo = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[ILightboxImageInfo]
        }
        
        @scala.inline
        implicit class ILightboxImageInfoMutableBuilder[Self <: ILightboxImageInfo] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
          
          @scala.inline
          def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setThumbUrl(value: String): Self = StObject.set(x, "thumbUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setThumbUrlUndefined: Self = StObject.set(x, "thumbUrl", js.undefined)
          
          @scala.inline
          def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IModalDimensions extends StObject {
        
        var height: Double = js.native
        
        var width: Double = js.native
      }
      object IModalDimensions {
        
        @scala.inline
        def apply(height: Double, width: Double): IModalDimensions = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[IModalDimensions]
        }
        
        @scala.inline
        implicit class IModalDimensionsMutableBuilder[Self <: IModalDimensions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait IModalDimensionsParameter extends StObject {
        
        var imageDisplayHeight: Double = js.native
        
        var imageDisplayWidth: Double = js.native
        
        var windowHeight: Double = js.native
        
        var windowWidth: Double = js.native
      }
      object IModalDimensionsParameter {
        
        @scala.inline
        def apply(imageDisplayHeight: Double, imageDisplayWidth: Double, windowHeight: Double, windowWidth: Double): IModalDimensionsParameter = {
          val __obj = js.Dynamic.literal(imageDisplayHeight = imageDisplayHeight.asInstanceOf[js.Any], imageDisplayWidth = imageDisplayWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
          __obj.asInstanceOf[IModalDimensionsParameter]
        }
        
        @scala.inline
        implicit class IModalDimensionsParameterMutableBuilder[Self <: IModalDimensionsParameter] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setImageDisplayHeight(value: Double): Self = StObject.set(x, "imageDisplayHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setImageDisplayWidth(value: Double): Self = StObject.set(x, "imageDisplayWidth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
