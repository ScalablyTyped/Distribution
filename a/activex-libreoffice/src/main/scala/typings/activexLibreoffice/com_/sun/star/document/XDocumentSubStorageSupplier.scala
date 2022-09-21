package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * through this interface documents can provide access to their substorages
  *
  * A temporary interface to get access to documents substorages.
  */
trait XDocumentSubStorageSupplier
  extends StObject
     with XInterface {
  
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  val DocumentSubStoragesNames: SafeArray[String]
  
  /**
    * provides the access to a substorage with specified name
    * @param StorageName the name of requested substorage
    * @param nMode a mode the storage should be opened in can take value from {@link com.sun.star.embed.ElementModes}
    * @returns XStorage implementation that refers to specified substorage
    */
  def getDocumentSubStorage(StorageName: String, nMode: Double): XStorage
  
  /**
    * provides the list of substorages
    * @returns sequence of substorages names
    */
  def getDocumentSubStoragesNames(): SafeArray[String]
}
object XDocumentSubStorageSupplier {
  
  inline def apply(
    DocumentSubStoragesNames: SafeArray[String],
    acquire: () => Unit,
    getDocumentSubStorage: (String, Double) => XStorage,
    getDocumentSubStoragesNames: () => SafeArray[String],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDocumentSubStorageSupplier = {
    val __obj = js.Dynamic.literal(DocumentSubStoragesNames = DocumentSubStoragesNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocumentSubStorage = js.Any.fromFunction2(getDocumentSubStorage), getDocumentSubStoragesNames = js.Any.fromFunction0(getDocumentSubStoragesNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentSubStorageSupplier]
  }
  
  extension [Self <: XDocumentSubStorageSupplier](x: Self) {
    
    inline def setDocumentSubStoragesNames(value: SafeArray[String]): Self = StObject.set(x, "DocumentSubStoragesNames", value.asInstanceOf[js.Any])
    
    inline def setGetDocumentSubStorage(value: (String, Double) => XStorage): Self = StObject.set(x, "getDocumentSubStorage", js.Any.fromFunction2(value))
    
    inline def setGetDocumentSubStoragesNames(value: () => SafeArray[String]): Self = StObject.set(x, "getDocumentSubStoragesNames", js.Any.fromFunction0(value))
  }
}
