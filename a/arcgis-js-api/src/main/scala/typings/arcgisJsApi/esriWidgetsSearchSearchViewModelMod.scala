package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import typings.arcgisJsApi.esri.SearchViewModel
import typings.arcgisJsApi.esri.SearchViewModelConstructor
import typings.arcgisJsApi.esri.SearchViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSearchSearchViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Search/SearchViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SearchViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Search/SearchViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Search](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html) widget, which performs search operations on [locator service(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-locator.html), [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html)/[feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) service feature layer(s), and/or [table(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-applicationProperties-SearchTable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchViewModel.html)
    */
  open class Class ()
    extends StObject
       with SearchViewModel {
    def this(properties: SearchViewModelProperties) = this()
    
    /**
      * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
      */
    /* CompleteClass */
    override def goToOverride(view: MapView, goToParameters: Any): Unit = js.native
    /* CompleteClass */
    override def goToOverride(view: SceneView, goToParameters: Any): Unit = js.native
    /**
      * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
      */
    /* CompleteClass */
    @JSName("goToOverride")
    var goToOverride_Original: GoToOverride = js.native
  }
  
  type _To = js.Object & SearchViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSearchSearchViewModelMod.foo` */
  override def _to: js.Object & SearchViewModelConstructor = ^
}
