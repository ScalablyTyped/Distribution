package typings.atlaskitTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handyMod {
  
  @JSImport("@atlaskit/tree/dist/types/utils/handy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def between(min: Double, max: Double, number: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("between")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], number.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def oneOf[T](a: T, b: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def range(n: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
