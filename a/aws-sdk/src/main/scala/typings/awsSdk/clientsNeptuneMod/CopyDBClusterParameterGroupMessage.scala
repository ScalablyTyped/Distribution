package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information about creating an ARN, see  Constructing an Amazon Resource Name (ARN). Constraints:   Must specify a valid DB cluster parameter group.   If the source DB cluster parameter group is in the same Amazon Region as the copy, specify a valid DB parameter group identifier, for example my-db-cluster-param-group, or a valid ARN.   If the source DB parameter group is in a different Amazon Region than the copy, specify a valid DB cluster parameter group ARN, for example arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1.  
    */
  var SourceDBClusterParameterGroupIdentifier: String
  
  /**
    * The tags to be assigned to the copied DB cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A description for the copied DB cluster parameter group.
    */
  var TargetDBClusterParameterGroupDescription: String
  
  /**
    * The identifier for the copied DB cluster parameter group. Constraints:   Cannot be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Example: my-cluster-param-group1 
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
