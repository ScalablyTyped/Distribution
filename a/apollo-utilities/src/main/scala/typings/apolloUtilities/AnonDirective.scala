package typings.apolloUtilities

import typings.graphql.astMod.ArgumentNode
import typings.graphql.astMod.DirectiveNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirective extends js.Object {
  var directive: DirectiveNode
  var ifArgument: ArgumentNode
}

object AnonDirective {
  @scala.inline
  def apply(directive: DirectiveNode, ifArgument: ArgumentNode): AnonDirective = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], ifArgument = ifArgument.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDirective]
  }
}

