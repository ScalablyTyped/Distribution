package typings.appiumAdb.anon

import typings.appiumAdb.appiumAdbStrings.full
import typings.appiumAdb.appiumAdbStrings.stdout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FULL extends StObject {
  
  val FULL: full
  
  val STDOUT: stdout
}
object FULL {
  
  inline def apply(): FULL = {
    val __obj = js.Dynamic.literal(FULL = "full", STDOUT = "stdout")
    __obj.asInstanceOf[FULL]
  }
  
  extension [Self <: FULL](x: Self) {
    
    inline def setFULL(value: full): Self = StObject.set(x, "FULL", value.asInstanceOf[js.Any])
    
    inline def setSTDOUT(value: stdout): Self = StObject.set(x, "STDOUT", value.asInstanceOf[js.Any])
  }
}
