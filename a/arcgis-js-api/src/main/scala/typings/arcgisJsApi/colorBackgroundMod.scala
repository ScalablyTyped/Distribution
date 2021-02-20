package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorBackground
import typings.arcgisJsApi.esri.ColorBackgroundConstructor
import typings.arcgisJsApi.esri.ColorBackgroundProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorBackgroundMod extends Shortcut {
  
  @JSImport("esri/webmap/background/ColorBackground", JSImport.Namespace)
  @js.native
  val ^ : ColorBackgroundConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webmap/background/ColorBackground", JSImport.Namespace)
  @js.native
  class Class () extends ColorBackground {
    def this(properties: ColorBackgroundProperties) = this()
  }
  
  type _To = ColorBackgroundConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorBackgroundMod.foo` */
  override def _to: ColorBackgroundConstructor = ^
}
