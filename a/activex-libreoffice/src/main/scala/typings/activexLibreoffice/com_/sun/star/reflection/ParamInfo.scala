package typings.activexLibreoffice.com_.sun.star.reflection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a formal parameter of a method. */
@js.native
trait ParamInfo extends js.Object {
  
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
  implicit class ParamInfoOps[Self <: ParamInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAMode(value: ParamMode): Self = this.set("aMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAName(value: String): Self = this.set("aName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAType(value: XIdlClass[_]): Self = this.set("aType", value.asInstanceOf[js.Any])
  }
}
