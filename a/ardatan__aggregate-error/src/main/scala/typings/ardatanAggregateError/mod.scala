package typings.ardatanAggregateError

import org.scalablytyped.runtime.StringDictionary
import typings.ardatanAggregateError.aggregateErrorMod.AggregateError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ardatan/aggregate-error", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected () extends AggregateError {
    def this(errors: js.Array[Error | StringDictionary[_] | String]) = this()
  }
}
