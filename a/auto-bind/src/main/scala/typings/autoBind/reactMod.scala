package typings.autoBind

import typings.autoBind.mod.Options
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auto-bind/react", JSImport.Namespace)
@js.native
object reactMod extends js.Object {
  
  /**
  Same as `autoBind`, but excludes the default [React component methods](https://reactjs.org/docs/react-component.html).
  @param self - Object with methods to bind.
  @example
  ```
  import autoBindReact = require('auto-bind/react');
  class Foo extends React.Component {
  	constructor(props) {
  		super(props);
  		autoBindReact(this);
  	}
  	// …
  }
  ```
  */
  def apply[SelfType /* <: Component[js.Object, js.Object, _] */](self: SelfType): SelfType = js.native
  def apply[SelfType /* <: Component[js.Object, js.Object, _] */](self: SelfType, options: Options): SelfType = js.native
}
