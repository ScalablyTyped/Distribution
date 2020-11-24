package typings.appleMapkitJsBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hybrid extends js.Object {
  
  /**
    * A satellite image of the area with road and road name information
    * layered on top.
    */
  val Hybrid: String = js.native
  
  /**
    * A street map where your data is emphasized over the underlying map details.
    */
  val MutedStandard: String = js.native
  
  /**
    * A satellite image of the area.
    */
  val Satellite: String = js.native
  
  /**
    * A street map that shows the position of all roads and some road names.
    */
  val Standard: String = js.native
}
object Hybrid {
  
  @scala.inline
  def apply(Hybrid: String, MutedStandard: String, Satellite: String, Standard: String): Hybrid = {
    val __obj = js.Dynamic.literal(Hybrid = Hybrid.asInstanceOf[js.Any], MutedStandard = MutedStandard.asInstanceOf[js.Any], Satellite = Satellite.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hybrid]
  }
  
  @scala.inline
  implicit class HybridOps[Self <: Hybrid] (val x: Self) extends AnyVal {
    
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
    def setHybrid(value: String): Self = this.set("Hybrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutedStandard(value: String): Self = this.set("MutedStandard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSatellite(value: String): Self = this.set("Satellite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandard(value: String): Self = this.set("Standard", value.asInstanceOf[js.Any])
  }
}
