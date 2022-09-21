package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to create and initialize a new embedded object.
  *
  * This interface contains methods that can help to create and initialize an embedded object.
  */
trait XEmbedObjectCreator
  extends StObject
     with XInterface {
  
  /**
    * creates a new object that should be based on specified storage entry.
    *
    * The specified entry must exists and the object should be loaded from the entry. In case a persistent representation of a link is specified, the result
    * object will be a link.
    * @param xStorage a parent storage the entry should be opened in
    * @param sEntryName a name for the entry
    * @param aMediaDescriptor an object of type {@link com.sun.star.document.MediaDescriptor} that specifies document related properties; please remember that
    * @param aObjectArgs an object of type {@link EmbeddedObjectDescriptor} contains object related properties
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::container::NoSuchElementException the specified entry does not exist
    * @throws com::sun::star::io::IOException in case of io problems during opening
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceInitFromEntry(
    xStorage: XStorage,
    sEntryName: String,
    aMediaDescriptor: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): XInterface
  
  /**
    * creates a new object and initializes it based on {@link com.sun.star.document.MediaDescriptor} .
    *
    * In case specified entry exists it's contents are ignored and will be overwritten on storing.
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntryName a name for the entry
    * @param aMediaDescriptor an object of type {@link com.sun.star.document.MediaDescriptor} that specifies source
    * @param aObjectArgs an object of type {@link EmbeddedObjectDescriptor} contains object related properties
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceInitFromMediaDescriptor(
    xStorage: XStorage,
    sEntryName: String,
    aMediaDescriptor: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): XInterface
  
  /**
    * creates a new object and initializes it as a new one.
    *
    * In case specified entry exists it's contents are ignored and will be overwritten on storing.
    * @param aClassID the class id of the new object
    * @param sClassName the class name of the new object
    * @param xStorage a parent storage the entry should be created/opened in
    * @param sEntryName a name for the entry
    * @param aObjectArgs optional parameters for the object persistence initialization see also {@link EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def createInstanceInitNew(
    aClassID: SeqEquiv[Double],
    sClassName: String,
    xStorage: XStorage,
    sEntryName: String,
    aObjectArgs: SeqEquiv[PropertyValue]
  ): XInterface
}
object XEmbedObjectCreator {
  
  inline def apply(
    acquire: () => Unit,
    createInstanceInitFromEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceInitFromMediaDescriptor: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface,
    createInstanceInitNew: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue]) => XInterface,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XEmbedObjectCreator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createInstanceInitFromEntry = js.Any.fromFunction4(createInstanceInitFromEntry), createInstanceInitFromMediaDescriptor = js.Any.fromFunction4(createInstanceInitFromMediaDescriptor), createInstanceInitNew = js.Any.fromFunction5(createInstanceInitNew), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEmbedObjectCreator]
  }
  
  extension [Self <: XEmbedObjectCreator](x: Self) {
    
    inline def setCreateInstanceInitFromEntry(value: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface): Self = StObject.set(x, "createInstanceInitFromEntry", js.Any.fromFunction4(value))
    
    inline def setCreateInstanceInitFromMediaDescriptor(value: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => XInterface): Self = StObject.set(x, "createInstanceInitFromMediaDescriptor", js.Any.fromFunction4(value))
    
    inline def setCreateInstanceInitNew(value: (SeqEquiv[Double], String, XStorage, String, SeqEquiv[PropertyValue]) => XInterface): Self = StObject.set(x, "createInstanceInitNew", js.Any.fromFunction5(value))
  }
}
