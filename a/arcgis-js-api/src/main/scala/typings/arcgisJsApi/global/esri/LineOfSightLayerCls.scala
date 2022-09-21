package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LineOfSightLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.LineOfSightLayer")
@js.native
/**
  * LineOfSightLayer computes the line of sight from a single observer position towards a set of targets.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html)
  */
open class LineOfSightLayerCls ()
  extends StObject
     with typings.arcgisJsApi.esri.LineOfSightLayer {
  def this(properties: LineOfSightLayerProperties) = this()
}
