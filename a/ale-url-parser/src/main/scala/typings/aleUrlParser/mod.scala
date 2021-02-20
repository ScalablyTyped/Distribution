package typings.aleUrlParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ale-url-parser", "parse")
  @js.native
  def parse(url: String): UrlObject = js.native
  
  @JSImport("ale-url-parser", "stringify")
  @js.native
  def stringify(urlObject: UrlObject): String = js.native
  
  type QueryParams = StringDictionary[js.Any]
  
  @js.native
  trait UrlObject extends StObject {
    
    var hash: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[js.Array[String]] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var query: js.UndefOr[QueryParams] = js.native
  }
  object UrlObject {
    
    @scala.inline
    def apply(): UrlObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObject]
    }
    
    @scala.inline
    implicit class UrlObjectMutableBuilder[Self <: UrlObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: QueryParams): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
