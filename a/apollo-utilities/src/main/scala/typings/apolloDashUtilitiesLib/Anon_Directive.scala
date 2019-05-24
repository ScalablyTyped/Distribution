package typings
package apolloDashUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directive extends js.Object {
  var directive: graphqlLib.languageAstMod.DirectiveNode
  var ifArgument: graphqlLib.languageAstMod.ArgumentNode
}

object Anon_Directive {
  @scala.inline
  def apply(
    directive: graphqlLib.languageAstMod.DirectiveNode,
    ifArgument: graphqlLib.languageAstMod.ArgumentNode
  ): Anon_Directive = {
    val __obj = js.Dynamic.literal(directive = directive, ifArgument = ifArgument)
  
    __obj.asInstanceOf[Anon_Directive]
  }
}

