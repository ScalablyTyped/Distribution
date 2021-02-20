package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalBaseBlockParams extends StObject {
  
  var blockLength: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var valueBeforeDecode: js.UndefOr[ArrayBuffer] = js.native
  
  var warnings: js.UndefOr[js.Array[String]] = js.native
}
object LocalBaseBlockParams {
  
  @scala.inline
  def apply(): LocalBaseBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalBaseBlockParams]
  }
  
  @scala.inline
  implicit class LocalBaseBlockParamsMutableBuilder[Self <: LocalBaseBlockParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockLengthUndefined: Self = StObject.set(x, "blockLength", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setValueBeforeDecode(value: ArrayBuffer): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBeforeDecodeUndefined: Self = StObject.set(x, "valueBeforeDecode", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
