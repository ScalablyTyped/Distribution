package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogicalResourceId extends StObject {
  
  /**
    * The name of the Amazon Elastic Kubernetes Service cluster and namespace this resource belongs to.  This parameter accepts values in "eks-cluster/namespace" format. 
    */
  var eksSourceName: js.UndefOr[String255] = js.undefined
  
  /**
    * The identifier of the resource.
    */
  var identifier: String255
  
  /**
    * The name of the CloudFormation stack this resource belongs to.
    */
  var logicalStackName: js.UndefOr[String255] = js.undefined
  
  /**
    * The name of the resource group that this resource belongs to.
    */
  var resourceGroupName: js.UndefOr[EntityName] = js.undefined
  
  /**
    *  The name of the Terraform S3 state file this resource belongs to. 
    */
  var terraformSourceName: js.UndefOr[String255] = js.undefined
}
object LogicalResourceId {
  
  inline def apply(identifier: String255): LogicalResourceId = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalResourceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogicalResourceId] (val x: Self) extends AnyVal {
    
    inline def setEksSourceName(value: String255): Self = StObject.set(x, "eksSourceName", value.asInstanceOf[js.Any])
    
    inline def setEksSourceNameUndefined: Self = StObject.set(x, "eksSourceName", js.undefined)
    
    inline def setIdentifier(value: String255): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setLogicalStackName(value: String255): Self = StObject.set(x, "logicalStackName", value.asInstanceOf[js.Any])
    
    inline def setLogicalStackNameUndefined: Self = StObject.set(x, "logicalStackName", js.undefined)
    
    inline def setResourceGroupName(value: EntityName): Self = StObject.set(x, "resourceGroupName", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupNameUndefined: Self = StObject.set(x, "resourceGroupName", js.undefined)
    
    inline def setTerraformSourceName(value: String255): Self = StObject.set(x, "terraformSourceName", value.asInstanceOf[js.Any])
    
    inline def setTerraformSourceNameUndefined: Self = StObject.set(x, "terraformSourceName", js.undefined)
  }
}
