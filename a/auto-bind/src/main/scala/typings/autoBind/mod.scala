package typings.autoBind

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Automatically bind methods to their class instance.
  @param self - Object with methods to bind.
  @example
  ```
  import autoBind = require('auto-bind');
  class Unicorn {
  	constructor(name) {
  		this.name = name;
  		autoBind(this);
  	}
  	message() {
  		return `${this.name} is awesome!`;
  	}
  }
  const unicorn = new Unicorn('Rainbow');
  // Grab the method off the class instance
  const message = unicorn.message;
  // Still bound to the class instance
  message();
  //=> 'Rainbow is awesome!'
  // Without `autoBind(this)`, the above would have resulted in
  message();
  //=> Error: Cannot read property 'name' of undefined
  ```
  */
  inline def apply[SelfType /* <: StringDictionary[js.Any] */](self: SelfType): SelfType = ^.asInstanceOf[js.Dynamic].apply(self.asInstanceOf[js.Any]).asInstanceOf[SelfType]
  inline def apply[SelfType /* <: StringDictionary[js.Any] */](self: SelfType, options: Options): SelfType = (^.asInstanceOf[js.Dynamic].apply(self.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelfType]
  
  @JSImport("auto-bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Bind methods except for the given methods.
    		*/
    val exclude: js.UndefOr[js.Array[String | RegExp]] = js.undefined
    
    /**
    		Bind only the given methods.
    		*/
    val include: js.UndefOr[js.Array[String | RegExp]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setInclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
}
