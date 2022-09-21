package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageAngleResult
import typings.arcgisJsApi.esri.ImageAngleResultConstructor
import typings.arcgisJsApi.esri.ImageAngleResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageAngleResultMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImageAngleResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageAngleResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImageAngleResult", JSImport.Namespace)
  @js.native
  /**
    * The results from [imageService.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeAngles) or [ImageryLayer.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeAngles) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html)
    */
  open class Class ()
    extends StObject
       with ImageAngleResult {
    def this(properties: ImageAngleResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageAngleResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageAngleResultMod.foo` */
  override def _to: js.Object & ImageAngleResultConstructor = ^
}
