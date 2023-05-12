package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) for the resource. 
    */
  var arn: js.UndefOr[GenericArn] = js.undefined
  
  /**
    *  The evaluation status for a resource that was assessed when collecting compliance check evidence.    Audit Manager classes the resource as non-compliant if Security Hub reports a Fail result, or if Config reports a Non-compliant result.   Audit Manager classes the resource as compliant if Security Hub reports a Pass result, or if Config reports a Compliant result.   If a compliance check isn't available or applicable, then no compliance evaluation can be made for that resource. This is the case if a resource assessment uses Config or Security Hub as the underlying data source type, but those services aren't enabled. This is also the case if the resource assessment uses an underlying data source type that doesn't support compliance checks (such as manual evidence, Amazon Web Services API calls, or CloudTrail).   
    */
  var complianceCheck: js.UndefOr[String] = js.undefined
  
  /**
    *  The value of the resource. 
    */
  var value: js.UndefOr[String] = js.undefined
}
object Resource {
  
  inline def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    inline def setArn(value: GenericArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setComplianceCheck(value: String): Self = StObject.set(x, "complianceCheck", value.asInstanceOf[js.Any])
    
    inline def setComplianceCheckUndefined: Self = StObject.set(x, "complianceCheck", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
