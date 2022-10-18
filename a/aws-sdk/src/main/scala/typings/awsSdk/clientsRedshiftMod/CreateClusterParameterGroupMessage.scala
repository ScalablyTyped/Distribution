package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterParameterGroupMessage extends StObject {
  
  /**
    * A description of the parameter group.
    */
  var Description: String
  
  /**
    * The Amazon Redshift engine version to which the cluster parameter group applies. The cluster engine version determines the set of parameters. To get a list of valid parameter group family names, you can call DescribeClusterParameterGroups. By default, Amazon Redshift returns a list of all the parameter groups that are owned by your Amazon Web Services account, including the default parameter groups for each Amazon Redshift engine version. The parameter group family names associated with the default parameter groups provide you the valid values. For example, a valid family name is "redshift-1.0". 
    */
  var ParameterGroupFamily: String
  
  /**
    * The name of the cluster parameter group. Constraints:   Must be 1 to 255 alphanumeric characters or hyphens   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique withing your Amazon Web Services account.    This value is stored as a lower-case string. 
    */
  var ParameterGroupName: String
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateClusterParameterGroupMessage {
  
  inline def apply(Description: String, ParameterGroupFamily: String, ParameterGroupName: String): CreateClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], ParameterGroupFamily = ParameterGroupFamily.asInstanceOf[js.Any], ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterParameterGroupMessage]
  }
  
  extension [Self <: CreateClusterParameterGroupMessage](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupFamily(value: String): Self = StObject.set(x, "ParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
