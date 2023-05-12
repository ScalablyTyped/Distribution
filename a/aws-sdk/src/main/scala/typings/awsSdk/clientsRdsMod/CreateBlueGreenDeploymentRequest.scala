package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBlueGreenDeploymentRequest extends StObject {
  
  /**
    * The name of the blue/green deployment. Constraints:   Can't be the same as an existing blue/green deployment name in the same account and Amazon Web Services Region.  
    */
  var BlueGreenDeploymentName: typings.awsSdk.clientsRdsMod.BlueGreenDeploymentName
  
  /**
    * The Amazon Resource Name (ARN) of the source production database. Specify the database that you want to clone. The blue/green deployment creates this database in the green environment. You can make updates to the database in the green environment, such as an engine version upgrade. When you are ready, you can switch the database in the green environment to be the production database.
    */
  var Source: DatabaseArn
  
  /**
    * Tags to assign to the blue/green deployment.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The DB cluster parameter group associated with the Aurora DB cluster in the green environment. To test parameter changes, specify a DB cluster parameter group that is different from the one associated with the source DB cluster.
    */
  var TargetDBClusterParameterGroupName: js.UndefOr[typings.awsSdk.clientsRdsMod.TargetDBClusterParameterGroupName] = js.undefined
  
  /**
    * The DB parameter group associated with the DB instance in the green environment. To test parameter changes, specify a DB parameter group that is different from the one associated with the source DB instance.
    */
  var TargetDBParameterGroupName: js.UndefOr[typings.awsSdk.clientsRdsMod.TargetDBParameterGroupName] = js.undefined
  
  /**
    * The engine version of the database in the green environment. Specify the engine version to upgrade to in the green environment.
    */
  var TargetEngineVersion: js.UndefOr[typings.awsSdk.clientsRdsMod.TargetEngineVersion] = js.undefined
}
object CreateBlueGreenDeploymentRequest {
  
  inline def apply(BlueGreenDeploymentName: BlueGreenDeploymentName, Source: DatabaseArn): CreateBlueGreenDeploymentRequest = {
    val __obj = js.Dynamic.literal(BlueGreenDeploymentName = BlueGreenDeploymentName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBlueGreenDeploymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBlueGreenDeploymentRequest] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenDeploymentName(value: BlueGreenDeploymentName): Self = StObject.set(x, "BlueGreenDeploymentName", value.asInstanceOf[js.Any])
    
    inline def setSource(value: DatabaseArn): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetDBClusterParameterGroupName(value: TargetDBClusterParameterGroupName): Self = StObject.set(x, "TargetDBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setTargetDBClusterParameterGroupNameUndefined: Self = StObject.set(x, "TargetDBClusterParameterGroupName", js.undefined)
    
    inline def setTargetDBParameterGroupName(value: TargetDBParameterGroupName): Self = StObject.set(x, "TargetDBParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setTargetDBParameterGroupNameUndefined: Self = StObject.set(x, "TargetDBParameterGroupName", js.undefined)
    
    inline def setTargetEngineVersion(value: TargetEngineVersion): Self = StObject.set(x, "TargetEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setTargetEngineVersionUndefined: Self = StObject.set(x, "TargetEngineVersion", js.undefined)
  }
}
