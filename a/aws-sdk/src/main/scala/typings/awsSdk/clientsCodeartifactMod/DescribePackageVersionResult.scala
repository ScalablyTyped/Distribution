package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackageVersionResult extends StObject {
  
  /**
    *  A PackageVersionDescription object that contains information about the requested package version. 
    */
  var packageVersion: PackageVersionDescription
}
object DescribePackageVersionResult {
  
  inline def apply(packageVersion: PackageVersionDescription): DescribePackageVersionResult = {
    val __obj = js.Dynamic.literal(packageVersion = packageVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageVersionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePackageVersionResult] (val x: Self) extends AnyVal {
    
    inline def setPackageVersion(value: PackageVersionDescription): Self = StObject.set(x, "packageVersion", value.asInstanceOf[js.Any])
  }
}
