package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityProfileIdentifier extends StObject {
  
  /**
    * The ARN of the security profile.
    */
  var arn: SecurityProfileArn
  
  /**
    * The name you've given to the security profile.
    */
  var name: SecurityProfileName
}
object SecurityProfileIdentifier {
  
  inline def apply(arn: SecurityProfileArn, name: SecurityProfileName): SecurityProfileIdentifier = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityProfileIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityProfileIdentifier] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SecurityProfileArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: SecurityProfileName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
