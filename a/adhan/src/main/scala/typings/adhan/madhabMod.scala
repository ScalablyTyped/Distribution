package typings.adhan

import typings.adhan.adhanInts.`1`
import typings.adhan.adhanInts.`2`
import typings.adhan.adhanStrings.hanafi
import typings.adhan.adhanStrings.shafi
import typings.adhan.anon.Hanafi
import typings.adhan.typeUtilsMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object madhabMod {
  
  @JSImport("adhan/lib/types/Madhab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Madhab {
    
    @JSImport("adhan/lib/types/Madhab", "Madhab.Hanafi")
    @js.native
    val Hanafi: hanafi = js.native
    
    @JSImport("adhan/lib/types/Madhab", "Madhab.Shafi")
    @js.native
    val Shafi: shafi = js.native
  }
  
  inline def shadowLength(madhab: ValueOf[Hanafi]): `1` | `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("shadowLength")(madhab.asInstanceOf[js.Any]).asInstanceOf[`1` | `2`]
}
