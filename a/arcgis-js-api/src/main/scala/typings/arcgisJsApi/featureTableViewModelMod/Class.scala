package typings.arcgisJsApi.featureTableViewModelMod

import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.FeatureLayer
import typings.arcgisJsApi.esri.FeatureTableViewModel
import typings.arcgisJsApi.esri.FieldColumnConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/FeatureTable/FeatureTableViewModel", JSImport.Namespace)
@js.native
class Class () extends FeatureTableViewModel {
  def this(properties: js.Any) = this()
  /**
    * Indicates whether to display the `Attachments` field in the table. This is only applicable if the feature layer supports attachments. Currently, this field only displays the count of attachments per feature.  ![featuretable attachmentenabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/attachments-enabled.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#attachmentsEnabled)
    *
    * @default false
    */
  /* CompleteClass */
  override var attachmentsEnabled: Boolean = js.native
  /**
    * An array of individual configuration objects.  This is where you can specify what fields to display and how you wish to display them.  When not set, all fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID` will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#fieldConfigs)
    *
    * @default null
    */
  /* CompleteClass */
  override var fieldConfigs: js.Array[FieldColumnConfig] = js.native
  /**
    * A collection of fields to remain hidden within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#hiddenFields)
    */
  /* CompleteClass */
  override var hiddenFields: Collection[String] = js.native
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#layer)
    */
  /* CompleteClass */
  override var layer: FeatureLayer = js.native
}

