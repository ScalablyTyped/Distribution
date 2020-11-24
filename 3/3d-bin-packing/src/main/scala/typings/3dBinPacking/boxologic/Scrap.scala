package typings.`3dBinPacking`.boxologic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * <p> Cumulated lengths of current layer. </p>
  *
  * <p> {@link Scrapped} represents an edge of the current layer under construction. </p>
  *
  * @author Bill Knechtel, <br>
  *		   Migrated and Refactored by Jeongho Nam <http://samchon.org>
  */
@js.native
trait Scrap extends js.Object {
  
  /**
    * Cumulated length on the X-axis in 3D.
    */
  var cumx: Double = js.native
  
  /**
    * Cumulated length on the Z-axis in 3D.
    */
  var cumz: Double = js.native
}
object Scrap {
  
  @scala.inline
  def apply(cumx: Double, cumz: Double): Scrap = {
    val __obj = js.Dynamic.literal(cumx = cumx.asInstanceOf[js.Any], cumz = cumz.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scrap]
  }
  
  @scala.inline
  implicit class ScrapOps[Self <: Scrap] (val x: Self) extends AnyVal {
    
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
    def setCumx(value: Double): Self = this.set("cumx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumz(value: Double): Self = this.set("cumz", value.asInstanceOf[js.Any])
  }
}
