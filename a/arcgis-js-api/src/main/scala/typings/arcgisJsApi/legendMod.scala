package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Legend
import typings.arcgisJsApi.esri.LegendConstructor
import typings.arcgisJsApi.esri.LegendProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod extends Shortcut {
  
  @JSImport("esri/widgets/Legend", JSImport.Namespace)
  @js.native
  val ^ : LegendConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Legend", JSImport.Namespace)
  @js.native
  /**
    * The Legend widget displays labels and symbols for layers in a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html)
    */
  class Class () extends Legend {
    def this(properties: LegendProperties) = this()
  }
  
  type _To = LegendConstructor
  
  /* This means you don't have to write `^`, but can instead just say `legendMod.foo` */
  override def _to: LegendConstructor = ^
}
