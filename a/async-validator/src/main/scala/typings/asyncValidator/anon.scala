package typings.asyncValidator

import typings.asyncValidator.distTypesInterfaceMod.EnumString
import typings.asyncValidator.distTypesInterfaceMod.FullField
import typings.asyncValidator.distTypesInterfaceMod.Pattern
import typings.asyncValidator.distTypesInterfaceMod.Range
import typings.asyncValidator.distTypesInterfaceMod.Type
import typings.asyncValidator.distTypesInterfaceMod.ValidateMessage
import typings.asyncValidator.distTypesInterfaceMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Array extends StObject {
    
    var array: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var boolean: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var date: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var email: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var float: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var hex: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var integer: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var method: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var number: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var `object`: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var regexp: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var string: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
    
    var url: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Type]]] = js.undefined
  }
  object Array {
    
    inline def apply(): Array = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Array]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
      
      inline def setArray(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setBoolean(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
      
      inline def setBooleanFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "boolean", js.Any.fromFunction1(value))
      
      inline def setBooleanUndefined: Self = StObject.set(x, "boolean", js.undefined)
      
      inline def setDate(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "date", js.Any.fromFunction1(value))
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setEmail(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "email", js.Any.fromFunction1(value))
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setFloat(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "float", js.Any.fromFunction1(value))
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setHex(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setInteger(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setIntegerFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "integer", js.Any.fromFunction1(value))
      
      inline def setIntegerUndefined: Self = StObject.set(x, "integer", js.undefined)
      
      inline def setMethod(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNumber(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "number", js.Any.fromFunction1(value))
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setObject(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "object", js.Any.fromFunction1(value))
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
      
      inline def setRegexp(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      inline def setRegexpFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "regexp", js.Any.fromFunction1(value))
      
      inline def setRegexpUndefined: Self = StObject.set(x, "regexp", js.undefined)
      
      inline def setString(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setUrl(value: ValidateMessage[js.Tuple2[FullField, Type]]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction1(value: js.Tuple2[FullField, Type] => String): Self = StObject.set(x, "url", js.Any.fromFunction1(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Format extends StObject {
    
    var format: js.UndefOr[ValidateMessage[js.Array[Any]]] = js.undefined
    
    var invalid: js.UndefOr[ValidateMessage[js.Array[Any]]] = js.undefined
    
    var parse: js.UndefOr[ValidateMessage[js.Array[Any]]] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: ValidateMessage[js.Array[Any]]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: js.Array[Any] => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInvalid(value: ValidateMessage[js.Array[Any]]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidFunction1(value: js.Array[Any] => String): Self = StObject.set(x, "invalid", js.Any.fromFunction1(value))
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setParse(value: ValidateMessage[js.Array[Any]]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseFunction1(value: js.Array[Any] => String): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    }
  }
  
  trait Len extends StObject {
    
    var len: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Range]]] = js.undefined
    
    var max: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Range]]] = js.undefined
    
    var min: js.UndefOr[ValidateMessage[js.Tuple2[FullField, Range]]] = js.undefined
    
    var range: js.UndefOr[ValidateMessage[js.Tuple3[FullField, Range, Range]]] = js.undefined
  }
  object Len {
    
    inline def apply(): Len = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Len]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Len] (val x: Self) extends AnyVal {
      
      inline def setLen(value: ValidateMessage[js.Tuple2[FullField, Range]]): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setLenFunction1(value: js.Tuple2[FullField, Range] => String): Self = StObject.set(x, "len", js.Any.fromFunction1(value))
      
      inline def setLenUndefined: Self = StObject.set(x, "len", js.undefined)
      
      inline def setMax(value: ValidateMessage[js.Tuple2[FullField, Range]]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxFunction1(value: js.Tuple2[FullField, Range] => String): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: ValidateMessage[js.Tuple2[FullField, Range]]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinFunction1(value: js.Tuple2[FullField, Range] => String): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setRange(value: ValidateMessage[js.Tuple3[FullField, Range, Range]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeFunction1(value: js.Tuple3[FullField, Range, Range] => String): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  trait Mismatch extends StObject {
    
    var mismatch: js.UndefOr[ValidateMessage[js.Tuple3[FullField, Value, Pattern]]] = js.undefined
  }
  object Mismatch {
    
    inline def apply(): Mismatch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mismatch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mismatch] (val x: Self) extends AnyVal {
      
      inline def setMismatch(value: ValidateMessage[js.Tuple3[FullField, Value, Pattern]]): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
      
      inline def setMismatchFunction1(value: js.Tuple3[FullField, Value, Pattern] => String): Self = StObject.set(x, "mismatch", js.Any.fromFunction1(value))
      
      inline def setMismatchUndefined: Self = StObject.set(x, "mismatch", js.undefined)
    }
  }
  
  /* Inlined std.Partial<async-validator.async-validator/dist-types/interface.ValidateMessages> */
  trait PartialValidateMessages extends StObject {
    
    var default: js.UndefOr[ValidateMessage[js.Array[Any]]] = js.undefined
    
    var array: js.UndefOr[Len] = js.undefined
    
    var date: js.UndefOr[Format] = js.undefined
    
    var `enum`: js.UndefOr[ValidateMessage[js.Tuple2[FullField, EnumString]]] = js.undefined
    
    var number: js.UndefOr[Len] = js.undefined
    
    var pattern: js.UndefOr[Mismatch] = js.undefined
    
    var required: js.UndefOr[ValidateMessage[js.Array[FullField]]] = js.undefined
    
    var string: js.UndefOr[Len] = js.undefined
    
    var types: js.UndefOr[Array] = js.undefined
    
    var whitespace: js.UndefOr[ValidateMessage[js.Array[FullField]]] = js.undefined
  }
  object PartialValidateMessages {
    
    inline def apply(): PartialValidateMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialValidateMessages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialValidateMessages] (val x: Self) extends AnyVal {
      
      inline def setArray(value: Len): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
      
      inline def setDate(value: Format): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setDefault(value: ValidateMessage[js.Array[Any]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultFunction1(value: js.Array[Any] => String): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEnum(value: ValidateMessage[js.Tuple2[FullField, EnumString]]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumFunction1(value: js.Tuple2[FullField, EnumString] => String): Self = StObject.set(x, "enum", js.Any.fromFunction1(value))
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setNumber(value: Len): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setPattern(value: Mismatch): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setRequired(value: ValidateMessage[js.Array[FullField]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredFunction1(value: js.Array[FullField] => String): Self = StObject.set(x, "required", js.Any.fromFunction1(value))
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setString(value: Len): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
      
      inline def setTypes(value: Array): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setWhitespace(value: ValidateMessage[js.Array[FullField]]): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceFunction1(value: js.Array[FullField] => String): Self = StObject.set(x, "whitespace", js.Any.fromFunction1(value))
      
      inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
}
