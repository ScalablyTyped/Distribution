package typings.atlassianConnectJs.anon

import typings.atlassianConnectJs.AP.confluence.ContentProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  var property: ContentProperty
}
object Property {
  
  inline def apply(property: ContentProperty): Property = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  extension [Self <: Property](x: Self) {
    
    inline def setProperty(value: ContentProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
