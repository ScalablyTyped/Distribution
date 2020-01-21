package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryPoint
  - typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryMultipoint
  - typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolyline
  - typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolygon
  - typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryEnvelope
*/
trait esriGeometryType extends js.Object

object esriGeometryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def esriGeometryEnvelope: typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryEnvelope = this.cast("esriGeometryEnvelope")
  @scala.inline
  def esriGeometryMultipoint: typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryMultipoint = this.cast("esriGeometryMultipoint")
  @scala.inline
  def esriGeometryPoint: typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryPoint = this.cast("esriGeometryPoint")
  @scala.inline
  def esriGeometryPolygon: typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolygon = this.cast("esriGeometryPolygon")
  @scala.inline
  def esriGeometryPolyline: typings.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolyline = this.cast("esriGeometryPolyline")
}

