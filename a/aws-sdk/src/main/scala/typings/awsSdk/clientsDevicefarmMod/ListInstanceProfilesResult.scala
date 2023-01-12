package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstanceProfilesResult extends StObject {
  
  /**
    * An object that contains information about your instance profiles.
    */
  var instanceProfiles: js.UndefOr[InstanceProfiles] = js.undefined
  
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListInstanceProfilesResult {
  
  inline def apply(): ListInstanceProfilesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstanceProfilesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInstanceProfilesResult] (val x: Self) extends AnyVal {
    
    inline def setInstanceProfiles(value: InstanceProfiles): Self = StObject.set(x, "instanceProfiles", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfilesUndefined: Self = StObject.set(x, "instanceProfiles", js.undefined)
    
    inline def setInstanceProfilesVarargs(value: InstanceProfile*): Self = StObject.set(x, "instanceProfiles", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
