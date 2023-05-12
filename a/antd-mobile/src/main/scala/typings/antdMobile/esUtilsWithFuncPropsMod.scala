package typings.antdMobile

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsWithFuncPropsMod {
  
  @JSImport("antd-mobile/es/utils/with-func-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeFuncProps[T /* <: Record[String, Any] */, P /* <: Record[String, Any] */](p1: T, p2: P): Merge[T, P] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeFuncProps")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Merge[T, P]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T & keyof P ]: P[K] | T[K]}
    }}}
    */
  @js.native
  trait Merge[T, P] extends StObject
}
