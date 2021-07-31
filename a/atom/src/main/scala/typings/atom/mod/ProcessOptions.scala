package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessOptions
  extends StObject
     with NodeProcessOptions {
  
  /**
    *  Whether the command will automatically start when this BufferedProcess is
    *  created.
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
}
object ProcessOptions {
  
  @scala.inline
  def apply(command: String): ProcessOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptions]
  }
  
  @scala.inline
  implicit class ProcessOptionsMutableBuilder[Self <: ProcessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
  }
}
