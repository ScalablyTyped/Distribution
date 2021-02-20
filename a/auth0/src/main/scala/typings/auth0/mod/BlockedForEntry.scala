package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockedForEntry extends StObject {
  
  var identifier: String = js.native
  
  var ip: js.UndefOr[String] = js.native
}
object BlockedForEntry {
  
  @scala.inline
  def apply(identifier: String): BlockedForEntry = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedForEntry]
  }
  
  @scala.inline
  implicit class BlockedForEntryMutableBuilder[Self <: BlockedForEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
  }
}
