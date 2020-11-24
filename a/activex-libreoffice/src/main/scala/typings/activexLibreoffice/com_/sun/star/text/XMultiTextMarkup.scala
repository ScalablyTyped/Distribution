package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to apply multiple text markups in one call.
  * @since OOo 3.0.1
  */
@js.native
trait XMultiTextMarkup extends js.Object {
  
  /**
    * submits multiple new markup ranges.
    *
    * The main use of this function will probably be for proofreading to allow for setting the markup of all found errors in a sentence in a single call.
    * For this the sequence needs to provide the markups for all errors along with the markup for the identified sentence boundaries. The order of those
    * entries is arbitrary.
    * @param aMarkups a sequence of single text markups.
    * @see com.sun.star.text.XTextMarkup
    * @see com.sun.star.text.TextMarkupType
    */
  def commitMultiTextMarkup(aMarkups: SeqEquiv[TextMarkupDescriptor]): Unit = js.native
}
object XMultiTextMarkup {
  
  @scala.inline
  def apply(commitMultiTextMarkup: SeqEquiv[TextMarkupDescriptor] => Unit): XMultiTextMarkup = {
    val __obj = js.Dynamic.literal(commitMultiTextMarkup = js.Any.fromFunction1(commitMultiTextMarkup))
    __obj.asInstanceOf[XMultiTextMarkup]
  }
  
  @scala.inline
  implicit class XMultiTextMarkupOps[Self <: XMultiTextMarkup] (val x: Self) extends AnyVal {
    
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
    def setCommitMultiTextMarkup(value: SeqEquiv[TextMarkupDescriptor] => Unit): Self = this.set("commitMultiTextMarkup", js.Any.fromFunction1(value))
  }
}
