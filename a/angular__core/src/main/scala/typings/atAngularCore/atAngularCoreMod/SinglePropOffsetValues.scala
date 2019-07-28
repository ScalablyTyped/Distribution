package typings.atAngularCore.atAngularCoreMod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An array that contains the index pointer values for every single styling property
  * that exists in the context and for every directive. It also contains the total
  * single styles and single classes that exists in the context as the first two values.
  *
  * Let's say we have the following template code:
  *
  * <div [style.width]="myWidth"
  *      [style.height]="myHeight"
  *      [class.flipped]="flipClass"
  *      directive-with-opacity>
  *      directive-with-foo-bar-classes>
  *
  * We have two directive and template-binding sources,
  * 2 + 1 styles and 1 + 1 classes. When the bindings are
  * registered the SinglePropOffsets array will look like so:
  *
  * s_0/c_0 = template directive value
  * s_1/c_1 = directive one (directive-with-opacity)
  * s_2/c_2 = directive two (directive-with-foo-bar-classes)
  *
  * [3, 2, 2, 1, s_00, s01, c_01, 1, 0, s_10, 0, 1, c_20
  */
@js.native
trait SinglePropOffsetValues extends Array[Double]

