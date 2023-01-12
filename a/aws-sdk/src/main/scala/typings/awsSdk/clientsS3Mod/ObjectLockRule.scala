package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLockRule extends StObject {
  
  /**
    * The default Object Lock retention mode and period that you want to apply to new objects placed in the specified bucket. Bucket settings require both a mode and a period. The period can be either Days or Years but you must select one. You cannot specify Days and Years at the same time.
    */
  var DefaultRetention: js.UndefOr[typings.awsSdk.clientsS3Mod.DefaultRetention] = js.undefined
}
object ObjectLockRule {
  
  inline def apply(): ObjectLockRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectLockRule] (val x: Self) extends AnyVal {
    
    inline def setDefaultRetention(value: DefaultRetention): Self = StObject.set(x, "DefaultRetention", value.asInstanceOf[js.Any])
    
    inline def setDefaultRetentionUndefined: Self = StObject.set(x, "DefaultRetention", js.undefined)
  }
}
