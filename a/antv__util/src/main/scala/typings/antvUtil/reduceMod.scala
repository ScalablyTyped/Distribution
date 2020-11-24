package typings.antvUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/util/lib/reduce", JSImport.Namespace)
@js.native
object reduceMod extends js.Object {
  
  def default[T, G](arr: js.Array[G], fn: js.Function3[/* result */ T, /* data */ G, /* idx */ Double, T], init: T): T = js.native
}
