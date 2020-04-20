package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edits extends Accessor {
  /**
    * The feature to be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html#feature)
    */
  val feature: Graphic = js.native
  /**
    * When true, the edited feature has been modified from its original state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Edits.html#modified)
    */
  val modified: Boolean = js.native
}

@JSGlobal("__esri.Edits")
@js.native
object Edits extends TopLevel[EditsConstructor]

