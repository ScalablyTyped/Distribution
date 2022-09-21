package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImagePixelLocationResult
import typings.arcgisJsApi.esri.ImagePixelLocationResultConstructor
import typings.arcgisJsApi.esri.ImagePixelLocationResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagePixelLocationResultMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImagePixelLocationResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImagePixelLocationResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImagePixelLocationResult", JSImport.Namespace)
  @js.native
  /**
    * The results from [imageService.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computePixelSpaceLocations) or [ImageryLayer.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computePixelSpaceLocations) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationResult.html)
    */
  open class Class ()
    extends StObject
       with ImagePixelLocationResult {
    def this(properties: ImagePixelLocationResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImagePixelLocationResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imagePixelLocationResultMod.foo` */
  override def _to: js.Object & ImagePixelLocationResultConstructor = ^
}
