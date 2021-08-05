package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The document can provide access to CMIS properties and versions through this interface. */
trait XCmisDocument
  extends StObject
     with XInterface {
  
  val AllVersions: SafeArray[CmisVersion]
  
  /** Contains the properties values named after their CMIS ID. */
  var CmisProperties: SafeArray[CmisProperty]
  
  def canCancelCheckOut(): Boolean
  
  def canCheckIn(): Boolean
  
  def canCheckOut(): Boolean
  
  /** Cancel checked out document, this will discard all changes since check-out. */
  def cancelCheckOut(): Unit
  
  /** Creates a new version of the document from the private working copy. */
  def checkIn(isMajor: Boolean, comment: String): Unit
  
  /** Check out the document into a private working copy on the server, and update the loaded document to reflect this change. */
  def checkOut(): Unit
  
  def getAllVersions(): SafeArray[CmisVersion]
  
  /** Tells whether a document can support versioning or not. */
  def isVersionable(): Boolean
  
  def updateCmisProperties(cmisProperties: SeqEquiv[CmisProperty]): Unit
}
object XCmisDocument {
  
  inline def apply(
    AllVersions: SafeArray[CmisVersion],
    CmisProperties: SafeArray[CmisProperty],
    acquire: () => Unit,
    canCancelCheckOut: () => Boolean,
    canCheckIn: () => Boolean,
    canCheckOut: () => Boolean,
    cancelCheckOut: () => Unit,
    checkIn: (Boolean, String) => Unit,
    checkOut: () => Unit,
    getAllVersions: () => SafeArray[CmisVersion],
    isVersionable: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    updateCmisProperties: SeqEquiv[CmisProperty] => Unit
  ): XCmisDocument = {
    val __obj = js.Dynamic.literal(AllVersions = AllVersions.asInstanceOf[js.Any], CmisProperties = CmisProperties.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), canCancelCheckOut = js.Any.fromFunction0(canCancelCheckOut), canCheckIn = js.Any.fromFunction0(canCheckIn), canCheckOut = js.Any.fromFunction0(canCheckOut), cancelCheckOut = js.Any.fromFunction0(cancelCheckOut), checkIn = js.Any.fromFunction2(checkIn), checkOut = js.Any.fromFunction0(checkOut), getAllVersions = js.Any.fromFunction0(getAllVersions), isVersionable = js.Any.fromFunction0(isVersionable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), updateCmisProperties = js.Any.fromFunction1(updateCmisProperties))
    __obj.asInstanceOf[XCmisDocument]
  }
  
  extension [Self <: XCmisDocument](x: Self) {
    
    inline def setAllVersions(value: SafeArray[CmisVersion]): Self = StObject.set(x, "AllVersions", value.asInstanceOf[js.Any])
    
    inline def setCanCancelCheckOut(value: () => Boolean): Self = StObject.set(x, "canCancelCheckOut", js.Any.fromFunction0(value))
    
    inline def setCanCheckIn(value: () => Boolean): Self = StObject.set(x, "canCheckIn", js.Any.fromFunction0(value))
    
    inline def setCanCheckOut(value: () => Boolean): Self = StObject.set(x, "canCheckOut", js.Any.fromFunction0(value))
    
    inline def setCancelCheckOut(value: () => Unit): Self = StObject.set(x, "cancelCheckOut", js.Any.fromFunction0(value))
    
    inline def setCheckIn(value: (Boolean, String) => Unit): Self = StObject.set(x, "checkIn", js.Any.fromFunction2(value))
    
    inline def setCheckOut(value: () => Unit): Self = StObject.set(x, "checkOut", js.Any.fromFunction0(value))
    
    inline def setCmisProperties(value: SafeArray[CmisProperty]): Self = StObject.set(x, "CmisProperties", value.asInstanceOf[js.Any])
    
    inline def setGetAllVersions(value: () => SafeArray[CmisVersion]): Self = StObject.set(x, "getAllVersions", js.Any.fromFunction0(value))
    
    inline def setIsVersionable(value: () => Boolean): Self = StObject.set(x, "isVersionable", js.Any.fromFunction0(value))
    
    inline def setUpdateCmisProperties(value: SeqEquiv[CmisProperty] => Unit): Self = StObject.set(x, "updateCmisProperties", js.Any.fromFunction1(value))
  }
}
