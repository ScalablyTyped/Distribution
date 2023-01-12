package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForVaultOutput extends StObject {
  
  /**
    * The tags attached to the vault. Each tag is composed of a key and a value.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object ListTagsForVaultOutput {
  
  inline def apply(): ListTagsForVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForVaultOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForVaultOutput] (val x: Self) extends AnyVal {
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
