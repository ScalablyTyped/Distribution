package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePackageResult extends StObject {
  
  /**
    * A PackageDescription object that contains information about the requested package.
    */
  @JSName("package")
  var _package: PackageDescription
}
object DescribePackageResult {
  
  inline def apply(_package: PackageDescription): DescribePackageResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackageResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePackageResult] (val x: Self) extends AnyVal {
    
    inline def set_package(value: PackageDescription): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
