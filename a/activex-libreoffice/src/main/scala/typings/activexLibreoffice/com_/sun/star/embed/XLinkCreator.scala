package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to create and initialize a new link.
  *
  * Methods of this interface does not require specification of the object type, it will be detected.
  */
@js.native
trait XLinkCreator extends XInterface {
  
  /**
    * creates a new object based on {@link com.sun.star.document.MediaDescriptor} and initializes it as a link.
    *
    * In case the entry exists already all its contents will be ignored and rewritten on storing of the object.
    * @param xStorage a parent storage the entry should be created or opened in
    * @param sEntryName a name for the entry
    * @param aArgs {@link com.sun.star.document.MediaDescriptor} the link will be based on
    * @param aObjectArgs optional parameters for the object persistence initialization, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException the argument is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceLink(
    xStorage: XStorage,
    sEntryName: String,
    aArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): XInterface = js.native
}
object XLinkCreator {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInstanceLink: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLinkCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstanceLink = js.Any.fromFunction4(createInstanceLink), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLinkCreator]
  }
  
  @scala.inline
  implicit class XLinkCreatorMutableBuilder[Self <: XLinkCreator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateInstanceLink(value: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface): Self = StObject.set(x, "createInstanceLink", js.Any.fromFunction4(value))
  }
}
