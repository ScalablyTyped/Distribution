package typings.amqplib.propertiesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagePropertyHeaders
  extends /* key */ StringDictionary[js.Any] {
  
  var `x-death`: js.UndefOr[js.Array[XDeath]] = js.native
  
  var `x-first-death-exchange`: js.UndefOr[String] = js.native
  
  var `x-first-death-queue`: js.UndefOr[String] = js.native
  
  var `x-first-death-reason`: js.UndefOr[String] = js.native
}
object MessagePropertyHeaders {
  
  @scala.inline
  def apply(): MessagePropertyHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePropertyHeaders]
  }
  
  @scala.inline
  implicit class MessagePropertyHeadersOps[Self <: MessagePropertyHeaders] (val x: Self) extends AnyVal {
    
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
    def `setX-deathVarargs`(value: XDeath*): Self = this.set("x-death", js.Array(value :_*))
    
    @scala.inline
    def `setX-death`(value: js.Array[XDeath]): Self = this.set("x-death", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-death`: Self = this.set("x-death", js.undefined)
    
    @scala.inline
    def `setX-first-death-exchange`(value: String): Self = this.set("x-first-death-exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-first-death-exchange`: Self = this.set("x-first-death-exchange", js.undefined)
    
    @scala.inline
    def `setX-first-death-queue`(value: String): Self = this.set("x-first-death-queue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-first-death-queue`: Self = this.set("x-first-death-queue", js.undefined)
    
    @scala.inline
    def `setX-first-death-reason`(value: String): Self = this.set("x-first-death-reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteX-first-death-reason`: Self = this.set("x-first-death-reason", js.undefined)
  }
}
