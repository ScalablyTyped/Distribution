package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImagePixelLocationParameters
import typings.arcgisJsApi.esri.ImagePixelLocationParametersConstructor
import typings.arcgisJsApi.esri.ImagePixelLocationParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportImagePixelLocationParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImagePixelLocationParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImagePixelLocationParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImagePixelLocationParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for the [ImageryLayer.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computePixelSpaceLocations) or [imageService.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computePixelSpaceLocations) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationParameters.html)
    */
  open class Class ()
    extends StObject
       with ImagePixelLocationParameters {
    def this(properties: ImagePixelLocationParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImagePixelLocationParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportImagePixelLocationParametersMod.foo` */
  override def _to: js.Object & ImagePixelLocationParametersConstructor = ^
}
