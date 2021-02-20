package typings.autoprefixer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prefixesMod {
  
  @JSImport("autoprefixer/lib/prefixes", JSImport.Namespace)
  @js.native
  class ^ protected () extends PrefixesImpl {
    def this(data: js.Array[String], browsers: typings.autoprefixer.browsersMod.^) = this()
    def this(data: js.Array[String], browsers: typings.autoprefixer.browsersMod.^, options: js.Any) = this()
  }
  
  @js.native
  trait Prefixes extends StObject {
    
    var remove: StringDictionary[js.Any] = js.native
    
    def unprefixed(value: String): String = js.native
  }
  object Prefixes {
    
    @scala.inline
    def apply(remove: StringDictionary[js.Any], unprefixed: String => String): Prefixes = {
      val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any], unprefixed = js.Any.fromFunction1(unprefixed))
      __obj.asInstanceOf[Prefixes]
    }
    
    @scala.inline
    implicit class PrefixesMutableBuilder[Self <: Prefixes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRemove(value: StringDictionary[js.Any]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprefixed(value: String => String): Self = StObject.set(x, "unprefixed", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PrefixesImpl extends Prefixes
  object PrefixesImpl {
    
    @scala.inline
    def apply(remove: StringDictionary[js.Any], unprefixed: String => String): PrefixesImpl = {
      val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any], unprefixed = js.Any.fromFunction1(unprefixed))
      __obj.asInstanceOf[PrefixesImpl]
    }
  }
}
