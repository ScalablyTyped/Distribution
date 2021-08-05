package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAppResult extends StObject {
  
  var app: App
}
object DeleteAppResult {
  
  inline def apply(app: App): DeleteAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppResult]
  }
  
  extension [Self <: DeleteAppResult](x: Self) {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
