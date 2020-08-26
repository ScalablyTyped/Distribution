package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldColumnConfigProperties extends FieldConfigProperties {
  /**
    * Controls the sort order of the column. This property will only be honored on one [fieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) in the FeatureTable widget. If direction is specified on more than one [fieldColumn](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) in the same FeatureTable, it will only be honored on the column with the highest index.
    *
    * Possible Value | Description
    * ---------------|------------
    * asc | Sorts the column in ascending order.
    * desc | Sorts the column in descending order.
    * null | No sort is applied to the column.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#direction)
    */
  var direction: js.UndefOr[asc_ | desc_ | js.Any] = js.native
  /**
    * Set this object to customize the field column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#menuConfig)
    */
  var menuConfig: js.UndefOr[ButtonMenuConfig] = js.native
  /**
    * Indicates whether the field column can be sorted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#sortable)
    *
    * @default true
    */
  var sortable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the field column is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#visible)
    *
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object FieldColumnConfigProperties {
  @scala.inline
  def apply(): FieldColumnConfigProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldColumnConfigProperties]
  }
  @scala.inline
  implicit class FieldColumnConfigPropertiesOps[Self <: FieldColumnConfigProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: asc_ | desc_ | js.Any): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setMenuConfig(value: ButtonMenuConfig): Self = this.set("menuConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuConfig: Self = this.set("menuConfig", js.undefined)
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortable: Self = this.set("sortable", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

