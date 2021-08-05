package typings.asn1js

import typings.asn1js.mod.LocalBaseBlock
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsIndefiniteForm extends StObject {
    
    var isIndefiniteForm: js.UndefOr[Boolean] = js.undefined
    
    var length: Double
    
    var longFormUsed: js.UndefOr[Boolean] = js.undefined
  }
  object IsIndefiniteForm {
    
    inline def apply(length: Double): IsIndefiniteForm = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsIndefiniteForm]
    }
    
    extension [Self <: IsIndefiniteForm](x: Self) {
      
      inline def setIsIndefiniteForm(value: Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
      
      inline def setIsIndefiniteFormUndefined: Self = StObject.set(x, "isIndefiniteForm", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLongFormUsed(value: Boolean): Self = StObject.set(x, "longFormUsed", value.asInstanceOf[js.Any])
      
      inline def setLongFormUsedUndefined: Self = StObject.set(x, "longFormUsed", js.undefined)
    }
  }
  
  /* Inlined asn1js.asn1js.LocalHexBlockParams & {  isConstructed :boolean | undefined,   tagClass :number | undefined,   tagNumber :number | undefined} */
  trait LocalHexBlockParamsisCons extends StObject {
    
    var blockLength: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var isConstructed: js.UndefOr[Boolean] = js.undefined
    
    var isHexOnly: js.UndefOr[Boolean] = js.undefined
    
    var tagClass: js.UndefOr[Double] = js.undefined
    
    var tagNumber: js.UndefOr[Double] = js.undefined
    
    var valueBeforeDecode: js.UndefOr[ArrayBuffer] = js.undefined
    
    var valueHex: js.UndefOr[ArrayBuffer] = js.undefined
    
    var warnings: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LocalHexBlockParamsisCons {
    
    inline def apply(): LocalHexBlockParamsisCons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalHexBlockParamsisCons]
    }
    
    extension [Self <: LocalHexBlockParamsisCons](x: Self) {
      
      inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
      
      inline def setBlockLengthUndefined: Self = StObject.set(x, "blockLength", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsConstructed(value: Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
      
      inline def setIsConstructedUndefined: Self = StObject.set(x, "isConstructed", js.undefined)
      
      inline def setIsHexOnly(value: Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
      
      inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
      
      inline def setTagClass(value: Double): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
      
      inline def setTagClassUndefined: Self = StObject.set(x, "tagClass", js.undefined)
      
      inline def setTagNumber(value: Double): Self = StObject.set(x, "tagNumber", value.asInstanceOf[js.Any])
      
      inline def setTagNumberUndefined: Self = StObject.set(x, "tagNumber", js.undefined)
      
      inline def setValueBeforeDecode(value: ArrayBuffer): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
      
      inline def setValueBeforeDecodeUndefined: Self = StObject.set(x, "valueBeforeDecode", js.undefined)
      
      inline def setValueHex(value: ArrayBuffer): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
      
      inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  trait Offset extends StObject {
    
    var offset: Double
    
    var result: LocalBaseBlock
  }
  object Offset {
    
    inline def apply(offset: Double, result: LocalBaseBlock): Offset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setResult(value: LocalBaseBlock): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var result: js.UndefOr[js.Any] = js.undefined
    
    var verified: Boolean
  }
  object Result {
    
    inline def apply(verified: Boolean): Result = {
      val __obj = js.Dynamic.literal(verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
