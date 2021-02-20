package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawDataParams extends StObject {
  
  var data: js.UndefOr[ArrayBuffer] = js.native
}
object RawDataParams {
  
  @scala.inline
  def apply(): RawDataParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawDataParams]
  }
  
  @scala.inline
  implicit class RawDataParamsMutableBuilder[Self <: RawDataParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
