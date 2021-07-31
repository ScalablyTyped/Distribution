package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UniqueValuesResult
import typings.arcgisJsApi.esri.uniqueValuesUniqueValuesParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueValuesMod extends Shortcut {
  
  @JSImport("esri/smartMapping/statistics/uniqueValues", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* params */ uniqueValuesUniqueValuesParams, js.Promise[UniqueValuesResult]] = js.native
  
  type _To = js.Function1[/* params */ uniqueValuesUniqueValuesParams, js.Promise[UniqueValuesResult]]
  
  /* This means you don't have to write `^`, but can instead just say `uniqueValuesMod.foo` */
  override def _to: js.Function1[/* params */ uniqueValuesUniqueValuesParams, js.Promise[UniqueValuesResult]] = ^
}
