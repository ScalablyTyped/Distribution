package typings.angularCommon

import org.scalablytyped.runtime.Shortcut
import typings.angularCommon.anon.CVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesKeaMod extends Shortcut {
  
  @JSImport("@angular/common/locales/kea", JSImport.Default)
  @js.native
  val default: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* n */ Double, Double]) | CVE
    ]
  ] = js.native
  
  type _To = js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* n */ Double, Double]) | CVE
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `localesKeaMod.foo` */
  override def _to: js.Array[
    js.UndefOr[
      String | Double | (js.Array[js.UndefOr[js.Array[String] | Double | String]]) | (js.Function1[/* n */ Double, Double]) | CVE
    ]
  ] = default
}
