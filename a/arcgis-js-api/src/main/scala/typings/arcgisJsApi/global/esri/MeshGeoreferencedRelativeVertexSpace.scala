package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshGeoreferencedRelativeVertexSpaceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.MeshGeoreferencedRelativeVertexSpace")
@js.native
/**
		 * A georeferenced relative mesh vertex space.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshGeoreferencedRelativeVertexSpace.html)
		 */
open class MeshGeoreferencedRelativeVertexSpace ()
  extends StObject
     with typings.arcgisJsApi.esri.MeshGeoreferencedRelativeVertexSpace {
  def this(properties: MeshGeoreferencedRelativeVertexSpaceProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object MeshGeoreferencedRelativeVertexSpace {
  
  @JSGlobal("__esri.MeshGeoreferencedRelativeVertexSpace")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.MeshGeoreferencedRelativeVertexSpace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.MeshGeoreferencedRelativeVertexSpace]
}
