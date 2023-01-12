package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationOutput extends StObject {
  
  /**
    * A unique application ID.
    */
  var applicationId: js.UndefOr[ApplicationId] = js.undefined
}
object CreateApplicationOutput {
  
  inline def apply(): CreateApplicationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationOutput] (val x: Self) extends AnyVal {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
  }
}
