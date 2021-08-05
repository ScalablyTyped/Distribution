package typings.autoprefixer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixesMod {
  
  @JSImport("autoprefixer/lib/prefixes", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with PrefixesImpl {
    def this(data: js.Array[String], browsers: typings.autoprefixer.browsersMod.^) = this()
    def this(data: js.Array[String], browsers: typings.autoprefixer.browsersMod.^, options: js.Any) = this()
    
    /* CompleteClass */
    var remove: StringDictionary[js.Any] = js.native
    
    /* CompleteClass */
    override def unprefixed(value: String): String = js.native
  }
  
  trait Prefixes extends StObject {
    
    var remove: StringDictionary[js.Any]
    
    def unprefixed(value: String): String
  }
  object Prefixes {
    
    inline def apply(remove: StringDictionary[js.Any], unprefixed: String => String): Prefixes = {
      val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any], unprefixed = js.Any.fromFunction1(unprefixed))
      __obj.asInstanceOf[Prefixes]
    }
    
    extension [Self <: Prefixes](x: Self) {
      
      inline def setRemove(value: StringDictionary[js.Any]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setUnprefixed(value: String => String): Self = StObject.set(x, "unprefixed", js.Any.fromFunction1(value))
    }
  }
  
  trait PrefixesImpl
    extends StObject
       with Prefixes
  object PrefixesImpl {
    
    inline def apply(remove: StringDictionary[js.Any], unprefixed: String => String): PrefixesImpl = {
      val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any], unprefixed = js.Any.fromFunction1(unprefixed))
      __obj.asInstanceOf[PrefixesImpl]
    }
  }
}
