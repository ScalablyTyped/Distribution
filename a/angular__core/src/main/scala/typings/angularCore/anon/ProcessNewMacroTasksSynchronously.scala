package typings.angularCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessNewMacroTasksSynchronously extends StObject {
  
  var processNewMacroTasksSynchronously: Boolean
}
object ProcessNewMacroTasksSynchronously {
  
  inline def apply(processNewMacroTasksSynchronously: Boolean): ProcessNewMacroTasksSynchronously = {
    val __obj = js.Dynamic.literal(processNewMacroTasksSynchronously = processNewMacroTasksSynchronously.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessNewMacroTasksSynchronously]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessNewMacroTasksSynchronously] (val x: Self) extends AnyVal {
    
    inline def setProcessNewMacroTasksSynchronously(value: Boolean): Self = StObject.set(x, "processNewMacroTasksSynchronously", value.asInstanceOf[js.Any])
  }
}
