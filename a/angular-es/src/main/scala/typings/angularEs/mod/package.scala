package typings.angularEs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typings.std.TypedPropertyDescriptor[js.Any], 
    typings.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
}
