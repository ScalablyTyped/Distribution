package typings.antvUtil

import typings.antvUtil.typesMod.ObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reduceMod {
  
  @JSImport("@antv/util/lib/lodash/reduce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, G](
    arr: js.Array[G],
    fn: js.Function3[/* result */ T, /* data */ G, /* idx */ String | Double, T],
    init: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def default[T, G](
    arr: ObjectType[T],
    fn: js.Function3[/* result */ T, /* data */ G, /* idx */ String | Double, T],
    init: T
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arr.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[T]
}
