package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.arithmetic
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.geographic
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.heading
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.roll
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.tilt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationVariableProperties extends VisualVariableProperties {
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
  var axis: js.UndefOr[heading | tilt | roll] = js.undefined
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
  var rotationType: js.UndefOr[geographic | arithmetic] = js.undefined
}

object RotationVariableProperties {
  @scala.inline
  def apply(
    axis: heading | tilt | roll = null,
    field: String = null,
    legendOptions: VisualVariableLegendOptions = null,
    rotationType: geographic | arithmetic = null,
    valueExpression: String = null,
    valueExpressionTitle: String = null
  ): RotationVariableProperties = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (rotationType != null) __obj.updateDynamic("rotationType")(rotationType.asInstanceOf[js.Any])
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression.asInstanceOf[js.Any])
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationVariableProperties]
  }
}

