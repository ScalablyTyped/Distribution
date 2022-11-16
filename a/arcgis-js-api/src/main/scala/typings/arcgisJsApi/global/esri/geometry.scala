package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ExtentProperties
import typings.arcgisJsApi.esri.MeshCreateBoxParams
import typings.arcgisJsApi.esri.MeshCreateCylinderParams
import typings.arcgisJsApi.esri.MeshCreateFromGLTFParams
import typings.arcgisJsApi.esri.MeshCreateFromPolygonParams
import typings.arcgisJsApi.esri.MeshCreatePlaneParams
import typings.arcgisJsApi.esri.MeshCreateSphereParams
import typings.arcgisJsApi.esri.MeshProperties
import typings.arcgisJsApi.esri.MultipointProperties
import typings.arcgisJsApi.esri.PointProperties
import typings.arcgisJsApi.esri.PolygonProperties
import typings.arcgisJsApi.esri.PolylineProperties
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/typescript-setup/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry.html)
  */
object geometry {
  
  object Extent {
    
    @JSGlobal("__esri.geometry.Extent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Extent]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Extent")
  @js.native
  /**
    * The minimum and maximum X and Y coordinates of a bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html)
    */
  open class ExtentCls ()
    extends StObject
       with typings.arcgisJsApi.esri.Extent {
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
    
    @JSGlobal("__esri.geometry.Mesh")
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
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Mesh")
  @js.native
  /**
    * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
    */
  open class MeshCls ()
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
  
  object Multipoint {
    
    @JSGlobal("__esri.geometry.Multipoint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Multipoint = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Multipoint]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Multipoint")
  @js.native
  /**
    * An ordered collection of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html)
    */
  open class MultipointCls ()
    extends StObject
       with typings.arcgisJsApi.esri.Multipoint {
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
    
    @JSGlobal("__esri.geometry.Point")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Point]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Point")
  @js.native
  /**
    * A location defined by X, Y, and Z coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html)
    */
  open class PointCls ()
    extends StObject
       with typings.arcgisJsApi.esri.Point {
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
    
    @JSGlobal("__esri.geometry.Polygon")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts the given Extent to a Polygon instance.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#fromExtent)
      */
    inline def fromExtent(extent: typings.arcgisJsApi.esri.Extent): typings.arcgisJsApi.esri.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polygon]
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Polygon = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polygon]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Polygon")
  @js.native
  /**
    * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
    */
  open class PolygonCls ()
    extends StObject
       with typings.arcgisJsApi.esri.Polygon {
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
    
    @JSGlobal("__esri.geometry.Polyline")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Polyline]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.Polyline")
  @js.native
  /**
    * A polyline contains an array of [paths](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths) and [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#spatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html)
    */
  open class PolylineCls ()
    extends StObject
       with typings.arcgisJsApi.esri.Polyline {
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
    
    @JSGlobal("__esri.geometry.SpatialReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A convenience spatial reference instance for WGS84.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WGS84)
      */
    @JSGlobal("__esri.geometry.SpatialReference.WGS84")
    @js.native
    def WGS84: typings.arcgisJsApi.esri.SpatialReference = js.native
    inline def WGS84_=(x: typings.arcgisJsApi.esri.SpatialReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WGS84")(x.asInstanceOf[js.Any])
    
    /**
      * A convenience spatial reference instance for Web Mercator.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#WebMercator)
      */
    @JSGlobal("__esri.geometry.SpatialReference.WebMercator")
    @js.native
    def WebMercator: typings.arcgisJsApi.esri.SpatialReference = js.native
    inline def WebMercator_=(x: typings.arcgisJsApi.esri.SpatialReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebMercator")(x.asInstanceOf[js.Any])
    
    inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SpatialReference = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SpatialReference]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("__esri.geometry.SpatialReference")
  @js.native
  /**
    * Defines the spatial reference of a view, layer, or method parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html)
    */
  open class SpatialReferenceCls ()
    extends StObject
       with typings.arcgisJsApi.esri.SpatialReference {
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
