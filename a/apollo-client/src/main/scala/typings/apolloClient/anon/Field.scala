package typings.apolloClient.anon

import typings.apolloUtilities.getFromASTMod.FragmentMap
import typings.graphql.astMod.FieldNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  var field: FieldNode = js.native
  var fragmentMap: FragmentMap = js.native
}

object Field {
  @scala.inline
  def apply(field: FieldNode, fragmentMap: FragmentMap): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragmentMap = fragmentMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setField(value: FieldNode): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentMap(value: FragmentMap): Self = this.set("fragmentMap", value.asInstanceOf[js.Any])
  }
  
}

