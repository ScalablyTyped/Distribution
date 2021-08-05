package typings.activexLibreoffice.com_.sun.star.ui

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextChangeEventObject
  extends StObject
     with EventObject {
  
  /** Return the name of the application. */
  var ApplicationName: String
  
  /** Return the application specific context name. */
  var ContextName: String
}
object ContextChangeEventObject {
  
  inline def apply(ApplicationName: String, ContextName: String, Source: XInterface): ContextChangeEventObject = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ContextName = ContextName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextChangeEventObject]
  }
  
  extension [Self <: ContextChangeEventObject](x: Self) {
    
    inline def setApplicationName(value: String): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setContextName(value: String): Self = StObject.set(x, "ContextName", value.asInstanceOf[js.Any])
  }
}
