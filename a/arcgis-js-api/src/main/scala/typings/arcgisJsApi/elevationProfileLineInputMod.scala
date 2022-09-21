package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ElevationProfileLineInput
import typings.arcgisJsApi.esri.ElevationProfileLineInputConstructor
import typings.arcgisJsApi.esri.ElevationProfileLineInputProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elevationProfileLineInputMod extends Shortcut {
  
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineInput", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ElevationProfileLineInputConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ElevationProfile/ElevationProfileLineInput", JSImport.Namespace)
  @js.native
  /**
    * Profile line which samples elevation from the geometry of the input [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) itself, typically used on input lines with z values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineInput.html)
    */
  open class Class ()
    extends StObject
       with ElevationProfileLineInput {
    def this(properties: ElevationProfileLineInputProperties) = this()
  }
  
  type _To = js.Object & ElevationProfileLineInputConstructor
  
  /* This means you don't have to write `^`, but can instead just say `elevationProfileLineInputMod.foo` */
  override def _to: js.Object & ElevationProfileLineInputConstructor = ^
}
