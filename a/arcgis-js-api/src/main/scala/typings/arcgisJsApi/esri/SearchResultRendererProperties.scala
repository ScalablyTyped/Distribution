package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResultRendererProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * Indicates whether to display the `Show more results` link within the search result's popup.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html#showMoreResultsOpen)
  		 */
  var showMoreResultsOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The view model for this Search widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchResultRenderer.html#viewModel)
  		 */
  var viewModel: js.UndefOr[SearchViewModelProperties] = js.undefined
}
object SearchResultRendererProperties {
  
  inline def apply(): SearchResultRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResultRendererProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResultRendererProperties] (val x: Self) extends AnyVal {
    
    inline def setShowMoreResultsOpen(value: Boolean): Self = StObject.set(x, "showMoreResultsOpen", value.asInstanceOf[js.Any])
    
    inline def setShowMoreResultsOpenUndefined: Self = StObject.set(x, "showMoreResultsOpen", js.undefined)
    
    inline def setViewModel(value: SearchViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
