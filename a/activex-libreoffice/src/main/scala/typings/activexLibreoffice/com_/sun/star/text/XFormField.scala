package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XFormField extends XInterface {
  
  var FieldType: String = js.native
  
  val Parameters: XNameContainer = js.native
  
  def getFieldType(): String = js.native
  
  def getParameters(): XNameContainer = js.native
  
  def setFieldType(fieldType: String): Unit = js.native
}
object XFormField {
  
  @scala.inline
  def apply(
    FieldType: String,
    Parameters: XNameContainer,
    acquire: () => Unit,
    getFieldType: () => String,
    getParameters: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFieldType: String => Unit
  ): XFormField = {
    val __obj = js.Dynamic.literal(FieldType = FieldType.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFieldType = js.Any.fromFunction0(getFieldType), getParameters = js.Any.fromFunction0(getParameters), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFieldType = js.Any.fromFunction1(setFieldType))
    __obj.asInstanceOf[XFormField]
  }
  
  @scala.inline
  implicit class XFormFieldOps[Self <: XFormField] (val x: Self) extends AnyVal {
    
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
    def setFieldType(value: String): Self = this.set("FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: XNameContainer): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFieldType(value: () => String): Self = this.set("getFieldType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParameters(value: () => XNameContainer): Self = this.set("getParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFieldType(value: String => Unit): Self = this.set("setFieldType", js.Any.fromFunction1(value))
  }
}
