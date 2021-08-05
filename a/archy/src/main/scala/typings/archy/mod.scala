package typings.archy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: String): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(obj: String, prefix: String): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: String, prefix: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: String, prefix: Unit, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Data): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(obj: Data, prefix: String): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Data, prefix: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Data, prefix: Unit, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("archy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Data extends StObject {
    
    var label: String
    
    var nodes: js.UndefOr[js.Array[Data | String]] = js.undefined
  }
  object Data {
    
    inline def apply(label: String): Data = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[Data | String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      inline def setNodesVarargs(value: (Data | String)*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  trait Options extends StObject {
    
    var unicode: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
}
