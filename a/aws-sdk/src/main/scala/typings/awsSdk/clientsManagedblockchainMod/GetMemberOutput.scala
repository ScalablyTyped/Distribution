package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMemberOutput extends StObject {
  
  /**
    * The properties of a member.
    */
  var Member: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.Member] = js.undefined
}
object GetMemberOutput {
  
  inline def apply(): GetMemberOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMemberOutput]
  }
  
  extension [Self <: GetMemberOutput](x: Self) {
    
    inline def setMember(value: Member): Self = StObject.set(x, "Member", value.asInstanceOf[js.Any])
    
    inline def setMemberUndefined: Self = StObject.set(x, "Member", js.undefined)
  }
}
