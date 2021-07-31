package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.widgetsSearchProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.widgetsSearch")
@js.native
/**
  * The Search widget provides a way to perform search operations on [locator service(s)](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html) and/or [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html)/[feature](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) service feature layer(s).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html)
  */
class widgetsSearchCls ()
  extends StObject
     with typings.arcgisJsApi.esri.widgetsSearch {
  def this(properties: widgetsSearchProperties) = this()
  
  /**
    * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    */
  /* CompleteClass */
  override def goToOverride(view: typings.arcgisJsApi.esri.MapView, goToParameters: js.Any): Unit = js.native
  /* CompleteClass */
  override def goToOverride(view: typings.arcgisJsApi.esri.SceneView, goToParameters: js.Any): Unit = js.native
  /**
    * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    */
  /* CompleteClass */
  @JSName("goToOverride")
  var goToOverride_Original: GoToOverride = js.native
}
