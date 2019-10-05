package typings.arcgisDashJsDashApi.esriPopupContentContentMod

import typings.arcgisDashJsDashApi.__esri.Content
import typings.arcgisDashJsDashApi.__esri.ContentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/popup/content/Content", JSImport.Namespace)
@js.native
/**
  * Content elements define what should display within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content. There are four specific element types:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html)
  */
class Class () extends Content {
  def this(properties: ContentProperties) = this()
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

