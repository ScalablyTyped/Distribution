package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DistanceMeasurement2DViewModel
import typings.arcgisJsApi.esri.DistanceMeasurement2DViewModelConstructor
import typings.arcgisJsApi.esri.DistanceMeasurement2DViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distanceMeasurement2DViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/DistanceMeasurement2D/DistanceMeasurement2DViewModel", JSImport.Namespace)
  @js.native
  val ^ : DistanceMeasurement2DViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/DistanceMeasurement2D/DistanceMeasurement2DViewModel", JSImport.Namespace)
  @js.native
  class Class () extends DistanceMeasurement2DViewModel {
    def this(properties: DistanceMeasurement2DViewModelProperties) = this()
  }
  
  type _To = DistanceMeasurement2DViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `distanceMeasurement2DViewModelMod.foo` */
  override def _to: DistanceMeasurement2DViewModelConstructor = ^
}
