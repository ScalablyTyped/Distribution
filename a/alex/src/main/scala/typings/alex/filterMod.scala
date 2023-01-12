package typings.alex

import typings.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("alex/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filter(): Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")().asInstanceOf[Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root])]
  inline def filter(options: Options): Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typings.mdast.mod.Root, typings.mdast.mod.Root])]
  
  trait Options extends StObject {
    
    /**
      * The `allow` field should be an array of rules or `undefined` (the default
      * is `undefined`).
      * When provided, the rules specified are skipped and not reported.
      * You cannot use both `allow` and `deny` at the same time.
      */
    var allow: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The `deny` field should be an array of rules or `undefined` (the default is
      * `undefined`).
      * When provided, *only* the rules specified are reported.
      * You cannot use both `allow` and `deny` at the same time.
      */
    var deny: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value*))
      
      inline def setDeny(value: js.Array[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
      
      inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
      
      inline def setDenyVarargs(value: String*): Self = StObject.set(x, "deny", js.Array(value*))
    }
  }
  
  type Root = typings.mdast.mod.Root
}
