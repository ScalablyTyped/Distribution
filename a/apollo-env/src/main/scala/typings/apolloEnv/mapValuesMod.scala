package typings.apolloEnv

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapValuesMod {
  
  @JSImport("apollo-env/lib/utils/mapValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def mapValues[T, U](`object`: Record[String, T], callback: js.Function1[/* value */ T, U]): Record[String, U] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapValues")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Record[String, U]]
}
