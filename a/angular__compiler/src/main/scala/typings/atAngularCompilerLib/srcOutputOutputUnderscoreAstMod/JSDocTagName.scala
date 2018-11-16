package typings
package atAngularCompilerLib.srcOutputOutputUnderscoreAstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JSDocTagName extends js.Object

@JSImport("@angular/compiler/src/output/output_ast", "JSDocTagName")
@js.native
object JSDocTagName extends js.Object {
  @js.native
  sealed trait Desc
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocTagName
  
  @js.native
  sealed trait Id
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocTagName
  
  @js.native
  sealed trait Meaning
    extends atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocTagName
  
  /* "desc" */ val Desc: Desc with java.lang.String = js.native
  /* "id" */ val Id: Id with java.lang.String = js.native
  /* "meaning" */ val Meaning: Meaning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.JSDocTagName with java.lang.String
  ] = js.native
}

