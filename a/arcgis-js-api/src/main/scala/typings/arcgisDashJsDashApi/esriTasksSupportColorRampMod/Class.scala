package typings.arcgisDashJsDashApi.esriTasksSupportColorRampMod

import typings.arcgisDashJsDashApi.__esri.ColorRamp
import typings.arcgisDashJsDashApi.__esri.ColorRampProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/tasks/support/ColorRamp", JSImport.Namespace)
@js.native
/**
  * A ColorRamp object is used to specify a range of colors that are applied to a group of symbols or pixels.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ColorRamp.html)
  */
class Class () extends ColorRamp {
  def this(properties: ColorRampProperties) = this()
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

