package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a method of changing names for converting an approximate name to an existing name.
  *
  * One field of application is the conversion of case-insensitive names to the existing names.
  *
  * Example: A basic interpreter ignores the case of the names. So it must query the {@link XExactName} interface and then call the method.
  * @see com.sun.star.beans.XPropertySet
  * @see com.sun.star.beans.XIntrospectionAccess
  * @see com.sun.star.container.XNameAccess
  */
trait XExactName
  extends StObject
     with XInterface {
  
  /** @returns the exact name for a given aprroximate name.  For example "getExactName" could be returned for "GETEXACTNAME" when "GETEXACTNAME" was used by a c */
  def getExactName(aApproximateName: String): String
}
object XExactName {
  
  inline def apply(
    acquire: () => Unit,
    getExactName: String => String,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XExactName = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getExactName = js.Any.fromFunction1(getExactName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XExactName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XExactName] (val x: Self) extends AnyVal {
    
    inline def setGetExactName(value: String => String): Self = StObject.set(x, "getExactName", js.Any.fromFunction1(value))
  }
}
