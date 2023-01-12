package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMemberOutput extends StObject {
  
  /**
    * The unique identifier of the member.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
}
object CreateMemberOutput {
  
  inline def apply(): CreateMemberOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMemberOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMemberOutput] (val x: Self) extends AnyVal {
    
    inline def setMemberId(value: ResourceIdString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setMemberIdUndefined: Self = StObject.set(x, "MemberId", js.undefined)
  }
}
