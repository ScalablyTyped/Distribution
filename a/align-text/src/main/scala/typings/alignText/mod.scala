package typings.alignText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String): String = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(text: String, fn: Double): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(text: String, fn: Callback): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(text: js.Array[js.Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(text: js.Array[js.Any], fn: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def apply(text: js.Array[js.Any], fn: Callback): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("align-text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function4[
    /* len */ Double, 
    /* longest */ Double, 
    /* line */ String, 
    /* lines */ js.Array[String], 
    Double | TransformResult
  ]
  
  trait TransformResult extends StObject {
    
    /**
      * the character to use for indentation. Default is '' (empty string) when an object is returned.
      */
    var character: String
    
    /**
      * the amount of indentation to use. Default is 0 when an object is returned.
      */
    var indent: Double
    
    /**
      * leading characters to use at the beginning of each line. '' (empty string) when an object is returned.
      */
    var prefix: String
  }
  object TransformResult {
    
    inline def apply(character: String, indent: Double, prefix: String): TransformResult = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformResult]
    }
    
    extension [Self <: TransformResult](x: Self) {
      
      inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
