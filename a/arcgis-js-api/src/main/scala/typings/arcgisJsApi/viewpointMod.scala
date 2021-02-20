package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Viewpoint
import typings.arcgisJsApi.esri.ViewpointConstructor
import typings.arcgisJsApi.esri.ViewpointProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewpointMod extends Shortcut {
  
  @JSImport("esri/Viewpoint", JSImport.Namespace)
  @js.native
  val ^ : ViewpointConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/Viewpoint", JSImport.Namespace)
  @js.native
  class Class () extends Viewpoint {
    def this(properties: ViewpointProperties) = this()
  }
  
  type _To = ViewpointConstructor
  
  /* This means you don't have to write `^`, but can instead just say `viewpointMod.foo` */
  override def _to: ViewpointConstructor = ^
}
