package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Extent
import typings.arcgisJsApi.esri.ExtentConstructor
import typings.arcgisJsApi.esri.ExtentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extentMod extends Shortcut {
  
  @JSImport("esri/geometry/Extent", JSImport.Namespace)
  @js.native
  val ^ : ExtentConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/Extent", JSImport.Namespace)
  @js.native
  class Class () extends Extent {
    def this(properties: ExtentProperties) = this()
  }
  
  type _To = ExtentConstructor
  
  /* This means you don't have to write `^`, but can instead just say `extentMod.foo` */
  override def _to: ExtentConstructor = ^
}
