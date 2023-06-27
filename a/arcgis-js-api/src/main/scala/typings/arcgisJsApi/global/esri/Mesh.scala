package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MeshCreateBoxParams
import typings.arcgisJsApi.esri.MeshCreateCylinderParams
import typings.arcgisJsApi.esri.MeshCreateFromFilesParams
import typings.arcgisJsApi.esri.MeshCreateFromGLTFParams
import typings.arcgisJsApi.esri.MeshCreateFromPolygonParams
import typings.arcgisJsApi.esri.MeshCreatePlaneParams
import typings.arcgisJsApi.esri.MeshCreateSphereParams
import typings.arcgisJsApi.esri.MeshProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Mesh")
@js.native
/**
		 * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
		 */
open class Mesh ()
  extends StObject
     with typings.arcgisJsApi.esri.Mesh {
  def this(properties: MeshProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Mesh {
  
  @JSGlobal("__esri.Mesh")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a mesh representing a box.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
  		 */
  inline def createBox(location: typings.arcgisJsApi.esri.Point): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(location.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  inline def createBox(location: typings.arcgisJsApi.esri.Point, params: MeshCreateBoxParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  
  /**
  		 * Creates a mesh representing a cylinder.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
  		 */
  inline def createCylinder(location: typings.arcgisJsApi.esri.Point): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createCylinder")(location.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  inline def createCylinder(location: typings.arcgisJsApi.esri.Point, params: MeshCreateCylinderParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createCylinder")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  
  /**
  		 * Creates a mesh geometry from a file or list of files and which is ready to be displayed in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromFiles)
  		 */
  inline def createFromFiles(location: typings.arcgisJsApi.esri.Point, files: js.Array[Any]): js.Promise[typings.arcgisJsApi.esri.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFiles")(location.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Mesh]]
  inline def createFromFiles(location: typings.arcgisJsApi.esri.Point, files: js.Array[Any], params: MeshCreateFromFilesParams): js.Promise[typings.arcgisJsApi.esri.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFiles")(location.asInstanceOf[js.Any], files.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Mesh]]
  
  /**
  		 * Creates a new mesh geometry from a glTF model referenced by the `url` parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromGLTF)
  		 */
  inline def createFromGLTF(location: typings.arcgisJsApi.esri.Point, url: String): js.Promise[typings.arcgisJsApi.esri.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromGLTF")(location.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Mesh]]
  inline def createFromGLTF(location: typings.arcgisJsApi.esri.Point, url: String, params: MeshCreateFromGLTFParams): js.Promise[typings.arcgisJsApi.esri.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromGLTF")(location.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Mesh]]
  
  /**
  		 * Creates a new mesh geometry from a polygon geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
  		 */
  inline def createFromPolygon(polygon: typings.arcgisJsApi.esri.Polygon): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPolygon")(polygon.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  inline def createFromPolygon(polygon: typings.arcgisJsApi.esri.Polygon, params: MeshCreateFromPolygonParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromPolygon")(polygon.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  
  /**
  		 * Creates a mesh representing a plane.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
  		 */
  inline def createPlane(location: typings.arcgisJsApi.esri.Point): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlane")(location.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  inline def createPlane(location: typings.arcgisJsApi.esri.Point, params: MeshCreatePlaneParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlane")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  
  /**
  		 * Creates a mesh representing a sphere.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  inline def createSphere(location: typings.arcgisJsApi.esri.Point): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createSphere")(location.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  inline def createSphere(location: typings.arcgisJsApi.esri.Point, params: MeshCreateSphereParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createSphere")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
}
