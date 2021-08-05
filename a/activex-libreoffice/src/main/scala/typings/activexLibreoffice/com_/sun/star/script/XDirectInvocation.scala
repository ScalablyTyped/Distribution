package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to an object's methods and properties. */
trait XDirectInvocation
  extends StObject
     with XInterface {
  
  /**
    * provides access to methods and properties exposed by an object.
    * @param aName the method to invoke
    * @param aParams all parameters, out parameters are not supported
    */
  def directInvoke(aName: String, aParams: SeqEquiv[js.Any]): js.Any
  
  /** returns `TRUE` if the method or property with the specified name exists, else `FALSE` . */
  def hasMember(aName: String): Boolean
}
object XDirectInvocation {
  
  inline def apply(
    acquire: () => Unit,
    directInvoke: (String, SeqEquiv[js.Any]) => js.Any,
    hasMember: String => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDirectInvocation = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), directInvoke = js.Any.fromFunction2(directInvoke), hasMember = js.Any.fromFunction1(hasMember), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDirectInvocation]
  }
  
  extension [Self <: XDirectInvocation](x: Self) {
    
    inline def setDirectInvoke(value: (String, SeqEquiv[js.Any]) => js.Any): Self = StObject.set(x, "directInvoke", js.Any.fromFunction2(value))
    
    inline def setHasMember(value: String => Boolean): Self = StObject.set(x, "hasMember", js.Any.fromFunction1(value))
  }
}
