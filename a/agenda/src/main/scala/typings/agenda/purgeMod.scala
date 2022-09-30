package typings.agenda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object purgeMod {
  
  @JSImport("agenda/dist/agenda/purge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def purge(): js.Promise[js.UndefOr[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("purge")().asInstanceOf[js.Promise[js.UndefOr[Double]]]
}
