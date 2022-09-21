package typings.angularDevkitCore.jobsApiMod

import typings.angularDevkitCore.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registry[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] extends StObject {
  
  /**
    * Get a job handler.
    * @param name The name of the job to get a handler from.
    */
  def get[A /* <: MinimumArgumentValueT */, I /* <: MinimumInputValueT */, O /* <: MinimumOutputValueT */](name: JobName): Any
}
object Registry {
  
  inline def apply[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */](get: JobName => Any): Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]]
  }
  
  extension [Self <: Registry[?, ?, ?], MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */](x: Self & (Registry[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT])) {
    
    inline def setGet(value: JobName => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
