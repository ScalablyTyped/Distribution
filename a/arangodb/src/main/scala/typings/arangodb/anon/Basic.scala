package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Basic extends StObject {
  
  var basic: js.UndefOr[Username] = js.native
  
  var bearer: js.UndefOr[String] = js.native
}
object Basic {
  
  @scala.inline
  def apply(): Basic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Basic]
  }
  
  @scala.inline
  implicit class BasicMutableBuilder[Self <: Basic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasic(value: Username): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    
    @scala.inline
    def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
  }
}
