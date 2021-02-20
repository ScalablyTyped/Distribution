package typings.activexLibreoffice.com_.sun.star.reflection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a formal parameter of a method. */
@js.native
trait ParamInfo extends StObject {
  
  /** parameter mode: in, out, inout */
  var aMode: ParamMode = js.native
  
  /** name of the parameter */
  var aName: String = js.native
  
  /** formal type of the parameter */
  var aType: XIdlClass[_] = js.native
}
object ParamInfo {
  
  @scala.inline
  def apply(aMode: ParamMode, aName: String, aType: XIdlClass[_]): ParamInfo = {
    val __obj = js.Dynamic.literal(aMode = aMode.asInstanceOf[js.Any], aName = aName.asInstanceOf[js.Any], aType = aType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamInfo]
  }
  
  @scala.inline
  implicit class ParamInfoMutableBuilder[Self <: ParamInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAMode(value: ParamMode): Self = StObject.set(x, "aMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAName(value: String): Self = StObject.set(x, "aName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAType(value: XIdlClass[_]): Self = StObject.set(x, "aType", value.asInstanceOf[js.Any])
  }
}
