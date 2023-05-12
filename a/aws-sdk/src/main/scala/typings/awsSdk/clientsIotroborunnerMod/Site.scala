package typings.awsSdk.clientsIotroborunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Site extends StObject {
  
  var arn: SiteArn
  
  var countryCode: SiteCountryCode
  
  var createdAt: js.Date
  
  /**
    * The name of the site. Mutable after creation and unique within a given account.
    */
  var name: Name
}
object Site {
  
  inline def apply(arn: SiteArn, countryCode: SiteCountryCode, createdAt: js.Date, name: Name): Site = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SiteArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCountryCode(value: SiteCountryCode): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
