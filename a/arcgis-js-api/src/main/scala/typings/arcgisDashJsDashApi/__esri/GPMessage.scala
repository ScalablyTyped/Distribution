package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`process-definition`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`process-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`process-stop`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.abort
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.empty
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.error
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.informative
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.warning
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
    * The geoprocessing message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#type)
    */
  var `type`: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort = js.native
}

@JSGlobal("__esri.GPMessage")
@js.native
object GPMessage extends TopLevel[GPMessageConstructor]

