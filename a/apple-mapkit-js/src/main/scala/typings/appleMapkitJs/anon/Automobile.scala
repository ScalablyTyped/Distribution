package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Automobile extends js.Object {
  /**
    * A constant identifying the mode of transportation as driving.
    */
  val Automobile: String = js.native
  /**
    * A constant identifying the mode of transportation as walking.
    */
  val Walking: String = js.native
}

object Automobile {
  @scala.inline
  def apply(Automobile: String, Walking: String): Automobile = {
    val __obj = js.Dynamic.literal(Automobile = Automobile.asInstanceOf[js.Any], Walking = Walking.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automobile]
  }
  @scala.inline
  implicit class AutomobileOps[Self <: Automobile] (val x: Self) extends AnyVal {
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
    def setAutomobile(value: String): Self = this.set("Automobile", value.asInstanceOf[js.Any])
    @scala.inline
    def setWalking(value: String): Self = this.set("Walking", value.asInstanceOf[js.Any])
  }
  
}

