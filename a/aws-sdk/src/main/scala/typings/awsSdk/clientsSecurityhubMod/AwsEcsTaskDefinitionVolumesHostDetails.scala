package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsTaskDefinitionVolumesHostDetails extends StObject {
  
  /**
    * The path on the host container instance that is presented to the container.
    */
  var SourcePath: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcsTaskDefinitionVolumesHostDetails {
  
  inline def apply(): AwsEcsTaskDefinitionVolumesHostDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsTaskDefinitionVolumesHostDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsTaskDefinitionVolumesHostDetails] (val x: Self) extends AnyVal {
    
    inline def setSourcePath(value: NonEmptyString): Self = StObject.set(x, "SourcePath", value.asInstanceOf[js.Any])
    
    inline def setSourcePathUndefined: Self = StObject.set(x, "SourcePath", js.undefined)
  }
}
