package typings.angularDashEs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularDashEsMod {
  import typings.std.TypedPropertyDescriptor

  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | Unit]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ String | js.Symbol, 
    /* descriptor */ TypedPropertyDescriptor[js.Any], 
    TypedPropertyDescriptor[js.Any] | Unit
  ]
}
