package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamInstanceProfile extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance profile.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance profile.
    */
  var Id: js.UndefOr[String] = js.undefined
}
object IamInstanceProfile {
  
  inline def apply(): IamInstanceProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamInstanceProfile]
  }
  
  extension [Self <: IamInstanceProfile](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
