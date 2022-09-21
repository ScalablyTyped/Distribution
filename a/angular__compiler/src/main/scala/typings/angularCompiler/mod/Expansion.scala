package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "Expansion")
@js.native
open class Expansion protected ()
  extends NodeWithI18n
     with Node2 {
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[ExpansionCase],
    sourceSpan: ParseSourceSpan,
    switchValueSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    switchValue: String,
    `type`: String,
    cases: js.Array[ExpansionCase],
    sourceSpan: ParseSourceSpan,
    switchValueSourceSpan: ParseSourceSpan,
    i18n: I18nMeta2
  ) = this()
  
  var cases: js.Array[ExpansionCase] = js.native
  
  var switchValue: String = js.native
  
  var switchValueSourceSpan: ParseSourceSpan = js.native
  
  var `type`: String = js.native
}
