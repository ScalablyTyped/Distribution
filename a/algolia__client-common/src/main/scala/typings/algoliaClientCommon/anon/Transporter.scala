package typings.algoliaClientCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transporter extends js.Object {
  
  val transporter: typings.algoliaTransporter.mod.Transporter = js.native
}
object Transporter {
  
  @scala.inline
  def apply(transporter: typings.algoliaTransporter.mod.Transporter): Transporter = {
    val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transporter]
  }
  
  @scala.inline
  implicit class TransporterOps[Self <: Transporter] (val x: Self) extends AnyVal {
    
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
    def setTransporter(value: typings.algoliaTransporter.mod.Transporter): Self = this.set("transporter", value.asInstanceOf[js.Any])
  }
}
