package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.algorithmic
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.multipart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorRamp
  extends Accessor
     with JSONSupport {
  /**
    * A string value representing the color ramp type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ColorRamp.html#type)
    */
  val `type`: algorithmic | multipart = js.native
}

@JSGlobal("__esri.ColorRamp")
@js.native
object ColorRamp extends TopLevel[ColorRampConstructor]

