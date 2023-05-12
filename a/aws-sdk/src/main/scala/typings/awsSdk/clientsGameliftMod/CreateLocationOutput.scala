package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocationOutput extends StObject {
  
  /**
    * The details of the custom location you created.
    */
  var Location: js.UndefOr[LocationModel] = js.undefined
}
object CreateLocationOutput {
  
  inline def apply(): CreateLocationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLocationOutput] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: LocationModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
