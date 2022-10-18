package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAppResult extends StObject {
  
  var app: App
}
object GetAppResult {
  
  inline def apply(app: App): GetAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAppResult]
  }
  
  extension [Self <: GetAppResult](x: Self) {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
