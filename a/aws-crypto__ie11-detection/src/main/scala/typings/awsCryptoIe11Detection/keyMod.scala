package typings.awsCryptoIe11Detection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyMod {
  
  @js.native
  trait Key extends StObject {
    
    val algorithm: String = js.native
    
    val extractable: Boolean = js.native
    
    val keyUsage: js.Array[String] = js.native
    
    val `type`: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(algorithm: String, extractable: Boolean, keyUsage: js.Array[String], `type`: String): Key = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], keyUsage = keyUsage.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractable(value: Boolean): Self = StObject.set(x, "extractable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUsage(value: js.Array[String]): Self = StObject.set(x, "keyUsage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUsageVarargs(value: String*): Self = StObject.set(x, "keyUsage", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
