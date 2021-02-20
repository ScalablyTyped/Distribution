package typings.arcgisJsApi

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryMod {
  
  @JSImport("esri/geometry", "Extent")
  @js.native
  val Extent: ExtentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Extent")
  @js.native
  class ExtentCls ()
    extends typings.arcgisJsApi.esri.Extent {
    def this(properties: ExtentProperties) = this()
  }
  
  @JSImport("esri/geometry", "Mesh")
  @js.native
  val Mesh: MeshConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Mesh")
  @js.native
  /**
    * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
    */
  class MeshCls ()
    extends typings.arcgisJsApi.esri.Mesh {
    def this(properties: MeshProperties) = this()
  }
  
  @JSImport("esri/geometry", "Multipoint")
  @js.native
  val Multipoint: MultipointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Multipoint")
  @js.native
  class MultipointCls ()
    extends typings.arcgisJsApi.esri.Multipoint {
    def this(properties: MultipointProperties) = this()
  }
  
  @JSImport("esri/geometry", "Point")
  @js.native
  val Point: PointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Point")
  @js.native
  /**
    * A location defined by X, Y, and Z coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html)
    */
  class PointCls ()
    extends typings.arcgisJsApi.esri.Point {
    def this(properties: PointProperties) = this()
  }
  
  @JSImport("esri/geometry", "Polygon")
  @js.native
  val Polygon: PolygonConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Polygon")
  @js.native
  /**
    * A polygon contains an array of [rings](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings) and a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#spatialReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html)
    */
  class PolygonCls ()
    extends typings.arcgisJsApi.esri.Polygon {
    def this(properties: PolygonProperties) = this()
  }
  
  @JSImport("esri/geometry", "Polyline")
  @js.native
  val Polyline: PolylineConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "Polyline")
  @js.native
  class PolylineCls ()
    extends typings.arcgisJsApi.esri.Polyline {
    def this(properties: PolylineProperties) = this()
  }
  
  @JSImport("esri/geometry", "SpatialReference")
  @js.native
  val SpatialReference: SpatialReferenceConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry", "SpatialReference")
  @js.native
  class SpatialReferenceCls ()
    extends typings.arcgisJsApi.esri.SpatialReference {
    def this(properties: SpatialReferenceProperties) = this()
  }
}
