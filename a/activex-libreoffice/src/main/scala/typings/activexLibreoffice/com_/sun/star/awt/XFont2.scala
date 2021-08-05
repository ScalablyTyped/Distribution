package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends the {@link XFont} interface and provides additional information for a font.
  * @since OOo 3.0
  */
trait XFont2
  extends StObject
     with XFont {
  
  /**
    * checks whether or not this font has all the glyphs for the text specified by aText.
    * @param aText The specified text for which glyphs are needed.
    * @returns Returns whether or not this font has all the glyphs for the specified text.
    */
  def hasGlyphs(aText: String): Boolean
}
object XFont2 {
  
  inline def apply(
    FontDescriptor: FontDescriptor,
    FontMetric: SimpleFontMetric,
    acquire: () => Unit,
    getCharWidth: String => Double,
    getCharWidths: (String, String) => SafeArray[Double],
    getFontDescriptor: () => FontDescriptor,
    getFontMetric: () => SimpleFontMetric,
    getKernPairs: (js.Array[SeqEquiv[String]], js.Array[SeqEquiv[String]], js.Array[SeqEquiv[Double]]) => Unit,
    getStringWidth: String => Double,
    getStringWidthArray: (String, js.Array[SeqEquiv[Double]]) => Double,
    hasGlyphs: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFont2 = {
    val __obj = js.Dynamic.literal(FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontMetric = FontMetric.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCharWidth = js.Any.fromFunction1(getCharWidth), getCharWidths = js.Any.fromFunction2(getCharWidths), getFontDescriptor = js.Any.fromFunction0(getFontDescriptor), getFontMetric = js.Any.fromFunction0(getFontMetric), getKernPairs = js.Any.fromFunction3(getKernPairs), getStringWidth = js.Any.fromFunction1(getStringWidth), getStringWidthArray = js.Any.fromFunction2(getStringWidthArray), hasGlyphs = js.Any.fromFunction1(hasGlyphs), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFont2]
  }
  
  extension [Self <: XFont2](x: Self) {
    
    inline def setHasGlyphs(value: String => Boolean): Self = StObject.set(x, "hasGlyphs", js.Any.fromFunction1(value))
  }
}
