package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePackageRequest extends StObject {
  
  /**
    * A name for the package.
    */
  var PackageName: NodePackageName
  
  /**
    * Tags for the package.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreatePackageRequest {
  
  inline def apply(PackageName: NodePackageName): CreatePackageRequest = {
    val __obj = js.Dynamic.literal(PackageName = PackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePackageRequest]
  }
  
  extension [Self <: CreatePackageRequest](x: Self) {
    
    inline def setPackageName(value: NodePackageName): Self = StObject.set(x, "PackageName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
