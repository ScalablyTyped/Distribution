package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountWithRestoreAccess extends StObject {
  
  /**
    * The identifier of an Amazon Web Services support account authorized to restore a snapshot. For Amazon Web Services Support, the identifier is amazon-redshift-support. 
    */
  var AccountAlias: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of an Amazon Web Services account authorized to restore a snapshot.
    */
  var AccountId: js.UndefOr[String] = js.undefined
}
object AccountWithRestoreAccess {
  
  inline def apply(): AccountWithRestoreAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountWithRestoreAccess]
  }
  
  extension [Self <: AccountWithRestoreAccess](x: Self) {
    
    inline def setAccountAlias(value: String): Self = StObject.set(x, "AccountAlias", value.asInstanceOf[js.Any])
    
    inline def setAccountAliasUndefined: Self = StObject.set(x, "AccountAlias", js.undefined)
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
  }
}
