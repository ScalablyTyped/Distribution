package typings
package angularDashEsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularDashEsMod {
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ stdLib.TypedPropertyDescriptor[js.Any], 
    stdLib.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
}
