package typings.aliApp.anon

import typings.aliApp.my.Beacon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Beacons extends js.Object {
  
  var beacons: js.Array[Beacon] = js.native
}
object Beacons {
  
  @scala.inline
  def apply(beacons: js.Array[Beacon]): Beacons = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacons]
  }
  
  @scala.inline
  implicit class BeaconsOps[Self <: Beacons] (val x: Self) extends AnyVal {
    
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
    def setBeaconsVarargs(value: Beacon*): Self = this.set("beacons", js.Array(value :_*))
    
    @scala.inline
    def setBeacons(value: js.Array[Beacon]): Self = this.set("beacons", value.asInstanceOf[js.Any])
  }
}
