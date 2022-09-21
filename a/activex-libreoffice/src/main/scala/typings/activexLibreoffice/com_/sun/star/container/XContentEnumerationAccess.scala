package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows access to the collections of all content types within the object.
  *
  * This example prints the names of all tables:
  *
  * {{program example here, see documentation}}
  */
trait XContentEnumerationAccess
  extends StObject
     with XInterface {
  
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  val AvailableServiceNames: SafeArray[String]
  
  /** @returns a new enumeration object for the contents of the specified service type. */
  def createContentEnumeration(aServiceName: String): XEnumeration
  
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  def getAvailableServiceNames(): SafeArray[String]
}
object XContentEnumerationAccess {
  
  inline def apply(
    AvailableServiceNames: SafeArray[String],
    acquire: () => Unit,
    createContentEnumeration: String => XEnumeration,
    getAvailableServiceNames: () => SafeArray[String],
    queryInterface: `type` => Any,
    release: () => Unit
  ): XContentEnumerationAccess = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createContentEnumeration = js.Any.fromFunction1(createContentEnumeration), getAvailableServiceNames = js.Any.fromFunction0(getAvailableServiceNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XContentEnumerationAccess]
  }
  
  extension [Self <: XContentEnumerationAccess](x: Self) {
    
    inline def setAvailableServiceNames(value: SafeArray[String]): Self = StObject.set(x, "AvailableServiceNames", value.asInstanceOf[js.Any])
    
    inline def setCreateContentEnumeration(value: String => XEnumeration): Self = StObject.set(x, "createContentEnumeration", js.Any.fromFunction1(value))
    
    inline def setGetAvailableServiceNames(value: () => SafeArray[String]): Self = StObject.set(x, "getAvailableServiceNames", js.Any.fromFunction0(value))
  }
}
