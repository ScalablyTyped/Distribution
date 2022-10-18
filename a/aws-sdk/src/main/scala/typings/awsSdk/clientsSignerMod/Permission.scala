package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Permission extends StObject {
  
  /**
    * An AWS Signer action permitted as part of cross-account permissions.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS principal that has been granted a cross-account permission.
    */
  var principal: js.UndefOr[String] = js.undefined
  
  /**
    * The signing profile version that a permission applies to.
    */
  var profileVersion: js.UndefOr[ProfileVersion] = js.undefined
  
  /**
    * A unique identifier for a cross-account permission statement.
    */
  var statementId: js.UndefOr[String] = js.undefined
}
object Permission {
  
  inline def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  extension [Self <: Permission](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setProfileVersion(value: ProfileVersion): Self = StObject.set(x, "profileVersion", value.asInstanceOf[js.Any])
    
    inline def setProfileVersionUndefined: Self = StObject.set(x, "profileVersion", js.undefined)
    
    inline def setStatementId(value: String): Self = StObject.set(x, "statementId", value.asInstanceOf[js.Any])
    
    inline def setStatementIdUndefined: Self = StObject.set(x, "statementId", js.undefined)
  }
}
