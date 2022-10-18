package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information about creating an ARN, see  Constructing an ARN for Amazon RDS in the Amazon Aurora User Guide. Constraints:   Must specify a valid DB cluster parameter group.  
    */
  var SourceDBClusterParameterGroupIdentifier: String
  
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A description for the copied DB cluster parameter group.
    */
  var TargetDBClusterParameterGroupDescription: String
  
  /**
    * The identifier for the copied DB cluster parameter group. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-cluster-param-group1 
    */
  var TargetDBClusterParameterGroupIdentifier: String
}
object CopyDBClusterParameterGroupMessage {
  
  inline def apply(
    SourceDBClusterParameterGroupIdentifier: String,
    TargetDBClusterParameterGroupDescription: String,
    TargetDBClusterParameterGroupIdentifier: String
  ): CopyDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(SourceDBClusterParameterGroupIdentifier = SourceDBClusterParameterGroupIdentifier.asInstanceOf[js.Any], TargetDBClusterParameterGroupDescription = TargetDBClusterParameterGroupDescription.asInstanceOf[js.Any], TargetDBClusterParameterGroupIdentifier = TargetDBClusterParameterGroupIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyDBClusterParameterGroupMessage]
  }
  
  extension [Self <: CopyDBClusterParameterGroupMessage](x: Self) {
    
    inline def setSourceDBClusterParameterGroupIdentifier(value: String): Self = StObject.set(x, "SourceDBClusterParameterGroupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetDBClusterParameterGroupDescription(value: String): Self = StObject.set(x, "TargetDBClusterParameterGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setTargetDBClusterParameterGroupIdentifier(value: String): Self = StObject.set(x, "TargetDBClusterParameterGroupIdentifier", value.asInstanceOf[js.Any])
  }
}
