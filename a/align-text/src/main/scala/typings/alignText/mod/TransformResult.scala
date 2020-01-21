package typings.alignText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformResult extends js.Object {
  /**
    * the character to use for indentation. Default is '' (empty string) when an object is returned.
    */
  var character: String
  /**
    * the amount of indentation to use. Default is 0 when an object is returned.
    */
  var indent: Double
  /**
    * leading characters to use at the beginning of each line. '' (empty string) when an object is returned.
    */
  var prefix: String
}

object TransformResult {
  @scala.inline
  def apply(character: String, indent: Double, prefix: String): TransformResult = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformResult]
  }
}

