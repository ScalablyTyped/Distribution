package typings.appdmg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecificationCodeSign extends js.Object {
  
  var identifier: js.UndefOr[String] = js.native
  
  var `signing-identity`: String = js.native
}
object SpecificationCodeSign {
  
  @scala.inline
  def apply(`signing-identity`: String): SpecificationCodeSign = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("signing-identity")(`signing-identity`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecificationCodeSign]
  }
  
  @scala.inline
  implicit class SpecificationCodeSignOps[Self <: SpecificationCodeSign] (val x: Self) extends AnyVal {
    
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
    def `setSigning-identity`(value: String): Self = this.set("signing-identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
}
