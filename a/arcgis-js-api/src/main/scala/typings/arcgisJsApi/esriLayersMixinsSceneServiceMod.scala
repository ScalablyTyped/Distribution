package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SceneService
import typings.arcgisJsApi.esri.SceneServiceProperties
import typings.arcgisJsApi.esri.SceneServiceVersion
import typings.arcgisJsApi.esri.SpatialReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersMixinsSceneServiceMod {
  
  @JSImport("esri/layers/mixins/SceneService", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SceneService {
    def this(properties: SceneServiceProperties) = this()
    
    /**
    		 * The copyright text as defined by the scene service.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#copyright)
    		 */
    /* CompleteClass */
    var copyright: String = js.native
    
    /**
    		 * The layer ID, or layer index, of a Scene Service layer.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId)
    		 */
    /* CompleteClass */
    var layerId: Double = js.native
    
    /**
    		 * The spatial reference of the layer.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#spatialReference)
    		 */
    /* CompleteClass */
    var spatialReference: SpatialReference = js.native
    
    /**
    		 * The URL of the REST endpoint of the layer or scene service.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url)
    		 */
    /* CompleteClass */
    var url: String = js.native
    
    /**
    		 * The version of the scene service specification used for this service.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
    		 */
    /* CompleteClass */
    override val version: SceneServiceVersion = js.native
  }
  @JSImport("esri/layers/mixins/SceneService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): SceneService = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[SceneService]
}
