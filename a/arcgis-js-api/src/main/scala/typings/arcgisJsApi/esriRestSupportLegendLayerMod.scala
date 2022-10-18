package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LegendLayer
import typings.arcgisJsApi.esri.LegendLayerConstructor
import typings.arcgisJsApi.esri.LegendLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportLegendLayerMod extends Shortcut {
  
  @JSImport("esri/rest/support/LegendLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LegendLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/rest/support/LegendLayer", JSImport.Namespace)
  @js.native
  /**
    * Define layer properties for the legend layers associated with a [PrintTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LegendLayer.html)
    */
  open class Class ()
    extends StObject
       with LegendLayer {
    def this(properties: LegendLayerProperties) = this()
  }
  
  type _To = js.Object & LegendLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriRestSupportLegendLayerMod.foo` */
  override def _to: js.Object & LegendLayerConstructor = ^
}
