package typings.alignText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformResult extends js.Object {
  /**
    * the character to use for indentation. Default is '' (empty string) when an object is returned.
    */
  var character: String = js.native
  /**
    * the amount of indentation to use. Default is 0 when an object is returned.
    */
  var indent: Double = js.native
  /**
    * leading characters to use at the beginning of each line. '' (empty string) when an object is returned.
    */
  var prefix: String = js.native
}

object TransformResult {
  @scala.inline
  def apply(character: String, indent: Double, prefix: String): TransformResult = {
    val __obj = js.Dynamic.literal(character = character.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformResult]
  }
  @scala.inline
  implicit class TransformResultOps[Self <: TransformResult] (val x: Self) extends AnyVal {
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
    def setCharacter(value: String): Self = this.set("character", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
  
}

