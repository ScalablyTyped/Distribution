package typings.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Length extends StObject {
  
  /**
    * The length.
    */
  var length: Double
  
  /**
    * The offset.
    */
  var offset: Double
  
  /**
    * The alternative type.
    */
  var types: js.Array[String]
  
  /**
    * The number of typos.
    */
  var typos: Double
  
  /**
    * The list of alternative words.
    */
  var words: js.Array[String]
}
object Length {
  
  inline def apply(length: Double, offset: Double, types: js.Array[String], typos: Double, words: js.Array[String]): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], typos = typos.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  extension [Self <: Length](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setTypos(value: Double): Self = StObject.set(x, "typos", value.asInstanceOf[js.Any])
    
    inline def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
