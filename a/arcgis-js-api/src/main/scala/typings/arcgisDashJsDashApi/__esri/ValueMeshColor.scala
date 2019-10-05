package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueMeshColor extends Accessor {
  /**
    * For ValueMeshColor the type is always `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ValueMeshColor.html#type)
    */
  val `type`: value = js.native
  /**
    * The color value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ValueMeshColor.html#value)
    */
  var value: Color = js.native
}

@JSGlobal("__esri.ValueMeshColor")
@js.native
object ValueMeshColor extends TopLevel[ValueMeshColorConstructor]

