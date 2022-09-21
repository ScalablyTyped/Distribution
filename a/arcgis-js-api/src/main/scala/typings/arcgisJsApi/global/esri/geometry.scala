package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ExtentConstructor
import typings.arcgisJsApi.esri.ExtentProperties
import typings.arcgisJsApi.esri.MeshConstructor
import typings.arcgisJsApi.esri.MeshProperties
import typings.arcgisJsApi.esri.MultipointConstructor
import typings.arcgisJsApi.esri.MultipointProperties
import typings.arcgisJsApi.esri.PointConstructor
import typings.arcgisJsApi.esri.PointProperties
import typings.arcgisJsApi.esri.PolygonConstructor
import typings.arcgisJsApi.esri.PolygonProperties
import typings.arcgisJsApi.esri.PolylineConstructor
import typings.arcgisJsApi.esri.PolylineProperties
import typings.arcgisJsApi.esri.SpatialReferenceConstructor
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
  
  @JSGlobal("__esri.geometry.Extent")
  @js.native
  val Extent: ExtentConstructor = js.native
  
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
  
  @JSGlobal("__esri.geometry.Mesh")
  @js.native
  val Mesh: MeshConstructor = js.native
  
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
  
  @JSGlobal("__esri.geometry.Multipoint")
  @js.native
  val Multipoint: MultipointConstructor = js.native
  
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
  
  @JSGlobal("__esri.geometry.Point")
  @js.native
  val Point: PointConstructor = js.native
  
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
  
  @JSGlobal("__esri.geometry.Polygon")
  @js.native
  val Polygon: PolygonConstructor = js.native
  
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
  
  @JSGlobal("__esri.geometry.Polyline")
  @js.native
  val Polyline: PolylineConstructor = js.native
  
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
  
  @JSGlobal("__esri.geometry.SpatialReference")
  @js.native
  val SpatialReference: SpatialReferenceConstructor = js.native
  
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
