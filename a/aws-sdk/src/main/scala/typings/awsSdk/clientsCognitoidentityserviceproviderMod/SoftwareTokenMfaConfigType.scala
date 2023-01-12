package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareTokenMfaConfigType extends StObject {
  
  /**
    * Specifies whether software token MFA is activated.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
}
object SoftwareTokenMfaConfigType {
  
  inline def apply(): SoftwareTokenMfaConfigType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareTokenMfaConfigType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoftwareTokenMfaConfigType] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: BooleanType): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
