package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultRendererProperties extends WidgetProperties {
  /**
    * Indicates whether to display the `Show more results` link within the search result's popup. A value of `true` will not display the link in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html#showMoreResultsOpen)
    *
    * @default false
    */
  var showMoreResultsOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SearchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html#viewModel)
    */
  var viewModel: js.UndefOr[SearchViewModelProperties] = js.undefined
}

object SearchResultRendererProperties {
  @scala.inline
  def apply(
    container: java.lang.String | stdLib.HTMLElement = null,
    destroyed: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    label: java.lang.String = null,
    showMoreResultsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    viewModel: SearchViewModelProperties = null
  ): SearchResultRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed)
    if (id != null) __obj.updateDynamic("id")(id)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(showMoreResultsOpen)) __obj.updateDynamic("showMoreResultsOpen")(showMoreResultsOpen)
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel)
    __obj.asInstanceOf[SearchResultRendererProperties]
  }
}

