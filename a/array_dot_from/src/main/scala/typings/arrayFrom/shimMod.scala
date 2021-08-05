package typings.arrayFrom

import typings.arrayFrom.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimMod {
  
  inline def apply(): FnCall = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FnCall]
  
  @JSImport("array.from/shim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
