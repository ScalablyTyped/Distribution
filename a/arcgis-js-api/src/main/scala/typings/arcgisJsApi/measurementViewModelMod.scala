package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MeasurementViewModel
import typings.arcgisJsApi.esri.MeasurementViewModelConstructor
import typings.arcgisJsApi.esri.MeasurementViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object measurementViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Measurement/MeasurementViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MeasurementViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Measurement/MeasurementViewModel", JSImport.Namespace)
  @js.native
  class Class ()
    extends StObject
       with MeasurementViewModel {
    def this(properties: MeasurementViewModelProperties) = this()
  }
  
  type _To = js.Object & MeasurementViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `measurementViewModelMod.foo` */
  override def _to: js.Object & MeasurementViewModelConstructor = ^
}
