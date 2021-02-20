package typings.archy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("archy", JSImport.Namespace)
  @js.native
  def apply(obj: String): String = js.native
  @JSImport("archy", JSImport.Namespace)
  @js.native
  def apply(obj: String, prefix: js.UndefOr[scala.Nothing], opts: Options): String = js.native
  @JSImport("archy", JSImport.Namespace)
  @js.native
  def apply(obj: String, prefix: String): String = js.native
  @JSImport("archy", JSImport.Namespace)
  @js.native
  def apply(obj: String, prefix: String, opts: Options): String = js.native
  @JSImport("archy", JSImport.Namespace)
  @js.native
  def apply(obj: Data): String = js.native
  @JSImport("archy", JSImport.Namespace)
  @js.native
  def apply(obj: Data, prefix: js.UndefOr[scala.Nothing], opts: Options): String = js.native
  @JSImport("archy", JSImport.Namespace)
  @js.native
  def apply(obj: Data, prefix: String): String = js.native
  @JSImport("archy", JSImport.Namespace)
  @js.native
  def apply(obj: Data, prefix: String, opts: Options): String = js.native
  
  @js.native
  trait Data extends StObject {
    
    var label: String = js.native
    
    var nodes: js.UndefOr[js.Array[Data | String]] = js.native
  }
  object Data {
    
    @scala.inline
    def apply(label: String): Data = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Array[Data | String]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      @scala.inline
      def setNodesVarargs(value: (Data | String)*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var unicode: js.UndefOr[Boolean] = js.native
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
      def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
}
