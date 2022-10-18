package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  T extends object ? K extends [infer Head, ...infer Tail] ? Head extends keyof T ? Tail extends std.Array<string | number> ? [] extends Tail ? T[Head] : @angular/forms.@angular/forms.ɵNavigate<T[Head], Tail> : any : never : any : any
  }}}
  */
@js.native
trait ɵNavigate[T, K /* <: js.Array[String | Double] */] extends StObject
