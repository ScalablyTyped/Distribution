package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.attachments
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.fields
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.media
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content
  extends Accessor
     with JSONSupport {
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html#type)
    */
  val `type`: text | fields | media | attachments = js.native
}

@JSGlobal("__esri.Content")
@js.native
object Content extends TopLevel[ContentConstructor]

