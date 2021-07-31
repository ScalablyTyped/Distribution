package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalSidValueBlockParams
  extends StObject
     with LocalHexBlockParams {
  
  var isFirstSid: js.UndefOr[scala.Boolean] = js.undefined
  
  var valueDec: js.UndefOr[Double] = js.undefined
}
object LocalSidValueBlockParams {
  
  @scala.inline
  def apply(): LocalSidValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalSidValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalSidValueBlockParamsMutableBuilder[Self <: LocalSidValueBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFirstSid(value: scala.Boolean): Self = StObject.set(x, "isFirstSid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirstSidUndefined: Self = StObject.set(x, "isFirstSid", js.undefined)
    
    @scala.inline
    def setValueDec(value: Double): Self = StObject.set(x, "valueDec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueDecUndefined: Self = StObject.set(x, "valueDec", js.undefined)
  }
}
