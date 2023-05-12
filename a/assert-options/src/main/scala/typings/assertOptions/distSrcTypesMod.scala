package typings.assertOptions

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  @js.native
  sealed trait OptionsError extends StObject
  @JSImport("assert-options/dist/src/types", "OptionsError")
  @js.native
  object OptionsError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OptionsError & Double] = js.native
    
    @js.native
    sealed trait invalidDefaultsParam
      extends StObject
         with OptionsError
    /* 1 */ val invalidDefaultsParam: typings.assertOptions.distSrcTypesMod.OptionsError.invalidDefaultsParam & Double = js.native
    
    @js.native
    sealed trait invalidOptionsParam
      extends StObject
         with OptionsError
    /* 0 */ val invalidOptionsParam: typings.assertOptions.distSrcTypesMod.OptionsError.invalidOptionsParam & Double = js.native
    
    @js.native
    sealed trait optionNotRecognized
      extends StObject
         with OptionsError
    /* 2 */ val optionNotRecognized: typings.assertOptions.distSrcTypesMod.OptionsError.optionNotRecognized & Double = js.native
  }
  
  type AssertFunc = js.Function2[
    /* options */ js.UndefOr[NamedValues | Null], 
    /* defaults */ NamedValues | js.Array[String], 
    NamedValues
  ]
  
  trait IOptionsErrorContext extends StObject {
    
    var defaults: Any
    
    var key: js.UndefOr[String] = js.undefined
    
    var options: Any
  }
  object IOptionsErrorContext {
    
    inline def apply(defaults: Any, options: Any): IOptionsErrorContext = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionsErrorContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptionsErrorContext] (val x: Self) extends AnyVal {
      
      inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type NamedValues = StringDictionary[Any]
}
