package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEfsAccessPointRootDirectoryDetails extends StObject {
  
  /**
    * Specifies the POSIX IDs and permissions to apply to the access point's root directory. 
    */
  var CreationInfo: js.UndefOr[AwsEfsAccessPointRootDirectoryCreationInfoDetails] = js.undefined
  
  /**
    * Specifies the path on the Amazon EFS file system to expose as the root directory to NFS clients using the access point to access the EFS file system. A path can have up to four subdirectories. If the specified path does not exist, you are required to provide CreationInfo. 
    */
  var Path: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEfsAccessPointRootDirectoryDetails {
  
  inline def apply(): AwsEfsAccessPointRootDirectoryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEfsAccessPointRootDirectoryDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEfsAccessPointRootDirectoryDetails] (val x: Self) extends AnyVal {
    
    inline def setCreationInfo(value: AwsEfsAccessPointRootDirectoryCreationInfoDetails): Self = StObject.set(x, "CreationInfo", value.asInstanceOf[js.Any])
    
    inline def setCreationInfoUndefined: Self = StObject.set(x, "CreationInfo", js.undefined)
    
    inline def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
