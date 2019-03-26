package typings
package alignDashTextLib.alignDashTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformResult extends js.Object {
  /**
    * the character to use for indentation. Default is '' (empty string) when an object is returned.
    */
  var character: java.lang.String
  /**
    * the amount of indentation to use. Default is 0 when an object is returned.
    */
  var indent: scala.Double
  /**
    * leading characters to use at the beginning of each line. '' (empty string) when an object is returned.
    */
  var prefix: java.lang.String
}

object TransformResult {
  @scala.inline
  def apply(character: java.lang.String, indent: scala.Double, prefix: java.lang.String): TransformResult = {
    val __obj = js.Dynamic.literal(character = character, indent = indent, prefix = prefix)
  
    __obj.asInstanceOf[TransformResult]
  }
}

