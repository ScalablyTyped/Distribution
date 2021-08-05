package typings.autoBind

import typings.autoBind.mod.Options
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
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
  inline def apply[SelfType /* <: Component[js.Object, js.Object, js.Any] */](self: SelfType): SelfType = ^.asInstanceOf[js.Dynamic].apply(self.asInstanceOf[js.Any]).asInstanceOf[SelfType]
  inline def apply[SelfType /* <: Component[js.Object, js.Object, js.Any] */](self: SelfType, options: Options): SelfType = (^.asInstanceOf[js.Dynamic].apply(self.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelfType]
  
  @JSImport("auto-bind/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
