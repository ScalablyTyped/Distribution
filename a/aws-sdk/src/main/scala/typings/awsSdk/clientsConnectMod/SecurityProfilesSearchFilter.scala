package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfilesSearchFilter extends StObject {
  
  var TagFilter: js.UndefOr[ControlPlaneTagFilter] = js.undefined
}
object SecurityProfilesSearchFilter {
  
  inline def apply(): SecurityProfilesSearchFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityProfilesSearchFilter]
  }
  
  extension [Self <: SecurityProfilesSearchFilter](x: Self) {
    
    inline def setTagFilter(value: ControlPlaneTagFilter): Self = StObject.set(x, "TagFilter", value.asInstanceOf[js.Any])
    
    inline def setTagFilterUndefined: Self = StObject.set(x, "TagFilter", js.undefined)
  }
}
