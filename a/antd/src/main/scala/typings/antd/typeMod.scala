package typings.antd

import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeMod {
  
  @JSImport("antd/lib/_util/type", "tuple")
  @js.native
  def tuple[T /* <: js.Array[String] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = js.native
  
  @JSImport("antd/lib/_util/type", "tupleNum")
  @js.native
  def tupleNum[T /* <: js.Array[Double] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = js.native
  
  type ElementOf[T] = js.Any
  
  type LiteralUnion[T /* <: U */, U] = T | (U with js.Object)
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
}
