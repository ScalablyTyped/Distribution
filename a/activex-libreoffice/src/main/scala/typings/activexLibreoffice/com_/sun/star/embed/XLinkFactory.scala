package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to create and initialize a new link of specified type. */
@js.native
trait XLinkFactory extends XInterface {
  /**
    * creates a new link and transport parameters for persistent initialization.
    *
    * This method can be used to have a full control over persistence initialization of a link.
    * @param aClassID the class id of the new object
    * @param ClassName the class name of the new object
    * @param xStorage a parent storage the entry should be created in
    * @param sEntryName a name for the entry
    * @param aArgs {@link com.sun.star.document.MediaDescriptor} that contains source for the link
    * @param aObjectArgs optional parameters for the object persistence initialization see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceLinkUserInit(
    aClassID: SeqEquiv[Double],
    ClassName: String,
    xStorage: XStorage,
    sEntryName: String,
    aArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): XInterface = js.native
}

object XLinkFactory {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createInstanceLinkUserInit: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLinkFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstanceLinkUserInit = js.Any.fromFunction6(createInstanceLinkUserInit), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLinkFactory]
  }
  @scala.inline
  implicit class XLinkFactoryOps[Self <: XLinkFactory] (val x: Self) extends AnyVal {
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
    def setCreateInstanceLinkUserInit(
      value: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface
    ): Self = this.set("createInstanceLinkUserInit", js.Any.fromFunction6(value))
  }
  
}

