package typings.appleDashMapkitDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hybrid extends js.Object {
  /**
    * A satellite image of the area with road and road name information
    * layered on top.
    */
  val Hybrid: String
  /**
    * A street map where your data is emphasized over the underlying map details.
    */
  val MutedStandard: String
  /**
    * A satellite image of the area.
    */
  val Satellite: String
  /**
    * A street map that shows the position of all roads and some road names.
    */
  val Standard: String
}

object Anon_Hybrid {
  @scala.inline
  def apply(Hybrid: String, MutedStandard: String, Satellite: String, Standard: String): Anon_Hybrid = {
    val __obj = js.Dynamic.literal(Hybrid = Hybrid.asInstanceOf[js.Any], MutedStandard = MutedStandard.asInstanceOf[js.Any], Satellite = Satellite.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Hybrid]
  }
}

