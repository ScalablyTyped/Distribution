package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OS extends StObject {
  
  /**
    * The long name of the Operating System.
    */
  var fullString: js.UndefOr[BoundedString] = js.undefined
}
object OS {
  
  inline def apply(): OS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OS] (val x: Self) extends AnyVal {
    
    inline def setFullString(value: BoundedString): Self = StObject.set(x, "fullString", value.asInstanceOf[js.Any])
    
    inline def setFullStringUndefined: Self = StObject.set(x, "fullString", js.undefined)
  }
}
