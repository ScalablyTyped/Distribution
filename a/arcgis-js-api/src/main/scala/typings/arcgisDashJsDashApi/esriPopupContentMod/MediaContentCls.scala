package typings.arcgisDashJsDashApi.esriPopupContentMod

import typings.arcgisDashJsDashApi.__esri.MediaContentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/popup/content", "MediaContent")
@js.native
/**
  * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
  */
class MediaContentCls ()
  extends typings.arcgisDashJsDashApi.__esri.MediaContent {
  def this(properties: MediaContentProperties) = this()
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

