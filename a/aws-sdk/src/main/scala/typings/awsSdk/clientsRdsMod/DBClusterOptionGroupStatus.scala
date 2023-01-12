package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterOptionGroupStatus extends StObject {
  
  /**
    * Specifies the name of the DB cluster option group.
    */
  var DBClusterOptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the status of the DB cluster option group.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object DBClusterOptionGroupStatus {
  
  inline def apply(): DBClusterOptionGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterOptionGroupStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBClusterOptionGroupStatus] (val x: Self) extends AnyVal {
    
    inline def setDBClusterOptionGroupName(value: String): Self = StObject.set(x, "DBClusterOptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBClusterOptionGroupNameUndefined: Self = StObject.set(x, "DBClusterOptionGroupName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
