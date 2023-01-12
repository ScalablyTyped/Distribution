package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAbpV10X extends StObject {
  
  /**
    * The FCnt init value.
    */
  var FCntStart: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.FCntStart] = js.undefined
}
object UpdateAbpV10X {
  
  inline def apply(): UpdateAbpV10X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAbpV10X]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAbpV10X] (val x: Self) extends AnyVal {
    
    inline def setFCntStart(value: FCntStart): Self = StObject.set(x, "FCntStart", value.asInstanceOf[js.Any])
    
    inline def setFCntStartUndefined: Self = StObject.set(x, "FCntStart", js.undefined)
  }
}
