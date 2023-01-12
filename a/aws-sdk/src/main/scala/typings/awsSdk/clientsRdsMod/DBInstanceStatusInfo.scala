package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBInstanceStatusInfo extends StObject {
  
  /**
    * Details of the error if there is an error for the instance. If the instance isn't in an error state, this value is blank.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
    */
  var Normal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Status of the DB instance. For a StatusType of read replica, the values can be replicating, replication stop point set, replication stop point reached, error, stopped, or terminated.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * This value is currently "read replication."
    */
  var StatusType: js.UndefOr[String] = js.undefined
}
object DBInstanceStatusInfo {
  
  inline def apply(): DBInstanceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceStatusInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBInstanceStatusInfo] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setNormal(value: Boolean): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "Normal", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusType(value: String): Self = StObject.set(x, "StatusType", value.asInstanceOf[js.Any])
    
    inline def setStatusTypeUndefined: Self = StObject.set(x, "StatusType", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
