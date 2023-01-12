package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentLink extends StObject {
  
  /**
    * The name of the linked environment (the dependency).
    */
  var EnvironmentName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the link.
    */
  var LinkName: js.UndefOr[String] = js.undefined
}
object EnvironmentLink {
  
  inline def apply(): EnvironmentLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentLink] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setLinkName(value: String): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setLinkNameUndefined: Self = StObject.set(x, "LinkName", js.undefined)
  }
}
