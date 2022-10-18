package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCertificateManagerCertificateResourceRecord extends StObject {
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of resource.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value of the resource.
    */
  var Value: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCertificateManagerCertificateResourceRecord {
  
  inline def apply(): AwsCertificateManagerCertificateResourceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCertificateManagerCertificateResourceRecord]
  }
  
  extension [Self <: AwsCertificateManagerCertificateResourceRecord](x: Self) {
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setValue(value: NonEmptyString): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
