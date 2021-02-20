package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MultipointDrawAction
import typings.arcgisJsApi.esri.MultipointDrawActionConstructor
import typings.arcgisJsApi.esri.MultipointDrawActionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipointDrawActionMod extends Shortcut {
  
  @JSImport("esri/views/draw/MultipointDrawAction", JSImport.Namespace)
  @js.native
  val ^ : MultipointDrawActionConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/draw/MultipointDrawAction", JSImport.Namespace)
  @js.native
  /**
    * This class uses the view events to generate a set of coordinates to create a new [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometry using [Draw](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-MultipointDrawAction.html)
    */
  class Class () extends MultipointDrawAction {
    def this(properties: MultipointDrawActionProperties) = this()
  }
  
  type _To = MultipointDrawActionConstructor
  
  /* This means you don't have to write `^`, but can instead just say `multipointDrawActionMod.foo` */
  override def _to: MultipointDrawActionConstructor = ^
}
