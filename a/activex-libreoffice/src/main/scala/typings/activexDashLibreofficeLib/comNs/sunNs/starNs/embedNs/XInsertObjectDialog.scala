package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to create and initialize a new embedded object using GUI dialog. */
trait XInsertObjectDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def createInstanceByDialog(
    xStorage: XStorage,
    sEntName: java.lang.String,
    lObjArgs: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): InsertedObjectInfo
}

object XInsertObjectDialog {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createInstanceByDialog: js.Function3[
      XStorage, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      InsertedObjectInfo
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInsertObjectDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, createInstanceByDialog = createInstanceByDialog, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInsertObjectDialog]
  }
}

