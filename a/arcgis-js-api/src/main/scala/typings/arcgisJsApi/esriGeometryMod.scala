package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Extent
import typings.arcgisJsApi.esri.ExtentProperties
import typings.arcgisJsApi.esri.Mesh
import typings.arcgisJsApi.esri.MeshCreateBoxParams
import typings.arcgisJsApi.esri.MeshCreateCylinderParams
import typings.arcgisJsApi.esri.MeshCreateFromFilesParams
import typings.arcgisJsApi.esri.MeshCreateFromGLTFParams
import typings.arcgisJsApi.esri.MeshCreateFromPolygonParams
import typings.arcgisJsApi.esri.MeshCreatePlaneParams
import typings.arcgisJsApi.esri.MeshCreateSphereParams
import typings.arcgisJsApi.esri.MeshProperties
import typings.arcgisJsApi.esri.Multipoint
import typings.arcgisJsApi.esri.MultipointProperties
import typings.arcgisJsApi.esri.Point
import typings.arcgisJsApi.esri.PointProperties
import typings.arcgisJsApi.esri.Polygon
import typings.arcgisJsApi.esri.PolygonProperties
import typings.arcgisJsApi.esri.Polyline
import typings.arcgisJsApi.esri.PolylineProperties
import typings.arcgisJsApi.esri.SpatialReference
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriGeometryMod {
  
  object Extent {
    
    @JSImport("esri/geometry", "Extent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Extent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Extent")
  @js.native
  /**
  		 * The minimum and maximum X and Y coordinates of a bounding box.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html)
  		 */
  open class ExtentCls ()
    extends StObject
       with Extent {
    def this(properties: ExtentProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object Mesh {
    
    @JSImport("esri/geometry", "Mesh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    		 * Creates a mesh representing a box.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
    		 */
    inline def createBox(location: Point): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(location.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    inline def createBox(location: Point, params: MeshCreateBoxParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createBox")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    
    /**
    		 * Creates a mesh representing a cylinder.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    		 */
    inline def createCylinder(location: Point): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createCylinder")(location.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    inline def createCylinder(location: Point, params: MeshCreateCylinderParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createCylinder")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    
    /**
    		 * Creates a mesh geometry from a file or list of files and which is ready to be displayed in the view.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromFiles)
    		 */
    inline def createFromFiles(location: Point, files: js.Array[Any]): js.Promise[typings.arcgisJsApi.esri.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFiles")(location.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Mesh]]
    inline def createFromFiles(location: Point, files: js.Array[Any], params: MeshCreateFromFilesParams): js.Promise[typings.arcgisJsApi.esri.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFiles")(location.asInstanceOf[js.Any], files.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Mesh]]
    
    /**
    		 * Creates a new mesh geometry from a glTF model referenced by the `url` parameter.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromGLTF)
    		 */
    inline def createFromGLTF(location: Point, url: String): js.Promise[typings.arcgisJsApi.esri.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromGLTF")(location.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Mesh]]
    inline def createFromGLTF(location: Point, url: String, params: MeshCreateFromGLTFParams): js.Promise[typings.arcgisJsApi.esri.Mesh] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromGLTF")(location.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.arcgisJsApi.esri.Mesh]]
    
    /**
    		 * Creates a new mesh geometry from a polygon geometry.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
    		 */
    inline def createFromPolygon(polygon: Polygon): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPolygon")(polygon.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    inline def createFromPolygon(polygon: Polygon, params: MeshCreateFromPolygonParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromPolygon")(polygon.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    
    /**
    		 * Creates a mesh representing a plane.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    		 */
    inline def createPlane(location: Point): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createPlane")(location.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    inline def createPlane(location: Point, params: MeshCreatePlaneParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createPlane")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    
    /**
    		 * Creates a mesh representing a sphere.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    		 */
    inline def createSphere(location: Point): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("createSphere")(location.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    inline def createSphere(location: Point, params: MeshCreateSphereParams): typings.arcgisJsApi.esri.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("createSphere")(location.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Mesh]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Mesh")
  @js.native
  /**
  		 * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
  		 */
  open class MeshCls ()
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
  
  object Multipoint {
    
    @JSImport("esri/geometry", "Multipoint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Multipoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Multipoint]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Multipoint")
  @js.native
  /**
  		 * An ordered collection of points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html)
  		 */
  open class MultipointCls ()
    extends StObject
       with Multipoint {
    def this(properties: MultipointProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object Point {
    
    @JSImport("esri/geometry", "Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Point]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Point")
  @js.native
  /**
  		 * A location defined by X, Y, and Z coordinates.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html)
  		 */
  open class PointCls ()
    extends StObject
       with Point {
    def this(properties: PointProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object Polygon {
    
    @JSImport("esri/geometry", "Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    		 * Converts the given Extent to a Polygon instance.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#fromExtent)
    		 */
    inline def fromExtent(extent: Extent): typings.arcgisJsApi.esri.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polygon]
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polygon]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Polygon")
  @js.native
  /**
  		 * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
  		 */
  open class PolygonCls ()
    extends StObject
       with Polygon {
    def this(properties: PolygonProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object Polyline {
    
    @JSImport("esri/geometry", "Polyline")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polyline]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Polyline")
  @js.native
  /**
  		 * A polyline contains an array of [paths](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths) and [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#spatialReference).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html)
  		 */
  open class PolylineCls ()
    extends StObject
       with Polyline {
    def this(properties: PolylineProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  
  object SpatialReference {
    
    @JSImport("esri/geometry", "SpatialReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
    		 * A convenience spatial reference instance for WGS84.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WGS84)
    		 */
    @JSImport("esri/geometry", "SpatialReference.WGS84")
    @js.native
    def WGS84: typings.arcgisJsApi.esri.SpatialReference = js.native
    inline def WGS84_=(x: typings.arcgisJsApi.esri.SpatialReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WGS84")(x.asInstanceOf[js.Any])
    
    /**
    		 * A convenience spatial reference instance for Web Mercator.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WebMercator)
    		 */
    @JSImport("esri/geometry", "SpatialReference.WebMercator")
    @js.native
    def WebMercator: typings.arcgisJsApi.esri.SpatialReference = js.native
    inline def WebMercator_=(x: typings.arcgisJsApi.esri.SpatialReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebMercator")(x.asInstanceOf[js.Any])
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SpatialReference]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "SpatialReference")
  @js.native
  /**
  		 * Defines the spatial reference of a view, layer, or method parameters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html)
  		 */
  open class SpatialReferenceCls ()
    extends StObject
       with SpatialReference {
    def this(properties: SpatialReferenceProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
