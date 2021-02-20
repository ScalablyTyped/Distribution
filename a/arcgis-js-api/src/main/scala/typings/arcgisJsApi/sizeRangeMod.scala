package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SizeRangeResult
import typings.arcgisJsApi.esri.sizeRangeSizeRangeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeRangeMod extends Shortcut {
  
  @JSImport("esri/smartMapping/heuristics/sizeRange", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* params */ sizeRangeSizeRangeParams, js.Promise[SizeRangeResult]] = js.native
  
  type _To = js.Function1[/* params */ sizeRangeSizeRangeParams, js.Promise[SizeRangeResult]]
  
  /* This means you don't have to write `^`, but can instead just say `sizeRangeMod.foo` */
  override def _to: js.Function1[/* params */ sizeRangeSizeRangeParams, js.Promise[SizeRangeResult]] = ^
}
