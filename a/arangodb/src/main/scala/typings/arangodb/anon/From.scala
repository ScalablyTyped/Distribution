package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From
  extends /* key */ StringDictionary[js.Any] {
  
  var _from: js.UndefOr[String] = js.native
  
  var _to: js.UndefOr[String] = js.native
}
object From {
  
  @scala.inline
  def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_from(value: String): Self = StObject.set(x, "_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fromUndefined: Self = StObject.set(x, "_from", js.undefined)
    
    @scala.inline
    def set_to(value: String): Self = StObject.set(x, "_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_toUndefined: Self = StObject.set(x, "_to", js.undefined)
  }
}
