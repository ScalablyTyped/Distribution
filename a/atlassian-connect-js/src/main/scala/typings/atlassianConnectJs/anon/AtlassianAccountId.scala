package typings.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AtlassianAccountId extends StObject {
  
  var atlassianAccountId: String = js.native
}
object AtlassianAccountId {
  
  @scala.inline
  def apply(atlassianAccountId: String): AtlassianAccountId = {
    val __obj = js.Dynamic.literal(atlassianAccountId = atlassianAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtlassianAccountId]
  }
  
  @scala.inline
  implicit class AtlassianAccountIdMutableBuilder[Self <: AtlassianAccountId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtlassianAccountId(value: String): Self = StObject.set(x, "atlassianAccountId", value.asInstanceOf[js.Any])
  }
}
