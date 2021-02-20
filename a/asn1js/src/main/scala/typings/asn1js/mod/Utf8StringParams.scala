package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utf8StringParams extends StObject {
  
  var value: js.UndefOr[String] = js.native
}
object Utf8StringParams {
  
  @scala.inline
  def apply(): Utf8StringParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Utf8StringParams]
  }
  
  @scala.inline
  implicit class Utf8StringParamsMutableBuilder[Self <: Utf8StringParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
