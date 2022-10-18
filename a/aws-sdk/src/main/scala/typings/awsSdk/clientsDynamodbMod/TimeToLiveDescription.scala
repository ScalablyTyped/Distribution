package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeToLiveDescription extends StObject {
  
  /**
    *  The name of the TTL attribute for items in the table.
    */
  var AttributeName: js.UndefOr[TimeToLiveAttributeName] = js.undefined
  
  /**
    *  The TTL status for the table.
    */
  var TimeToLiveStatus: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TimeToLiveStatus] = js.undefined
}
object TimeToLiveDescription {
  
  inline def apply(): TimeToLiveDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeToLiveDescription]
  }
  
  extension [Self <: TimeToLiveDescription](x: Self) {
    
    inline def setAttributeName(value: TimeToLiveAttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setTimeToLiveStatus(value: TimeToLiveStatus): Self = StObject.set(x, "TimeToLiveStatus", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveStatusUndefined: Self = StObject.set(x, "TimeToLiveStatus", js.undefined)
  }
}
