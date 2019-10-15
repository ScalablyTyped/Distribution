package typings.arcgisDashJsDashApi.esriWebsceneBackgroundBackgroundMod

import typings.arcgisDashJsDashApi.__esri.Background
import typings.arcgisDashJsDashApi.__esri.BackgroundProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/webscene/background/Background", JSImport.Namespace)
@js.native
/**
  * The background of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) that lies behind the sky, atmosphere and stars.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-background-Background.html)
  */
class Class () extends Background {
  def this(properties: BackgroundProperties) = this()
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

