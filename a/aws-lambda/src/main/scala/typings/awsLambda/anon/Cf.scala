package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cf extends StObject {
  
  var cf: CloudFrontEventrequestClo = js.native
}
object Cf {
  
  @scala.inline
  def apply(cf: CloudFrontEventrequestClo): Cf = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cf]
  }
  
  @scala.inline
  implicit class CfMutableBuilder[Self <: Cf] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCf(value: CloudFrontEventrequestClo): Self = StObject.set(x, "cf", value.asInstanceOf[js.Any])
  }
}
