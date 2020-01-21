package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object templateMod {
  type DeclareLocalVarCallback = js.Function2[
    /* scope */ typings.angularCompiler.templateMod.BindingScope, 
    /* relativeLevel */ scala.Double, 
    js.Array[typings.angularCompiler.outputAstMod.Statement]
  ]
}
