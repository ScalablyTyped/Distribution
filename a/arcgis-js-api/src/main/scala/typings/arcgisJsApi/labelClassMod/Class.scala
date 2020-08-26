package typings.arcgisJsApi.labelClassMod

import typings.arcgisJsApi.esri.LabelClass
import typings.arcgisJsApi.esri.LabelClassProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/LabelClass", JSImport.Namespace)
@js.native
/**
  * Defines label expressions, symbols, scale ranges, label priorities, and label placement options for labels on a layer. See the [Labeling guide](https://developers.arcgis.com/javascript/latest/guide/labeling/index.html) for more information about labeling.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html)
  */
class Class () extends LabelClass {
  def this(properties: LabelClassProperties) = this()
}

