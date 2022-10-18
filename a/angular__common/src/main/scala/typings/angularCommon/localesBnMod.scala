package typings.angularCommon

import org.scalablytyped.runtime.Shortcut
import typings.angularCommon.anon.BDT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesBnMod extends Shortcut {
  
  @JSImport("@angular/common/locales/bn", JSImport.Default)
  @js.native
  val default: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | BDT
    ]
  ] = js.native
  
  type _To = js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | BDT
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `localesBnMod.foo` */
  override def _to: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* val */ Double, Double]) | BDT
    ]
  ] = default
}
