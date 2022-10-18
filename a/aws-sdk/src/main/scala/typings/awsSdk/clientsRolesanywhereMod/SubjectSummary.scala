package typings.awsSdk.clientsRolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectSummary extends StObject {
  
  /**
    * The ISO-8601 time stamp of when the certificate was first used in a CreateSession operation.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The enabled status of the Subject. 
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ISO-8601 time stamp of when the certificate was last used in a CreateSession operation.
    */
  var lastSeenAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the resource.
    */
  var subjectArn: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the resource.
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
object SubjectSummary {
  
  inline def apply(): SubjectSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectSummary]
  }
  
  extension [Self <: SubjectSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
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
