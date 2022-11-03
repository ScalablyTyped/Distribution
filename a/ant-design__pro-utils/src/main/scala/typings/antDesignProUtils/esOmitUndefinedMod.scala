package typings.antDesignProUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOmitUndefinedMod {
  
  @JSImport("@ant-design/pro-utils/es/omitUndefined", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def omitUndefined[T](obj: T): OmitUndefined_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("omitUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[OmitUndefined_[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: std.NonNullable<T[P]>}
    }}}
    */
  @js.native
  trait OmitUndefined_[T] extends StObject
}
