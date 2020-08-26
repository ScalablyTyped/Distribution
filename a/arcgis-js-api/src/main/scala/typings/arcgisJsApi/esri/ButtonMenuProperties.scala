package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonMenuProperties extends WidgetProperties {
  /**
    * Adds a CSS class to the menu button's DOM node.  ![featuretable widget menu items](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/button-menu-icon-class.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  /**
    * An array of individual [menu items](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#items)
    */
  var items: js.UndefOr[js.Array[ButtonMenuItem]] = js.native
  /**
    * Indicates if the menu content is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#open)
    *
    * @default false
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [ButtonMenuViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html#viewModel)
    */
  var viewModel: js.UndefOr[ButtonMenuViewModelProperties] = js.native
}

object ButtonMenuProperties {
  @scala.inline
  def apply(): ButtonMenuProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonMenuProperties]
  }
  @scala.inline
  implicit class ButtonMenuPropertiesOps[Self <: ButtonMenuProperties] (val x: Self) extends AnyVal {
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
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    @scala.inline
    def setItemsVarargs(value: ButtonMenuItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ButtonMenuItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setViewModel(value: ButtonMenuViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

