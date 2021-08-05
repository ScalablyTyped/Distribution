package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTitle
  extends StObject
     with XInterface {
  
  var Text: SafeArray[XFormattedString]
  
  def getText(): SafeArray[XFormattedString]
  
  def setText(Strings: SeqEquiv[XFormattedString]): Unit
}
object XTitle {
  
  inline def apply(
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
  
  extension [Self <: XTitle](x: Self) {
    
    inline def setGetText(value: () => SafeArray[XFormattedString]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setSetText(value: SeqEquiv[XFormattedString] => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setText(value: SafeArray[XFormattedString]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
