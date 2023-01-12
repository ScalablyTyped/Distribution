package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionRunAsConfig extends StObject {
  
  /**
    * The group ID whose permissions are used to run a Lambda function.
    */
  var Gid: js.UndefOr[integer] = js.undefined
  
  /**
    * The user ID whose permissions are used to run a Lambda function.
    */
  var Uid: js.UndefOr[integer] = js.undefined
}
object FunctionRunAsConfig {
  
  inline def apply(): FunctionRunAsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionRunAsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionRunAsConfig] (val x: Self) extends AnyVal {
    
    inline def setGid(value: integer): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "Gid", js.undefined)
    
    inline def setUid(value: integer): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "Uid", js.undefined)
  }
}
