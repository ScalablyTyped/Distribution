package typings.appendQuery

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param url a string URL to append to
    * @param query a string or object containing query params to append
    */
  @scala.inline
  def apply(url: String, query: String): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(url: String, query: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(url: String, query: Query): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(url: String, query: Query, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], query.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("append-query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * whether or not to encode appended passed params using `encodeURIComponent`.
      * Default: `true`.
      */
    var encodeComponents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * whether or not to remove params for `null` properties in the query object.
      * Default: `false` (properties will be preserved with no value).
      */
    var removeNull: js.UndefOr[Boolean] = js.undefined
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
