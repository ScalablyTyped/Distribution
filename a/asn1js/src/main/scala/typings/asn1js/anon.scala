package typings.asn1js

import org.scalablytyped.runtime.Instantiable1
import typings.pvtsutils.mod.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BlockLength extends StObject {
    
    var blockLength: Double
    
    var blockName: String
    
    var error: String
    
    var isHexOnly: Boolean
    
    var valueBeforeDecode: String
    
    var valueHex: String
    
    var warnings: js.Array[String]
  }
  object BlockLength {
    
    inline def apply(
      blockLength: Double,
      blockName: String,
      error: String,
      isHexOnly: Boolean,
      valueBeforeDecode: String,
      valueHex: String,
      warnings: js.Array[String]
    ): BlockLength = {
      val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], isHexOnly = isHexOnly.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], valueHex = valueHex.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockLength]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockLength] (val x: Self) extends AnyVal {
      
      inline def setBlockLength(value: Double): Self = StObject.set(x, "blockLength", value.asInstanceOf[js.Any])
      
      inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setIsHexOnly(value: Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
      
      inline def setValueBeforeDecode(value: String): Self = StObject.set(x, "valueBeforeDecode", value.asInstanceOf[js.Any])
      
      inline def setValueHex(value: String): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
      
      inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait Error extends StObject {
    
    var error: String
  }
  object Error {
    
    inline def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FromBER extends StObject {
    
    var blockLength: Double = js.native
    
    var error: String = js.native
    
    def fromBER(inputBuffer: js.typedarray.ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
    def fromBER(inputBuffer: js.typedarray.Uint8Array, inputOffset: Double, inputLength: Double): Double = js.native
    
    var isHexOnly: Boolean = js.native
    
    def toBER(): js.typedarray.ArrayBuffer = js.native
    def toBER(sizeOnly: Boolean): js.typedarray.ArrayBuffer = js.native
    
    /**
      * Returns a JSON representation of an object
      * @returns JSON object
      */
    def toJSON(): BlockLength = js.native
    
    /**
      * Binary data in ArrayBuffer representation
      *
      * @deprecated since version 3.0.0
      */
    var valueBeforeDecode: js.typedarray.ArrayBuffer = js.native
    
    var valueBeforeDecodeView: js.typedarray.Uint8Array = js.native
    
    /**
      * Binary data in ArrayBuffer representation
      *
      * @deprecated since version 3.0.0
      */
    var valueHex: js.typedarray.ArrayBuffer = js.native
    
    /**
      * Binary data in Uint8Array representation
      *
      * @since 3.0.0
      */
    var valueHexView: js.typedarray.Uint8Array = js.native
    
    var warnings: js.Array[String] = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* args (repeated) */ Any, FromBER] {
    
    var NAME: String = js.native
    
    def blockName(): String = js.native
  }
  
  /* Inlined std.Partial<asn1js.asn1js.ILocalIdentificationBlock> & asn1js.asn1js.HexBlockParams */
  trait PartialILocalIdentificati extends StObject {
    
    var isConstructed: js.UndefOr[Boolean] = js.undefined
    
    var isHexOnly: js.UndefOr[Boolean] = js.undefined
    
    var tagClass: js.UndefOr[Double] = js.undefined
    
    var tagNumber: js.UndefOr[Double] = js.undefined
    
    var valueHex: js.UndefOr[BufferSource] = js.undefined
  }
  object PartialILocalIdentificati {
    
    inline def apply(): PartialILocalIdentificati = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialILocalIdentificati]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialILocalIdentificati] (val x: Self) extends AnyVal {
      
      inline def setIsConstructed(value: Boolean): Self = StObject.set(x, "isConstructed", value.asInstanceOf[js.Any])
      
      inline def setIsConstructedUndefined: Self = StObject.set(x, "isConstructed", js.undefined)
      
      inline def setIsHexOnly(value: Boolean): Self = StObject.set(x, "isHexOnly", value.asInstanceOf[js.Any])
      
      inline def setIsHexOnlyUndefined: Self = StObject.set(x, "isHexOnly", js.undefined)
      
      inline def setTagClass(value: Double): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
      
      inline def setTagClassUndefined: Self = StObject.set(x, "tagClass", js.undefined)
      
      inline def setTagNumber(value: Double): Self = StObject.set(x, "tagNumber", value.asInstanceOf[js.Any])
      
      inline def setTagNumberUndefined: Self = StObject.set(x, "tagNumber", js.undefined)
      
      inline def setValueHex(value: BufferSource): Self = StObject.set(x, "valueHex", value.asInstanceOf[js.Any])
      
      inline def setValueHexUndefined: Self = StObject.set(x, "valueHex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<asn1js.asn1js.ILocalLengthBlock> */
  trait PartialILocalLengthBlock extends StObject {
    
    var isIndefiniteForm: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var longFormUsed: js.UndefOr[Boolean] = js.undefined
  }
  object PartialILocalLengthBlock {
    
    inline def apply(): PartialILocalLengthBlock = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialILocalLengthBlock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialILocalLengthBlock] (val x: Self) extends AnyVal {
      
      inline def setIsIndefiniteForm(value: Boolean): Self = StObject.set(x, "isIndefiniteForm", value.asInstanceOf[js.Any])
      
      inline def setIsIndefiniteFormUndefined: Self = StObject.set(x, "isIndefiniteForm", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLongFormUsed(value: Boolean): Self = StObject.set(x, "longFormUsed", value.asInstanceOf[js.Any])
      
      inline def setLongFormUsedUndefined: Self = StObject.set(x, "longFormUsed", js.undefined)
    }
  }
}
