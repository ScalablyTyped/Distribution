package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldGroupConfig extends Accessor {
  /**
    * The field's description. The description is shown below the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#description)
    */
  var description: java.lang.String = js.native
  /**
    * The field configurations belonging to a group. For an example of grouped field configurations, please refer to the [Update Feature Attributes](https://developers.arcgis.com/javascript/latest/sample-code/editing-groupedfeatureform/index.html) sample.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#fieldConfig)
    */
  var fieldConfig: js.Array[FieldConfig] = js.native
  /**
    * The field's label. The label is shown above the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#label)
    */
  var label: java.lang.String = js.native
}

@JSGlobal("__esri.FieldGroupConfig")
@js.native
class FieldGroupConfigCls () extends FieldGroupConfig {
  def this(properties: FieldGroupConfigProperties) = this()
}

