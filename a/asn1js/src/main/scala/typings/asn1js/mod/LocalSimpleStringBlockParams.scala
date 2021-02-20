package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalSimpleStringBlockParams extends StObject {
  
  var value: js.UndefOr[String] = js.native
}
object LocalSimpleStringBlockParams {
  
  @scala.inline
  def apply(): LocalSimpleStringBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSimpleStringBlockParams]
  }
  
  @scala.inline
  implicit class LocalSimpleStringBlockParamsMutableBuilder[Self <: LocalSimpleStringBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
