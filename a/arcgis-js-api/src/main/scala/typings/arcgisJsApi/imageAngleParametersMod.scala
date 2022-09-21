package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageAngleParameters
import typings.arcgisJsApi.esri.ImageAngleParametersConstructor
import typings.arcgisJsApi.esri.ImageAngleParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageAngleParametersMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImageAngleParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageAngleParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImageAngleParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [ImageryLayer.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeAngles) or [imageService.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeAngles) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html)
    */
  open class Class ()
    extends StObject
       with ImageAngleParameters {
    def this(properties: ImageAngleParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageAngleParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageAngleParametersMod.foo` */
  override def _to: js.Object & ImageAngleParametersConstructor = ^
}
