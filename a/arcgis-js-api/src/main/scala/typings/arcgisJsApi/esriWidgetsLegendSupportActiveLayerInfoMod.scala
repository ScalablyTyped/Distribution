package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ActiveLayerInfo
import typings.arcgisJsApi.esri.ActiveLayerInfoConstructor
import typings.arcgisJsApi.esri.ActiveLayerInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLegendSupportActiveLayerInfoMod extends Shortcut {
  
  @JSImport("esri/widgets/Legend/support/ActiveLayerInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ActiveLayerInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Legend/support/ActiveLayerInfo", JSImport.Namespace)
  @js.native
  /**
    * ActiveLayerInfo is added to or removed from the collection of activeLayerInfos as layers become visible or invisible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html)
    */
  open class Class ()
    extends StObject
       with ActiveLayerInfo {
    def this(properties: ActiveLayerInfoProperties) = this()
  }
  
  type _To = js.Object & ActiveLayerInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsLegendSupportActiveLayerInfoMod.foo` */
  override def _to: js.Object & ActiveLayerInfoConstructor = ^
}
