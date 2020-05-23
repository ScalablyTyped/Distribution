package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ServiceAreaTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.ServiceAreaTask")
@js.native
/**
  * ServiceAreaTask helps you find service areas around any location on a network. A network service area is a region that encompasses all accessible streets (streets that are within a specified impedance). For instance, the 5-minute service area for a point includes all the streets that can be reached within five minutes from that point.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html)
  */
class ServiceAreaTaskCls ()
  extends typings.arcgisJsApi.esri.ServiceAreaTask {
  def this(properties: ServiceAreaTaskProperties) = this()
}

