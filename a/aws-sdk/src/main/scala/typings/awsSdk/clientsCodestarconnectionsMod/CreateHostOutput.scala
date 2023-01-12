package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHostOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the host to be created.
    */
  var HostArn: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.HostArn] = js.undefined
  
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateHostOutput {
  
  inline def apply(): CreateHostOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateHostOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHostOutput] (val x: Self) extends AnyVal {
    
    inline def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    inline def setHostArnUndefined: Self = StObject.set(x, "HostArn", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
