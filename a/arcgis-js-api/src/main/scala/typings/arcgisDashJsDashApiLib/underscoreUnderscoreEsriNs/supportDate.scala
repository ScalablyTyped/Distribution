package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait supportDate
  extends Accessor
     with JSONSupport {
  /**
    * Date value returned from server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Date.html#date)
    */
  var date: stdLib.Date = js.native
  /**
    * The format of the date used in the date property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Date.html#format)
    *
    * @default EEE MMM dd HH:mm:ss zzz yyyy
    */
  var format: java.lang.String = js.native
}

@JSGlobal("__esri.supportDate")
@js.native
class supportDateCls () extends supportDate {
  def this(properties: supportDateProperties) = this()
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

