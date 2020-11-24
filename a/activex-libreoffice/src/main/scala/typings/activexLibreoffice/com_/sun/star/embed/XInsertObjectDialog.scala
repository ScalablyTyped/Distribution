package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to create and initialize a new embedded object using GUI dialog. */
@js.native
trait XInsertObjectDialog extends XInterface {
  
  /**
    * creates a new object using GUI dialog.
    *
    * The dialog allows for user to do a number of choices that are container related. This information will be returned in the {@link InsertedObjectInfo}
    * object.
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntName a name for the entry
    * @param lObjArgs optional parameters for the object persistence initialization see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @returns the structure containing the object and container related options
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceByDialog(xStorage: XStorage, sEntName: String, lObjArgs: SeqEquiv[PropertyValue]): InsertedObjectInfo = js.native
}
object XInsertObjectDialog {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInstanceByDialog: (XStorage, String, SeqEquiv[PropertyValue]) => InsertedObjectInfo,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInsertObjectDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstanceByDialog = js.Any.fromFunction3(createInstanceByDialog), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInsertObjectDialog]
  }
  
  @scala.inline
  implicit class XInsertObjectDialogOps[Self <: XInsertObjectDialog] (val x: Self) extends AnyVal {
    
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
    def setCreateInstanceByDialog(value: (XStorage, String, SeqEquiv[PropertyValue]) => InsertedObjectInfo): Self = this.set("createInstanceByDialog", js.Any.fromFunction3(value))
  }
}
