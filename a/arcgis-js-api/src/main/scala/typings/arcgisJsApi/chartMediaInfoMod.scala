package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ChartMediaInfo
import typings.arcgisJsApi.esri.ChartMediaInfoConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartMediaInfoMod extends Shortcut {
  
  @JSImport("esri/popup/content/mixins/ChartMediaInfo", JSImport.Namespace)
  @js.native
  val ^ : ChartMediaInfoConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/content/mixins/ChartMediaInfo", JSImport.Namespace)
  @js.native
  class Class () extends ChartMediaInfo
  
  type _To = ChartMediaInfoConstructor
  
  /* This means you don't have to write `^`, but can instead just say `chartMediaInfoMod.foo` */
  override def _to: ChartMediaInfoConstructor = ^
}
