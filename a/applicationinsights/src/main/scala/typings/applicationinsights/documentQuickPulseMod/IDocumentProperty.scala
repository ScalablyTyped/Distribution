package typings.applicationinsights.documentQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentProperty extends js.Object {
  var key: String
  var value: String
}

object IDocumentProperty {
  @scala.inline
  def apply(key: String, value: String): IDocumentProperty = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDocumentProperty]
  }
}

