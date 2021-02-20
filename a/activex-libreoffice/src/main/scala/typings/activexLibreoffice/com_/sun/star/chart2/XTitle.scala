package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XTitle extends XInterface {
  
  var Text: SafeArray[XFormattedString] = js.native
  
  def getText(): SafeArray[XFormattedString] = js.native
  
  def setText(Strings: SeqEquiv[XFormattedString]): Unit = js.native
}
object XTitle {
  
  @scala.inline
  def apply(
    Text: SafeArray[XFormattedString],
    acquire: () => Unit,
    getText: () => SafeArray[XFormattedString],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setText: SeqEquiv[XFormattedString] => Unit
  ): XTitle = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[XTitle]
  }
  
  @scala.inline
  implicit class XTitleMutableBuilder[Self <: XTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetText(value: () => SafeArray[XFormattedString]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetText(value: SeqEquiv[XFormattedString] => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: SafeArray[XFormattedString]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
