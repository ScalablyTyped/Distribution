package typings.activexLibreoffice.com_.sun.star.reflection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a formal parameter of a method. */
trait ParamInfo extends StObject {
  
  /** parameter mode: in, out, inout */
  var aMode: ParamMode
  
  /** name of the parameter */
  var aName: String
  
  /** formal type of the parameter */
  var aType: XIdlClass[js.Any]
}
object ParamInfo {
  
  inline def apply(aMode: ParamMode, aName: String, aType: XIdlClass[js.Any]): ParamInfo = {
    val __obj = js.Dynamic.literal(aMode = aMode.asInstanceOf[js.Any], aName = aName.asInstanceOf[js.Any], aType = aType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamInfo]
  }
  
  extension [Self <: ParamInfo](x: Self) {
    
    inline def setAMode(value: ParamMode): Self = StObject.set(x, "aMode", value.asInstanceOf[js.Any])
    
    inline def setAName(value: String): Self = StObject.set(x, "aName", value.asInstanceOf[js.Any])
    
    inline def setAType(value: XIdlClass[js.Any]): Self = StObject.set(x, "aType", value.asInstanceOf[js.Any])
  }
}
