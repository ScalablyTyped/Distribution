package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageImportJobOutput extends StObject {
  
  /**
    * The package's output location.
    */
  var OutputS3Location: OutPutS3Location
  
  /**
    * The package's ID.
    */
  var PackageId: NodePackageId
  
  /**
    * The package's version.
    */
  var PackageVersion: NodePackageVersion
  
  /**
    * The package's patch version.
    */
  var PatchVersion: NodePackagePatchVersion
}
object PackageImportJobOutput {
  
  inline def apply(
    OutputS3Location: OutPutS3Location,
    PackageId: NodePackageId,
    PackageVersion: NodePackageVersion,
    PatchVersion: NodePackagePatchVersion
  ): PackageImportJobOutput = {
    val __obj = js.Dynamic.literal(OutputS3Location = OutputS3Location.asInstanceOf[js.Any], PackageId = PackageId.asInstanceOf[js.Any], PackageVersion = PackageVersion.asInstanceOf[js.Any], PatchVersion = PatchVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageImportJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageImportJobOutput] (val x: Self) extends AnyVal {
    
    inline def setOutputS3Location(value: OutPutS3Location): Self = StObject.set(x, "OutputS3Location", value.asInstanceOf[js.Any])
    
    inline def setPackageId(value: NodePackageId): Self = StObject.set(x, "PackageId", value.asInstanceOf[js.Any])
    
    inline def setPackageVersion(value: NodePackageVersion): Self = StObject.set(x, "PackageVersion", value.asInstanceOf[js.Any])
    
    inline def setPatchVersion(value: NodePackagePatchVersion): Self = StObject.set(x, "PatchVersion", value.asInstanceOf[js.Any])
  }
}
