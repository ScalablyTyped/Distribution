package typings.angularCompiler

import typings.angularCompiler.r3AstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNgContentSelectors extends js.Object {
  /**
    * Any ng-content selectors extracted from the template. Contains `null` when an ng-content
    * element without selector is present.
    */
  var ngContentSelectors: js.Array[String]
  /**
    * Parsed nodes of the template.
    */
  var nodes: js.Array[Node]
}

object AnonNgContentSelectors {
  @scala.inline
  def apply(ngContentSelectors: js.Array[String], nodes: js.Array[Node]): AnonNgContentSelectors = {
    val __obj = js.Dynamic.literal(ngContentSelectors = ngContentSelectors.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNgContentSelectors]
  }
}

