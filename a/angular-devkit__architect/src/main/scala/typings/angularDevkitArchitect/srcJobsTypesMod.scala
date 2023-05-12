package typings.angularDevkitArchitect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcJobsTypesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Array<infer R> ? @angular-devkit/architect.@angular-devkit/architect/src/jobs/types.DeepReadonlyArray<R> : T extends std.Function ? T : T extends object ? @angular-devkit/architect.@angular-devkit/architect/src/jobs/types.DeepReadonlyObject<T> : T
    }}}
    */
  type DeepReadonly[T] = T
  
  type DeepReadonlyArray[T] = js.Array[DeepReadonly[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {readonly [ P in keyof T ]: @angular-devkit/architect.@angular-devkit/architect/src/jobs/types.DeepReadonly<T[P]>}
    }}}
    */
  @js.native
  trait DeepReadonlyObject[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {-readonly [ P in keyof T ]: T[P]}
    }}}
    */
  type Readwrite[T] = T
}
