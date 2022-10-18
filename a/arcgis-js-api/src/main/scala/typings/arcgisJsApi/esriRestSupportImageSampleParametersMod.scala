package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageSampleParameters
import typings.arcgisJsApi.esri.ImageSampleParametersConstructor
import typings.arcgisJsApi.esri.ImageSampleParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportImageSampleParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImageSampleParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageSampleParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImageSampleParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for the [getSamples()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleParameters.html)
    */
  open class Class ()
    extends StObject
       with ImageSampleParameters {
    def this(properties: ImageSampleParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageSampleParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportImageSampleParametersMod.foo` */
  override def _to: js.Object & ImageSampleParametersConstructor = ^
}
