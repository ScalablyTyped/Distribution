package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppComponent extends StObject {
  
  /**
    * The name of the application component.
    */
  var name: String255
  
  /**
    * The type of application component.
    */
  var `type`: String255
}
object AppComponent {
  
  inline def apply(name: String255, `type`: String255): AppComponent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppComponent]
  }
  
  extension [Self <: AppComponent](x: Self) {
    
    inline def setName(value: String255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String255): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
