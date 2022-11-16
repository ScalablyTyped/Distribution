package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SceneModification
import typings.arcgisJsApi.esri.SceneModificationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportSceneModificationMod {
  
  @JSImport("esri/layers/support/SceneModification", JSImport.Namespace)
  @js.native
  /**
    * The SceneModification is used to perform a client-side geometric modifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html)
    */
  open class ^ ()
    extends StObject
       with SceneModification {
    def this(properties: SceneModificationProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/support/SceneModification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SceneModification = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SceneModification]
}
