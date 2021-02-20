package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CoordinateConversionViewModel
import typings.arcgisJsApi.esri.CoordinateConversionViewModelConstructor
import typings.arcgisJsApi.esri.CoordinateConversionViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordinateConversionViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/CoordinateConversion/CoordinateConversionViewModel", JSImport.Namespace)
  @js.native
  val ^ : CoordinateConversionViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/CoordinateConversion/CoordinateConversionViewModel", JSImport.Namespace)
  @js.native
  class Class () extends CoordinateConversionViewModel {
    def this(properties: CoordinateConversionViewModelProperties) = this()
  }
  
  type _To = CoordinateConversionViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `coordinateConversionViewModelMod.foo` */
  override def _to: CoordinateConversionViewModelConstructor = ^
}
