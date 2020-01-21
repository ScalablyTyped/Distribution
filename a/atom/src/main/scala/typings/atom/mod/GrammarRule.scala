package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrammarRule extends js.Object {
  var contentScopeName: String
  // https://github.com/atom/first-mate/blob/v7.0.7/src/rule.coffee
  // This is private. Don't go down the rabbit hole.
  var rule: js.Object
  var scopeName: String
}

object GrammarRule {
  @scala.inline
  def apply(contentScopeName: String, rule: js.Object, scopeName: String): GrammarRule = {
    val __obj = js.Dynamic.literal(contentScopeName = contentScopeName.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GrammarRule]
  }
}

