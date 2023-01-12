package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ulimit extends StObject {
  
  /**
    * The hard limit for the ulimit type.
    */
  var hardLimit: Integer
  
  /**
    * The type of the ulimit.
    */
  var name: UlimitName
  
  /**
    * The soft limit for the ulimit type.
    */
  var softLimit: Integer
}
object Ulimit {
  
  inline def apply(hardLimit: Integer, name: UlimitName, softLimit: Integer): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], softLimit = softLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ulimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ulimit] (val x: Self) extends AnyVal {
    
    inline def setHardLimit(value: Integer): Self = StObject.set(x, "hardLimit", value.asInstanceOf[js.Any])
    
    inline def setName(value: UlimitName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSoftLimit(value: Integer): Self = StObject.set(x, "softLimit", value.asInstanceOf[js.Any])
  }
}
