package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OSRelease extends StObject {
  
  /**
    * The Amazon Linux release specified for a cluster in the RunJobFlow request. The format is as shown in  Amazon Linux 2 Release Notes . For example, 2.0.20220218.1.
    */
  var Label: js.UndefOr[String] = js.undefined
}
object OSRelease {
  
  inline def apply(): OSRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OSRelease]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OSRelease] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
  }
}
