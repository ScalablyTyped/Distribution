package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * $scope for ngRepeat directive.
  * see https://docs.angularjs.org/api/ng/directive/ngRepeat
  */
@js.native
trait IRepeatScope extends IRootScopeService {
  /**
    * true if the iterator position $index is even (otherwise false).
    */
  @JSName("$even")
  var $even: Boolean = js.native
  /**
    * true if the repeated element is first in the iterator.
    */
  @JSName("$first")
  var $first: Boolean = js.native
  /**
    * iterator offset of the repeated element (0..length-1).
    */
  @JSName("$index")
  var $index: Double = js.native
  /**
    * true if the repeated element is last in the iterator.
    */
  @JSName("$last")
  var $last: Boolean = js.native
  /**
    * true if the repeated element is between the first and last in the iterator.
    */
  @JSName("$middle")
  var $middle: Boolean = js.native
  /**
    * true if the iterator position $index is odd (otherwise false).
    */
  @JSName("$odd")
  var $odd: Boolean = js.native
}

