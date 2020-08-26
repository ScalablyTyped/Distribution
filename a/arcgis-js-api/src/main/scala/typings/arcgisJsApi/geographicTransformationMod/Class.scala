package typings.arcgisJsApi.geographicTransformationMod

import typings.arcgisJsApi.esri.GeographicTransformation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/geometry/support/GeographicTransformation", JSImport.Namespace)
@js.native
/**
  * Projecting your data between coordinate systems sometimes requires transforming between geographic coordinate systems. Geographic transformations are used to transform coordinates between spatial references that have different geographic coordinate systems, and thus different datums. Using the most suitable transformation ensures the best possible accuracy when converting geometries from one spatial reference to another.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html)
  */
class Class () extends GeographicTransformation {
  def this(properties: js.Any) = this()
}

