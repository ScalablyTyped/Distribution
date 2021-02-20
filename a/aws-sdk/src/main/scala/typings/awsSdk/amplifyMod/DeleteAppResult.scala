package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppResult extends StObject {
  
  var app: App = js.native
}
object DeleteAppResult {
  
  @scala.inline
  def apply(app: App): DeleteAppResult = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppResult]
  }
  
  @scala.inline
  implicit class DeleteAppResultMutableBuilder[Self <: DeleteAppResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
