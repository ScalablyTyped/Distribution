package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBSubnetGroupMessage extends StObject {
  
  /**
    * The description for the subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name for the subnet group. This value is stored as a lowercase string. You can't modify the default subnet group.  Constraints: Must match the name of an existing DBSubnetGroup. Must not be default. Example: mySubnetgroup 
    */
  var DBSubnetGroupName: String
  
  /**
    * The Amazon EC2 subnet IDs for the subnet group.
    */
  var SubnetIds: SubnetIdentifierList
}
object ModifyDBSubnetGroupMessage {
  
  inline def apply(DBSubnetGroupName: String, SubnetIds: SubnetIdentifierList): ModifyDBSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(DBSubnetGroupName = DBSubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSubnetGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyDBSubnetGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setDBSubnetGroupDescription(value: String): Self = StObject.set(x, "DBSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupDescriptionUndefined: Self = StObject.set(x, "DBSubnetGroupDescription", js.undefined)
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetIds(value: SubnetIdentifierList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
  }
}
