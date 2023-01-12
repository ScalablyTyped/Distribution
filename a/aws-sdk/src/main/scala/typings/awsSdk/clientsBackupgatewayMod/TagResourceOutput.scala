package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource you tagged.
    */
  var ResourceARN: js.UndefOr[ResourceArn] = js.undefined
}
object TagResourceOutput {
  
  inline def apply(): TagResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagResourceOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagResourceOutput] (val x: Self) extends AnyVal {
    
    inline def setResourceARN(value: ResourceArn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
  }
}
