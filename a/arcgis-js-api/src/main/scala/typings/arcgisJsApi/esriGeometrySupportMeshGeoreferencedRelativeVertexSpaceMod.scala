package typings.arcgisJsApi

import typings.arcgisJsApi.esri.MeshGeoreferencedRelativeVertexSpace
import typings.arcgisJsApi.esri.MeshGeoreferencedRelativeVertexSpaceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGeometrySupportMeshGeoreferencedRelativeVertexSpaceMod {
  
  @JSImport("esri/geometry/support/MeshGeoreferencedRelativeVertexSpace", JSImport.Namespace)
  @js.native
  /**
  		 * A georeferenced relative mesh vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshGeoreferencedRelativeVertexSpace.html)
  		 */
  open class ^ ()
    extends StObject
       with MeshGeoreferencedRelativeVertexSpace {
    def this(properties: MeshGeoreferencedRelativeVertexSpaceProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/geometry/support/MeshGeoreferencedRelativeVertexSpace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): MeshGeoreferencedRelativeVertexSpace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[MeshGeoreferencedRelativeVertexSpace]
}
