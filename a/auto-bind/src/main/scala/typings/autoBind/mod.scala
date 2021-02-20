package typings.autoBind

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("auto-bind", JSImport.Namespace)
  @js.native
  def apply[SelfType /* <: StringDictionary[js.Any] */](self: SelfType): SelfType = js.native
  @JSImport("auto-bind", JSImport.Namespace)
  @js.native
  def apply[SelfType /* <: StringDictionary[js.Any] */](self: SelfType, options: Options): SelfType = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Bind methods except for the given methods.
    		*/
    val exclude: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    /**
    		Bind only the given methods.
    		*/
    val include: js.UndefOr[js.Array[String | RegExp]] = js.native
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
      def setExclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setInclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "include", js.Array(value :_*))
    }
  }
}
