package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsSystem extends StObject {
  
  var isSystem: js.UndefOr[Boolean] = js.native
}
object IsSystem {
  
  @scala.inline
  def apply(): IsSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsSystem]
  }
  
  @scala.inline
  implicit class IsSystemMutableBuilder[Self <: IsSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystemUndefined: Self = StObject.set(x, "isSystem", js.undefined)
  }
}
