package typings.alertify

import org.scalablytyped.runtime.Shortcut
import typings.alertify.alertify.IAlertifyStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object alertify extends Shortcut {
    
    @JSGlobal("alertify")
    @js.native
    val ^ : IAlertifyStatic = js.native
    
    type _To = IAlertifyStatic
    
    /* This means you don't have to write `^`, but can instead just say `alertify.foo` */
    override def _to: IAlertifyStatic = ^
  }
}
