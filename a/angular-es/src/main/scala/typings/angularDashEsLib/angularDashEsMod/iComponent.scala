package typings
package angularDashEsLib.angularDashEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Component interface
     * @see https://docs.angularjs.org/guide/component
     */

trait iComponent extends js.Object {
  var bindings: js.UndefOr[js.Object] = js.undefined
  var controllerAs: js.UndefOr[java.lang.String] = js.undefined
  var require: js.UndefOr[java.lang.String] = js.undefined
  var selector: java.lang.String
  var template: java.lang.String
  var templateUrl: js.UndefOr[java.lang.String] = js.undefined
  var transclude: js.UndefOr[java.lang.String] = js.undefined
}

