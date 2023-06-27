package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MeshLocalVertexSpace
import typings.arcgisJsApi.esri.MeshLocalVertexSpaceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGeometrySupportMeshLocalVertexSpaceMod {
  
  @JSImport("esri/geometry/support/MeshLocalVertexSpace", JSImport.Namespace)
  @js.native
  /**
  		 * A local mesh vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshLocalVertexSpace.html)
  		 */
  open class ^ ()
    extends StObject
       with MeshLocalVertexSpace {
    def this(properties: MeshLocalVertexSpaceProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/geometry/support/MeshLocalVertexSpace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): MeshLocalVertexSpace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[MeshLocalVertexSpace]
}
