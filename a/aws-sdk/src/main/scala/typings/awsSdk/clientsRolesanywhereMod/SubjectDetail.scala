package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectDetail extends StObject {
  
  /**
    * The ISO-8601 timestamp when the subject was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The temporary session credentials vended at the last authenticating call with this Subject.
    */
  var credentials: js.UndefOr[CredentialSummaries] = js.undefined
  
  /**
    * The enabled status of the subject.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The specified instance properties associated with the request.
    */
  var instanceProperties: js.UndefOr[InstanceProperties] = js.undefined
  
  /**
    * The ISO-8601 timestamp of the last time this Subject requested temporary session credentials.
    */
  var lastSeenAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var subjectArn: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the resource
    */
  var subjectId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The ISO-8601 timestamp when the subject was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The x509 principal identifier of the authenticating certificate.
    */
  var x509Subject: js.UndefOr[String] = js.undefined
}
object SubjectDetail {
  
  inline def apply(): SubjectDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectDetail]
  }
  
  extension [Self <: SubjectDetail](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCredentials(value: CredentialSummaries): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setCredentialsVarargs(value: CredentialSummary*): Self = StObject.set(x, "credentials", js.Array(value*))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setInstanceProperties(value: InstanceProperties): Self = StObject.set(x, "instanceProperties", value.asInstanceOf[js.Any])
    
    inline def setInstancePropertiesUndefined: Self = StObject.set(x, "instanceProperties", js.undefined)
    
    inline def setInstancePropertiesVarargs(value: InstanceProperty*): Self = StObject.set(x, "instanceProperties", js.Array(value*))
    
    inline def setLastSeenAt(value: js.Date): Self = StObject.set(x, "lastSeenAt", value.asInstanceOf[js.Any])
    
    inline def setLastSeenAtUndefined: Self = StObject.set(x, "lastSeenAt", js.undefined)
    
    inline def setSubjectArn(value: String): Self = StObject.set(x, "subjectArn", value.asInstanceOf[js.Any])
    
    inline def setSubjectArnUndefined: Self = StObject.set(x, "subjectArn", js.undefined)
    
    inline def setSubjectId(value: Uuid): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setSubjectIdUndefined: Self = StObject.set(x, "subjectId", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setX509Subject(value: String): Self = StObject.set(x, "x509Subject", value.asInstanceOf[js.Any])
    
    inline def setX509SubjectUndefined: Self = StObject.set(x, "x509Subject", js.undefined)
  }
}
