package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GeometryServiceProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.GeometryService")
@js.native
/**
  * Represents a geometry service resource exposed by the ArcGIS REST API. It is used to perform various operations on geometries such as project, simplify, buffer, and relationships.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html)
  */
class GeometryServiceCls ()
  extends typings.arcgisJsApi.esri.GeometryService {
  def this(properties: GeometryServiceProperties) = this()
}

