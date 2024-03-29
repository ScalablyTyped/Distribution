package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVodSourceRequest extends StObject {
  
  /**
    * The name of the source location associated with this VOD Source.
    */
  var SourceLocationName: _String
  
  /**
    * The name of the VOD Source.
    */
  var VodSourceName: _String
}
object DescribeVodSourceRequest {
  
  inline def apply(SourceLocationName: _String, VodSourceName: _String): DescribeVodSourceRequest = {
    val __obj = js.Dynamic.literal(SourceLocationName = SourceLocationName.asInstanceOf[js.Any], VodSourceName = VodSourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVodSourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVodSourceRequest] (val x: Self) extends AnyVal {
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceName(value: _String): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
  }
}
