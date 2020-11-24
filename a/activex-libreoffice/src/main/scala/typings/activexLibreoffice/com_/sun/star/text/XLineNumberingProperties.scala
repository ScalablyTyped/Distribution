package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains the settings of the line numbering in a text document. */
@js.native
trait XLineNumberingProperties extends XInterface {
  
  /** @returns the {@link LineNumberingProperties} of the object. */
  val LineNumberingProperties: XPropertySet = js.native
  
  /** @returns the {@link LineNumberingProperties} of the object. */
  def getLineNumberingProperties(): XPropertySet = js.native
}
object XLineNumberingProperties {
  
  @scala.inline
  def apply(
    LineNumberingProperties: XPropertySet,
    acquire: () => Unit,
    getLineNumberingProperties: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLineNumberingProperties = {
    val __obj = js.Dynamic.literal(LineNumberingProperties = LineNumberingProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLineNumberingProperties = js.Any.fromFunction0(getLineNumberingProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLineNumberingProperties]
  }
  
  @scala.inline
  implicit class XLineNumberingPropertiesOps[Self <: XLineNumberingProperties] (val x: Self) extends AnyVal {
    
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
    def setLineNumberingProperties(value: XPropertySet): Self = this.set("LineNumberingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLineNumberingProperties(value: () => XPropertySet): Self = this.set("getLineNumberingProperties", js.Any.fromFunction0(value))
  }
}
