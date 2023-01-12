package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheParameterGroupsMessage extends StObject {
  
  /**
    * A list of cache parameter groups. Each element in the list contains detailed information about one cache parameter group.
    */
  var CacheParameterGroups: js.UndefOr[CacheParameterGroupList] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object CacheParameterGroupsMessage {
  
  inline def apply(): CacheParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheParameterGroupsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheParameterGroupsMessage] (val x: Self) extends AnyVal {
    
    inline def setCacheParameterGroups(value: CacheParameterGroupList): Self = StObject.set(x, "CacheParameterGroups", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupsUndefined: Self = StObject.set(x, "CacheParameterGroups", js.undefined)
    
    inline def setCacheParameterGroupsVarargs(value: CacheParameterGroup*): Self = StObject.set(x, "CacheParameterGroups", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
