package typings.antd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilTypeMod {
  
  @JSImport("antd/lib/_util/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tuple[T /* <: js.Array[String] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def tupleNum[T /* <: js.Array[Double] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("tupleNum")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer E> ? E : T extends std.Array<infer F> ? F : never
    }}}
    */
  @js.native
  trait ElementOf[T] extends StObject
  
  type LiteralUnion[T /* <: U */, U] = T | (U & js.Object)
}
