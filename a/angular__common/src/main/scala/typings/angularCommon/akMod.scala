package typings.angularCommon

import org.scalablytyped.runtime.Shortcut
import typings.angularCommon.anon.GHS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object akMod extends Shortcut {
  
  @JSImport("@angular/common/locales/ak", JSImport.Default)
  @js.native
  val default: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* n */ Double, Double]) | GHS
    ]
  ] = js.native
  
  type _To = js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* n */ Double, Double]) | GHS
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `akMod.foo` */
  override def _to: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* n */ Double, Double]) | GHS
    ]
  ] = default
}
