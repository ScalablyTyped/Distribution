package typings.arcgisDashJsDashApi.esriLayersSupportLabelClassMod

import typings.arcgisDashJsDashApi.__esri.LabelClass
import typings.arcgisDashJsDashApi.__esri.LabelClassProperties
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
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

