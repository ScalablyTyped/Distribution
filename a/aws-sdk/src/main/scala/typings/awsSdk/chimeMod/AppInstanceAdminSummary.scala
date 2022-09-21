package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceAdminSummary extends StObject {
  
  /**
    * The details of the AppInstanceAdmin.
    */
  var Admin: js.UndefOr[Identity] = js.undefined
}
object AppInstanceAdminSummary {
  
  inline def apply(): AppInstanceAdminSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceAdminSummary]
  }
  
  extension [Self <: AppInstanceAdminSummary](x: Self) {
    
    inline def setAdmin(value: Identity): Self = StObject.set(x, "Admin", value.asInstanceOf[js.Any])
    
    inline def setAdminUndefined: Self = StObject.set(x, "Admin", js.undefined)
  }
}
