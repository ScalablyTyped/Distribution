package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BuildingPhaseProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.BuildingPhase")
@js.native
/**
  * BuildingPhase provides information for the construction phase filter, such as the value selected by the user or the minimum and maximum allowed values.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingPhase.html)
  */
open class BuildingPhaseCls ()
  extends StObject
     with typings.arcgisJsApi.esri.BuildingPhase {
  def this(properties: BuildingPhaseProperties) = this()
}
