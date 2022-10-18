package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  /**
    * The node's category.
    */
  var Category: NodeCategory
  
  /**
    * When the node was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The node's description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsPanoramaMod.Description] = js.undefined
  
  /**
    * The node's name.
    */
  var Name: NodeName
  
  /**
    * The node's ID.
    */
  var NodeId: typings.awsSdk.clientsPanoramaMod.NodeId
  
  /**
    * The account ID of the node's owner.
    */
  var OwnerAccount: js.UndefOr[PackageOwnerAccount] = js.undefined
  
  /**
    * The node's ARN.
    */
  var PackageArn: js.UndefOr[NodePackageArn] = js.undefined
  
  /**
    * The node's package ID.
    */
  var PackageId: NodePackageId
  
  /**
    * The node's package name.
    */
  var PackageName: NodePackageName
  
  /**
    * The node's package version.
    */
  var PackageVersion: NodePackageVersion
  
  /**
    * The node's patch version.
    */
  var PatchVersion: NodePackagePatchVersion
}
object Node {
  
  inline def apply(
    Category: NodeCategory,
    CreatedTime: js.Date,
    Name: NodeName,
    NodeId: NodeId,
    PackageId: NodePackageId,
    PackageName: NodePackageName,
    PackageVersion: NodePackageVersion,
    PatchVersion: NodePackagePatchVersion
  ): Node = {
    val __obj = js.Dynamic.literal(Category = Category.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any], PackageId = PackageId.asInstanceOf[js.Any], PackageName = PackageName.asInstanceOf[js.Any], PackageVersion = PackageVersion.asInstanceOf[js.Any], PatchVersion = PatchVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setCategory(value: NodeCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccount(value: PackageOwnerAccount): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    inline def setPackageArn(value: NodePackageArn): Self = StObject.set(x, "PackageArn", value.asInstanceOf[js.Any])
    
    inline def setPackageArnUndefined: Self = StObject.set(x, "PackageArn", js.undefined)
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: NodePackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PatchVersion", value.asInstanceOf[js.Any])
  }
}
