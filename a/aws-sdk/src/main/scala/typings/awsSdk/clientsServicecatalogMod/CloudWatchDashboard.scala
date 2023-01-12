package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchDashboard extends StObject {
  
  /**
    * The name of the CloudWatch dashboard.
    */
  var Name: js.UndefOr[CloudWatchDashboardName] = js.undefined
}
object CloudWatchDashboard {
  
  inline def apply(): CloudWatchDashboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchDashboard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchDashboard] (val x: Self) extends AnyVal {
    
    inline def setName(value: CloudWatchDashboardName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
