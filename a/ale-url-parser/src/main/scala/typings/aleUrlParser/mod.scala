package typings.aleUrlParser

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ale-url-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(url: String): UrlObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[UrlObject]
  
  inline def stringify(urlObject: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(urlObject: UrlObject, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(urlObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      * Sorting query params is disabled by default.
      * You can define your own sorting method
      */
    var compareFunction: js.UndefOr[js.Function2[/* a */ String, /* b */ String, Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCompareFunction(value: (/* a */ String, /* b */ String) => Double): Self = StObject.set(x, "compareFunction", js.Any.fromFunction2(value))
      
      inline def setCompareFunctionUndefined: Self = StObject.set(x, "compareFunction", js.undefined)
    }
  }
  
  type QueryParams = StringDictionary[Any]
  
  trait UrlObject extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    /**
      * @default '''
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * @default []
      */
    var path: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * @default 'http'
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * @default {}
      */
    var query: js.UndefOr[QueryParams] = js.undefined
  }
  object UrlObject {
    
    inline def apply(): UrlObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlObject] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: QueryParams): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
