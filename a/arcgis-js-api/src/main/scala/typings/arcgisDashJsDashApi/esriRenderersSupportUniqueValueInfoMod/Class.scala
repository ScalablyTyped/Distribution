package typings.arcgisDashJsDashApi.esriRenderersSupportUniqueValueInfoMod

import typings.arcgisDashJsDashApi.__esri.UniqueValueInfo
import typings.arcgisDashJsDashApi.__esri.UniqueValueInfoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/renderers/support/UniqueValueInfo", JSImport.Namespace)
@js.native
/**
  * Defines the symbols to use in a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html). Each unique value info defines a [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#symbol) that should be used to represent features with a specific [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html#value).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueInfo.html)
  */
class Class () extends UniqueValueInfo {
  def this(properties: UniqueValueInfoProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

