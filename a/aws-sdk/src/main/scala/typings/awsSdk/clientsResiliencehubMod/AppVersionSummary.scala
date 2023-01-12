package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppVersionSummary extends StObject {
  
  /**
    * The version of the application.
    */
  var appVersion: EntityVersion
}
object AppVersionSummary {
  
  inline def apply(appVersion: EntityVersion): AppVersionSummary = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppVersionSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppVersionSummary] (val x: Self) extends AnyVal {
    
    inline def setAppVersion(value: EntityVersion): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
  }
}
