package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskVolumeHostDetails extends StObject {
  
  /**
    * When the host parameter is used, specify a sourcePath to declare the path on the host container instance that's presented to the container. 
    */
  var SourcePath: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskVolumeHostDetails {
  
  inline def apply(): AwsEcsTaskVolumeHostDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskVolumeHostDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskVolumeHostDetails] (val x: Self) extends AnyVal {
    
    inline def setSourcePath(value: NonEmptyString): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "SourcePath", js.undefined)
  }
}
