package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BasemapViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.BasemapView")
@js.native
/**
  * Represents the view for a single basemap after it has been added to either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-BasemapView.html)
  */
open class BasemapViewCls ()
  extends StObject
     with typings.arcgisJsApi.esri.BasemapView {
  def this(properties: BasemapViewProperties) = this()
}
