package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfigurationSummary extends StObject {
  
  /**
    * The date and time the security configuration was created.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[XmlString] = js.undefined
}
object SecurityConfigurationSummary {
  
  inline def apply(): SecurityConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfigurationSummary]
  }
  
  extension [Self <: SecurityConfigurationSummary](x: Self) {
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    inline def setName(value: XmlString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
