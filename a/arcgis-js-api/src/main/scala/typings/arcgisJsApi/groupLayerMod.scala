package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GroupLayer
import typings.arcgisJsApi.esri.GroupLayerConstructor
import typings.arcgisJsApi.esri.GroupLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupLayerMod extends Shortcut {
  
  @JSImport("esri/layers/GroupLayer", JSImport.Namespace)
  @js.native
  val ^ : GroupLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/GroupLayer", JSImport.Namespace)
  @js.native
  /**
    * GroupLayer provides the ability to organize several sublayers into one common layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html)
    */
  class Class () extends GroupLayer {
    def this(properties: GroupLayerProperties) = this()
  }
  
  type _To = GroupLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `groupLayerMod.foo` */
  override def _to: GroupLayerConstructor = ^
}
