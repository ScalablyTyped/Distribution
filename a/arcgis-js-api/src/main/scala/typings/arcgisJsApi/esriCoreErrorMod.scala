package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriCoreErrorMod {
  
  @JSImport("esri/core/Error", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Error {
    def this(name: String) = this()
    def this(name: String, message: String) = this()
    def this(name: String, message: String, details: Any) = this()
    def this(name: String, message: Unit, details: Any) = this()
    
    /**
      * The details object provides additional details specific to the error, giving more information about why the error was raised.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#details)
      */
    /* CompleteClass */
    var details: Any = js.native
    
    /**
      * A message describing the details of the error.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#message)
      */
    /* CompleteClass */
    var message: String = js.native
    
    /**
      * A unique error name.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html#name)
      */
    /* CompleteClass */
    var name: String = js.native
  }
}
