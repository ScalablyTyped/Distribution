package typings.acornJsx

import org.scalablytyped.runtime.Instantiable2
import typings.acorn.mod.Parser
import typings.acornJsx.anon.TypeofParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.Function1[
    /* BaseParser */ TypeofParser & (Instantiable2[/* options */ typings.acorn.mod.Options, /* input */ String, Parser]), 
    TypeofParser & (Instantiable2[/* options */ typings.acorn.mod.Options, /* input */ String, Parser])
  ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Function1[
    /* BaseParser */ TypeofParser & (Instantiable2[/* options */ typings.acorn.mod.Options, /* input */ String, Parser]), 
    TypeofParser & (Instantiable2[/* options */ typings.acorn.mod.Options, /* input */ String, Parser])
  ]]
  inline def apply(options: Options): js.Function1[
    /* BaseParser */ TypeofParser & (Instantiable2[/* options */ typings.acorn.mod.Options, /* input */ String, Parser]), 
    TypeofParser & (Instantiable2[/* options */ typings.acorn.mod.Options, /* input */ String, Parser])
  ] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* BaseParser */ TypeofParser & (Instantiable2[/* options */ typings.acorn.mod.Options, /* input */ String, Parser]), 
    TypeofParser & (Instantiable2[/* options */ typings.acorn.mod.Options, /* input */ String, Parser])
  ]]
  
  @JSImport("acorn-jsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var allowNamespacedObjects: js.UndefOr[Boolean] = js.undefined
    
    var allowNamespaces: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAllowNamespacedObjects(value: Boolean): Self = StObject.set(x, "allowNamespacedObjects", value.asInstanceOf[js.Any])
      
      inline def setAllowNamespacedObjectsUndefined: Self = StObject.set(x, "allowNamespacedObjects", js.undefined)
      
      inline def setAllowNamespaces(value: Boolean): Self = StObject.set(x, "allowNamespaces", value.asInstanceOf[js.Any])
      
      inline def setAllowNamespacesUndefined: Self = StObject.set(x, "allowNamespaces", js.undefined)
    }
  }
}
