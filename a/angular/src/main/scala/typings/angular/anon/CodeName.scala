package typings.angular.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeName extends js.Object {
  
  var codeName: String = js.native
  
  var dot: Double = js.native
  
  var full: String = js.native
  
  var major: Double = js.native
  
  var minor: Double = js.native
}
object CodeName {
  
  @scala.inline
  def apply(codeName: String, dot: Double, full: String, major: Double, minor: Double): CodeName = {
    val __obj = js.Dynamic.literal(codeName = codeName.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeName]
  }
  
  @scala.inline
  implicit class CodeNameOps[Self <: CodeName] (val x: Self) extends AnyVal {
    
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
    def setCodeName(value: String): Self = this.set("codeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDot(value: Double): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFull(value: String): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = this.set("major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = this.set("minor", value.asInstanceOf[js.Any])
  }
}
