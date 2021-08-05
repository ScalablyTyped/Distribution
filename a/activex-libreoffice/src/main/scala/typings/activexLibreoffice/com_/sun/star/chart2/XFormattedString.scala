package typings.activexLibreoffice.com_.sun.star.chart2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XFormattedString
  extends StObject
     with XInterface {
  
  var String: java.lang.String
  
  def getString(): String
  
  def setString(String: String): Unit
}
object XFormattedString {
  
  inline def apply(
    String: String,
    acquire: () => Unit,
    getString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setString: String => Unit
  ): XFormattedString = {
    val __obj = js.Dynamic.literal(String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getString = js.Any.fromFunction0(getString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XFormattedString]
  }
  
  extension [Self <: XFormattedString](x: Self) {
    
    inline def setGetString(value: () => String): Self = StObject.set(x, "getString", js.Any.fromFunction0(value))
    
    inline def setSetString(value: String => Unit): Self = StObject.set(x, "setString", js.Any.fromFunction1(value))
    
    inline def setString(value: String): Self = StObject.set(x, "String", value.asInstanceOf[js.Any])
  }
}
