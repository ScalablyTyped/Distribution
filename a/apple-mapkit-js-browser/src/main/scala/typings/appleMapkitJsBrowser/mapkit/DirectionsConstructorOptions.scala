package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that you may provide when creating a directions object.
  */
trait DirectionsConstructorOptions extends StObject {
  
  /**
    * A language ID that determines the language for route information.
    */
  var language: js.UndefOr[String] = js.undefined
}
object DirectionsConstructorOptions {
  
  inline def apply(): DirectionsConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
