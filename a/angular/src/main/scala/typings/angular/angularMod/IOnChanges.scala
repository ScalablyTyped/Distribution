package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the $onChanges lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
@js.native
trait IOnChanges extends js.Object {
  /**
    * Called whenever one-way bindings are updated. The onChangesObj is a hash whose keys are the names of the bound
    * properties that have changed, and the values are an {@link IChangesObject} object  of the form
    * { currentValue, previousValue, isFirstChange() }. Use this hook to trigger updates within a component such as
    * cloning the bound value to prevent accidental mutation of the outer value.
    */
  @JSName("$onChanges")
  def $onChanges(onChangesObj: IOnChangesObject): Unit = js.native
}

