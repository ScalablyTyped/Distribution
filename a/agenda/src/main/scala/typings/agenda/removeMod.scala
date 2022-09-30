package typings.agenda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeMod {
  
  @JSImport("agenda/dist/job/remove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def remove(): js.Promise[js.UndefOr[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[js.Promise[js.UndefOr[Double]]]
}
