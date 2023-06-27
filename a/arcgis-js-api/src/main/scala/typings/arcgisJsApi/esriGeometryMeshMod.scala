package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Mesh
import typings.arcgisJsApi.esri.MeshCreateBoxParams
import typings.arcgisJsApi.esri.MeshCreateCylinderParams
import typings.arcgisJsApi.esri.MeshCreateFromFilesParams
import typings.arcgisJsApi.esri.MeshCreateFromGLTFParams
import typings.arcgisJsApi.esri.MeshCreateFromPolygonParams
import typings.arcgisJsApi.esri.MeshCreatePlaneParams
import typings.arcgisJsApi.esri.MeshCreateSphereParams
import typings.arcgisJsApi.esri.MeshProperties
import typings.arcgisJsApi.esri.Point
import typings.arcgisJsApi.esri.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriGeometryMeshMod {
  
  @JSImport("esri/geometry/Mesh", JSImport.Namespace)
  @js.native
  /**
  		 * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
  		 */
  open class ^ ()
    extends StObject
       with Mesh {
    def this(properties: MeshProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/geometry/Mesh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  		 * Creates a mesh representing a box.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
  		 */
  inline def createBox(location: Point): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(location.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def createBox(location: Point, params: MeshCreateBoxParams): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  /**
  		 * Creates a mesh representing a cylinder.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
  		 */
  inline def createCylinder(location: Point): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createCylinder")(location.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def createCylinder(location: Point, params: MeshCreateCylinderParams): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createCylinder")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  /**
  		 * Creates a mesh geometry from a file or list of files and which is ready to be displayed in the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromFiles)
  		 */
  inline def createFromFiles(location: Point, files: js.Array[Any]): js.Promise[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFiles")(location.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Mesh]]
  inline def createFromFiles(location: Point, files: js.Array[Any], params: MeshCreateFromFilesParams): js.Promise[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFiles")(location.asInstanceOf[js.Any], files.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Mesh]]
  
  /**
  		 * Creates a new mesh geometry from a glTF model referenced by the `url` parameter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromGLTF)
  		 */
  inline def createFromGLTF(location: Point, url: String): js.Promise[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromGLTF")(location.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Mesh]]
  inline def createFromGLTF(location: Point, url: String, params: MeshCreateFromGLTFParams): js.Promise[Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromGLTF")(location.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Mesh]]
  
  /**
  		 * Creates a new mesh geometry from a polygon geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
  		 */
  inline def createFromPolygon(polygon: Polygon): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPolygon")(polygon.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def createFromPolygon(polygon: Polygon, params: MeshCreateFromPolygonParams): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromPolygon")(polygon.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  /**
  		 * Creates a mesh representing a plane.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
  		 */
  inline def createPlane(location: Point): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlane")(location.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def createPlane(location: Point, params: MeshCreatePlaneParams): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlane")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  /**
  		 * Creates a mesh representing a sphere.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
  		 */
  inline def createSphere(location: Point): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createSphere")(location.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def createSphere(location: Point, params: MeshCreateSphereParams): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createSphere")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  inline def fromJSON(json: Any): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Mesh]
}
