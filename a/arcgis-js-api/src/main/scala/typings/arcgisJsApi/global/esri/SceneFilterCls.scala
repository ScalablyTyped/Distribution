package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SceneFilterProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.SceneFilter")
@js.native
/**
  * A SceneFilter is a collection of polygons and a type which can be set on a layer to spatially mask out features.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneFilter.html)
  */
open class SceneFilterCls ()
  extends StObject
     with typings.arcgisJsApi.esri.SceneFilter {
  def this(properties: SceneFilterProperties) = this()
}
