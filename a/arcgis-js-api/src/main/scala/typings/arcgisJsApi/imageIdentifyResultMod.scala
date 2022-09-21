package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ImageIdentifyResult
import typings.arcgisJsApi.esri.ImageIdentifyResultConstructor
import typings.arcgisJsApi.esri.ImageIdentifyResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageIdentifyResultMod extends Shortcut {
  
  @JSImport("esri/rest/support/ImageIdentifyResult", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ImageIdentifyResultConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/ImageIdentifyResult", JSImport.Namespace)
  @js.native
  /**
    * The results from [imageService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html)
    */
  open class Class ()
    extends StObject
       with ImageIdentifyResult {
    def this(properties: ImageIdentifyResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  type _To = js.Object & ImageIdentifyResultConstructor
  
  /* This means you don't have to write `^`, but can instead just say `imageIdentifyResultMod.foo` */
  override def _to: js.Object & ImageIdentifyResultConstructor = ^
}
