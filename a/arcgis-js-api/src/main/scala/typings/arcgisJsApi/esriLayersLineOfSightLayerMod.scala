package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineOfSightLayer
import typings.arcgisJsApi.esri.LineOfSightLayerConstructor
import typings.arcgisJsApi.esri.LineOfSightLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersLineOfSightLayerMod extends Shortcut {
  
  @JSImport("esri/layers/LineOfSightLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineOfSightLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/LineOfSightLayer", JSImport.Namespace)
  @js.native
  /**
    * LineOfSightLayer computes the line of sight from a single observer position towards a set of targets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-LineOfSightLayer.html)
    */
  open class Class ()
    extends StObject
       with LineOfSightLayer {
    def this(properties: LineOfSightLayerProperties) = this()
  }
  
  type _To = js.Object & LineOfSightLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersLineOfSightLayerMod.foo` */
  override def _to: js.Object & LineOfSightLayerConstructor = ^
}
