package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageValue
  extends Accessor
     with JSONSupport {
  /**
    * A string containing a URL to be launched in a browser when a user clicks the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Image-Value.html#linkURL)
    */
  var linkURL: java.lang.String = js.native
  /**
    * A string containing the URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Image-Value.html#sourceURL)
    */
  var sourceURL: java.lang.String = js.native
}

@JSGlobal("__esri.ImageValue")
@js.native
class ImageValueCls () extends ImageValue {
  def this(properties: ImageValueProperties) = this()
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

