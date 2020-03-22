package typings.autoBind.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("auto-bind", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply[SelfType /* <: StringDictionary[js.Any] */](self: SelfType): SelfType = js.native
  def apply[SelfType /* <: StringDictionary[js.Any] */](self: SelfType, options: Options): SelfType = js.native
}

