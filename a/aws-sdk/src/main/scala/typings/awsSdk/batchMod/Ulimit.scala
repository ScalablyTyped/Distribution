package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ulimit extends StObject {
  
  /**
    * The hard limit for the ulimit type.
    */
  var hardLimit: Integer = js.native
  
  /**
    * The type of the ulimit.
    */
  var name: String = js.native
  
  /**
    * The soft limit for the ulimit type.
    */
  var softLimit: Integer = js.native
}
object Ulimit {
  
  @scala.inline
  def apply(hardLimit: Integer, name: String, softLimit: Integer): Ulimit = {
    val __obj = js.Dynamic.literal(hardLimit = hardLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], softLimit = softLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ulimit]
  }
  
  @scala.inline
  implicit class UlimitMutableBuilder[Self <: Ulimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHardLimit(value: Integer): Self = StObject.set(x, "hardLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftLimit(value: Integer): Self = StObject.set(x, "softLimit", value.asInstanceOf[js.Any])
  }
}
