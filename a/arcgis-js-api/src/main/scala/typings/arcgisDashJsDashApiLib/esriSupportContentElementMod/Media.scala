package typings
package arcgisDashJsDashApiLib.esriSupportContentElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/support/ContentElement", "Media")
@js.native
/**
  * A `MediaContentElement` represents an individual or array of [Media](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Media.html) elements to display within a popup's content. Examples of these types of media are [charts](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart.html) and/or [images](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Image.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media.html)
  */
class MediaCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Media {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MediaProperties) = this()
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

