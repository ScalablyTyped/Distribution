package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVLayerConstructor
  extends /**
  * The CSVLayer is a point layer based on a CSV file (.csv, .txt). CSV is a plain-text file format used to represent tabular data, including geographic point features (latitude, longitude). Typically the latitude coordinate is the Y value, and the longitude coordinate is the X value. Features from the CSV file are accessible via the API so you can query features and use them as input to geometry or geoprocessing services.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html)
  */
Instantiable0[CSVLayer]
     with Instantiable1[/* properties */ CSVLayerProperties, CSVLayer] {
  def fromJSON(json: js.Any): CSVLayer = js.native
}

