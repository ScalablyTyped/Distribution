package typings.angular.mod

import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterFunction extends Function {
  
  /**
    * By default, filters are only run once the input value changes. By marking the filter as `$stateful`, the filter will be run on every `$digest` to update the output. **This is strongly discouraged.**
    * See https://docs.angularjs.org/guide/filter#stateful-filters
    */
  @JSName("$stateful")
  var $stateful: js.UndefOr[Boolean] = js.native
}
