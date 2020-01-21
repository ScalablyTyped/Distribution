package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueMeshColor extends Accessor {
  val `type`: value = js.native
  /**
    * The color value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ValueMeshColor.html#value)
    */
  var value: Color_ = js.native
}

@JSGlobal("__esri.ValueMeshColor")
@js.native
object ValueMeshColor extends TopLevel[ValueMeshColorConstructor]

