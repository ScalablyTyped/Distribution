package typings.adminCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("admin-check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[js.Promise[Boolean]]
}
