package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that S3 on Outposts assumes when replicating objects. For information about S3 replication on Outposts configuration, see Setting up replication in the Amazon S3 User Guide.
    */
  var Role: typings.awsSdk.clientsS3controlMod.Role
  
  /**
    * A container for one or more replication rules. A replication configuration must have at least one rule and can contain an array of 100 rules at the most. 
    */
  var Rules: ReplicationRules
}
object ReplicationConfiguration {
  
  inline def apply(Role: Role, Rules: ReplicationRules): ReplicationConfiguration = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRules(value: ReplicationRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: ReplicationRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
