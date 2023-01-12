package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMetadataServiceConfiguration extends StObject {
  
  /**
    * Indicates the minimum IMDS version that the notebook instance supports. When passed as part of CreateNotebookInstance, if no value is selected, then it defaults to IMDSv1. This means that both IMDSv1 and IMDSv2 are supported. If passed as part of UpdateNotebookInstance, there is no default.
    */
  var MinimumInstanceMetadataServiceVersion: typings.awsSdk.clientsSagemakerMod.MinimumInstanceMetadataServiceVersion
}
object InstanceMetadataServiceConfiguration {
  
  inline def apply(MinimumInstanceMetadataServiceVersion: MinimumInstanceMetadataServiceVersion): InstanceMetadataServiceConfiguration = {
    val __obj = js.Dynamic.literal(MinimumInstanceMetadataServiceVersion = MinimumInstanceMetadataServiceVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceMetadataServiceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceMetadataServiceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMinimumInstanceMetadataServiceVersion(value: MinimumInstanceMetadataServiceVersion): Self = StObject.set(x, "MinimumInstanceMetadataServiceVersion", value.asInstanceOf[js.Any])
  }
}
