package typings.apolloDashUtilities

import typings.graphql.languageAstMod.ArgumentNode
import typings.graphql.languageAstMod.DirectiveNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directive extends js.Object {
  var directive: DirectiveNode
  var ifArgument: ArgumentNode
}

object Anon_Directive {
  @scala.inline
  def apply(directive: DirectiveNode, ifArgument: ArgumentNode): Anon_Directive = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], ifArgument = ifArgument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Directive]
  }
}

