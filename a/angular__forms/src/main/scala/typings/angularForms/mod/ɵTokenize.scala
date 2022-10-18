package typings.angularForms.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  string extends S ? std.Array<string> : S extends / * template literal string: ${inferT}${D}${inferU} * / string ? [/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify T * / any, ...@angular/forms.@angular/forms.ɵTokenize</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify U * / any, D>] : [S]
  }}}
  */
@js.native
trait ɵTokenize[S /* <: String */, D /* <: String */] extends StObject
