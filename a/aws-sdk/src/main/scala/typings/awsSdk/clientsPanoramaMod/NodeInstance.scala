package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeInstance extends StObject {
  
  /**
    * The instance's current status.
    */
  var CurrentStatus: NodeInstanceStatus
  
  /**
    * The node's ID.
    */
  var NodeId: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NodeId] = js.undefined
  
  /**
    * The instance's ID.
    */
  var NodeInstanceId: typings.awsSdk.clientsPanoramaMod.NodeInstanceId
  
  /**
    * The instance's name.
    */
  var NodeName: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NodeName] = js.undefined
  
  /**
    * The instance's package name.
    */
  var PackageName: js.UndefOr[NodePackageName] = js.undefined
  
  /**
    * The instance's package patch version.
    */
  var PackagePatchVersion: js.UndefOr[NodePackagePatchVersion] = js.undefined
  
  /**
    * The instance's package version.
    */
  var PackageVersion: js.UndefOr[NodePackageVersion] = js.undefined
}
object NodeInstance {
  
  inline def apply(CurrentStatus: NodeInstanceStatus, NodeInstanceId: NodeInstanceId): NodeInstance = {
    val __obj = js.Dynamic.literal(CurrentStatus = CurrentStatus.asInstanceOf[js.Any], NodeInstanceId = NodeInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeInstance] (val x: Self) extends AnyVal {
    
    inline def setCurrentStatus(value: NodeInstanceStatus): Self = StObject.set(x, "CurrentStatus", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "NodeId", js.undefined)
    
    inline def setNodeInstanceId(value: NodeInstanceId): Self = StObject.set(x, "NodeInstanceId", value.asInstanceOf[js.Any])
    
    inline def setNodeName(value: NodeName): Self = StObject.set(x, "NodeName", value.asInstanceOf[js.Any])
    
    inline def setNodeNameUndefined: Self = StObject.set(x, "NodeName", js.undefined)
    
    inline def setPackageName(value: NodePackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "PackageName", js.undefined)
    
    inline def setPackagePatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PackagePatchVersion", value.asInstanceOf[js.Any])
    
    inline def setPackagePatchVersionUndefined: Self = StObject.set(x, "PackagePatchVersion", js.undefined)
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPackageVersionUndefined: Self = StObject.set(x, "PackageVersion", js.undefined)
  }
}
