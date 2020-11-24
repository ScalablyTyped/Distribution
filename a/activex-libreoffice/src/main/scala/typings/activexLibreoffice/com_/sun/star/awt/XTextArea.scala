package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the text in a control. */
@js.native
trait XTextArea extends XInterface {
  
  /** returns the text lines as a single string with line separators. */
  val TextLines: String = js.native
  
  /** returns the text lines as a single string with line separators. */
  def getTextLines(): String = js.native
}
object XTextArea {
  
  @scala.inline
  def apply(
    TextLines: String,
    acquire: () => Unit,
    getTextLines: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextArea = {
    val __obj = js.Dynamic.literal(TextLines = TextLines.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getTextLines = js.Any.fromFunction0(getTextLines), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XTextArea]
  }
  
  @scala.inline
  implicit class XTextAreaOps[Self <: XTextArea] (val x: Self) extends AnyVal {
    
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
    def setTextLines(value: String): Self = this.set("TextLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTextLines(value: () => String): Self = this.set("getTextLines", js.Any.fromFunction0(value))
  }
}
