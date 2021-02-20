package typings.alignText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("align-text", JSImport.Namespace)
  @js.native
  def apply(text: String): String = js.native
  @JSImport("align-text", JSImport.Namespace)
  @js.native
  def apply(text: String, fn: Double): String = js.native
  @JSImport("align-text", JSImport.Namespace)
  @js.native
  def apply(text: String, fn: Callback): String = js.native
  @JSImport("align-text", JSImport.Namespace)
  @js.native
  def apply(text: js.Array[_]): js.Array[String] = js.native
  @JSImport("align-text", JSImport.Namespace)
  @js.native
  def apply(text: js.Array[_], fn: Double): js.Array[String] = js.native
  @JSImport("align-text", JSImport.Namespace)
  @js.native
  def apply(text: js.Array[_], fn: Callback): js.Array[String] = js.native
  
  type Callback = js.Function4[
    /* len */ Double, 
    /* longest */ Double, 
    /* line */ String, 
    /* lines */ js.Array[String], 
    Double | TransformResult
  ]
  
  @js.native
  trait TransformResult extends StObject {
    
    /**
      * the character to use for indentation. Default is '' (empty string) when an object is returned.
      */
    var character: String = js.native
    
    /**
      * the amount of indentation to use. Default is 0 when an object is returned.
      */
    var indent: Double = js.native
    
    /**
      * leading characters to use at the beginning of each line. '' (empty string) when an object is returned.
      */
    var prefix: String = js.native
  }
  object TransformResult {
    
    @scala.inline
    def apply(character: String, indent: Double, prefix: String): TransformResult = {
      val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformResult]
    }
    
    @scala.inline
    implicit class TransformResultMutableBuilder[Self <: TransformResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
