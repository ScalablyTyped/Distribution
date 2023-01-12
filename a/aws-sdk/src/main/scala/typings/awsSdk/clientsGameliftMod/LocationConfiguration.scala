package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationConfiguration extends StObject {
  
  /**
    * An Amazon Web Services Region code, such as us-west-2. 
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
}
object LocationConfiguration {
  
  inline def apply(): LocationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
