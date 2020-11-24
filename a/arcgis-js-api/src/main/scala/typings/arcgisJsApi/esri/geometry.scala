package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry.html)
  */
@JSGlobal("__esri.geometry")
@js.native
object geometry extends js.Object {
  
  /* Rewritten from type alias, can be one of: 
    - typings.arcgisJsApi.esri.Extent
    - typings.arcgisJsApi.esri.Multipoint
    - typings.arcgisJsApi.esri.Point
    - typings.arcgisJsApi.esri.Polygon
    - typings.arcgisJsApi.esri.Polyline
    - typings.arcgisJsApi.esri.Mesh
  */
  trait Geometry extends js.Object
  
  type Extent = typings.arcgisJsApi.esri.Extent
  
  type Mesh = typings.arcgisJsApi.esri.Mesh
  
  type Multipoint = typings.arcgisJsApi.esri.Multipoint
  
  type Point = typings.arcgisJsApi.esri.Point
  
  type Polygon = typings.arcgisJsApi.esri.Polygon
  
  type Polyline = typings.arcgisJsApi.esri.Polyline
  
  type SpatialReference = typings.arcgisJsApi.esri.SpatialReference
}
