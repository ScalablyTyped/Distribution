package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingularSourceProperties extends StObject {
  
  /**
    *  The object specified in the Singular flow source. 
    */
  var `object`: Object = js.native
}
object SingularSourceProperties {
  
  @scala.inline
  def apply(`object`: Object): SingularSourceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingularSourceProperties]
  }
  
  @scala.inline
  implicit class SingularSourcePropertiesMutableBuilder[Self <: SingularSourceProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
