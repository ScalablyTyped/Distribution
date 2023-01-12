package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationInfo extends StObject {
  
  /**
    * 
    ARN of the configuration to use.
    
    */
  var Arn: string
  
  /**
    * 
    The revision of the configuration to use.
    
    */
  var Revision: long
}
object ConfigurationInfo {
  
  inline def apply(Arn: string, Revision: long): ConfigurationInfo = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Revision = Revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationInfo] (val x: Self) extends AnyVal {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: long): Self = StObject.set(x, "Revision", value.asInstanceOf[js.Any])
  }
}
