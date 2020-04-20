package typings.arcgisJsApi.featureTableMod

import typings.arcgisJsApi.esri.FeatureTable
import typings.arcgisJsApi.esri.FeatureTableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/FeatureTable", JSImport.Namespace)
@js.native
/**
  * This widget provides an interactive tabular view of each feature's attributes in a feature layer. When working with a large dataset, the table loads additional features as the user scrolls. Users can select rows (features) within the table.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html)
  */
class Class () extends FeatureTable {
  def this(properties: FeatureTableProperties) = this()
}

