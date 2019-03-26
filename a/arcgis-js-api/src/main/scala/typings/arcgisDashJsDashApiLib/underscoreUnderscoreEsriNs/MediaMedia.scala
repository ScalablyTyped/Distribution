package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaMedia
  extends Accessor
     with JSONSupport {
  /**
    * Defines a caption for the media.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Media.html#caption)
    */
  var caption: java.lang.String = js.native
  /**
    * The title of the media element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Media.html#title)
    */
  var title: java.lang.String = js.native
  /**
    * The type of media element displayed. **Possible values**: image | bar-chart | column-chart | line-chart | pie-chart
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Media.html#type)
    */
  val `type`: java.lang.String = js.native
}

@JSGlobal("__esri.MediaMedia")
@js.native
class MediaMediaCls () extends MediaMedia {
  def this(properties: MediaMediaProperties) = this()
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

