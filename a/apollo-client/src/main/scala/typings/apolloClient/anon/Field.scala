package typings.apolloClient.anon

import typings.apolloUtilities.getFromASTMod.FragmentMap
import typings.graphql.astMod.FieldNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var field: FieldNode
  var fragmentMap: FragmentMap
}

object Field {
  @scala.inline
  def apply(field: FieldNode, fragmentMap: FragmentMap): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragmentMap = fragmentMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

