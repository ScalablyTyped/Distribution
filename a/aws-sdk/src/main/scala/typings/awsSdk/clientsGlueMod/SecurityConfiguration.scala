package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityConfiguration extends StObject {
  
  /**
    * The time at which this security configuration was created.
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The encryption configuration associated with this security configuration.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsGlueMod.EncryptionConfiguration] = js.undefined
  
  /**
    * The name of the security configuration.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object SecurityConfiguration {
  
  inline def apply(): SecurityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimeStamp(value: js.Date): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
