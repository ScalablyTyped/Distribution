package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLOptionElement extends StObject {
  
  @JSName("MSHTML.IHTMLOptionElement_typekey")
  var MSHTMLDotIHTMLOptionElement_typekey: IHTMLOptionElement
  
  var defaultSelected: Boolean
  
  def form(): js.Any
  def form(name: js.Any): js.Any
  def form(name: js.Any, index: js.Any): js.Any
  def form(name: Unit, index: js.Any): js.Any
  @JSName("form")
  val form_Original: IHTMLFormElement
  
  var index: Double
  
  var selected: Boolean
  
  var text: String
  
  var value: String
}
object IHTMLOptionElement {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLOptionElement_typekey: IHTMLOptionElement,
    defaultSelected: Boolean,
    form: IHTMLFormElement,
    index: Double,
    selected: Boolean,
    text: String,
    value: String
  ): IHTMLOptionElement = {
    val __obj = js.Dynamic.literal(defaultSelected = defaultSelected.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLOptionElement_typekey")(MSHTMLDotIHTMLOptionElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLOptionElement]
  }
  
  @scala.inline
  implicit class IHTMLOptionElementMutableBuilder[Self <: IHTMLOptionElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultSelected(value: Boolean): Self = StObject.set(x, "defaultSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForm(value: IHTMLFormElement): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotIHTMLOptionElement_typekey(value: IHTMLOptionElement): Self = StObject.set(x, "MSHTML.IHTMLOptionElement_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
