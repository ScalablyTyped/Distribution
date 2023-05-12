package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapStart extends StObject {
  
  /**
    * Set to PublishedVersions to create a snapshot of the initialized execution environment when you publish a function version.
    */
  var ApplyOn: js.UndefOr[SnapStartApplyOn] = js.undefined
}
object SnapStart {
  
  inline def apply(): SnapStart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapStart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SnapStart] (val x: Self) extends AnyVal {
    
    inline def setApplyOn(value: SnapStartApplyOn): Self = StObject.set(x, "ApplyOn", value.asInstanceOf[js.Any])
    
    inline def setApplyOnUndefined: Self = StObject.set(x, "ApplyOn", js.undefined)
  }
}
