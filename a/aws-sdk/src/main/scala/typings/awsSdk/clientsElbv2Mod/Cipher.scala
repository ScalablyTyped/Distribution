package typings.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cipher extends StObject {
  
  /**
    * The name of the cipher.
    */
  var Name: js.UndefOr[CipherName] = js.undefined
  
  /**
    * The priority of the cipher.
    */
  var Priority: js.UndefOr[CipherPriority] = js.undefined
}
object Cipher {
  
  inline def apply(): Cipher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cipher]
  }
  
  extension [Self <: Cipher](x: Self) {
    
    inline def setName(value: CipherName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPriority(value: CipherPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
  }
}
