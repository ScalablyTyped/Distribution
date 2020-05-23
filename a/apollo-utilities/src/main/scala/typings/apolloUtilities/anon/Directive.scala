package typings.apolloUtilities.anon

import typings.graphql.astMod.ArgumentNode
import typings.graphql.astMod.DirectiveNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive extends js.Object {
  var directive: DirectiveNode
  var ifArgument: ArgumentNode
}

object Directive {
  @scala.inline
  def apply(directive: DirectiveNode, ifArgument: ArgumentNode): Directive = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], ifArgument = ifArgument.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
}

