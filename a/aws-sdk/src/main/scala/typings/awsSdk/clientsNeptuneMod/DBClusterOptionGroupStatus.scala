package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterOptionGroupStatus extends StObject {
  
  /**
    * Not supported by Neptune.
    */
  var DBClusterOptionGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Not supported by Neptune.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object DBClusterOptionGroupStatus {
  
  inline def apply(): DBClusterOptionGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterOptionGroupStatus]
  }
  
  extension [Self <: DBClusterOptionGroupStatus](x: Self) {
    
    inline def setDBClusterOptionGroupName(value: String): Self = StObject.set(x, "DBClusterOptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBClusterOptionGroupNameUndefined: Self = StObject.set(x, "DBClusterOptionGroupName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
