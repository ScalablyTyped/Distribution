package typings.apolloDashClient

import typings.apolloDashUtilities.libGetFromASTMod.FragmentMap
import typings.graphql.languageAstMod.FieldNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Field extends js.Object {
  var field: FieldNode
  var fragmentMap: FragmentMap
}

object Anon_Field {
  @scala.inline
  def apply(field: FieldNode, fragmentMap: FragmentMap): Anon_Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragmentMap = fragmentMap.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Field]
  }
}

