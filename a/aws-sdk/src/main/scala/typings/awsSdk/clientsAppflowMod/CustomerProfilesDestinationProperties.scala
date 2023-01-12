package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerProfilesDestinationProperties extends StObject {
  
  /**
    *  The unique name of the Amazon Connect Customer Profiles domain. 
    */
  var domainName: DomainName
  
  /**
    *  The object specified in the Amazon Connect Customer Profiles flow destination. 
    */
  var objectTypeName: js.UndefOr[ObjectTypeName] = js.undefined
}
object CustomerProfilesDestinationProperties {
  
  inline def apply(domainName: DomainName): CustomerProfilesDestinationProperties = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerProfilesDestinationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerProfilesDestinationProperties] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeName(value: ObjectTypeName): Self = StObject.set(x, "objectTypeName", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNameUndefined: Self = StObject.set(x, "objectTypeName", js.undefined)
  }
}
