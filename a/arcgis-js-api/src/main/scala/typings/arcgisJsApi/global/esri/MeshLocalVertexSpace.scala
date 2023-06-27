package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshLocalVertexSpaceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.MeshLocalVertexSpace")
@js.native
/**
		 * A local mesh vertex space.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshLocalVertexSpace.html)
		 */
open class MeshLocalVertexSpace ()
  extends StObject
     with typings.arcgisJsApi.esri.MeshLocalVertexSpace {
  def this(properties: MeshLocalVertexSpaceProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object MeshLocalVertexSpace {
  
  @JSGlobal("__esri.MeshLocalVertexSpace")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.MeshLocalVertexSpace = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.MeshLocalVertexSpace]
}
