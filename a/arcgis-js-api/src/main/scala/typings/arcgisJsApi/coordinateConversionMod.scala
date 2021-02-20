package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CoordinateConversion
import typings.arcgisJsApi.esri.CoordinateConversionConstructor
import typings.arcgisJsApi.esri.CoordinateConversionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordinateConversionMod extends Shortcut {
  
  @JSImport("esri/widgets/CoordinateConversion", JSImport.Namespace)
  @js.native
  val ^ : CoordinateConversionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/CoordinateConversion", JSImport.Namespace)
  @js.native
  /**
    * The CoordinateConversion widget provides a way to display user cursor position either as map coordinates or as any of several popular coordinate notations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html)
    */
  class Class () extends CoordinateConversion {
    def this(properties: CoordinateConversionProperties) = this()
  }
  
  type _To = CoordinateConversionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `coordinateConversionMod.foo` */
  override def _to: CoordinateConversionConstructor = ^
}
