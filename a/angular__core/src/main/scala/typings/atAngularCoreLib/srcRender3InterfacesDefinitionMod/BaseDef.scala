package typings
package atAngularCoreLib.srcRender3InterfacesDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseDef[T] extends js.Object {
  /**
       * @deprecated This is only here because `NgOnChanges` incorrectly uses declared name instead of
       * public or minified name.
       */
  val declaredInputs: atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any
  /**
       * A dictionary mapping the inputs' minified property names to their public API names, which
       * are their aliases if any, or their original unminified property names
       * (as in `@Input('alias') propertyName: any;`).
       */
  val inputs: atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any
  /**
       * A dictionary mapping the outputs' minified property names to their public API names, which
       * are their aliases if any, or their original unminified property names
       * (as in `@Output('alias') propertyName: any;`).
       */
  val outputs: atAngularCoreLib.atAngularCoreLibStrings.BaseDef with js.Any
}

