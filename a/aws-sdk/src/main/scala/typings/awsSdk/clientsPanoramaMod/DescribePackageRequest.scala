package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackageRequest extends StObject {
  
  /**
    * The package's ID.
    */
  var PackageId: NodePackageId
}
object DescribePackageRequest {
  
  inline def apply(PackageId: NodePackageId): DescribePackageRequest = {
    val __obj = js.Dynamic.literal(PackageId = PackageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePackageRequest] (val x: Self) extends AnyVal {
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
  }
}
