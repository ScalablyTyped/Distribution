package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LightingProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.Lighting")
@js.native
/**
  * The lighting object is part of the [webscene/Environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Environment.html) and contains information relating to how a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is lit.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Lighting.html)
  */
open class LightingCls ()
  extends StObject
     with typings.arcgisJsApi.esri.Lighting {
  def this(properties: LightingProperties) = this()
}
