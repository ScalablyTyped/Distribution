package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobUnlockCodeResult extends StObject {
  
  /**
    * The UnlockCode value for the specified job. The UnlockCode value can be accessed for up to 360 days after the job has been created.
    */
  var UnlockCode: js.UndefOr[String] = js.undefined
}
object GetJobUnlockCodeResult {
  
  inline def apply(): GetJobUnlockCodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobUnlockCodeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetJobUnlockCodeResult] (val x: Self) extends AnyVal {
    
    inline def setUnlockCode(value: String): Self = StObject.set(x, "UnlockCode", value.asInstanceOf[js.Any])
    
    inline def setUnlockCodeUndefined: Self = StObject.set(x, "UnlockCode", js.undefined)
  }
}
