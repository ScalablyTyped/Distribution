package typings.amapJsSdk.anon

import typings.amapJsSdk.AMap.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsOpen extends js.Object {
  
  var isOpen: js.UndefOr[Boolean] = js.native
  
  var tileLayer: js.UndefOr[js.Array[TileLayer]] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object IsOpen {
  
  @scala.inline
  def apply(): IsOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsOpen]
  }
  
  @scala.inline
  implicit class IsOpenOps[Self <: IsOpen] (val x: Self) extends AnyVal {
    
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setTileLayerVarargs(value: TileLayer*): Self = this.set("tileLayer", js.Array(value :_*))
    
    @scala.inline
    def setTileLayer(value: js.Array[TileLayer]): Self = this.set("tileLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileLayer: Self = this.set("tileLayer", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
