package typings.appBuilderLib.integrityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsarIntegrityOptions extends js.Object {
  
  /**
    * Allows external asar files.
    *
    * @default false
    */
  val externalAllowed: js.UndefOr[Boolean] = js.native
}
object AsarIntegrityOptions {
  
  @scala.inline
  def apply(): AsarIntegrityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsarIntegrityOptions]
  }
  
  @scala.inline
  implicit class AsarIntegrityOptionsOps[Self <: AsarIntegrityOptions] (val x: Self) extends AnyVal {
    
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
    def setExternalAllowed(value: Boolean): Self = this.set("externalAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAllowed: Self = this.set("externalAllowed", js.undefined)
  }
}
