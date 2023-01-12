package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterMember extends StObject {
  
  /**
    * Specifies the status of the cluster parameter group for this member of the DB cluster.
    */
  var DBClusterParameterGroupStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the instance identifier for this member of the cluster.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * A value that is true if the cluster member is the primary instance for the cluster and false otherwise.
    */
  var IsClusterWriter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that specifies the order in which an Amazon DocumentDB replica is promoted to the primary instance after a failure of the existing primary instance. 
    */
  var PromotionTier: js.UndefOr[IntegerOptional] = js.undefined
}
object DBClusterMember {
  
  inline def apply(): DBClusterMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBClusterMember] (val x: Self) extends AnyVal {
    
    inline def setDBClusterParameterGroupStatus(value: String): Self = StObject.set(x, "DBClusterParameterGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupStatusUndefined: Self = StObject.set(x, "DBClusterParameterGroupStatus", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setIsClusterWriter(value: Boolean): Self = StObject.set(x, "IsClusterWriter", value.asInstanceOf[js.Any])
    
    inline def setIsClusterWriterUndefined: Self = StObject.set(x, "IsClusterWriter", js.undefined)
    
    inline def setPromotionTier(value: IntegerOptional): Self = StObject.set(x, "PromotionTier", value.asInstanceOf[js.Any])
    
    inline def setPromotionTierUndefined: Self = StObject.set(x, "PromotionTier", js.undefined)
  }
}
