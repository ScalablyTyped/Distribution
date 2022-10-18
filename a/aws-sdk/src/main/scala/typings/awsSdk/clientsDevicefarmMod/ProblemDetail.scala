package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProblemDetail extends StObject {
  
  /**
    * The problem detail's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The problem detail's name.
    */
  var name: js.UndefOr[Name] = js.undefined
}
object ProblemDetail {
  
  inline def apply(): ProblemDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProblemDetail]
  }
  
  extension [Self <: ProblemDetail](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
