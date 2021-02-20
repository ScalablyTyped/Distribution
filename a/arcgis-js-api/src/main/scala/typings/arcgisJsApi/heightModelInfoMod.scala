package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.HeightModelInfo
import typings.arcgisJsApi.esri.HeightModelInfoConstructor
import typings.arcgisJsApi.esri.HeightModelInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heightModelInfoMod extends Shortcut {
  
  @JSImport("esri/geometry/HeightModelInfo", JSImport.Namespace)
  @js.native
  val ^ : HeightModelInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/geometry/HeightModelInfo", JSImport.Namespace)
  @js.native
  class Class () extends HeightModelInfo {
    def this(properties: HeightModelInfoProperties) = this()
  }
  
  type _To = HeightModelInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `heightModelInfoMod.foo` */
  override def _to: HeightModelInfoConstructor = ^
}
