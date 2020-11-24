package typings.activexLibreoffice.com_.sun.star.text.fieldmaster

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.text.TextFieldMaster
import typings.activexLibreoffice.com_.sun.star.text.XDependentTextField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of a {@link DDE} field master.
  * @see com.sun.star.text.TextField
  */
@js.native
trait DDE extends TextFieldMaster {
  
  /** contains the content. */
  var Content: String = js.native
  
  /** contains the element string of the {@link DDE} command. */
  var DDECommandElement: String = js.native
  
  /** contains the file string of the {@link DDE} command. */
  var DDECommandFile: String = js.native
  
  /** contains the type string of the {@link DDE} command. */
  var DDECommandType: String = js.native
  
  /** determines whether {@link DDE} link is updated automatically. */
  var IsAutomaticUpdate: Boolean = js.native
}
object DDE {
  
  @scala.inline
  def apply(
    Content: String,
    DDECommandElement: String,
    DDECommandFile: String,
    DDECommandType: String,
    DependentTextFields: SafeArray[XDependentTextField],
    InstanceName: String,
    IsAutomaticUpdate: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DDE = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], DDECommandElement = DDECommandElement.asInstanceOf[js.Any], DDECommandFile = DDECommandFile.asInstanceOf[js.Any], DDECommandType = DDECommandType.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsAutomaticUpdate = IsAutomaticUpdate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DDE]
  }
  
  @scala.inline
  implicit class DDEOps[Self <: DDE] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDDECommandElement(value: String): Self = this.set("DDECommandElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDDECommandFile(value: String): Self = this.set("DDECommandFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDDECommandType(value: String): Self = this.set("DDECommandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomaticUpdate(value: Boolean): Self = this.set("IsAutomaticUpdate", value.asInstanceOf[js.Any])
  }
}
