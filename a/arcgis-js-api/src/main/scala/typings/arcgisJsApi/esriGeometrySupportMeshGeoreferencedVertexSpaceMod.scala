package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MeshGeoreferencedVertexSpace
import typings.arcgisJsApi.esri.MeshGeoreferencedVertexSpaceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGeometrySupportMeshGeoreferencedVertexSpaceMod {
  
  @JSImport("esri/geometry/support/MeshGeoreferencedVertexSpace", JSImport.Namespace)
  @js.native
  /**
  		 * A georeferenced mesh vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshGeoreferencedVertexSpace.html)
  		 */
  open class ^ ()
    extends StObject
       with MeshGeoreferencedVertexSpace {
    def this(properties: MeshGeoreferencedVertexSpaceProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/geometry/support/MeshGeoreferencedVertexSpace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): MeshGeoreferencedVertexSpace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[MeshGeoreferencedVertexSpace]
}
