package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content
  extends Accessor
     with JSONSupport {
  /**
    * The type of popup element displayed.  **Possible values**: text | fields | media | attachments
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html#type)
    */
  val `type`: String = js.native
}

@JSGlobal("__esri.Content")
@js.native
object Content extends TopLevel[ContentConstructor]

