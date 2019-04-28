package typings
package apolloDashEnvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptDashUtilityDashTypesMod {
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? object}
    */ apolloDashEnvLib.apolloDashEnvLibStrings.DeepPartial with js.Any
  type WithRequired[T, K /* <: java.lang.String */] = T with (stdLib.Required[stdLib.Pick[T, K]])
}
