package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInstanceAdminSummary extends StObject {
  
  /**
    * The name and metadata of the app instance administrator.
    */
  var Admin: js.UndefOr[Identity] = js.undefined
}
object AppInstanceAdminSummary {
  
  @scala.inline
  def apply(): AppInstanceAdminSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceAdminSummary]
  }
  
  @scala.inline
  implicit class AppInstanceAdminSummaryMutableBuilder[Self <: AppInstanceAdminSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Identity): Self = StObject.set(x, "Admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminUndefined: Self = StObject.set(x, "Admin", js.undefined)
  }
}
