package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainServiceSoftwareOptions extends StObject {
  
  /**
    * The epoch time when the deployment window closes for required updates. After this time, Amazon OpenSearch Service schedules the software upgrade automatically.
    */
  var AutomatedUpdateDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether a request to update the domain can be canceled.
    */
  var Cancellable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The version of the service software that is currently installed on the domain.
    */
  var CurrentVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A more detailed description of the service software status.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The most recent version of the service software.
    */
  var NewVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether a service software update is available for the domain.
    */
  var UpdateAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The status of the service software update. Valid values are as follows:    COMPLETED     ELIGIBLE     IN_PROGRESS     NOT_ELIGIBLE     PENDING_UPDATE   
    */
  var UpdateStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElasticsearchDomainServiceSoftwareOptions {
  
  inline def apply(): AwsElasticsearchDomainServiceSoftwareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainServiceSoftwareOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsElasticsearchDomainServiceSoftwareOptions] (val x: Self) extends AnyVal {
    
    inline def setAutomatedUpdateDate(value: NonEmptyString): Self = StObject.set(x, "AutomatedUpdateDate", value.asInstanceOf[js.Any])
    
    inline def setAutomatedUpdateDateUndefined: Self = StObject.set(x, "AutomatedUpdateDate", js.undefined)
    
    inline def setCancellable(value: Boolean): Self = StObject.set(x, "Cancellable", value.asInstanceOf[js.Any])
    
    inline def setCancellableUndefined: Self = StObject.set(x, "Cancellable", js.undefined)
    
    inline def setCurrentVersion(value: NonEmptyString): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setNewVersion(value: NonEmptyString): Self = StObject.set(x, "NewVersion", value.asInstanceOf[js.Any])
    
    inline def setNewVersionUndefined: Self = StObject.set(x, "NewVersion", js.undefined)
    
    inline def setUpdateAvailable(value: Boolean): Self = StObject.set(x, "UpdateAvailable", value.asInstanceOf[js.Any])
    
    inline def setUpdateAvailableUndefined: Self = StObject.set(x, "UpdateAvailable", js.undefined)
    
    inline def setUpdateStatus(value: NonEmptyString): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
  }
}
