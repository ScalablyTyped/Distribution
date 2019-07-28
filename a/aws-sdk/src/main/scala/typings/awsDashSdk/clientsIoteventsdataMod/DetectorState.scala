package typings.awsDashSdk.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorState extends js.Object {
  /**
    * The name of the state.
    */
  var stateName: StateName
  /**
    * The current state of the detector's timers.
    */
  var timers: Timers
  /**
    * The current values of the detector's variables.
    */
  var variables: Variables
}

object DetectorState {
  @scala.inline
  def apply(stateName: StateName, timers: Timers, variables: Variables): DetectorState = {
    val __obj = js.Dynamic.literal(stateName = stateName, timers = timers, variables = variables)
  
    __obj.asInstanceOf[DetectorState]
  }
}

