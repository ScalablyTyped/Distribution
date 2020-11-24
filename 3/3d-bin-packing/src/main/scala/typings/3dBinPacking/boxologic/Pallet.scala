package typings.`3dBinPacking`.boxologic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pallet containing boxes.
  *
  * @author Bill Knechtel, <br>
  *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
  */
@js.native
trait Pallet extends Instance {
  
  /**
    * Set placement orientation.
    */
  def set_orientation(orientation: Double): Unit = js.native
}
object Pallet {
  
  @scala.inline
  def apply(
    height: Double,
    layout_height: Double,
    layout_length: Double,
    layout_width: Double,
    length: Double,
    set_orientation: Double => Unit,
    volume: Double,
    width: Double
  ): Pallet = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout_height = layout_height.asInstanceOf[js.Any], layout_length = layout_length.asInstanceOf[js.Any], layout_width = layout_width.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], set_orientation = js.Any.fromFunction1(set_orientation), volume = volume.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pallet]
  }
  
  @scala.inline
  implicit class PalletOps[Self <: Pallet] (val x: Self) extends AnyVal {
    
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
    def setSet_orientation(value: Double => Unit): Self = this.set("set_orientation", js.Any.fromFunction1(value))
  }
}
