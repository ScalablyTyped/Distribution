package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cf extends StObject {
  
  var cf: CloudFrontEventrequestClo
}
object Cf {
  
  inline def apply(cf: CloudFrontEventrequestClo): Cf = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cf]
  }
  
  extension [Self <: Cf](x: Self) {
    
    inline def setCf(value: CloudFrontEventrequestClo): Self = StObject.set(x, "cf", value.asInstanceOf[js.Any])
  }
}
