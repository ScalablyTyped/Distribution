package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cf extends StObject {
  
  var cf: CloudFrontEventreadonlyre
}
object Cf {
  
  inline def apply(cf: CloudFrontEventreadonlyre): Cf = {
    val __obj = js.Dynamic.literal(cf = cf.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cf] (val x: Self) extends AnyVal {
    
    inline def setCf(value: CloudFrontEventreadonlyre): Self = StObject.set(x, "cf", value.asInstanceOf[js.Any])
  }
}
