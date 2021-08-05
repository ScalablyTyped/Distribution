package typings.activexLibreoffice.com_.sun.star.security

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This permission grants runtime access to some named functionality. A {@link RuntimePermission} contains a name (also referred to as a "target name")
  * but no actions list; you either have the named permission or you don't.
  * @since OOo 1.1.2
  */
trait RuntimePermission extends StObject {
  
  /** name of permission */
  var Name: String
}
object RuntimePermission {
  
  inline def apply(Name: String): RuntimePermission = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimePermission]
  }
  
  extension [Self <: RuntimePermission](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
