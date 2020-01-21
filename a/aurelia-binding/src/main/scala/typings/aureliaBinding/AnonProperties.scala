package typings.aureliaBinding

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  var properties: StringDictionary[js.Array[String]]
  var tagName: String
}

object AnonProperties {
  @scala.inline
  def apply(properties: StringDictionary[js.Array[String]], tagName: String): AnonProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProperties]
  }
}

