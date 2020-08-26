package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonMenuConfig extends Object {
  /**
    * The DOM Element containing the menu.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuConfig)
    */
  var container: js.UndefOr[HTMLElement] = js.native
  /**
    * Adds a CSS class to the menu button's DOM node.  </br> ![menu items iconClass](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/button-menu-icon-class.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuConfig)
    */
  var iconClass: js.UndefOr[Boolean] = js.native
  /**
    * An array of [ButtonMenuItems](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenuItem.html). The following image shows the default menu with two additional items.  </br> ![ButtonMenuItems array](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/custom-menu-items.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuConfig)
    */
  var items: js.UndefOr[js.Array[ButtonMenuItem]] = js.native
  /**
    * Indicates if the menu content is visible. Default is `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuConfig)
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * The associated viewModel for the [ButtonMenu](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-support-ButtonMenu.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuConfig)
    */
  var viewModel: js.UndefOr[ButtonMenuViewModel] = js.native
}

object ButtonMenuConfig {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ButtonMenuConfig = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ButtonMenuConfig]
  }
  @scala.inline
  implicit class ButtonMenuConfigOps[Self <: ButtonMenuConfig] (val x: Self) extends AnyVal {
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
    def setContainer(value: HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setIconClass(value: Boolean): Self = this.set("iconClass", value.asInstanceOf[js.Any])
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
    def setViewModel(value: ButtonMenuViewModel): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

