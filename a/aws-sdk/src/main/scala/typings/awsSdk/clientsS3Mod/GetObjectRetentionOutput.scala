package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectRetentionOutput extends StObject {
  
  /**
    * The container element for an object's retention settings.
    */
  var Retention: js.UndefOr[ObjectLockRetention] = js.undefined
}
object GetObjectRetentionOutput {
  
  inline def apply(): GetObjectRetentionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectRetentionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetObjectRetentionOutput] (val x: Self) extends AnyVal {
    
    inline def setRetention(value: ObjectLockRetention): Self = StObject.set(x, "Retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "Retention", js.undefined)
  }
}
