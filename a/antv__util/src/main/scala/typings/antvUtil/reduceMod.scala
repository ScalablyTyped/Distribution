package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceMod {
  
  @JSImport("@antv/util/lib/reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T, G](arr: js.Array[G], fn: js.Function3[/* result */ T, /* data */ G, /* idx */ Double, T], init: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T]
}
