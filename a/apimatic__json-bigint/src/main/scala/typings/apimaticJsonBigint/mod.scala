package typings.apimaticJsonBigint

import org.scalablytyped.runtime.Shortcut
import typings.apimaticJsonBigint.anon.Parse
import typings.apimaticJsonBigint.anon.Stringify
import typings.apimaticJsonBigint.apimaticJsonBigintStrings.error
import typings.apimaticJsonBigint.apimaticJsonBigintStrings.ignore
import typings.apimaticJsonBigint.apimaticJsonBigintStrings.preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@apimatic/json-bigint", JSImport.Namespace)
  @js.native
  val ^ : JSONBigExport = js.native
  
  type JSONBigExport = (js.Function1[/* options */ js.UndefOr[Options], Parse]) & Stringify
  
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var alwaysParseAsBig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default 'error'
      */
    var constructorAction: js.UndefOr[error | ignore | preserve] = js.undefined
    
    /**
      * @default 'error'
      */
    var protoAction: js.UndefOr[error | ignore | preserve] = js.undefined
    
    /**
      * @default false
      */
    var storeAsString: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAlwaysParseAsBig(value: Boolean): Self = StObject.set(x, "alwaysParseAsBig", value.asInstanceOf[js.Any])
      
      inline def setAlwaysParseAsBigUndefined: Self = StObject.set(x, "alwaysParseAsBig", js.undefined)
      
      inline def setConstructorAction(value: error | ignore | preserve): Self = StObject.set(x, "constructorAction", value.asInstanceOf[js.Any])
      
      inline def setConstructorActionUndefined: Self = StObject.set(x, "constructorAction", js.undefined)
      
      inline def setProtoAction(value: error | ignore | preserve): Self = StObject.set(x, "protoAction", value.asInstanceOf[js.Any])
      
      inline def setProtoActionUndefined: Self = StObject.set(x, "protoAction", js.undefined)
      
      inline def setStoreAsString(value: Boolean): Self = StObject.set(x, "storeAsString", value.asInstanceOf[js.Any])
      
      inline def setStoreAsStringUndefined: Self = StObject.set(x, "storeAsString", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type _To = JSONBigExport
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: JSONBigExport = ^
}
