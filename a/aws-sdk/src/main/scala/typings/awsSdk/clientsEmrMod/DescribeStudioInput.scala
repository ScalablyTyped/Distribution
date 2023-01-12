package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStudioInput extends StObject {
  
  /**
    * The Amazon EMR Studio ID.
    */
  var StudioId: XmlStringMaxLen256
}
object DescribeStudioInput {
  
  inline def apply(StudioId: XmlStringMaxLen256): DescribeStudioInput = {
    val __obj = js.Dynamic.literal(StudioId = StudioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStudioInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeStudioInput] (val x: Self) extends AnyVal {
    
    inline def setStudioId(value: XmlStringMaxLen256): Self = StObject.set(x, "StudioId", value.asInstanceOf[js.Any])
  }
}
