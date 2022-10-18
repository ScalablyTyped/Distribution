package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Owner extends StObject {
  
  /**
    * The canonical user ID of the bucket owner. For information about locating your canonical user ID see Finding Your Account Canonical User ID. 
    */
  var Id: js.UndefOr[String] = js.undefined
}
object Owner {
  
  inline def apply(): Owner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Owner]
  }
  
  extension [Self <: Owner](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
