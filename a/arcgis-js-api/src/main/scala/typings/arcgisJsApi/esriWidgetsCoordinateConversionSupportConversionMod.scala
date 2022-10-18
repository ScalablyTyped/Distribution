package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Conversion
import typings.arcgisJsApi.esri.ConversionConstructor
import typings.arcgisJsApi.esri.ConversionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsCoordinateConversionSupportConversionMod extends Shortcut {
  
  @JSImport("esri/widgets/CoordinateConversion/support/Conversion", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ConversionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/CoordinateConversion/support/Conversion", JSImport.Namespace)
  @js.native
  /**
    * The Conversion class represents one of the [conversions](esri-widgets-CoordinateConversion.html#conversions) in the [Coordinate Conversion widget](esri-widgets-CoordinateConversion.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html)
    */
  open class Class ()
    extends StObject
       with Conversion {
    def this(properties: ConversionProperties) = this()
  }
  
  type _To = js.Object & ConversionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsCoordinateConversionSupportConversionMod.foo` */
  override def _to: js.Object & ConversionConstructor = ^
}
