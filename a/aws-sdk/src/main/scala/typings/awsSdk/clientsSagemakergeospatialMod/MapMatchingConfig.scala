package typings.awsSdk.clientsSagemakergeospatialMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapMatchingConfig extends StObject {
  
  /**
    * The field name for the data that describes the identifier representing a collection of GPS points belonging to an individual trace.
    */
  var IdAttributeName: String
  
  /**
    * The name of the timestamp attribute.
    */
  var TimestampAttributeName: String
  
  /**
    * The name of the X-attribute
    */
  var XAttributeName: String
  
  /**
    * The name of the Y-attribute
    */
  var YAttributeName: String
}
object MapMatchingConfig {
  
  inline def apply(
    IdAttributeName: String,
    TimestampAttributeName: String,
    XAttributeName: String,
    YAttributeName: String
  ): MapMatchingConfig = {
    val __obj = js.Dynamic.literal(IdAttributeName = IdAttributeName.asInstanceOf[js.Any], TimestampAttributeName = TimestampAttributeName.asInstanceOf[js.Any], XAttributeName = XAttributeName.asInstanceOf[js.Any], YAttributeName = YAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMatchingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapMatchingConfig] (val x: Self) extends AnyVal {
    
    inline def setIdAttributeName(value: String): Self = StObject.set(x, "IdAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTimestampAttributeName(value: String): Self = StObject.set(x, "TimestampAttributeName", value.asInstanceOf[js.Any])
    
    inline def setXAttributeName(value: String): Self = StObject.set(x, "XAttributeName", value.asInstanceOf[js.Any])
    
    inline def setYAttributeName(value: String): Self = StObject.set(x, "YAttributeName", value.asInstanceOf[js.Any])
  }
}
