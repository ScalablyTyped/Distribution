package typings.appendQuery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param url a string URL to append to
    * @param query a string or object containing query params to append
    */
  @JSImport("append-query", JSImport.Namespace)
  @js.native
  def apply(url: String, query: String): String = js.native
  @JSImport("append-query", JSImport.Namespace)
  @js.native
  def apply(url: String, query: String, options: Options): String = js.native
  @JSImport("append-query", JSImport.Namespace)
  @js.native
  def apply(url: String, query: Query): String = js.native
  @JSImport("append-query", JSImport.Namespace)
  @js.native
  def apply(url: String, query: Query, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * whether or not to encode appended passed params using `encodeURIComponent`.
      * Default: `true`.
      */
    var encodeComponents: js.UndefOr[Boolean] = js.native
    
    /**
      * whether or not to remove params for `null` properties in the query object.
      * Default: `false` (properties will be preserved with no value).
      */
    var removeNull: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncodeComponents(value: Boolean): Self = StObject.set(x, "encodeComponents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodeComponentsUndefined: Self = StObject.set(x, "encodeComponents", js.undefined)
      
      @scala.inline
      def setRemoveNull(value: Boolean): Self = StObject.set(x, "removeNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveNullUndefined: Self = StObject.set(x, "removeNull", js.undefined)
    }
  }
  
  type Query = StringDictionary[String | Null]
}
