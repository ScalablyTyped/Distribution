package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** knows all currently used and all free numbers for using with untitled but counted objects. */
trait XUntitledNumbers
  extends StObject
     with XInterface {
  
  /**
    * returns the localized string value to be used for untitled objects in combination with the leased number.
    *
    * Note: Such string already contains leading spaces/tabs etc. ! The only thing which an outside code has todo then ... adding a leased number to the
    * string.
    * @returns the localized string for untitled components.
    */
  val UntitledPrefix: String
  
  /**
    * returns the localized string value to be used for untitled objects in combination with the leased number.
    *
    * Note: Such string already contains leading spaces/tabs etc. ! The only thing which an outside code has todo then ... adding a leased number to the
    * string.
    * @returns the localized string for untitled components.
    */
  def getUntitledPrefix(): String
  
  /**
    * callee has to lease a number before they can use it within in its own title.
    *
    * Such number must be freed after using e.g. while the object was closed or gets another title (e.g. by saving a document to a real location on disc).
    * @param xComponent the component which has to be registered for the leased number.
    * @returns the new number for these object or 0 if no further numbers are available.
    * @throws [IllegalArgumentException] if an invalid object reference was provided to this method.
    */
  def leaseNumber(xComponent: XInterface): Double
  
  /**
    * has to be used to mark those number as "free for using".
    *
    * If the registered component does not use such leased number any longer it has to be released so it can be used for new components.
    *
    * Note: calling this method with an unknown (but normally valid number) has to be ignored. No exceptions - no errors.
    * @param nNumber specify number for release.
    * @throws [IllegalArgumentException] if the given number is the special value 0.
    */
  def releaseNumber(nNumber: Double): Unit
  
  /**
    * does the same then releaseNumber () but it searches the corresponding number for the specified component and deregister it.
    * @param xComponent the component for deregistration.
    * @throws [IllegalArgumentException] if an invalid object reference was provided to this method.
    */
  def releaseNumberForComponent(xComponent: XInterface): Unit
}
object XUntitledNumbers {
  
  inline def apply(
    UntitledPrefix: String,
    acquire: () => Unit,
    getUntitledPrefix: () => String,
    leaseNumber: XInterface => Double,
    queryInterface: `type` => Any,
    release: () => Unit,
    releaseNumber: Double => Unit,
    releaseNumberForComponent: XInterface => Unit
  ): XUntitledNumbers = {
    val __obj = js.Dynamic.literal(UntitledPrefix = UntitledPrefix.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getUntitledPrefix = js.Any.fromFunction0(getUntitledPrefix), leaseNumber = js.Any.fromFunction1(leaseNumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), releaseNumber = js.Any.fromFunction1(releaseNumber), releaseNumberForComponent = js.Any.fromFunction1(releaseNumberForComponent))
    __obj.asInstanceOf[XUntitledNumbers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XUntitledNumbers] (val x: Self) extends AnyVal {
    
    inline def setGetUntitledPrefix(value: () => String): Self = StObject.set(x, "getUntitledPrefix", js.Any.fromFunction0(value))
    
    inline def setLeaseNumber(value: XInterface => Double): Self = StObject.set(x, "leaseNumber", js.Any.fromFunction1(value))
    
    inline def setReleaseNumber(value: Double => Unit): Self = StObject.set(x, "releaseNumber", js.Any.fromFunction1(value))
    
    inline def setReleaseNumberForComponent(value: XInterface => Unit): Self = StObject.set(x, "releaseNumberForComponent", js.Any.fromFunction1(value))
    
    inline def setUntitledPrefix(value: String): Self = StObject.set(x, "UntitledPrefix", value.asInstanceOf[js.Any])
  }
}
