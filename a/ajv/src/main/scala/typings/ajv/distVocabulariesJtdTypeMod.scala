package typings.ajv

import org.scalablytyped.runtime.Shortcut
import typings.ajv.distTypesMod.CodeKeywordDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVocabulariesJtdTypeMod extends Shortcut {
  
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
  
  object IntType {
    
    inline def int16: "int16" = "int16".asInstanceOf["int16"]
    
    inline def int32: "int32" = "int32".asInstanceOf["int32"]
    
    inline def int8: "int8" = "int8".asInstanceOf["int8"]
    
    inline def uint16: "uint16" = "uint16".asInstanceOf["uint16"]
    
    inline def uint32: "uint32" = "uint32".asInstanceOf["uint32"]
    
    inline def uint8: "uint8" = "uint8".asInstanceOf["uint8"]
  }
  type IntType = "int8" | "uint8" | "int16" | "uint16" | "int32" | "uint32"
  
  object JTDType {
    
    inline def boolean: "boolean" = "boolean".asInstanceOf["boolean"]
    
    inline def float32: "float32" = "float32".asInstanceOf["float32"]
    
    inline def float64: "float64" = "float64".asInstanceOf["float64"]
    
    inline def int16: "int16" = "int16".asInstanceOf["int16"]
    
    inline def int32: "int32" = "int32".asInstanceOf["int32"]
    
    inline def int8: "int8" = "int8".asInstanceOf["int8"]
    
    inline def string: "string" = "string".asInstanceOf["string"]
    
    inline def timestamp: "timestamp" = "timestamp".asInstanceOf["timestamp"]
    
    inline def uint16: "uint16" = "uint16".asInstanceOf["uint16"]
    
    inline def uint32: "uint32" = "uint32".asInstanceOf["uint32"]
    
    inline def uint8: "uint8" = "uint8".asInstanceOf["uint8"]
  }
  type JTDType = "boolean" | "string" | "timestamp" | "float32" | "float64" | "int8" | "uint8" | "int16" | "uint16" | "int32" | "uint32"
  
  type JTDTypeError = typings.ajv.distVocabulariesJtdErrorMod.JTDTypeError["type", JTDType, JTDType]
  
  type _To = CodeKeywordDefinition
  
  /* This means you don't have to write `default`, but can instead just say `distVocabulariesJtdTypeMod.foo` */
  override def _to: CodeKeywordDefinition = default
}
