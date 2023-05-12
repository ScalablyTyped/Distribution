package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocationInput extends StObject {
  
  /**
    * The location name of the custom location to be deleted.
    */
  var LocationName: CustomLocationNameOrArnModel
}
object DeleteLocationInput {
  
  inline def apply(LocationName: CustomLocationNameOrArnModel): DeleteLocationInput = {
    val __obj = js.Dynamic.literal(LocationName = LocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLocationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLocationInput] (val x: Self) extends AnyVal {
    
    inline def setLocationName(value: CustomLocationNameOrArnModel): Self = StObject.set(x, "LocationName", value.asInstanceOf[js.Any])
  }
}
