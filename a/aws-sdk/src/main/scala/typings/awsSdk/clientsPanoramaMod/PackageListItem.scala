package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageListItem extends StObject {
  
  /**
    * The package's ARN.
    */
  var Arn: js.UndefOr[NodePackageArn] = js.undefined
  
  /**
    * When the package was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The package's ID.
    */
  var PackageId: js.UndefOr[NodePackageId] = js.undefined
  
  /**
    * The package's name.
    */
  var PackageName: js.UndefOr[NodePackageName] = js.undefined
  
  /**
    * The package's tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object PackageListItem {
  
  inline def apply(): PackageListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageListItem]
  }
  
  extension [Self <: PackageListItem](x: Self) {
    
    inline def setArn(value: NodePackageArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageIdUndefined: Self = StObject.set(x, "PackageId", js.undefined)
    
    inline def setPackageName(value: NodePackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "PackageName", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
