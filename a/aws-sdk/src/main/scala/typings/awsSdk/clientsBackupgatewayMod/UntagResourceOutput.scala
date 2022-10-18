package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource from which you removed tags.
    */
  var ResourceARN: js.UndefOr[ResourceArn] = js.undefined
}
object UntagResourceOutput {
  
  inline def apply(): UntagResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourceOutput]
  }
  
  extension [Self <: UntagResourceOutput](x: Self) {
    
    inline def setResourceARN(value: ResourceArn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
  }
}
