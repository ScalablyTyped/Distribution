package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

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
/**
  * ValueMeshColor is a type of mesh color that represents a single uniform color to be applied to a mesh component. ValueMeshColor instances can be used with the [MeshComponent.material.color](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material) property.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ValueMeshColor.html)
  */
class ValueMeshColorCls () extends ValueMeshColor {
  def this(properties: ValueMeshColorProperties) = this()
}

