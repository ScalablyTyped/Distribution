package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelsQuery extends js.Object {
  
   // the channel id prefix (returns channels with this prefix)
  var marker: String = js.native
  
   // the channel id marker (returns channels after this id)
  var `max-keys `: Double = js.native
  
  var prefix: String = js.native
}
object ListChannelsQuery {
  
  @scala.inline
  def apply(marker: String, `max-keys `: Double, prefix: String): ListChannelsQuery = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("max-keys ")((`max-keys `).asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsQuery]
  }
  
  @scala.inline
  implicit class ListChannelsQueryOps[Self <: ListChannelsQuery] (val x: Self) extends AnyVal {
    
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
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-keys `(value: Double): Self = this.set("max-keys ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
}
