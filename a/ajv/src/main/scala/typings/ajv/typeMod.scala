package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.ajvStrings.`type`
import typings.ajv.distTypesMod.CodeKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod extends Shortcut {
  
  @JSImport("ajv/dist/vocabularies/jtd/type", JSImport.Default)
  @js.native
  val default: CodeKeywordDefinition = js.native
  
  /* Inlined {[ T in ajv.ajv/dist/vocabularies/jtd/type.IntType ]: [number, number, number]} */
  object intRange {
    
    @JSImport("ajv/dist/vocabularies/jtd/type", "intRange")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ajv/dist/vocabularies/jtd/type", "intRange.int16")
    @js.native
    def int16: js.Tuple3[Double, Double, Double] = js.native
    inline def int16_=(x: js.Tuple3[Double, Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int16")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/vocabularies/jtd/type", "intRange.int32")
    @js.native
    def int32: js.Tuple3[Double, Double, Double] = js.native
    inline def int32_=(x: js.Tuple3[Double, Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int32")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/vocabularies/jtd/type", "intRange.int8")
    @js.native
    def int8: js.Tuple3[Double, Double, Double] = js.native
    inline def int8_=(x: js.Tuple3[Double, Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("int8")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/vocabularies/jtd/type", "intRange.uint16")
    @js.native
    def uint16: js.Tuple3[Double, Double, Double] = js.native
    inline def uint16_=(x: js.Tuple3[Double, Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint16")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/vocabularies/jtd/type", "intRange.uint32")
    @js.native
    def uint32: js.Tuple3[Double, Double, Double] = js.native
    inline def uint32_=(x: js.Tuple3[Double, Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint32")(x.asInstanceOf[js.Any])
    
    @JSImport("ajv/dist/vocabularies/jtd/type", "intRange.uint8")
    @js.native
    def uint8: js.Tuple3[Double, Double, Double] = js.native
    inline def uint8_=(x: js.Tuple3[Double, Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uint8")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvStrings.int8
    - typings.ajv.ajvStrings.uint8
    - typings.ajv.ajvStrings.int16
    - typings.ajv.ajvStrings.uint16
    - typings.ajv.ajvStrings.int32
    - typings.ajv.ajvStrings.uint32
  */
  trait IntType extends StObject
  object IntType {
    
    inline def int16: typings.ajv.ajvStrings.int16 = "int16".asInstanceOf[typings.ajv.ajvStrings.int16]
    
    inline def int32: typings.ajv.ajvStrings.int32 = "int32".asInstanceOf[typings.ajv.ajvStrings.int32]
    
    inline def int8: typings.ajv.ajvStrings.int8 = "int8".asInstanceOf[typings.ajv.ajvStrings.int8]
    
    inline def uint16: typings.ajv.ajvStrings.uint16 = "uint16".asInstanceOf[typings.ajv.ajvStrings.uint16]
    
    inline def uint32: typings.ajv.ajvStrings.uint32 = "uint32".asInstanceOf[typings.ajv.ajvStrings.uint32]
    
    inline def uint8: typings.ajv.ajvStrings.uint8 = "uint8".asInstanceOf[typings.ajv.ajvStrings.uint8]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ajv.ajvStrings.boolean
    - typings.ajv.ajvStrings.string
    - typings.ajv.ajvStrings.timestamp
    - typings.ajv.ajvStrings.float32
    - typings.ajv.ajvStrings.float64
    - typings.ajv.ajvStrings.int8
    - typings.ajv.ajvStrings.uint8
    - typings.ajv.ajvStrings.int16
    - typings.ajv.ajvStrings.uint16
    - typings.ajv.ajvStrings.int32
    - typings.ajv.ajvStrings.uint32
  */
  trait JTDType extends StObject
  object JTDType {
    
    inline def boolean: typings.ajv.ajvStrings.boolean = "boolean".asInstanceOf[typings.ajv.ajvStrings.boolean]
    
    inline def float32: typings.ajv.ajvStrings.float32 = "float32".asInstanceOf[typings.ajv.ajvStrings.float32]
    
    inline def float64: typings.ajv.ajvStrings.float64 = "float64".asInstanceOf[typings.ajv.ajvStrings.float64]
    
    inline def int16: typings.ajv.ajvStrings.int16 = "int16".asInstanceOf[typings.ajv.ajvStrings.int16]
    
    inline def int32: typings.ajv.ajvStrings.int32 = "int32".asInstanceOf[typings.ajv.ajvStrings.int32]
    
    inline def int8: typings.ajv.ajvStrings.int8 = "int8".asInstanceOf[typings.ajv.ajvStrings.int8]
    
    inline def string: typings.ajv.ajvStrings.string = "string".asInstanceOf[typings.ajv.ajvStrings.string]
    
    inline def timestamp: typings.ajv.ajvStrings.timestamp = "timestamp".asInstanceOf[typings.ajv.ajvStrings.timestamp]
    
    inline def uint16: typings.ajv.ajvStrings.uint16 = "uint16".asInstanceOf[typings.ajv.ajvStrings.uint16]
    
    inline def uint32: typings.ajv.ajvStrings.uint32 = "uint32".asInstanceOf[typings.ajv.ajvStrings.uint32]
    
    inline def uint8: typings.ajv.ajvStrings.uint8 = "uint8".asInstanceOf[typings.ajv.ajvStrings.uint8]
  }
  
  type JTDTypeError = typings.ajv.errorMod.JTDTypeError[`type`, JTDType, JTDType]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `typeMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
