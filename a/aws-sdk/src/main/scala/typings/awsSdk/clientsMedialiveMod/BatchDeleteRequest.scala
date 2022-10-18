package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteRequest extends StObject {
  
  /**
    * List of channel IDs
    */
  var ChannelIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * List of input IDs
    */
  var InputIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * List of input security group IDs
    */
  var InputSecurityGroupIds: js.UndefOr[listOfString] = js.undefined
  
  /**
    * List of multiplex IDs
    */
  var MultiplexIds: js.UndefOr[listOfString] = js.undefined
}
object BatchDeleteRequest {
  
  inline def apply(): BatchDeleteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteRequest]
  }
  
  extension [Self <: BatchDeleteRequest](x: Self) {
    
    inline def setChannelIds(value: listOfString): Self = StObject.set(x, "ChannelIds", value.asInstanceOf[js.Any])
    
    inline def setChannelIdsUndefined: Self = StObject.set(x, "ChannelIds", js.undefined)
    
    inline def setChannelIdsVarargs(value: string*): Self = StObject.set(x, "ChannelIds", js.Array(value*))
    
    inline def setInputIds(value: listOfString): Self = StObject.set(x, "InputIds", value.asInstanceOf[js.Any])
    
    inline def setInputIdsUndefined: Self = StObject.set(x, "InputIds", js.undefined)
    
    inline def setInputIdsVarargs(value: string*): Self = StObject.set(x, "InputIds", js.Array(value*))
    
    inline def setInputSecurityGroupIds(value: listOfString): Self = StObject.set(x, "InputSecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setInputSecurityGroupIdsUndefined: Self = StObject.set(x, "InputSecurityGroupIds", js.undefined)
    
    inline def setInputSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "InputSecurityGroupIds", js.Array(value*))
    
    inline def setMultiplexIds(value: listOfString): Self = StObject.set(x, "MultiplexIds", value.asInstanceOf[js.Any])
    
    inline def setMultiplexIdsUndefined: Self = StObject.set(x, "MultiplexIds", js.undefined)
    
    inline def setMultiplexIdsVarargs(value: string*): Self = StObject.set(x, "MultiplexIds", js.Array(value*))
  }
}
