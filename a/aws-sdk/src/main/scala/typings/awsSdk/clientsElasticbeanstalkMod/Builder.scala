package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Builder extends StObject {
  
  /**
    * The ARN of the builder.
    */
  var ARN: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ARN] = js.undefined
}
object Builder {
  
  inline def apply(): Builder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Builder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Builder] (val x: Self) extends AnyVal {
    
    inline def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
  }
}
