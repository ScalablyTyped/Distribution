package typings.androiduix.android.text.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Directions extends js.Object {
  
  var mDirections: js.Array[Double] = js.native
}
object Directions {
  
  @scala.inline
  def apply(mDirections: js.Array[Double]): Directions = {
    val __obj = js.Dynamic.literal(mDirections = mDirections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directions]
  }
  
  @scala.inline
  implicit class DirectionsOps[Self <: Directions] (val x: Self) extends AnyVal {
    
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
    def setMDirectionsVarargs(value: Double*): Self = this.set("mDirections", js.Array(value :_*))
    
    @scala.inline
    def setMDirections(value: js.Array[Double]): Self = this.set("mDirections", value.asInstanceOf[js.Any])
  }
}
