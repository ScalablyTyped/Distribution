package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshGeoreferencedVertexSpaceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.MeshGeoreferencedVertexSpace")
@js.native
/**
		 * A georeferenced mesh vertex space.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshGeoreferencedVertexSpace.html)
		 */
open class MeshGeoreferencedVertexSpace ()
  extends StObject
     with typings.arcgisJsApi.esri.MeshGeoreferencedVertexSpace {
  def this(properties: MeshGeoreferencedVertexSpaceProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object MeshGeoreferencedVertexSpace {
  
  @JSGlobal("__esri.MeshGeoreferencedVertexSpace")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.MeshGeoreferencedVertexSpace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.MeshGeoreferencedVertexSpace]
}
