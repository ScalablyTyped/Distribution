package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotationVariable extends VisualVariable {
  /**
    * Only applicable when working in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Defines the axis the rotation visual variable should be applied to when rendering features with an [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then the following rotation axis will rotate the symbol as indicated by their name.
    *
    * Possible Value | Description
    * ----------------|-----------
    * heading | The rotation of the symbol in the horizontal plane (i.e., around the z axis).
    * tilt | The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis).
    * roll | The rotation of the symbol in the lateral vertical plane (i.e., around the y axis).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#axis)
    *
    * @default heading
    */
  var axis: java.lang.String = js.native
  /**
    * Defines the origin and direction of rotation depending on how the angle of rotation was measured. See the table below for a list of possible values. This property only applies to rotations around the `heading` axis.
    *
    * Value | Description
    * ------|------------
    * geographic | Rotates the symbol from the north in a clockwise direction.
    * arithmetic | Rotates the symbol from the east in a counter-clockwise direction.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#rotationType)
    *
    * @default geographic
    */
  var rotationType: java.lang.String = js.native
  /**
    * The visual variable type. For RotationVariable, this value is always `rotation`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html#type)
    */
  @JSName("type")
  val type_RotationVariable: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.rotation = js.native
}

@JSGlobal("__esri.RotationVariable")
@js.native
/**
  * The rotation visual variable defines how features rendered with [marker symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html) or [text symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html) in a MapView are rotated. The rotation value is determined by mapping the values to data in a field, or by other arithmetic means with an Arcade expression.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html)
  */
class RotationVariableCls () extends RotationVariable {
  def this(properties: RotationVariableProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

