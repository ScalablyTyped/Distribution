package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterClusterSecurityGroup extends StObject {
  
  /**
    * The name of the cluster security group.
    */
  var ClusterSecurityGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the cluster security group.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterClusterSecurityGroup {
  
  inline def apply(): AwsRedshiftClusterClusterSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterSecurityGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRedshiftClusterClusterSecurityGroup] (val x: Self) extends AnyVal {
    
    inline def setClusterSecurityGroupName(value: NonEmptyString): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setClusterSecurityGroupNameUndefined: Self = StObject.set(x, "ClusterSecurityGroupName", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
