package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SmartMappingSliderBase
import typings.arcgisJsApi.esri.SmartMappingSliderBaseConstructor
import typings.arcgisJsApi.esri.SmartMappingSliderBaseProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingSmartMappingSliderBaseMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/SmartMappingSliderBase", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SmartMappingSliderBaseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/SmartMappingSliderBase", JSImport.Namespace)
  @js.native
  /**
    * The base class for all Smart Mapping slider widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html)
    */
  open class Class ()
    extends StObject
       with SmartMappingSliderBase {
    def this(properties: SmartMappingSliderBaseProperties) = this()
  }
  
  type _To = js.Object & SmartMappingSliderBaseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingSmartMappingSliderBaseMod.foo` */
  override def _to: js.Object & SmartMappingSliderBaseConstructor = ^
}
