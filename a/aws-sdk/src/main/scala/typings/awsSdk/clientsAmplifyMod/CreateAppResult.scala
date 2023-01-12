package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppResult extends StObject {
  
  var app: App
}
object CreateAppResult {
  
  inline def apply(app: App): CreateAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppResult] (val x: Self) extends AnyVal {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
