package typings.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection of string-related arguments used on all canvas text interfaces.
  *
  * A possibly much larger string than later rendered is necessary here, because in several languages, glyph selection is context dependent.
  * @since OOo 2.0
  */
@js.native
trait StringContext extends js.Object {
  
  /**
    * Length of the substring to actually use.
    *
    * Must be within the range [0,INTMAX].
    */
  var Length: Double = js.native
  
  /**
    * Start position within the string.
    *
    * The first character has index 0.
    */
  var StartPosition: Double = js.native
  
  /** The complete text, from which a subset is selected by the parameters below. */
  var Text: String = js.native
}
object StringContext {
  
  @scala.inline
  def apply(Length: Double, StartPosition: Double, Text: String): StringContext = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], StartPosition = StartPosition.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringContext]
  }
  
  @scala.inline
  implicit class StringContextOps[Self <: StringContext] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("Length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartPosition(value: Double): Self = this.set("StartPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
}
