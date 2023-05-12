package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImageAreaParameters
import typings.arcgisJsApi.esri.ImageAreaParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportImageAreaParametersMod {
  
  @JSImport("esri/rest/support/ImageAreaParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters used by  the [ImageryLayer.measureAreaAndPerimeter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measureAreaAndPerimeter) and [imageService.measureAreaAndPerimeter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureAreaAndPerimeter) methods to perform imagery area and perimeter mensuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaParameters.html)
    */
  open class ^ ()
    extends StObject
       with ImageAreaParameters {
    def this(properties: ImageAreaParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ImageAreaParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImageAreaParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImageAreaParameters]
}
