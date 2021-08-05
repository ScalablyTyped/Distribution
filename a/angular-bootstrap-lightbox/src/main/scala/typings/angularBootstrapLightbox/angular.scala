package typings.angularBootstrapLightbox

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object bootstrap {
    
    object lightbox {
      
      trait IImageDimensionLimits extends StObject {
        
        var maxHeight: js.UndefOr[Double] = js.undefined
        
        var maxWidth: js.UndefOr[Double] = js.undefined
        
        var minHeight: js.UndefOr[Double] = js.undefined
        
        var minWidth: js.UndefOr[Double] = js.undefined
      }
      object IImageDimensionLimits {
        
        inline def apply(): IImageDimensionLimits = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IImageDimensionLimits]
        }
        
        extension [Self <: IImageDimensionLimits](x: Self) {
          
          inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
          
          inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
          
          inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
          
          inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
          
          inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
          
          inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
          
          inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
          
          inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
        }
      }
      
      trait IImageDimensionParameter extends StObject {
        
        var imageHeight: Double
        
        var imageWidth: Double
        
        var windowHeight: Double
        
        var windowWidth: Double
      }
      object IImageDimensionParameter {
        
        inline def apply(imageHeight: Double, imageWidth: Double, windowHeight: Double, windowWidth: Double): IImageDimensionParameter = {
          val __obj = js.Dynamic.literal(imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
          __obj.asInstanceOf[IImageDimensionParameter]
        }
        
        extension [Self <: IImageDimensionParameter](x: Self) {
          
          inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
          
          inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
          
          inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
          
          inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
        }
      }
      
      trait ILightBoxProvider extends StObject {
        
        def calculateImageDimensionLimits(dimensions: IImageDimensionParameter): IImageDimensionLimits
        
        def calculateModalDimensions(dimensions: IModalDimensionsParameter): IModalDimensions
        
        var templateUrl: String
      }
      object ILightBoxProvider {
        
        inline def apply(
          calculateImageDimensionLimits: IImageDimensionParameter => IImageDimensionLimits,
          calculateModalDimensions: IModalDimensionsParameter => IModalDimensions,
          templateUrl: String
        ): ILightBoxProvider = {
          val __obj = js.Dynamic.literal(calculateImageDimensionLimits = js.Any.fromFunction1(calculateImageDimensionLimits), calculateModalDimensions = js.Any.fromFunction1(calculateModalDimensions), templateUrl = templateUrl.asInstanceOf[js.Any])
          __obj.asInstanceOf[ILightBoxProvider]
        }
        
        extension [Self <: ILightBoxProvider](x: Self) {
          
          inline def setCalculateImageDimensionLimits(value: IImageDimensionParameter => IImageDimensionLimits): Self = StObject.set(x, "calculateImageDimensionLimits", js.Any.fromFunction1(value))
          
          inline def setCalculateModalDimensions(value: IModalDimensionsParameter => IModalDimensions): Self = StObject.set(x, "calculateModalDimensions", js.Any.fromFunction1(value))
          
          inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ILightbox extends StObject {
        
        def openModal(images: js.Array[ILightboxImageInfo], index: Double): Unit = js.native
        def openModal(images: js.Array[ILightboxImageInfo], index: Double, modalParams: StringDictionary[js.Any]): Unit = js.native
      }
      
      trait ILightboxImageInfo extends StObject {
        
        var caption: js.UndefOr[String] = js.undefined
        
        var height: Double
        
        var thumbUrl: js.UndefOr[String] = js.undefined
        
        var url: String
        
        var width: Double
      }
      object ILightboxImageInfo {
        
        inline def apply(height: Double, url: String, width: Double): ILightboxImageInfo = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[ILightboxImageInfo]
        }
        
        extension [Self <: ILightboxImageInfo](x: Self) {
          
          inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
          
          inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
          
          inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          inline def setThumbUrl(value: String): Self = StObject.set(x, "thumbUrl", value.asInstanceOf[js.Any])
          
          inline def setThumbUrlUndefined: Self = StObject.set(x, "thumbUrl", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
      
      trait IModalDimensions extends StObject {
        
        var height: Double
        
        var width: Double
      }
      object IModalDimensions {
        
        inline def apply(height: Double, width: Double): IModalDimensions = {
          val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
          __obj.asInstanceOf[IModalDimensions]
        }
        
        extension [Self <: IModalDimensions](x: Self) {
          
          inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
          
          inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        }
      }
      
      trait IModalDimensionsParameter extends StObject {
        
        var imageDisplayHeight: Double
        
        var imageDisplayWidth: Double
        
        var windowHeight: Double
        
        var windowWidth: Double
      }
      object IModalDimensionsParameter {
        
        inline def apply(imageDisplayHeight: Double, imageDisplayWidth: Double, windowHeight: Double, windowWidth: Double): IModalDimensionsParameter = {
          val __obj = js.Dynamic.literal(imageDisplayHeight = imageDisplayHeight.asInstanceOf[js.Any], imageDisplayWidth = imageDisplayWidth.asInstanceOf[js.Any], windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
          __obj.asInstanceOf[IModalDimensionsParameter]
        }
        
        extension [Self <: IModalDimensionsParameter](x: Self) {
          
          inline def setImageDisplayHeight(value: Double): Self = StObject.set(x, "imageDisplayHeight", value.asInstanceOf[js.Any])
          
          inline def setImageDisplayWidth(value: Double): Self = StObject.set(x, "imageDisplayWidth", value.asInstanceOf[js.Any])
          
          inline def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
          
          inline def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
