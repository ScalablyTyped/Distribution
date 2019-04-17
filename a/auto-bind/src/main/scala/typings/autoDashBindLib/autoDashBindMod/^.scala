package typings
package autoDashBindLib.autoDashBindMod

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
  def apply[SelfType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](self: SelfType): SelfType = js.native
  def apply[SelfType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](self: SelfType, options: Options): SelfType = js.native
  /**
  	Same as `autoBind`, but excludes the default [React component methods](https://reactjs.org/docs/react-component.html).
  	@param self - Object with methods to bind.
  	@example
  	```
  	import autoBind = require('auto-bind');
  	class Foo extends React.Component {
  		constructor(props) {
  			super(props);
  			autoBind.react(this);
  		}
  		// …
  	}
  	```
  	*/
  def react[SelfType /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */](self: SelfType): SelfType = js.native
  def react[SelfType /* <: reactLib.reactMod.Component[js.Object, js.Object, _] */](self: SelfType, options: Options): SelfType = js.native
}

