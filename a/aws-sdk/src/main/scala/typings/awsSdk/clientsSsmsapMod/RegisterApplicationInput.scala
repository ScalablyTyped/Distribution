package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterApplicationInput extends StObject {
  
  /**
    * The ID of the application.
    */
  var ApplicationId: typings.awsSdk.clientsSsmsapMod.ApplicationId
  
  /**
    * The type of the application.
    */
  var ApplicationType: typings.awsSdk.clientsSsmsapMod.ApplicationType
  
  /**
    * The credentials of the SAP application.
    */
  var Credentials: ApplicationCredentialList
  
  /**
    * The Amazon EC2 instances on which your SAP application is running.
    */
  var Instances: InstanceList
  
  /**
    * The SAP instance number of the application.
    */
  var SapInstanceNumber: js.UndefOr[SAPInstanceNumber] = js.undefined
  
  /**
    * The System ID of the application.
    */
  var Sid: js.UndefOr[SID] = js.undefined
  
  /**
    * The tags to be attached to the SAP application.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object RegisterApplicationInput {
  
  inline def apply(
    ApplicationId: ApplicationId,
    ApplicationType: ApplicationType,
    Credentials: ApplicationCredentialList,
    Instances: InstanceList
  ): RegisterApplicationInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], ApplicationType = ApplicationType.asInstanceOf[js.Any], Credentials = Credentials.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterApplicationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterApplicationInput] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationType(value: ApplicationType): Self = StObject.set(x, "ApplicationType", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: ApplicationCredentialList): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsVarargs(value: ApplicationCredential*): Self = StObject.set(x, "Credentials", js.Array(value*))
    
    inline def setInstances(value: InstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: InstanceId*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setSapInstanceNumber(value: SAPInstanceNumber): Self = StObject.set(x, "SapInstanceNumber", value.asInstanceOf[js.Any])
    
    inline def setSapInstanceNumberUndefined: Self = StObject.set(x, "SapInstanceNumber", js.undefined)
    
    inline def setSid(value: SID): Self = StObject.set(x, "Sid", value.asInstanceOf[js.Any])
    
    inline def setSidUndefined: Self = StObject.set(x, "Sid", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
