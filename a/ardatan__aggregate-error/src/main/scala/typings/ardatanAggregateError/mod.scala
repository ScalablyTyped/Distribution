package typings.ardatanAggregateError

import org.scalablytyped.runtime.StringDictionary
import typings.ardatanAggregateError.aggregateErrorMod.AggregateError
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ardatan/aggregate-error", JSImport.Default)
  @js.native
  class default protected () extends AggregateError {
    def this(errors: js.Array[Error | StringDictionary[js.Any] | String]) = this()
  }
}
