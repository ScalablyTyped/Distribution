package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalObjectIdentifierValueBlockParams extends LocalBaseBlockParams {
  
  var value: js.UndefOr[String] = js.native
}
object LocalObjectIdentifierValueBlockParams {
  
  @scala.inline
  def apply(): LocalObjectIdentifierValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalObjectIdentifierValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalObjectIdentifierValueBlockParamsMutableBuilder[Self <: LocalObjectIdentifierValueBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
