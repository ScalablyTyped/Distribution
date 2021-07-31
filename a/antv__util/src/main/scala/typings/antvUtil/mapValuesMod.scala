package typings.antvUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapValuesMod {
  
  @JSImport("@antv/util/lib/map-values", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T](`object`: StringDictionary[T]): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  @scala.inline
  def default[T](`object`: StringDictionary[T], func: js.Function2[/* value */ T, /* key */ String, js.Any]): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
}
