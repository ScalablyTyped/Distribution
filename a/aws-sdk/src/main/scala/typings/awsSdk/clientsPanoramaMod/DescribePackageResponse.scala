package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackageResponse extends StObject {
  
  /**
    * The package's ARN.
    */
  var Arn: NodePackageArn
  
  /**
    * When the package was created.
    */
  var CreatedTime: js.Date
  
  /**
    * The package's ID.
    */
  var PackageId: NodePackageId
  
  /**
    * The package's name.
    */
  var PackageName: NodePackageName
  
  /**
    * ARNs of accounts that have read access to the package.
    */
  var ReadAccessPrincipalArns: js.UndefOr[PrincipalArnsList] = js.undefined
  
  /**
    * The package's storage location.
    */
  var StorageLocation: typings.awsSdk.clientsPanoramaMod.StorageLocation
  
  /**
    * The package's tags.
    */
  var Tags: TagMap
  
  /**
    * ARNs of accounts that have write access to the package.
    */
  var WriteAccessPrincipalArns: js.UndefOr[PrincipalArnsList] = js.undefined
}
object DescribePackageResponse {
  
  inline def apply(
    Arn: NodePackageArn,
    CreatedTime: js.Date,
    PackageId: NodePackageId,
    PackageName: NodePackageName,
    StorageLocation: StorageLocation,
    Tags: TagMap
  ): DescribePackageResponse = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], PackageId = PackageId.asInstanceOf[js.Any], PackageName = PackageName.asInstanceOf[js.Any], StorageLocation = StorageLocation.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageResponse]
  }
  
  extension [Self <: DescribePackageResponse](x: Self) {
    
    inline def setArn(value: NodePackageArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageName(value: NodePackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setReadAccessPrincipalArns(value: PrincipalArnsList): Self = StObject.set(x, "ReadAccessPrincipalArns", value.asInstanceOf[js.Any])
    
    inline def setReadAccessPrincipalArnsUndefined: Self = StObject.set(x, "ReadAccessPrincipalArns", js.undefined)
    
    inline def setReadAccessPrincipalArnsVarargs(value: PrincipalArn*): Self = StObject.set(x, "ReadAccessPrincipalArns", js.Array(value*))
    
    inline def setStorageLocation(value: StorageLocation): Self = StObject.set(x, "StorageLocation", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setWriteAccessPrincipalArns(value: PrincipalArnsList): Self = StObject.set(x, "WriteAccessPrincipalArns", value.asInstanceOf[js.Any])
    
    inline def setWriteAccessPrincipalArnsUndefined: Self = StObject.set(x, "WriteAccessPrincipalArns", js.undefined)
    
    inline def setWriteAccessPrincipalArnsVarargs(value: PrincipalArn*): Self = StObject.set(x, "WriteAccessPrincipalArns", js.Array(value*))
  }
}
