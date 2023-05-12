package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksMetadata extends StObject {
  
  /**
    * Key-value pairs used to identify, sort, and organize cube resources. Can contain up to 63 uppercase letters, lowercase letters, numbers, hyphens (-), and underscores (_). Labels can be added or modified at any time. Each resource can have multiple labels, but each key must be unique for a given object.
    */
  var labels: js.UndefOr[EksLabelsMap] = js.undefined
}
object EksMetadata {
  
  inline def apply(): EksMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EksMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksMetadata] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: EksLabelsMap): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
  }
}
