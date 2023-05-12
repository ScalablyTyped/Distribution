package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails extends StObject {
  
  /**
    *  Indicates the minimum IMDS version that the notebook instance supports. 
    */
  var MinimumInstanceMetadataServiceVersion: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails {
  
  inline def apply(): AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetails] (val x: Self) extends AnyVal {
    
    inline def setMinimumInstanceMetadataServiceVersion(value: NonEmptyString): Self = StObject.set(x, "MinimumInstanceMetadataServiceVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumInstanceMetadataServiceVersionUndefined: Self = StObject.set(x, "MinimumInstanceMetadataServiceVersion", js.undefined)
  }
}
