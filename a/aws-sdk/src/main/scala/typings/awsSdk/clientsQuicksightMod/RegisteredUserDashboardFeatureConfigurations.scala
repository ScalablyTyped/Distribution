package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisteredUserDashboardFeatureConfigurations extends StObject {
  
  /**
    * The bookmarks configuration for an embedded dashboard in Amazon QuickSight.
    */
  var Bookmarks: js.UndefOr[BookmarksConfigurations] = js.undefined
  
  /**
    * The state persistence settings of an embedded dashboard.
    */
  var StatePersistence: js.UndefOr[StatePersistenceConfigurations] = js.undefined
}
object RegisteredUserDashboardFeatureConfigurations {
  
  inline def apply(): RegisteredUserDashboardFeatureConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisteredUserDashboardFeatureConfigurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisteredUserDashboardFeatureConfigurations] (val x: Self) extends AnyVal {
    
    inline def setBookmarks(value: BookmarksConfigurations): Self = StObject.set(x, "Bookmarks", value.asInstanceOf[js.Any])
    
    inline def setBookmarksUndefined: Self = StObject.set(x, "Bookmarks", js.undefined)
    
    inline def setStatePersistence(value: StatePersistenceConfigurations): Self = StObject.set(x, "StatePersistence", value.asInstanceOf[js.Any])
    
    inline def setStatePersistenceUndefined: Self = StObject.set(x, "StatePersistence", js.undefined)
  }
}
