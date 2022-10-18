package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcCidrBlockState extends StObject {
  
  /**
    * The state of the CIDR block.
    */
  var State: js.UndefOr[VpcCidrBlockStateCode] = js.undefined
  
  /**
    * A message about the status of the CIDR block, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object VpcCidrBlockState {
  
  inline def apply(): VpcCidrBlockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcCidrBlockState]
  }
  
  extension [Self <: VpcCidrBlockState](x: Self) {
    
    inline def setState(value: VpcCidrBlockStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
