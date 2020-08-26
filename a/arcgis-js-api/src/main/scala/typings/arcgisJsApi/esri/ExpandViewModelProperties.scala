package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandViewModelProperties extends js.Object {
  /**
    * Automatically collapses the expand widget instance when the view's viewpoint updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#autoCollapse)
    *
    * @default false
    */
  var autoCollapse: js.UndefOr[Boolean] = js.native
  /**
    * Whether the widget is currently expanded or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#expanded)
    *
    * @default false
    */
  var expanded: js.UndefOr[Boolean] = js.native
  /**
    * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded. For auto collapsing to take effect, all instances of the group must be included in the [view.ui](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#ui).  For example, if you place multiple Expand instances in the top-left of the view's ui, you can assign them to a group called `top-left`. If one Expand instance is expanded and the user clicks on a different instance in the `top-left` group, then the first instance is collapsed, allowing the content of the second instance to be fully visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#group)
    */
  var group: js.UndefOr[String] = js.native
  /**
    * The view in which the Expand is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}

object ExpandViewModelProperties {
  @scala.inline
  def apply(): ExpandViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandViewModelProperties]
  }
  @scala.inline
  implicit class ExpandViewModelPropertiesOps[Self <: ExpandViewModelProperties] (val x: Self) extends AnyVal {
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
    def setAutoCollapse(value: Boolean): Self = this.set("autoCollapse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCollapse: Self = this.set("autoCollapse", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

