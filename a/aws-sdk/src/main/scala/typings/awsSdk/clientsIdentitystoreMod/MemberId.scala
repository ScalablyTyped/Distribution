package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberId extends StObject {
  
  /**
    * An object containing the identifiers of resources that can be members.
    */
  var UserId: js.UndefOr[ResourceId] = js.undefined
}
object MemberId {
  
  inline def apply(): MemberId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberId]
  }
  
  extension [Self <: MemberId](x: Self) {
    
    inline def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
