package typings
package astDashTypesLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTNode extends js.Object {
  var `type`: java.lang.String
}

object ASTNode {
  @scala.inline
  def apply(`type`: java.lang.String): ASTNode = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[ASTNode]
  }
}

