package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * supports the formatting of numberings in various language environments.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.text.NumberingLevel
  * @version 1.0
  */
@js.native
trait XNumberingFormatter extends XInterface {
  
  /** @returns the formatted numbering string according to the given {@link com.sun.star.text.NumberingLevel} and the given {@link com.sun.star.lang.Locale} . */
  def makeNumberingString(aProperties: SeqEquiv[PropertyValue], aLocale: Locale): String = js.native
}
object XNumberingFormatter {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    makeNumberingString: (SeqEquiv[PropertyValue], Locale) => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberingFormatter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), makeNumberingString = js.Any.fromFunction2(makeNumberingString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberingFormatter]
  }
  
  @scala.inline
  implicit class XNumberingFormatterOps[Self <: XNumberingFormatter] (val x: Self) extends AnyVal {
    
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
    def setMakeNumberingString(value: (SeqEquiv[PropertyValue], Locale) => String): Self = this.set("makeNumberingString", js.Any.fromFunction2(value))
  }
}
