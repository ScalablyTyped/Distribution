package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReverseGeocodingConfig extends StObject {
  
  /**
    * The field name for the data that describes x-axis coordinate, eg. longitude of a point.
    */
  var XAttributeName: String
  
  /**
    * The field name for the data that describes y-axis coordinate, eg. latitude of a point.
    */
  var YAttributeName: String
}
object ReverseGeocodingConfig {
  
  inline def apply(XAttributeName: String, YAttributeName: String): ReverseGeocodingConfig = {
    val __obj = js.Dynamic.literal(XAttributeName = XAttributeName.asInstanceOf[js.Any], YAttributeName = YAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseGeocodingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReverseGeocodingConfig] (val x: Self) extends AnyVal {
    
    inline def setXAttributeName(value: String): Self = StObject.set(x, "XAttributeName", value.asInstanceOf[js.Any])
    
    inline def setYAttributeName(value: String): Self = StObject.set(x, "YAttributeName", value.asInstanceOf[js.Any])
  }
}
