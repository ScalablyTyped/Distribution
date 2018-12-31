package typings
package angularLib.angularMod.angularNs

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
  var $even: scala.Boolean = js.native
  /**
    * true if the repeated element is first in the iterator.
    */
  @JSName("$first")
  var $first: scala.Boolean = js.native
  /**
    * iterator offset of the repeated element (0..length-1).
    */
  @JSName("$index")
  var $index: scala.Double = js.native
  /**
    * true if the repeated element is last in the iterator.
    */
  @JSName("$last")
  var $last: scala.Boolean = js.native
  /**
    * true if the repeated element is between the first and last in the iterator.
    */
  @JSName("$middle")
  var $middle: scala.Boolean = js.native
  /**
    * true if the iterator position $index is odd (otherwise false).
    */
  @JSName("$odd")
  var $odd: scala.Boolean = js.native
}

