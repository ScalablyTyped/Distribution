package typings.antd

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharacter extends js.Object {
  var character: Requireable[ReactNodeLike]
  var prefixCls: Requireable[String]
}

object AnonCharacter {
  @scala.inline
  def apply(character: Requireable[ReactNodeLike], prefixCls: Requireable[String]): AnonCharacter = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCharacter]
  }
}

