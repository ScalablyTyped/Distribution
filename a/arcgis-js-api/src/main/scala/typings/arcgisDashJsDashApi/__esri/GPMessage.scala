package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GPMessage
  extends Accessor
     with JSONSupport {
  /**
    * The geoprocessing message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#description)
    */
  var description: String = js.native
  /**
    * The geoprocessing message type.  **Possible Values:** informative | process-definition | process-start | process-stop | warning | error | empty | abort
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#type)
    */
  var `type`: String = js.native
}

@JSGlobal("__esri.GPMessage")
@js.native
object GPMessage extends TopLevel[GPMessageConstructor]

