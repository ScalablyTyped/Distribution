package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NAMessage
  extends Accessor
     with JSONSupport {
  /**
    * A description of the network analyst message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#description)
    */
  var description: String = js.native
  /**
    * The network analyst message type.  **Possible Values:** informative | process-definition | process-start | process-stop | warning | error | empty | abort
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-NAMessage.html#type)
    */
  var `type`: String = js.native
}

@JSGlobal("__esri.NAMessage")
@js.native
object NAMessage extends TopLevel[NAMessageConstructor]

