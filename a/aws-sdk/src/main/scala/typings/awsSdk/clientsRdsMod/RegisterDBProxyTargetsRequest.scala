package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDBProxyTargetsRequest extends StObject {
  
  /**
    * One or more DB cluster identifiers.
    */
  var DBClusterIdentifiers: js.UndefOr[StringList] = js.undefined
  
  /**
    * One or more DB instance identifiers.
    */
  var DBInstanceIdentifiers: js.UndefOr[StringList] = js.undefined
  
  /**
    * The identifier of the DBProxy that is associated with the DBProxyTargetGroup.
    */
  var DBProxyName: String
  
  /**
    * The identifier of the DBProxyTargetGroup.
    */
  var TargetGroupName: js.UndefOr[String] = js.undefined
}
object RegisterDBProxyTargetsRequest {
  
  inline def apply(DBProxyName: String): RegisterDBProxyTargetsRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDBProxyTargetsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterDBProxyTargetsRequest] (val x: Self) extends AnyVal {
    
    inline def setDBClusterIdentifiers(value: StringList): Self = StObject.set(x, "DBClusterIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifiersUndefined: Self = StObject.set(x, "DBClusterIdentifiers", js.undefined)
    
    inline def setDBClusterIdentifiersVarargs(value: String*): Self = StObject.set(x, "DBClusterIdentifiers", js.Array(value*))
    
    inline def setDBInstanceIdentifiers(value: StringList): Self = StObject.set(x, "DBInstanceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifiersUndefined: Self = StObject.set(x, "DBInstanceIdentifiers", js.undefined)
    
    inline def setDBInstanceIdentifiersVarargs(value: String*): Self = StObject.set(x, "DBInstanceIdentifiers", js.Array(value*))
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupName(value: String): Self = StObject.set(x, "TargetGroupName", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupNameUndefined: Self = StObject.set(x, "TargetGroupName", js.undefined)
  }
}
